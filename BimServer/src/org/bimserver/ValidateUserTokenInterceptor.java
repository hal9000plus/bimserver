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


//public class ValidateUserTokenInterceptor extends AbstractPhaseInterceptor {
//
//	public ValidateUserTokenInterceptor(String s) {
//		super(s);
//	}
//
//	public void handleMessage(Message message) throws Fault {
//		boolean userTokenValidated = false;
//		Vector result = (Vector) message.getContextualProperty(WSHandlerConstants.RECV_RESULTS);
//		for (int i = 0; i < result.size(); i++) {
//			WSHandlerResult res = (WSHandlerResult) result.get(i);
//			for (int j = 0; j < res.getResults().size(); j++) {
//				WSSecurityEngineResult secRes = (WSSecurityEngineResult) res.getResults().get(j);
//				WSUsernameTokenPrincipal principal = (WSUsernameTokenPrincipal) secRes.getPrincipal();
//				if (principal.getPassword() == null) {
//					throw new RuntimeException("Invalid Security Header");
//				} else {
//					userTokenValidated = true;
//				}
//			}
//		}
//		if (!userTokenValidated) {
//			throw new RuntimeException("Security processing failed");
//		}
//	}
//}
