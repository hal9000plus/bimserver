package org.bimserver;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.cxf.interceptor.Fault;
//import org.apache.cxf.message.Message;
//import org.apache.cxf.phase.AbstractPhaseInterceptor;
//import org.apache.cxf.phase.Phase;
//import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
//
//public class WSSecurityInterceptor extends AbstractPhaseInterceptor {
//
//	public WSSecurityInterceptor() {
//		super(Phase.PRE_PROTOCOL);
//	}
//
//	public WSSecurityInterceptor(String s) {
//		super(Phase.PRE_PROTOCOL);
//	}
//
//	public void handleMessage(Message message) throws Fault {
//		Map props = new HashMap();
//		props.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
//		props.put(WSHandlerConstants.PW_CALLBACK_REF, new PasswordHandler());
//
//		WSS4JInInterceptor wss4jInHandler = new WSS4JInInterceptor(props);
////		ValidateUserTokenInterceptor userTokenInterceptor = new ValidateUserTokenInterceptor(Phase.POST_PROTOCOL);
//
//		message.getInterceptorChain().add(wss4jInHandler);
////		message.getInterceptorChain().add(userTokenInterceptor);
//	}
//}
