if (typeof console === "undefined") {
	console = {
		log: function(msg){
			print(msg);
		}
	};
}

function BimServerApi(baseUrl, notifier) {
	var othis = this;

	othis.schemaFetcher = new Synchronizer(function(callback){
		$.getJSON(othis.baseUrl + "/js/ifc2x3tc1.json", function(result){
			callback(result.classes);
		});
	});
	othis.jsonSerializerFetcher = new Synchronizer(function(callback){
		othis.call("ServiceInterface", "getSerializerByPluginClassName", {pluginClassName: "org.bimserver.serializers.JsonSerializerPlugin"}, function(serializer){
			callback(serializer.oid);
		});
	});
	
	othis.translations = {
		GETDATAOBJECTSBYTYPE_BUSY: "Loading objects"
	}
	
	othis.token = null;
	othis.baseUrl = baseUrl;
	othis.address = baseUrl + "/jsonapi";
	othis.notifier = notifier;
	if (othis.notifier == null) {
		othis.notifier = {
			error: function(){},
			info: function(){},
			warn: function(){},
			setStatus: function(message, timeout){},
			setError: function(){},
			resetStatus: function(){},
			resetStatusQuick: function(){},
			clear: function(){}
		};
	}
	othis.server = new BimServerWebSocket(baseUrl);
	othis.user = null;
	othis.listeners = {};
	othis.autoLoginTried = false;

	this.autologin = function(username, autologin, callback, errorCallback) {
		var request = {
			username: username,
			hash: autologin
		};
		othis.call("ServiceInterface", "autologin", request, function(data){
			othis.token = data;
			othis.notifier.info("Auto login successful, logout to disable autologin");
			othis.resolveUser();
			callback();
			othis.autoLoginTried = false;
		}, errorCallback);
	};
	
	this.translate = function(key) {
		key = key.toUpperCase();
		if (othis.translations[key] != null) {
			return othis.translations[key];
		}
		console.log("translation for " + key + " not found");
		return key;
	};

	this.login = function(username, password, rememberme, callback, errorCallback) {
		var request = {
			username: username,
			password: password
		};
		othis.call("ServiceInterface", "login", request, function(data){
			othis.token = data;
			var autologin = Sha256.hash(username + Sha256.hash(password));
			if (rememberme) {
				$.cookie("username", username, { expires: 31 });
				$.cookie("autologin", autologin, { expires: 31 });
				$.cookie("address", othis.baseUrl, { expires: 31 });
			} else {
				$.cookie("username", username, { });
				$.cookie("autologin", autologin, { });
				$.cookie("address", othis.baseUrl, { });
			}
			othis.notifier.info("Login successful");
			othis.resolveUser();
			callback();
		}, errorCallback);
	};

	this.processNotification = function(message) {
		var intf = message["interface"];
		if (othis.listeners[intf] != null) {
			if (othis.listeners[intf][message.method] != null) {
				othis.listeners[intf][message.method].forEach(function(listener) {
					var ar = [];
					var i=0;
					for (var key in message.parameters) {
						ar[i++] = message.parameters[key]; 
					}
					listener.apply(null, ar);
				});
			}
		}
	};
	
	this.resolveUser = function() {
		othis.call("ServiceInterface", "getCurrentUser", {}, function(data){
			othis.user = data;
		});
	};
	
	this.logout = function(callback) {
		$.removeCookie("username");
		$.removeCookie("autologin");
		$.removeCookie("address");
		othis.call("ServiceInterface", "logout", {}, function(){
			othis.notifier.info("Logout successful");
			callback();
		});
	};
	
	this.generateRevisionDownloadUrl = function(settings) {
		return othis.baseUrl + "/download?token=" + othis.token + "&longActionId=" + settings.laid + (settings.zip ? "&zip=on" : "") + "&serializerOid=" + settings.serializerOid;
	};

	this.generateExtendedDataDownloadUrl = function(edid) {
		return othis.baseUrl + "/download?token=" + othis.token + "&action=extendeddata&edid=" + edid;
	};
	
	this.openWebSocket = function(callback) {
		if (othis.server.connected) {
			callback();
		} else {
			othis.server.connect(callback);			
		}
	};
	
	this.register = function(interfaceName, methodName, callback, registerCallback) {
		if (othis.listeners[interfaceName] == null) {
			othis.listeners[interfaceName] = {};
		}
		if (othis.listeners[interfaceName][methodName] == null) {
			othis.listeners[interfaceName][methodName] = [];
		}
		othis.listeners[interfaceName][methodName].push(callback);
		othis.openWebSocket(function(){
			othis.call("ServiceInterface", "registerAll", {endPointId: othis.server.endPointId}, registerCallback);
		});
	};
	
	this.unregister = function(listener) {
		for (var i in othis.listeners) {
			for (var j in othis.listeners[i]) {
				var list = othis.listeners[i][j];
				for (var k=0; k < list.length; k++) {
					if (list[k] === listener){
						list.splice(k, 1);
						return;
					}
				}
			}
		}
	};
	
	this.callWs = function(interfaceName, method, data) {
		var requestObject = {
			request: othis.createRequest(interfaceName, method, data)
		};
		if (othis.token != null) {
			requestObject.token = othis.token;
		}
		othis.server.send(requestObject);
	};
	
	this.createRequest = function(interfaceName, method, data) {
		var object = {};
		object["interface"] = interfaceName;
		object.method = method;
		object.parameters = data;
		
		return object;
	};
	
	this.multiCall = function(requests, callback, showBusy, showDone, showError) {
		var request = null;
		if (requests.length == 1) {
			var request = requests[0];
			request = {request: othis.createRequest(request[0], request[1], request[2])};
		} else if (requests.length > 1) {
			var requestObjects = [];
			requests.forEach(function(request){
				requestObjects.push(othis.createRequest(request[0], request[1], request[2]));
			});
			request = {
				requests: requestObjects
			};
		}

		othis.notifier.clear();
		
		if (othis.token != null) {
			request.token = othis.token;
		}
		
		var key = requests[0][1];
		requests.forEach(function(item, index){
			if (index > 0) {
				key += "_" + item;
			}
		});
		
		var showedBusy = false;
		if (showBusy) {
			if (othis.lastBusyTimeOut != null) {
				clearTimeout(othis.lastBusyTimeOut);
				othis.lastBusyTimeOut = null;
			}
			if (typeof window !== 'undefined' && window.setTimeout != null) {
				othis.lastBusyTimeOut = window.setTimeout(function(){
					othis.notifier.setStatus(othis.translate(key + "_BUSY"), -1);
					showedBusy = true;
				}, 200);
			}
		}
		
		othis.notifier.resetStatusQuick();
		
		console.log("request", request);

		$.ajax(othis.address, {
			type: "POST",
			contentType: 'application/json',
			data: JSON.stringify(request),
			dataType: "json",
			success: function(data) {
				console.log("response", data);
				var errorsToReport = [];
				if (requests.length == 1) {
					if (showBusy) {
						if (othis.lastBusyTimeOut != null) {
							clearTimeout(othis.lastBusyTimeOut);
						}
						if (showedBusy) {
							othis.notifier.resetStatus();
						}
					}
					if (data.response.exception != null) {
						if (data.response.exception.message == "Invalid token" && !othis.autoLoginTried && $.cookie("username") != null && $.cookie("autologin") != null) {
							othis.autologin($.cookie("username"), $.cookie("autologin"), function(){
								console.log("Trying to connect with autologin");
								othis.multiCall(requests, callback, errorCallback);
							});
						} else {
							if (showError) {
								if (othis.lastTimeOut != null) {
									clearTimeout(othis.lastTimeOut);
								}
								othis.notifier.setError(data.response.exception.message);
							}
						}
					} else {
						if (showDone) {
							othis.notifier.setStatus(othis.translate(key + "_DONE"), 5000);
						}
					}
				} else if (requests.length > 1) {
					data.responses.forEach(function(response){
						if (response.exception != null) {
							if (errorCallback == null) {
								othis.notifier.error(response.exception.message);
							} else {
								errorsToReport.push(response.exception);
							}
						}
					});
				}
				if (errorsToReport.length > 0) {
					errorCallback(errorsToReport);
				} else {
					if (requests.length == 1) {
						callback(data.response);
					} else if (requests.length > 1) {
						callback(data.responses);
					}
				}
			},
			error: function(jqXHR, textStatus, errorThrown){
				if (textStatus == "abort") {
					// ignore
				} else {
					console.log(errorThrown);
					console.log(textStatus);
					console.log(jqXHR);
					if (othis.lastTimeOut != null) {
						clearTimeout(othis.lastTimeOut);
					}
					othis.notifier.error("ERROR_REMOTE_METHOD_CALL");
				}
				if (callback != null) {
					var result = new Object();
					result.error = textStatus;
					result.ok = false;
					callback(result);
				}
			}
		});		
	};
	
	this.getModel = function(poid, roid, deep, callback) {
		var model = new Model(othis, poid, roid, deep);
		model.load(deep, callback);
		return model;
	};
	
	this.createModel = function(poid, callback) {
		var model = new Model(othis, poid);
		model.init(callback);
		return model;
	};
	
	this.callWithFullIndication = function(interfaceName, methodName, data, callback) {
		othis.call(interfaceName, methodName, data, callback, true, true, true);
	};

	this.callWithUserErrorIndication = function(action, data, callback) {
		othis.call(interfaceName, methodName, data, callback, false, false, true);
	};

	this.callWithUserErrorAndDoneIndication = function(action, data, callback) {
		othis.call(interfaceName, methodName, data, callback, false, true, true);
	};
	
	this.setToken = function(token) {
		othis.token = token;
	};
	
	this.call = function(interfaceName, methodName, data, callback, showBusy, showDone, showError) {
		var showBusy = typeof showBusy !== 'undefined' ? showBusy : true;
		var showDone = typeof showDone !== 'undefined' ? showDone : false;
		var showError = typeof showError !== 'undefined' ? showError : true;

		othis.multiCall([[
		    interfaceName,
		    methodName,
			data
		]], function(data){
			if (data.exception == null) {
				if (callback != null) {
					callback(data.result);
				}
			}
		}, showBusy, showDone, showError);
	};
	
	othis.server.listener = othis.processNotification;
}

function Synchronizer(fetcher) {
	var othis = this;
	othis.result = null;
	othis.state = "none";
	othis.waiters = [];
	
	this.notify = function(result){
		othis.result = result;
		othis.state = "done";
		othis.waiters.forEach(function(waiter){
			waiter(result);
		});
		othis.waiters = [];
	};
	
	this.fetch = function(callback){
		if (othis.state == "none") {
			othis.waiters.push(callback)
			othis.state = "fetching";
			fetcher(othis.notify);
		} else if (othis.state == "done") {
			callback(othis.result);
		} else if (othis.state == "fetching") {
			othis.waiters.push(callback)
		}
	};
}

function Model(bimServerApi, poid, roid) {
	var othis = this;
	othis.bimServerApi = bimServerApi;
	othis.poid = poid;
	othis.roid = roid;
	othis.waiters = [];
	othis.objects = {};
	othis.objectsByGuid = {};
	othis.loadedTypes = [];
	othis.loadedDeep = false;
	othis.changedObjectOids = {};
	othis.oidsFetching = {};
	othis.guidsFetching = {};
	othis.doneCallbacks = [];
	othis.runningCalls = 0;
	othis.loading = false;
	othis.logging = true;
	
	othis.transactionSynchronizer = new Synchronizer(function(callback){
		bimServerApi.call("ServiceInterface", "startTransaction", {poid: othis.poid}, function(tid){
			callback(tid);
		});
	});
	
	this.init = function(callback){
		othis.incrementRunningCalls("init");
		othis.transactionSynchronizer.fetch(function(){
			callback(othis);
			othis.decrementRunningCalls("init");
		});
	};
	
	this.load = function(deep, modelLoadCallback) {
		if (deep) {
			othis.loading = true;
			othis.incrementRunningCalls("load");
			othis.bimServerApi.jsonSerializerFetcher.fetch(function(jsonSerializerOid){
				bimServerApi.call("ServiceInterface", "download", {
					roid: roid,
					serializerOid: jsonSerializerOid,
					showOwn: true,
					sync: true
				}, function(laid){
					var url = bimServerApi.generateRevisionDownloadUrl({
						laid: laid,
						serializerOid: jsonSerializerOid
					});
					$.getJSON(url, function(data, textStatus, jqXHR){
						data.objects.forEach(function(object){
							othis.objects[object.oid] = object;
						});
						for (var oid in othis.objects) {
							othis.resolveReferences(othis.objects[oid]);
						}
						othis.loading = false;
						othis.loadedDeep = true;
						othis.waiters.forEach(function(waiter){
							waiter();
						});
						othis.waiters = [];
						bimServerApi.call("ServiceInterface", "cleanupLongAction", {actionId: laid}, function(){
							modelLoadCallback(othis);
							othis.decrementRunningCalls("load");
						});
					});
				});
			});
		} else {
			othis.loaded = true;
			modelLoadCallback(othis);
		}
	};
	
	this.create = function(className, object, callback) {
		othis.incrementRunningCalls("create (" + className + ")");
		othis.transactionSynchronizer.fetch(function(tid){
			object.__type = className;
			othis.resolveReferences(object, function(){
				bimServerApi.call("ServiceInterface", "createObject", {tid: tid, className: className}, function(oid){
					object.oid = oid;
					if (callback != null) {
						callback(object);
					}
					othis.decrementRunningCalls("create (" + className + ")");
				});
			});
		});
		return object;
	};

	this.incrementRunningCalls = function(method){
		othis.runningCalls++;
		console.log("inc", method, othis.runningCalls);
	};
	
	this.decrementRunningCalls = function(method){
		othis.runningCalls--;
		console.log("dec", method, othis.runningCalls);
		if (othis.runningCalls == 0) {
			othis.doneCallbacks.forEach(function(cb){
				cb(othis);
			});
		}
	};
	
	this.done = function(doneCallback){
		if (othis.runningCalls == 0) {
			console.log("immediately done");
			doneCallback(othis);
		} else {
			othis.doneCallbacks.push(doneCallback);
		}
	};
	
	this.get = function(oids, callback) {
		othis.incrementRunningCalls("get(" + oids + ")");
		if (typeof oids == "number") {
			oids = [oids];
		}
		othis.waitForLoaded(function(){
			oids.forEach(function(oid){
				if (othis.objects[oid] != null) {
					// Already loaded? Remove from list and call callback
					callback(othis.objects[oid]);
					var index = oids.indexOf(oid);
					oids.splice(index, 1);
				} else if (othis.oidsFetching[oid] != null) {
					// Already loading? Add the callback to the list and remove from fetching list
					othis.oidsFetching[oid].push(callback);
					var index = oids.indexOf(oid);
					oids.splice(index, 1);
				}
			});
			// Any left?
			if (oids.length > 0) {
				oids.forEach(function(oid){
					othis.oidsFetching[oid] = [];
				});
				othis.bimServerApi.jsonSerializerFetcher.fetch(function(jsonSerializerOid){
					bimServerApi.call("ServiceInterface", "downloadByOids", {
						roids: [roid],
						oids: oids,
						serializerOid: jsonSerializerOid,
						deep: false,
						sync: true
					}, function(laid){
						var url = bimServerApi.generateRevisionDownloadUrl({
							laid: laid,
							serializerOid: jsonSerializerOid
						});
						$.getJSON(url, function(data, textStatus, jqXHR){
							if (data.objects.length > 0) {
								var done = 0;
								data.objects.forEach(function(object){
									var oid = object.oid;
									othis.objects[object.oid] = object;
									othis.resolveReferences(object, function(){
										if (othis.oidsFetching[oid] != null) {
											othis.oidsFetching[oid].forEach(function(cb){
												cb(object);
											});
											delete othis.oidsFetching[oid];
										}
										callback(object);
										done++;
										if (done == data.objects.length) {
											bimServerApi.call("ServiceInterface", "cleanupLongAction", {actionId: laid}, function(){
												othis.decrementRunningCalls("get(" + oids + ")");
											});
										}
									});
								});
							} else {
								console.log("Object with oid " + oids + " not found");
							}
						});
					});
				});
			} else {
				othis.decrementRunningCalls("get(" + oids + ")");
			}
		});
	};

	this.waitForLoaded = function(callback) {
		if (othis.loaded) {
			callback();
		} else {
			othis.waiters.push(callback);
		}
	};

	this.commit = function(comment, callback){
		othis.transactionSynchronizer.fetch(function(tid){
			bimServerApi.call("ServiceInterface", "commitTransaction", {tid: tid, comment: comment}, function(roid){
				if (callback != null) {
					callback(roid);
				}
			});
		});
	};
	
	this.resolveFields = function(object, type) {
		for (var fieldName in type.fields){
			var field = type.fields[fieldName];
			if (field.reference) {
				(function(object, fieldName){
					object["set" + fieldName.firstUpper()] = function(value) {
						othis.transactionSynchronizer.fetch(function(tid){
							object[fieldName] = value;
							othis.incrementRunningCalls("set" + fieldName.firstUpper());
							bimServerApi.call("ServiceInterface", "setReference", {
								tid: tid,
								oid: object.oid,
								referenceName: fieldName,
								referenceOid: value.oid
							}, function(){
								othis.decrementRunningCalls("set" + fieldName.firstUpper());
								if (object.changedFields == null) {
									object.changedFields = {};
								}
								object.changedFields[fieldName] = true;
								othis.changedObjectOids[object.oid] = true;
							});
						});
					};
					object["get" + fieldName.firstUpper()] = function(callback) {
						if (object[fieldName] != null) {
							return object[fieldName];
						}
						var value = object["__ref" + fieldName];
						if ($.isArray(value)) {
							if (object[fieldName] == null) {
								object[fieldName] = [];
							}
							value.forEach(function(val){
								var ref = othis.objects[val];
								if (ref == null) {
									othis.get(value, function(v){
										object[fieldName].push(v);
										callback(v);
									});
								} else {
									object[fieldName].push(ref);
									callback(ref);
								}
							});
						} else if (value != null) {
							var ref = othis.objects[value];
							if (value == -1) {
								callback(null);
							} else if (ref == null) {
								othis.get(value, function(v){
									object[fieldName] = v;
									callback(v);
								});
							} else {
								object[fieldName] = ref;
								callback(ref);
							}
						}
					};
				})(object, fieldName);
			} else {
				(function(object, fieldName){
					object["get" + fieldName.firstUpper()] = function(callback) {
						if (callback != null) {
							callback(object[fieldName]);
						}
						return object[fieldName];
					};
					object["set" + fieldName.firstUpper()] = function(value) {
						othis.incrementRunningCalls("set" + fieldName.firstUpper());
						othis.transactionSynchronizer.fetch(function(tid){
							if (typeof value == "string") {
								bimServerApi.call("ServiceInterface", "setStringAttribute", {
									tid: tid,
									oid: object.oid,
									attributeName: fieldName,
									value: value
								}, function(){
									othis.decrementRunningCalls("set" + fieldName.firstUpper());
								});
							} else if (typeof value == "number") {
								bimServerApi.call("ServiceInterface", "setDoubleAttribute", {
									tid: tid,
									oid: object.oid,
									attributeName: fieldName,
									value: value
								}, function(){
									othis.decrementRunningCalls("set" + fieldName.firstUpper());
								});
							} else {									
								console.log("Unimplemented type " + typeof value);
								othis.decrementRunningCalls("set" + fieldName.firstUpper());
							}
							object[fieldName] = value;
							if (object.changedFields == null) {
								object.changedFields = {};
							}
							object.changedFields[fieldName] = true;
							othis.changedObjectOids[object.oid] = true;
						});
					};
				})(object, fieldName);
			}
		}
	};

	this.resolveType = function(schema, object, realType){
		realType.superclasses.forEach(function(typeName){
			othis.resolveType(schema, object, schema[typeName]);
		});
		othis.resolveFields(object, realType);
	};
	
	this.resolveReferences = function(object, callback){
		// TODO move this function to prototype
		object.remove = function(removeCallback){
			othis.incrementRunningCalls("removeObject");
			othis.transactionSynchronizer.fetch(function(tid){
				bimServerApi.call("ServiceInterface", "removeObject", {tid: tid, oid: object.oid}, function(){
					if (removeCallback != null) {
						removeCallback();
					}
					delete othis.objects[object.oid];
					othis.decrementRunningCalls("removeObject");
				});
			});
		};
		othis.bimServerApi.schemaFetcher.fetch(function(schema){
			var realType = schema[object.__type];
			if (realType == null) {
				throw "Type " + object.__type + " not found";
			}
			othis.resolveType(schema, object, realType);
			callback();
		});
	};
	
	this.count = function(type, includeAllSubTypes, callback) {
		// TODO use includeAllSubTypes
		othis.incrementRunningCalls("count (" + type + ")");
		bimServerApi.call("ServiceInterface", "count", {roid: roid, className: type}, function(size){
			callback(size);
			othis.decrementRunningCalls("count (" + type + ")");
		});		
	};
	
	this.getByGuid = function(guids, callback) {
		// TODO this is almost a direct copy of "get", merge
		othis.incrementRunningCalls("getByGuid(" + guids + ")");
		if (typeof guids == "string") {
			guids = [guids];
		}
		othis.waitForLoaded(function(){
			guids.forEach(function(guid){
				if (othis.objectsByGuid[guid] != null) {
					// Already loaded? Remove from list and call callback
					callback(othis.objectsByGuid[guid]);
					var index = guids.indexOf(guid);
					guids.splice(index, 1);
				} else if (othis.oidsFetching[guid] != null) {
					// Already loading? Add the callback to the list and remove from fetching list
					othis.guidsFetching[guid].push(callback);
					var index = guids.indexOf(guid);
					guids.splice(index, 1);
				}
			});
			// Any left?
			if (guids.length > 0) {
				guids.forEach(function(guid){
					othis.guidsFetching[guid] = [];
				});
				othis.bimServerApi.jsonSerializerFetcher.fetch(function(jsonSerializerOid){
					bimServerApi.call("ServiceInterface", "downloadByGuids", {
						roids: [roid],
						guids: guids,
						serializerOid: jsonSerializerOid,
						sync: true
					}, function(laid){
						var url = bimServerApi.generateRevisionDownloadUrl({
							laid: laid,
							serializerOid: jsonSerializerOid
						});
						$.getJSON(url, function(data, textStatus, jqXHR){
							if (data.objects.length > 0) {
								var done = 0;
								data.objects.forEach(function(object){
									othis.resolveReferences(object, function(){
										var guid = object.getGlobalId();
										othis.objects[guid] = object;
										if (othis.guidsFetching[guid] != null) {
											othis.guidsFetching[guid].forEach(function(cb){
												cb(object);
											});
											delete othis.guidsFetching[guid];
										}
										callback(object);
										done++;
										if (done == data.objects.length) {
											bimServerApi.call("ServiceInterface", "cleanupLongAction", {actionId: laid}, function(){
												othis.decrementRunningCalls("getByGuid(" + guids + ")");
											});
										}
									});
								});
							} else {
								console.log("Object with guid " + guids + " not found");
							}
						});
					});
				});
			} else {
				othis.decrementRunningCalls("getByGuid(" + guids + ")");
			}
		});
	};
	
	this.getAllOfType = function(type, includeAllSubTypes, callback) {
		othis.incrementRunningCalls("getAllOfType");
		othis.waitForLoaded(function(){
			if (othis.loadedDeep) {
				for (var oid in othis.objects) {
					var object = othis.objects[oid];
					if (object.__type == type) {
						callback(object);
					}
				}
				othis.decrementRunningCalls("getAllOfType");
			} else {
				othis.bimServerApi.jsonSerializerFetcher.fetch(function(jsonSerializerOid){
					bimServerApi.call("ServiceInterface", "downloadByTypes", {
						roids: [roid],
						classNames: [type],
						includeAllSubtypes: includeAllSubTypes,
						serializerOid: jsonSerializerOid,
						useObjectIDM: true,
						deep: false,
						sync: true
					}, function(laid){
						var url = bimServerApi.generateRevisionDownloadUrl({
							laid: laid,
							serializerOid: jsonSerializerOid
						});
						$.getJSON(url, function(data, textStatus, jqXHR){
							data.objects.forEach(function(object){
								othis.objects[object.oid] = object;
							});
							for (var oid in othis.objects) {
								var object = othis.objects[oid];
								othis.resolveReferences(object, function(){
									callback(object);
								});
							}
							bimServerApi.call("ServiceInterface", "cleanupLongAction", {actionId: laid}, function(){
								othis.decrementRunningCalls("getAllOfType");
							});
						});
					});
				});
			}
		});
	};
}

function BimServerWebSocket(baseUrl) {
	var othis = this;
	this.connected = false;
	this.openCallbacks = [];
	this.endPointId = null;
	this.listener = null;
	
	this.connect = function(callback) {
		othis.openCallbacks.push(callback);
		var location = baseUrl.toString().replace('http://', 'ws://').replace('https://', 'wss://');
		var index = location.indexOf("/", 5);
		if (index == -1) {
			location = location + "/stream";
		} else {
			location = location.substring(0, index) + "/stream";
		}
		this._ws = new WebSocket(location);
		this._ws.onopen = this._onopen;
		this._ws.onmessage = this._onmessage;
		this._ws.onclose = this._onclose;
	};

	this._onopen = function() {
	};

	this._send = function(message) {
		if (this._ws) {
			this._ws.send(message);
		}
	};

	this.send = function(object) {
		othis._send(JSON.stringify(object));
	};

	this._onmessage = function(message) {
		var incomingMessage = JSON.parse(message.data);
		console.log("incoming", incomingMessage);
		if (incomingMessage.endpointid != null) {
			othis.endPointId = incomingMessage.endpointid;
			othis.connected = true;
			othis.openCallbacks.forEach(function(callback){
				callback();
			});
			othis.openCallbacks = [];
		} else {
			if (incomingMessage.request != null) {
				othis.listener(incomingMessage.request);
			} else if (incomingMessage.requests != null) {
				incomingMessage.requests.forEach(function(request){
					othis.listener(request);
				});
			}
		}
	};

	this._onclose = function(m) {
		othis._ws = null;
		othis.connected = false;
		othis.openCallbacks = [];
		othis.endpointid = null;
	};
}