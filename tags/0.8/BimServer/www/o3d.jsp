<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<title>BIMserver.org | Open Source Building Information Model server</title>
<meta http-equiv="content-type" content="text/html;charset=utf-8" />
<meta name="description" content="BIMserver is free and Open Source software for setting up a Building Information Model server based on IFC." />
<meta http-equiv="Content-Style-Type" content="text/css" />
<link rel="stylesheet" href="css/bim.css" type="text/css" media="all" />
<link rel="stylesheet" href="css/tabber.css" type="text/css" media="all" />
<link rel="shortcut icon" type="image/ico" href="images/logo_small.png"/>
<%
	if (request.getRequestURI().endsWith("main.jsp")) {
%>
		<link rel="alternate" type="application/atom+xml" title="BIMserver.org projects feed" href="<%=request.getContextPath() %>/syndication/projects" />
<%	
	}
%>
<script src="js/main.js" type="text/javascript" charset="utf-8"></script>
<script src="js/jquery-1.3.2.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	/************************************************************
	 * (c) Copyright bimserver.org
	 * Licensed under GNU GPLv3
	 * http://www.gnu.org/licenses/gpl-3.0.txt
	 * For more information mail to license@bimserver.org
	 ***********************************************************/

	var tabberOptions = {
		'cookie' :"tabber",
		'onLoad' : function(argsObj) {
			var t = argsObj.tabber;
			var i;
			if (t.id) {
				t.cookie = t.id + t.cookie;
			}
			i = parseInt(getCookie(t.cookie));
			if (isNaN(i)) {
				return;
			}
			t.tabShow(i);
		},

		'onClick' : function(argsObj) {
			var c = argsObj.tabber.cookie;
			var i = argsObj.index;
			setCookie(c, i);
		}
	};

	function setCookie(name, value, expires, path, domain, secure) {
		document.cookie = name + "=" + escape(value)
				+ ((expires) ? "; expires=" + expires.toGMTString() : "")
				+ ((path) ? "; path=" + path : "")
				+ ((domain) ? "; domain=" + domain : "")
				+ ((secure) ? "; secure" : "");
	}

	function getCookie(name) {
		var dc = document.cookie;
		var prefix = name + "=";
		var begin = dc.indexOf("; " + prefix);
		if (begin == -1) {
			begin = dc.indexOf(prefix);
			if (begin != 0)
				return null;
		} else {
			begin += 2;
		}
		var end = document.cookie.indexOf(";", begin);
		if (end == -1) {
			end = dc.length;
		}
		return unescape(dc.substring(begin + prefix.length, end));
	}
	
	function deleteCookie(name, path, domain) {
		if (getCookie(name)) {
			document.cookie = name + "=" + ((path) ? "; path=" + path : "")
					+ ((domain) ? "; domain=" + domain : "")
					+ "; expires=Thu, 01-Jan-70 00:00:01 GMT";
		}
	}
</script>
<script src="js/tabber-minimized.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript" src="js/o3djs/base.js"></script> 
<script type="text/javascript" id="o3dscript"> 
o3djs.require('o3djs.util');
o3djs.require('o3djs.math');
o3djs.require('o3djs.quaternions');
o3djs.require('o3djs.rendergraph');
o3djs.require('o3djs.pack');
o3djs.require('o3djs.arcball');
o3djs.require('o3djs.scene');

var g_root;
var g_o3d;
var g_math;
var g_quaternions;
var g_client;
var g_aball;
var g_thisRot;
var g_lastRot;
var g_pack = null;
var g_mainPack;
var g_viewInfo;
var g_lightPosParam;
var g_loadingElement;
var g_o3dWidth = -1;
var g_o3dHeight = -1;
var g_o3dElement;
var g_finished = false;

var g_camera = {
  farPlane: 5000,
  nearPlane:0.1
};

var g_dragging = false;

function startDragging(e) {
  g_lastRot = g_thisRot;
 
  g_aball.click([e.x, e.y]);
 
  g_dragging = true;
}

function drag(e) {
  if (g_dragging) {
    var rotationQuat = g_aball.drag([e.x, e.y]);
    var rot_mat = g_quaternions.quaternionToRotation(rotationQuat);
    g_thisRot = g_math.matrix4.mul(g_lastRot, rot_mat);
 
    var m = g_root.localMatrix;
    g_math.matrix4.setUpper3x3(m, g_thisRot);
    g_root.localMatrix = m;
  }
}

function stopDragging(e) {
  g_dragging = false;
}

function updateCamera() {
  var up = [0, 1, 0];
  g_viewInfo.drawContext.view = g_math.matrix4.lookAt(g_camera.eye,
                                                      g_camera.target,
                                                      up);
  g_lightPosParam.value = g_camera.eye;
}

function updateProjection() {
  // Create a perspective projection matrix.
  g_viewInfo.drawContext.projection = g_math.matrix4.perspective(
    g_math.degToRad(45), g_o3dWidth / g_o3dHeight, g_camera.nearPlane,
    g_camera.farPlane);
}

function scrollMe(e) {
  if (e.deltaY) {
    var t = 1;
    if (e.deltaY > 0)
      t = 11 / 12;
    else
      t = 13 / 12;
    g_camera.eye = g_math.lerpVector(g_camera.target, g_camera.eye, t);
 
    updateCamera();
  }
}

function loadFile(context, path) {
  function callback(pack, parent, exception) {
    if (exception) {
      alert("Could not load: " + path + "\n" + exception);
      g_loadingElement.innerHTML = "loading failed.";
    } else {
      g_loadingElement.innerHTML = "loading finished.";
      // Generate draw elements and setup material draw lists.
      o3djs.pack.preparePack(pack, g_viewInfo);
      var bbox = o3djs.util.getBoundingBoxOfTree(g_client.root);
      g_camera.target = g_math.lerpVector(bbox.minExtent, bbox.maxExtent, 0.5);
      var diag = g_math.length(g_math.subVector(bbox.maxExtent,
                                                bbox.minExtent));
      g_camera.eye = g_math.addVector(g_camera.target, [0, 0, 1.5 * diag]);
      g_camera.nearPlane = diag / 1000;
      g_camera.farPlane = diag * 10;
      setClientSize();
      updateCamera();
      updateProjection();
 
      // Manually connect all the materials' lightWorldPos params to the context
      var materials = pack.getObjectsByClassName('o3d.Material');
      for (var m = 0; m < materials.length; ++m) {
        var material = materials[m];
        var param = material.getParam('lightWorldPos');
        if (param) {
          param.bind(g_lightPosParam);
        }
      }
 
      g_finished = true;  // for selenium
 
      // Comment out the next line to dump lots of info.
      if (false) {
        o3djs.dump.dump('---dumping context---\n');
        o3djs.dump.dumpParamObject(context);
 
        o3djs.dump.dump('---dumping root---\n');
        o3djs.dump.dumpTransformTree(g_client.root);
 
        o3djs.dump.dump('---dumping render root---\n');
        o3djs.dump.dumpRenderNodeTree(g_client.renderGraphRoot);
 
        o3djs.dump.dump('---dump g_pack shapes---\n');
        var shapes = pack.getObjectsByClassName('o3d.Shape');
        for (var t = 0; t < shapes.length; t++) {
          o3djs.dump.dumpShape(shapes[t]);
        }
 
        o3djs.dump.dump('---dump g_pack materials---\n');
        var materials = pack.getObjectsByClassName('o3d.Material');
        for (var t = 0; t < materials.length; t++) {
          o3djs.dump.dump (
              '  ' + t + ' : ' + materials[t].className +
              ' : "' + materials[t].name + '"\n');
          o3djs.dump.dumpParams(materials[t], '    ');
        }
 
        o3djs.dump.dump('---dump g_pack textures---\n');
        var textures = pack.getObjectsByClassName('o3d.Texture');
        for (var t = 0; t < textures.length; t++) {
          o3djs.dump.dumpTexture(textures[t]);
        }
 
        o3djs.dump.dump('---dump g_pack effects---\n');
        var effects = pack.getObjectsByClassName('o3d.Effect');
        for (var t = 0; t < effects.length; t++) {
          o3djs.dump.dump ('  ' + t + ' : ' + effects[t].className +
                  ' : "' + effects[t].name + '"\n');
          o3djs.dump.dumpParams(effects[t], '    ');
        }
      }
    }
  }

  g_pack = g_client.createPack();

  // Create a new transform for the loaded file
  var parent = g_pack.createObject('Transform');
  parent.parent = g_client.root;
  if (path != null) {
    g_loadingElement.innerHTML = "Loading: " + path;
    try {
      o3djs.scene.loadScene(g_client, g_pack, parent, path, callback);
    } catch (e) {
      g_loadingElement.innerHTML = "loading failed : " + e;
    }
  }

  return parent;
}
 
function setClientSize() {
  var newWidth  = parseInt(g_client.width);
  var newHeight = parseInt(g_client.height);
 
  if (newWidth != g_o3dWidth || newHeight != g_o3dHeight) {
    g_o3dWidth = newWidth;
    g_o3dHeight = newHeight;
 
    updateProjection();
 
    // Sets a new area size for arcball.
    g_aball.setAreaSize(g_o3dWidth, g_o3dHeight);
  }
}
 
/**
 *  Called every frame.
 */
function onRender() {
  // If we don't check the size of the client area every frame we don't get a
  // chance to adjust the perspective matrix fast enough to keep up with the
  // browser resizing us.
  setClientSize();
}
 
/**
 * Creates the client area.
 */
function init() {
  o3djs.util.makeClients(initStep2, 'LargeGeometry');
}
 
/**
 * Initializes O3D and loads the scene into the transform graph.
 * @param {Array} clientElements Array of o3d object elements.
 */
function initStep2(clientElements) {
  var path = o3djs.util.getCurrentURI() + 'download?pid=2&resultType=O3D_JSON';
  var url = path;
  g_loadingElement = document.getElementById('loading');
 
  g_o3dElement = clientElements[0];
  g_o3d = g_o3dElement.o3d;
  g_math = o3djs.math;
  g_quaternions = o3djs.quaternions;
  g_client = g_o3dElement.client;
 
  g_mainPack = g_client.createPack();
 
  // Create the render graph for a view.
  g_viewInfo = o3djs.rendergraph.createBasicView(
      g_mainPack,
      g_client.root,
      g_client.renderGraphRoot);
 
  g_lastRot = g_math.matrix4.identity();
  g_thisRot = g_math.matrix4.identity();
 
  var root = g_client.root;
 
  g_aball = o3djs.arcball.create(100, 100);
  setClientSize();
 
  // Set the light at the same position as the camera to create a headlight
  // that illuminates the object straight on.
  var paramObject = g_mainPack.createObject('ParamObject');
  g_lightPosParam = paramObject.createParam('lightWorldPos', 'ParamFloat3');
  g_camera.target = [0, 0, 0];
  g_camera.eye = [0, 0, 5];
  updateCamera();
 
  doload(url)
 
  o3djs.event.addEventListener(g_o3dElement, 'mousedown', startDragging);
  o3djs.event.addEventListener(g_o3dElement, 'mousemove', drag);
  o3djs.event.addEventListener(g_o3dElement, 'mouseup', stopDragging);
  o3djs.event.addEventListener(g_o3dElement, 'wheel', scrollMe);
 
  g_client.setRenderCallback(onRender);
}
 
/**
 * Removes any callbacks so they don't get called after the page has unloaded.
 */
function uninit() {
  if (g_client) {
    g_client.cleanup();
  }
}
 
function doload(url) {
  if (g_root) {
    g_root.parent = null;
    g_root = null;
  }
  if (g_pack) {
    g_pack.destroy();
    g_pack = null;
  }
  g_root = loadFile(g_viewInfo.drawContext, url);
}
</script>
</head>
<body onload="init();" onunload="uninit();">
<div id="o3d" style="width: 100%; height: 100%;"></div>
<div style="color: red;" id="loading"></div>
</body>
</html>