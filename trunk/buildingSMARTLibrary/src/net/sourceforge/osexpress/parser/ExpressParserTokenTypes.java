// $ANTLR : "express.g" -> "ExpressParser.java"$
 
  package net.sourceforge.osexpress.parser;

   
public interface ExpressParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int CONSTANT_IDENT = 4;
	int ENTITY_IDENT = 5;
	int FUNCTION_IDENT = 6;
	int PROCEDURE_IDENT = 7;
	int PARAMETER_IDENT = 8;
	int SCHEMA_IDENT = 9;
	int TYPE_IDENT = 10;
	int VARIABLE_IDENT = 11;
	int ENUMERATION_IDENT = 12;
	int ATTRIBUTE_IDENT = 13;
	int ENTITY_ATTR_IDENT = 14;
	int TYPE_ATTR_IDENT = 15;
	int ENTITY_VAR_IDENT = 16;
	int TYPE_VAR_IDENT = 17;
	int ENTITY_PARAM_IDENT = 18;
	int TYPE_PARAM_IDENT = 19;
	int SUBTYPE_CONSTRAINT_ID = 20;
	int ACTUAL_PARAMETER_LIST = 21;
	int ADD_LIKE_OP = 22;
	int AGGREGATE_INITIALIZER = 23;
	int AGGREGATE_SOURCE = 24;
	int AGGREGATE_TYPE = 25;
	int AGGREGATION_TYPES = 26;
	int ALGORITHM_HEAD = 27;
	int ALIAS_STMT = 28;
	int ARRAY_TYPE = 29;
	int ASSIGNMENT_STMT = 30;
	int BAG_TYPE = 31;
	int BASE_TYPE = 32;
	int BINARY_TYPE = 33;
	int BOOLEAN_TYPE = 34;
	int BOUND_1 = 35;
	int BOUND_2 = 36;
	int BOUND_SPEC = 37;
	int BUILT_IN_CONSTANT = 38;
	int BUILT_IN_FUNCTION = 39;
	int BUILT_IN_PROCEDURE = 40;
	int CASE_ACTION = 41;
	int CASE_LABEL = 42;
	int CASE_STMT = 43;
	int COMPOUND_STMT = 44;
	int CONSTANT_BODY = 45;
	int CONSTANT_DECL = 46;
	int CONSTANT_FACTOR = 47;
	int CONSTANT_ID = 48;
	int DECLARATION = 49;
	int DOMAIN_RULE = 50;
	int ELEMENT = 51;
	int ENTITY_HEAD = 52;
	int ENTITY_DECL = 53;
	int ENTITY_BODY = 54;
	int SUBSUPER = 55;
	int SUPERTYPE_CONSTRAINT = 56;
	int ABSTRACT_SUPERTYPE_DECLARATION = 57;
	int SUBTYPE_DECLARATION = 58;
	int EXPLICIT_ATTR = 59;
	int ATTRIBUTE_DECL = 60;
	int ATTRIBUTE_ID = 61;
	int QUALIFIED_ATTRIBUTE = 62;
	int DERIVE_CLAUSE = 63;
	int DERIVED_ATTR = 64;
	int INVERSE_CLAUSE = 65;
	int INVERSE_ATTR = 66;
	int UNIQUE_CLAUSE = 67;
	int UNIQUE_RULE = 68;
	int REFERENCED_ATTRIBUTE = 69;
	int ENTITY_CONSTRUCTOR = 70;
	int ENTITY_ID = 71;
	int ENUMERATION_REFERENCE = 72;
	int ESCAPE_STMT = 73;
	int EXPRESSION = 74;
	int FACTOR = 75;
	int FORMAL_PARAMETER = 76;
	int ATTRIBUTE_QUALIFIER = 77;
	int FUNCTION_CALL = 78;
	int FUNCTION_DECL = 79;
	int FUNCTION_HEAD = 80;
	int FUNCTION_ID = 81;
	int GENERALIZED_TYPES = 82;
	int GENERAL_AGGREGATION_TYPES = 83;
	int GENERAL_ARRAY_TYPE = 84;
	int GENERAL_BAG_TYPE = 85;
	int GENERAL_LIST_TYPE = 86;
	int GENERAL_REF = 87;
	int GENERAL_SET_TYPE = 88;
	int GENERIC_TYPE = 89;
	int GROUP_QUALIFIER = 90;
	int IF_STMT = 91;
	int INCREMENT = 92;
	int INCREMENT_CONTROL = 93;
	int INDEX = 94;
	int INDEX_1 = 95;
	int INDEX_2 = 96;
	int INDEX_QUALIFIER = 97;
	int INTEGER_TYPE = 98;
	int INTERVAL = 99;
	int INTERVAL_HIGH = 100;
	int INTERVAL_ITEM = 101;
	int INTERVAL_LOW = 102;
	int INTERVAL_OP = 103;
	int LABEL = 104;
	int LIST_TYPE = 105;
	int LITERAL = 106;
	int REAL = 107;
	int INTEGER = 108;
	int STRING_LITERAL = 109;
	int LOCAL_DECL = 110;
	int LOCAL_VARIABLE = 111;
	int LOGICAL_EXPRESSION = 112;
	int LOGICAL = 113;
	int LOGICAL_TYPE = 114;
	int MULTIPLICATION_LIKE_OP = 115;
	int NAMED_TYPES = 116;
	int NULL_STMT = 117;
	int NUMBER_TYPE = 118;
	int NUMERIC_EXPRESSION = 119;
	int ONE_OF = 120;
	int PARAMETER = 121;
	int PARAMETER_ID = 122;
	int PARAMETER_TYPE = 123;
	int POPULATION = 124;
	int PRECISION_SPEC = 125;
	int PRIMARY = 126;
	int PROCEDURE_CALL_STMT = 127;
	int PROCEDURE_DECL = 128;
	int PROCEDURE_HEAD = 129;
	int PROCEDURE_ID = 130;
	int QUALIFIABLE_FACTOR = 131;
	int QUALIFIER = 132;
	int QUERY_EXPRESSION = 133;
	int REAL_TYPE = 134;
	int REFERENCE_CLAUSE = 135;
	int REL_OP = 136;
	int REL_OP_EXTENDED = 137;
	int REPEAT_CONTROL = 138;
	int REPEAT_STMT = 139;
	int REPETITION = 140;
	int RESOURCE_OR_RENAME = 141;
	int RESOURCE_REF = 142;
	int RETURN_STMT = 143;
	int RULE_DECL = 144;
	int RULE_HEAD = 145;
	int RULE_ID = 146;
	int SCHEMA_ID = 147;
	int SCHEMA_BODY = 148;
	int SCHEMA_DECL = 149;
	int INTERFACE_SPECIFICATION = 150;
	int USE_CLAUSE = 151;
	int NAMED_TYPE_OR_RENAME = 152;
	int SELECTOR = 153;
	int SET_TYPE = 154;
	int SIMPLE_EXPRESSION = 155;
	int SIMPLE_FACTOR = 156;
	int SIMPLE_TYPES = 157;
	int SKIP_STMT = 158;
	int STMT = 159;
	int STRING_TYPE = 160;
	int SUBTYPE_CONSTRAINT = 161;
	int SUPERTYPE_EXPRESSION = 162;
	int SUPERTYPE_FACTOR = 163;
	int SUPERTYPE_RULE = 164;
	int SUPERTYPE_TERM = 165;
	int SYNTAX = 166;
	int TERM = 167;
	int TYPE_DECL = 168;
	int UNDERLYING_TYPE = 169;
	int CONSTRUCTED_TYPES = 170;
	int ENUMERATION_TYPE = 171;
	int ENUMERATION_ID = 172;
	int SELECT_TYPE = 173;
	int TYPE_ID = 174;
	int TYPE_LABEL = 175;
	int TYPE_LABEL_ID = 176;
	int UNARY_OP = 177;
	int UNTIL_CONTROL = 178;
	int VARIABLE_ID = 179;
	int WHERE_CLAUSE = 180;
	int WHILE_CONTROL = 181;
	int WIDTH = 182;
	int WIDTH_SPEC = 183;
	int ENTITY_REF = 184;
	int TYPE_REF = 185;
	int ENUMERATION_REF = 186;
	int ATTRIBUTE_REF = 187;
	int CONSTANT_REF = 188;
	int FUNCTION_REF = 189;
	int PARAMETER_REF = 190;
	int VARIABLE_REF = 191;
	int SCHEMA_REF = 192;
	int TYPE_LABEL_REF = 193;
	int PROCEDURE_REF = 194;
	int SIMPLE_ID = 195;
	int ELSE_CLAUSE = 196;
	int RENAME_ID = 197;
	int ENUMERATION_ITEMS = 198;
	int ENUMERATION_EXTENSION = 199;
	int SELECT_LIST = 200;
	int SELECT_EXTENSION = 201;
	int REDECLARED_ATTRIBUTE = 202;
	int SUBTYPE_CONSTRAINT_DECL = 203;
	int SUBTYPE_CONSTRAINT_HEAD = 204;
	int SUBTYPE_CONSTRAINT_BODY = 205;
	int ABSTRACT_SUPERTYPE = 206;
	int TOTAL_OVER = 207;
	int CONCRETE_TYPES = 208;
	int GENERIC_ENTITY_TYPE = 209;
	int SCHEMA_VERSION_ID = 210;
	int LANGUAGE_VERSION_ID = 211;
	int LPAREN = 212;
	int COMMA = 213;
	int RPAREN = 214;
	int PLUS = 215;
	int MINUS = 216;
	int LITERAL_or = 217;
	int LITERAL_xor = 218;
	int LBRACK = 219;
	int RBRACK = 220;
	int LITERAL_aggregate = 221;
	int COLON = 222;
	int LITERAL_of = 223;
	int LITERAL_alias = 224;
	int LITERAL_for = 225;
	int IDENT = 226;
	int SEMI = 227;
	int LITERAL_end_alias = 228;
	int LITERAL_array = 229;
	int LITERAL_optional = 230;
	int LITERAL_unique = 231;
	int COLEQ = 232;
	int LITERAL_bag = 233;
	int LITERAL_binary = 234;
	int LITERAL_boolean = 235;
	int LITERAL_const_e = 236;
	int LITERAL_pi = 237;
	int LITERAL_self = 238;
	int QUESTION = 239;
	int STAR = 240;
	int LITERAL_abs = 241;
	int LITERAL_acos = 242;
	int LITERAL_asin = 243;
	int LITERAL_atan = 244;
	int LITERAL_blength = 245;
	int LITERAL_cos = 246;
	int LITERAL_exists = 247;
	int LITERAL_exp = 248;
	int LITERAL_format = 249;
	int LITERAL_hibound = 250;
	int LITERAL_hiindex = 251;
	int LITERAL_length = 252;
	int LITERAL_lobound = 253;
	int LITERAL_loindex = 254;
	int LITERAL_log = 255;
	// "log2" = 256
	// "log10" = 257
	int LITERAL_nvl = 258;
	int LITERAL_odd = 259;
	int LITERAL_rolesof = 260;
	int LITERAL_sin = 261;
	int LITERAL_sizeof = 262;
	int LITERAL_sqrt = 263;
	int LITERAL_tan = 264;
	int LITERAL_typeof = 265;
	int LITERAL_usedin = 266;
	int LITERAL_value = 267;
	int LITERAL_value_in = 268;
	int LITERAL_value_unique = 269;
	int LITERAL_insert = 270;
	int LITERAL_remove = 271;
	int LITERAL_case = 272;
	int LITERAL_otherwise = 273;
	int LITERAL_end_case = 274;
	int LITERAL_begin = 275;
	int LITERAL_end = 276;
	int LITERAL_constant = 277;
	int LITERAL_end_constant = 278;
	int LITERAL_entity = 279;
	int LITERAL_abstract = 280;
	int LITERAL_end_entity = 281;
	int LITERAL_supertype = 282;
	int LITERAL_subtype = 283;
	int LITERAL_end_subtype_constraint = 284;
	int LITERAL_subtype_constraint = 285;
	int LITERAL_total_over = 286;
	int LITERAL_renamed = 287;
	int LITERAL_derive = 288;
	int LITERAL_inverse = 289;
	int LITERAL_set = 290;
	int DOT = 291;
	int LITERAL_escape = 292;
	int DOUBLESTAR = 293;
	int LITERAL_end_function = 294;
	int LITERAL_function = 295;
	int LITERAL_list = 296;
	int LITERAL_generic = 297;
	int LITERAL_generic_entity = 298;
	int BACKSLASH = 299;
	int LITERAL_if = 300;
	int LITERAL_then = 301;
	int LITERAL_end_if = 302;
	int LITERAL_else = 303;
	int LITERAL_to = 304;
	int LITERAL_by = 305;
	int LITERAL_integer = 306;
	int LCURLY = 307;
	int RCURLY = 308;
	int LT = 309;
	int LE = 310;
	int INT = 311;
	int FLOAT = 312;
	int STRING = 313;
	int LITERAL_local = 314;
	int LITERAL_end_local = 315;
	int LITERAL_false = 316;
	int LITERAL_true = 317;
	int LITERAL_unknown = 318;
	int LITERAL_logical = 319;
	int DIVSIGN = 320;
	int LITERAL_div = 321;
	int LITERAL_mod = 322;
	int LITERAL_and = 323;
	int DOUBLEBAR = 324;
	int LITERAL_number = 325;
	int LITERAL_oneof = 326;
	int LITERAL_end_procedure = 327;
	int LITERAL_procedure = 328;
	int LITERAL_var = 329;
	int LITERAL_query = 330;
	int LTSTAR = 331;
	int BAR = 332;
	int LITERAL_real = 333;
	int LITERAL_reference = 334;
	int LITERAL_from = 335;
	int GT = 336;
	int GE = 337;
	int LTGT = 338;
	int ASSIGN = 339;
	int COLLTGT = 340;
	int COLEQCOL = 341;
	int LITERAL_in = 342;
	int LITERAL_like = 343;
	int LITERAL_repeat = 344;
	int LITERAL_end_repeat = 345;
	int LITERAL_as = 346;
	int LITERAL_return = 347;
	int LITERAL_end_rule = 348;
	int LITERAL_rule = 349;
	int LITERAL_schema = 350;
	int LITERAL_end_schema = 351;
	int LITERAL_use = 352;
	int LITERAL_skip = 353;
	int LITERAL_string = 354;
	int LITERAL_andor = 355;
	int LANG_VERSION = 356;
	int LITERAL_type = 357;
	int LITERAL_end_type = 358;
	int LITERAL_extensible = 359;
	int LITERAL_enumeration = 360;
	int LITERAL_based_on = 361;
	int LITERAL_with = 362;
	int LITERAL_select = 363;
	int LITERAL_not = 364;
	int LITERAL_until = 365;
	int LITERAL_where = 366;
	int LITERAL_while = 367;
	int LITERAL_fixed = 368;
	int COMMENT = 369;
	int LINECOMMENT = 370;
	int AMPERSAND = 371;
	int AT = 372;
	int WS = 373;
	int DIGIT = 374;
}
