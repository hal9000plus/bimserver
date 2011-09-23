/* Generated By:JavaCC: Do not edit this line. Part21Parser.java */
package nl.tue.buildingsmart.express.population;

/******************************************************************************
 * Copyright (C) 2011  BIMserver.org
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

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import nl.tue.buildingsmart.express.parser.ExpressSchemaParser;

import org.bimserver.plugins.schema.Attribute;
import org.bimserver.plugins.schema.EntityDefinition;
import org.bimserver.plugins.schema.ExplicitAttribute;
import org.bimserver.plugins.schema.InverseAttribute;
import org.bimserver.plugins.schema.SchemaDefinition;

//import owlGenerator;

@SuppressWarnings("all")
public class Part21Parser implements Part21ParserConstants {

        public Vector current_record = new Vector();
        public Object[] current_entity = new Object[2];



        private SchemaDefinition schema;
        private String schemaName;
        private File schemaFile;
        private ModelPopulation model;

        private HashMap <Integer,EntityInstance> instances;

        private FileInputStream inputStream;

        static boolean verbose;

        public void init(){
                 this.instances = new HashMap<Integer,EntityInstance>();

                this.verbose= false;
                this.schemaName = new String("");
        if (this.schema ==null ){
                ExpressSchemaParser schemaParser = new ExpressSchemaParser(schemaFile);
                schemaParser.parse();
                this.schema = schemaParser.getSchema();
                if (verbose) System.out.println("Loading Schema "+this.schema.getName()+" successful");
        }
}
        public HashMap<Integer, EntityInstance> getInstances() {
                return instances;
        }


        public void setInstances(HashMap<Integer, EntityInstance> instances) {
                this.instances = instances;
        }



        public SchemaDefinition getSchema() {
                return schema;
        }

        public void setSchema(SchemaDefinition schema) {
                this.schema = schema;
        }

        public String getSchemaName() {
                return schemaName;
        }

        public void setSchemaName(String schemaName) {
                this.schemaName = schemaName;
        }

        public File getSchemaFile() {
                return schemaFile;
        }

        public void setSchemaFile(File schemaFile) {
                this.schemaFile = schemaFile;
        }



        public ModelPopulation getModel() {
                return model;
        }
        public void setModel(ModelPopulation model) {
                this.model = model;
        }

/************************************************
* Grammar
***********************************************/
  final public void exchange_file() throws ParseException {
    jj_consume_token(50);
    header_section();
    data_section();
    jj_consume_token(51);
  }

  final public void header_section() throws ParseException {
    jj_consume_token(52);
    header_entity();
    header_entity();
    header_entity();
    if (jj_2_1(3)) {
      header_entity_list();
    } else {
      ;
    }
    jj_consume_token(53);
  }

  final public void header_entity_list() throws ParseException {
    header_entity();
    label_1:
    while (true) {
      if (jj_2_2(3)) {
        ;
      } else {
        break label_1;
      }
      header_entity();
    }
  }

  final public void header_entity() throws ParseException {
                        Token name=null;
    name = jj_consume_token(KEYWORD);
    jj_consume_token(LPAREN);
    if (jj_2_3(3)) {
      parameter_list();
    } else {
      ;
    }
        if (name.image.indexOf("FILE_SCHEMA")>-1){
        String schema_name = ((String[])((Vector)current_record.get(9)).get(0))[1];
        this.setSchemaName(schema_name);

        }
    jj_consume_token(RPAREN);
    jj_consume_token(SEMICOLON);
  }

  final public void parameter_list() throws ParseException {
    parameter();
    label_2:
    while (true) {
      if (jj_2_4(3)) {
        ;
      } else {
        break label_2;
      }
      jj_consume_token(COMMA);
      parameter();
    }
  }

  final public void parameter() throws ParseException {
    if (jj_2_5(3)) {
      typed_parameter();
    } else if (jj_2_6(3)) {
      untyped_parameter();
    } else if (jj_2_7(3)) {
      omitted_parameter();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void typed_parameter() throws ParseException {
                Token t = null;
                Object[] pair = new Object[2];
                Vector park_current = (Vector)current_record.clone();
            current_record.clear();
    t = jj_consume_token(KEYWORD);
    jj_consume_token(LPAREN);
    parameter();
    jj_consume_token(RPAREN);
        pair[0]=t.image;
        pair[1]=current_record.clone();
        //System.out.println("TP:"+t.image+"("+current_record.clone()+")");
        park_current.add(pair);
        current_record=(Vector)park_current.clone();
  }

  final public void untyped_parameter() throws ParseException {
        Token t=null;
        String[] pair = new String[2];
    if (jj_2_8(3)) {
      t = jj_consume_token(DOLLAR);
           if (t!=null) {

                    pair[0]="DOLLAR";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("DOLLAR"+t.image+", ");
           }
    } else if (jj_2_9(3)) {
      t = jj_consume_token(INTEGER);
           if (t!=null) {
                        pair[0]="INTEGER";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("INTEGER"+t.image+", ");
           }
    } else if (jj_2_10(3)) {
      t = jj_consume_token(REAL);
           if (t!=null) {
                        pair[0]="REAL";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("REAL"+t.image+", ");
           }
    } else if (jj_2_11(3)) {
      t = jj_consume_token(STRING);
           if (t!=null) {
                        pair[0]="STRING";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("STRING"+t.image+", ");
           }
    } else if (jj_2_12(3)) {
      t = jj_consume_token(ENTITY_INSTANCE_NAME);
           if (t!=null) {
                        pair[0]="ENTITY_INSTANCE_NAME";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("ENTITY_INSTANCE_NAME"+t.image+", ");
           }
    } else if (jj_2_13(3)) {
      t = jj_consume_token(ENUMERATION);
           if (t!=null) {
                        pair[0]="ENUMERATION";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("ENUMERATION"+t.image+", ");
           }
    } else if (jj_2_14(3)) {
      t = jj_consume_token(BINARY);
           if (t!=null) {
                        pair[0]="BINARY";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("BINARY"+t.image+", ");
           }
    } else if (jj_2_15(3)) {
      list();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void omitted_parameter() throws ParseException {
        Token t=null;
        String[] pair = new String[2];
    t = jj_consume_token(STAR);
           if (t!=null) {
                        pair[0]="STAR";
                    pair[1]=t.image;
                        current_record.add(pair);
                        if (verbose)
                                System.out.print("STAR"+t.image+", ");
           }
  }

  final public void list() throws ParseException {
        //park the Vector 
         Vector park_current = (Vector)current_record.clone();
     current_record.clear();
        if (verbose)
                System.out.print("list, ");
    jj_consume_token(LPAREN);
    label_3:
    while (true) {
      if (jj_2_16(3)) {
        ;
      } else {
        break label_3;
      }
      parameter();
      label_4:
      while (true) {
        if (jj_2_17(3)) {
          ;
        } else {
          break label_4;
        }
        jj_consume_token(COMMA);
        parameter();
      }
    }
    jj_consume_token(RPAREN);
        park_current.add(current_record.clone());
        current_record=(Vector)park_current.clone();
  }

  final public void data_section() throws ParseException {
    jj_consume_token(54);
    entity_instance_list();
    jj_consume_token(53);
  }

  final public void entity_instance_list() throws ParseException {
    entity_instance();
    label_5:
    while (true) {
      if (jj_2_18(3)) {
        ;
      } else {
        break label_5;
      }
      entity_instance();
    }
  }

  final public void entity_instance() throws ParseException {
    if (jj_2_19(3)) {
        if (verbose)
                System.out.print("entity_instance, ");
      simple_entity_instance();
    } else if (jj_2_20(3)) {
      complex_entity_instance();
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  public void simple_entity_instance() throws ParseException {
                                 Token name=null;
    name = jj_consume_token(ENTITY_INSTANCE_NAME);
    jj_consume_token(EQ);
    if (jj_2_21(3)) {
      scope();
    } else {
      ;
    }
    simple_record();
    jj_consume_token(SEMICOLON);
        //System.out.println("instance name "+name.image);
        Integer id = new Integer(name.image.substring(1,name.image.length()));
        EntityInstance ent = new EntityInstance(this.getModel(), id.intValue());
        EntityDefinition entDef = schema.getEntityBN((String)current_entity[0]);
        ent.setEntityDefinition(entDef);
        Iterator<Attribute> attribIter = entDef.getAttributes(true).iterator();
        int attribCount = entDef.getAttributes(true).size();
        int recordSize = current_record.size();
        Iterator recordIter = current_record.iterator();
        while (attribIter.hasNext()){
                //System.out.println(attribIter.next().getName());
                Attribute attr = attribIter.next();
                if (!(attr instanceof InverseAttribute)){
                        AttributeInstance ai = new AttributeInstance();
                        ai.setAttributeType((ExplicitAttribute)attr);
                        Object tmp = recordIter.next();
                        //System.out.println(tmp.getClass());
                        //ai.setValue(tmp);

                        if (tmp instanceof String[]){
                                //only get the value part
                                String[] singleval = (String[])tmp;
                                ai.setValue(singleval[1]);
                                ai.setP21Header(singleval[0]);
                        }
                        else if (tmp instanceof Vector){
                                        Vector<String> tmpVec = new Vector<String>();
                                        Iterator vecIter = ((Vector)tmp).iterator();
                                        String header ="";
                                        while (vecIter.hasNext()){
                                                Object value = vecIter.next();
                                                if (value instanceof String[])
                                                {
                                                        String[] stringVal = (String[])value;
                                                        if (!header.equals("") && !stringVal[0].equals(header))
                                                                System.err.println("ERROR: "+stringVal[0]+" has different header than "+header);
                                                        tmpVec.add(stringVal[1]);
                                                        ai.setP21Header(stringVal[0]);
                                                        header=stringVal[0];
                                                }
                                        }
                                        ai.setValue(tmpVec);
                                }




                        else if (tmp instanceof Object[]){
                                //an inlinde definition of some type
                                Object[] inline = (Object[])tmp;
                                ai.setP21Header((String)inline[0]);
                                if (inline[1] instanceof Vector){
                                        Vector<String> tmpVec = new Vector<String>();
                                        Iterator vecIter = ((Vector)inline[1]).iterator();
                                        while (vecIter.hasNext()){
                                                Object value = vecIter.next();
                                                if (value instanceof String[])
                                                {
                                                        tmpVec.add(((String[])value)[1]);
                                                }
                                        }
                                        ai.setValue(tmpVec);
                                }


                        }


                        ent.addAttribute(ai);
                     /*   if (ai.getAttributeType().getDomain() instanceof SimpleType){
                                if (ai.getAttributeType().getDomain() instanceof StringType){
                                        if (!(tmp instanceof String[] || !((String[])tmp)[0].equalsIgnoreCase("string")))
                                                        System.err.println("error");
                                }


                        }
                        */
                }
        }
        //ent.setId(name.image);
        instances.put(id, ent);
  }

  final public void complex_entity_instance() throws ParseException {
  Token t=null;
    jj_consume_token(ENTITY_INSTANCE_NAME);
    jj_consume_token(EQ);
    if (jj_2_22(3)) {
      scope();
    } else {
      ;
    }
    subsuper_record();
    jj_consume_token(SEMICOLON);
        if (verbose)
                System.out.println("Complex:"+t);
  }

  final public void scope() throws ParseException {
    jj_consume_token(55);
    entity_instance_list();
    jj_consume_token(56);
    if (jj_2_23(3)) {
      export_list();
    } else {
      ;
    }
  }

  final public void export_list() throws ParseException {
    jj_consume_token(SLASH);
    jj_consume_token(ENTITY_INSTANCE_NAME);
    label_6:
    while (true) {
      if (jj_2_24(3)) {
        ;
      } else {
        break label_6;
      }
      jj_consume_token(COMMA);
      jj_consume_token(ENTITY_INSTANCE_NAME);
    }
    jj_consume_token(SLASH);
  }

  final public void simple_record() throws ParseException {
                        Token record=null;
                current_entity = new Object[2];
                current_record = new Vector();
    record = jj_consume_token(KEYWORD);
        if (verbose)
                System.out.print("record: " + record.image+ " ");
    jj_consume_token(LPAREN);
    if (jj_2_25(3)) {
      parameter_list();
    } else {
      ;
    }
    jj_consume_token(RPAREN);
        if (verbose)
                System.out.println(" end record: "+current_record.size()) ;


        current_entity[0]=record.image;
        current_entity[1]=current_record.clone();
  }

  final public void subsuper_record() throws ParseException {
    jj_consume_token(LPAREN);
    simple_record_list();
    jj_consume_token(RPAREN);
  }

  final public void simple_record_list() throws ParseException {
    simple_record();
    label_7:
    while (true) {
      if (jj_2_26(3)) {
        ;
      } else {
        break label_7;
      }
      simple_record();
    }
  if (verbose)
        System.out.print("simple_record_list triggered");
  }

  final public void syntax() throws ParseException {
    exchange_file();
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  private boolean jj_2_7(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_7(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(6, xla); }
  }

  private boolean jj_2_8(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_8(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(7, xla); }
  }

  private boolean jj_2_9(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_9(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(8, xla); }
  }

  private boolean jj_2_10(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_10(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(9, xla); }
  }

  private boolean jj_2_11(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_11(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(10, xla); }
  }

  private boolean jj_2_12(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_12(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(11, xla); }
  }

  private boolean jj_2_13(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_13(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(12, xla); }
  }

  private boolean jj_2_14(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_14(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(13, xla); }
  }

  private boolean jj_2_15(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_15(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(14, xla); }
  }

  private boolean jj_2_16(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_16(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(15, xla); }
  }

  private boolean jj_2_17(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_17(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(16, xla); }
  }

  private boolean jj_2_18(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_18(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(17, xla); }
  }

  private boolean jj_2_19(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_19(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(18, xla); }
  }

  private boolean jj_2_20(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_20(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(19, xla); }
  }

  private boolean jj_2_21(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_21(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(20, xla); }
  }

  private boolean jj_2_22(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_22(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(21, xla); }
  }

  private boolean jj_2_23(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_23(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(22, xla); }
  }

  private boolean jj_2_24(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_24(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(23, xla); }
  }

  private boolean jj_2_25(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_25(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(24, xla); }
  }

  private boolean jj_2_26(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_26(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(25, xla); }
  }

  private boolean jj_3_8() {
    if (jj_scan_token(DOLLAR)) return true;
    return false;
  }

  private boolean jj_3R_13() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_8()) {
    jj_scanpos = xsp;
    if (jj_3_9()) {
    jj_scanpos = xsp;
    if (jj_3_10()) {
    jj_scanpos = xsp;
    if (jj_3_11()) {
    jj_scanpos = xsp;
    if (jj_3_12()) {
    jj_scanpos = xsp;
    if (jj_3_13()) {
    jj_scanpos = xsp;
    if (jj_3_14()) {
    jj_scanpos = xsp;
    if (jj_3_15()) return true;
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  private boolean jj_3_23() {
    if (jj_3R_20()) return true;
    return false;
  }

  private boolean jj_3_24() {
    if (jj_scan_token(COMMA)) return true;
    if (jj_scan_token(ENTITY_INSTANCE_NAME)) return true;
    return false;
  }

  private boolean jj_3R_22() {
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3R_14() {
    if (jj_scan_token(STAR)) return true;
    return false;
  }

  private boolean jj_3_25() {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3_21() {
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3R_12() {
    if (jj_scan_token(KEYWORD)) return true;
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3_15() {
    if (jj_3R_15()) return true;
    return false;
  }

  private boolean jj_3_7() {
    if (jj_3R_14()) return true;
    return false;
  }

  private boolean jj_3_22() {
    if (jj_3R_19()) return true;
    return false;
  }

  private boolean jj_3_6() {
    if (jj_3R_13()) return true;
    return false;
  }

  private boolean jj_3R_21() {
    if (jj_scan_token(KEYWORD)) return true;
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_25()) jj_scanpos = xsp;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  private boolean jj_3_4() {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3_20() {
    if (jj_3R_18()) return true;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_3R_12()) return true;
    return false;
  }

  private boolean jj_3R_11() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_5()) {
    jj_scanpos = xsp;
    if (jj_3_6()) {
    jj_scanpos = xsp;
    if (jj_3_7()) return true;
    }
    }
    return false;
  }

  private boolean jj_3_14() {
    if (jj_scan_token(BINARY)) return true;
    return false;
  }

  private boolean jj_3R_20() {
    if (jj_scan_token(SLASH)) return true;
    if (jj_scan_token(ENTITY_INSTANCE_NAME)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_24()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(SLASH)) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_3R_11()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_4()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_13() {
    if (jj_scan_token(ENUMERATION)) return true;
    return false;
  }

  private boolean jj_3R_19() {
    if (jj_scan_token(55)) return true;
    if (jj_3R_23()) return true;
    return false;
  }

  private boolean jj_3_18() {
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_17() {
    if (jj_scan_token(ENTITY_INSTANCE_NAME)) return true;
    if (jj_scan_token(EQ)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_21()) jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    return false;
  }

  private boolean jj_3R_18() {
    if (jj_scan_token(ENTITY_INSTANCE_NAME)) return true;
    if (jj_scan_token(EQ)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_22()) jj_scanpos = xsp;
    if (jj_3R_22()) return true;
    return false;
  }

  private boolean jj_3_12() {
    if (jj_scan_token(ENTITY_INSTANCE_NAME)) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3_17() {
    if (jj_scan_token(COMMA)) return true;
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3_19() {
    if (jj_3R_17()) return true;
    return false;
  }

  private boolean jj_3R_16() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_19()) {
    jj_scanpos = xsp;
    if (jj_3_20()) return true;
    }
    return false;
  }

  private boolean jj_3R_9() {
    if (jj_scan_token(KEYWORD)) return true;
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_3()) jj_scanpos = xsp;
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  private boolean jj_3R_23() {
    if (jj_3R_16()) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_3R_8()) return true;
    return false;
  }

  private boolean jj_3_11() {
    if (jj_scan_token(STRING)) return true;
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3_16() {
    if (jj_3R_11()) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_17()) { jj_scanpos = xsp; break; }
    }
    return false;
  }

  private boolean jj_3_10() {
    if (jj_scan_token(REAL)) return true;
    return false;
  }

  private boolean jj_3_26() {
    if (jj_3R_21()) return true;
    return false;
  }

  private boolean jj_3_9() {
    if (jj_scan_token(INTEGER)) return true;
    return false;
  }

  private boolean jj_3R_15() {
    if (jj_scan_token(LPAREN)) return true;
    Token xsp;
    while (true) {
      xsp = jj_scanpos;
      if (jj_3_16()) { jj_scanpos = xsp; break; }
    }
    if (jj_scan_token(RPAREN)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public Part21ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[26];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Part21Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Part21Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Part21ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Part21Parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Part21ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Part21Parser(Part21ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(Part21ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  public Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[57];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 57; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 26; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
            case 6: jj_3_7(); break;
            case 7: jj_3_8(); break;
            case 8: jj_3_9(); break;
            case 9: jj_3_10(); break;
            case 10: jj_3_11(); break;
            case 11: jj_3_12(); break;
            case 12: jj_3_13(); break;
            case 13: jj_3_14(); break;
            case 14: jj_3_15(); break;
            case 15: jj_3_16(); break;
            case 16: jj_3_17(); break;
            case 17: jj_3_18(); break;
            case 18: jj_3_19(); break;
            case 19: jj_3_20(); break;
            case 20: jj_3_21(); break;
            case 21: jj_3_22(); break;
            case 22: jj_3_23(); break;
            case 23: jj_3_24(); break;
            case 24: jj_3_25(); break;
            case 25: jj_3_26(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
