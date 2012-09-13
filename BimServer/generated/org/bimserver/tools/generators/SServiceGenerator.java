package org.bimserver.tools.generators;

import org.eclipse.emf.ecore.*;
import org.bimserver.utils.*;
import java.io.File;

public class SServiceGenerator
{
  protected static String nl;
  public static synchronized SServiceGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    SServiceGenerator result = new SServiceGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package org.bimserver.interfaces;" + NL;
  protected final String TEXT_2 = NL + NL + "import org.bimserver.shared.meta.*;" + NL + "import org.slf4j.Logger;" + NL + "import org.slf4j.LoggerFactory;" + NL + "import java.io.File;" + NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + NL + "public class S";
  protected final String TEXT_6 = "Service extends SService {" + NL + "\tprivate static final Logger LOGGER = LoggerFactory.getLogger(S";
  protected final String TEXT_7 = "Service.class);" + NL + "" + NL + "\tpublic S";
  protected final String TEXT_8 = "Service(File sourceFile, Class<?> cl) {" + NL + "\t\tsuper(sourceFile, cl);" + NL + "\t}" + NL + "\t" + NL + "\t\tpublic void init() {" + NL + "\t\t\ttry {";
  protected final String TEXT_9 = NL + "\t\taddType(new SClass(this, Class.forName(\"org.bimserver.interfaces.objects.S";
  protected final String TEXT_10 = "\")));";
  protected final String TEXT_11 = NL + "\t\t} catch (ClassNotFoundException e) {" + NL + "\t\t\tLOGGER.error(\"\", e);" + NL + "\t\t}" + NL + "\t}" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
/******************************************************************************
 * Copyright (C) 2009-2012  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    stringBuffer.append(Licenser.getCommentedLicenseText(new File("license.txt")));
    stringBuffer.append(TEXT_4);
    
Object[] args = (Object[])argument;
Class<?> cl = (Class<?>)args[0];
EPackage ePackage = (EPackage)args[1];

    stringBuffer.append(TEXT_5);
    stringBuffer.append(cl.getSimpleName());
    stringBuffer.append(TEXT_6);
    stringBuffer.append(cl.getSimpleName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cl.getSimpleName());
    stringBuffer.append(TEXT_8);
    
		for (EClassifier eClassifier : ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass || eClassifier instanceof EEnum) {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(eClassifier.getName());
    stringBuffer.append(TEXT_10);
    
			}
		}

    stringBuffer.append(TEXT_11);
    return stringBuffer.toString();
  }
}