package org.eclipse.ice.example.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ice.example.services.ExampleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExampleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_OPEN", "RULE_ID", "RULE_CLOSE", "RULE_ASSIGN", "RULE_TEXT", "RULE_WHITESPACE", "RULE_STRING", "RULE_COMMENT", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_CLOSE=7;
    public static final int RULE_ID=6;
    public static final int RULE_WS=16;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_OPEN=5;
    public static final int RULE_STRING=11;
    public static final int RULE_COMMENT=12;
    public static final int RULE_ASSIGN=8;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=14;
    public static final int RULE_TEXT=9;
    public static final int EOF=-1;
    public static final int RULE_WHITESPACE=10;

    // delegates
    // delegators


        public InternalExampleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExampleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExampleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExample.g"; }



     	private ExampleGrammarAccess grammarAccess;

        public InternalExampleParser(TokenStream input, ExampleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Input";
       	}

       	@Override
       	protected ExampleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInput"
    // InternalExample.g:64:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalExample.g:64:46: (iv_ruleInput= ruleInput EOF )
            // InternalExample.g:65:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalExample.g:71:1: ruleInput returns [EObject current=null] : ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_1=null;
        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalExample.g:77:2: ( ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* ) )
            // InternalExample.g:78:2: ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* )
            {
            // InternalExample.g:78:2: ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* )
            // InternalExample.g:79:3: () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )*
            {
            // InternalExample.g:79:3: ()
            // InternalExample.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalExample.g:86:3: (this_NEWLINE_1= RULE_NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExample.g:87:4: this_NEWLINE_1= RULE_NEWLINE
            	    {
            	    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_3); 

            	    				newLeafNode(this_NEWLINE_1, grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalExample.g:92:3: ( (lv_sections_2_0= ruleSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OPEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalExample.g:93:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalExample.g:93:4: (lv_sections_2_0= ruleSection )
            	    // InternalExample.g:94:5: lv_sections_2_0= ruleSection
            	    {

            	    					newCompositeNode(grammarAccess.getInputAccess().getSectionsSectionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_sections_2_0=ruleSection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInputRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sections",
            	    						lv_sections_2_0,
            	    						"org.eclipse.ice.example.Example.Section");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleSection"
    // InternalExample.g:115:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalExample.g:115:48: (iv_ruleSection= ruleSection EOF )
            // InternalExample.g:116:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalExample.g:122:1: ruleSection returns [EObject current=null] : ( (this_OPEN_0= RULE_OPEN )+ ( (lv_sectionName_1_0= RULE_ID ) )+ this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+ (this_NEWLINE_5= RULE_NEWLINE )+ ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token lv_sectionName_1_0=null;
        Token this_CLOSE_2=null;
        Token this_NEWLINE_3=null;
        Token this_NEWLINE_5=null;
        EObject lv_lines_4_0 = null;



        	enterRule();

        try {
            // InternalExample.g:128:2: ( ( (this_OPEN_0= RULE_OPEN )+ ( (lv_sectionName_1_0= RULE_ID ) )+ this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+ (this_NEWLINE_5= RULE_NEWLINE )+ ) )
            // InternalExample.g:129:2: ( (this_OPEN_0= RULE_OPEN )+ ( (lv_sectionName_1_0= RULE_ID ) )+ this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+ (this_NEWLINE_5= RULE_NEWLINE )+ )
            {
            // InternalExample.g:129:2: ( (this_OPEN_0= RULE_OPEN )+ ( (lv_sectionName_1_0= RULE_ID ) )+ this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+ (this_NEWLINE_5= RULE_NEWLINE )+ )
            // InternalExample.g:130:3: (this_OPEN_0= RULE_OPEN )+ ( (lv_sectionName_1_0= RULE_ID ) )+ this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+ (this_NEWLINE_5= RULE_NEWLINE )+
            {
            // InternalExample.g:130:3: (this_OPEN_0= RULE_OPEN )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_OPEN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExample.g:131:4: this_OPEN_0= RULE_OPEN
            	    {
            	    this_OPEN_0=(Token)match(input,RULE_OPEN,FOLLOW_5); 

            	    				newLeafNode(this_OPEN_0, grammarAccess.getSectionAccess().getOPENTerminalRuleCall_0());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // InternalExample.g:136:3: ( (lv_sectionName_1_0= RULE_ID ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalExample.g:137:4: (lv_sectionName_1_0= RULE_ID )
            	    {
            	    // InternalExample.g:137:4: (lv_sectionName_1_0= RULE_ID )
            	    // InternalExample.g:138:5: lv_sectionName_1_0= RULE_ID
            	    {
            	    lv_sectionName_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    					newLeafNode(lv_sectionName_1_0, grammarAccess.getSectionAccess().getSectionNameIDTerminalRuleCall_1_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getSectionRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"sectionName",
            	    						lv_sectionName_1_0,
            	    						"org.eclipse.ice.example.Example.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_CLOSE_2=(Token)match(input,RULE_CLOSE,FOLLOW_7); 

            			newLeafNode(this_CLOSE_2, grammarAccess.getSectionAccess().getCLOSETerminalRuleCall_2());
            		
            // InternalExample.g:158:3: ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalExample.g:159:4: (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) )
            	    {
            	    // InternalExample.g:159:4: (this_NEWLINE_3= RULE_NEWLINE )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==RULE_NEWLINE) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalExample.g:160:5: this_NEWLINE_3= RULE_NEWLINE
            	    	    {
            	    	    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

            	    	    					newLeafNode(this_NEWLINE_3, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalExample.g:165:4: ( (lv_lines_4_0= ruleLine ) )
            	    // InternalExample.g:166:5: (lv_lines_4_0= ruleLine )
            	    {
            	    // InternalExample.g:166:5: (lv_lines_4_0= ruleLine )
            	    // InternalExample.g:167:6: lv_lines_4_0= ruleLine
            	    {

            	    						newCompositeNode(grammarAccess.getSectionAccess().getLinesLineParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_lines_4_0=ruleLine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"lines",
            	    							lv_lines_4_0,
            	    							"org.eclipse.ice.example.Example.Line");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalExample.g:185:3: (this_NEWLINE_5= RULE_NEWLINE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExample.g:186:4: this_NEWLINE_5= RULE_NEWLINE
            	    {
            	    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

            	    				newLeafNode(this_NEWLINE_5, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleLine"
    // InternalExample.g:195:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalExample.g:195:45: (iv_ruleLine= ruleLine EOF )
            // InternalExample.g:196:2: iv_ruleLine= ruleLine EOF
            {
             newCompositeNode(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLine=ruleLine();

            state._fsp--;

             current =iv_ruleLine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalExample.g:202:1: ruleLine returns [EObject current=null] : ( ( (lv_varName_0_0= RULE_ID ) )+ (this_ASSIGN_1= RULE_ASSIGN )+ ( (lv_value_2_0= RULE_TEXT ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token lv_varName_0_0=null;
        Token this_ASSIGN_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalExample.g:208:2: ( ( ( (lv_varName_0_0= RULE_ID ) )+ (this_ASSIGN_1= RULE_ASSIGN )+ ( (lv_value_2_0= RULE_TEXT ) ) ) )
            // InternalExample.g:209:2: ( ( (lv_varName_0_0= RULE_ID ) )+ (this_ASSIGN_1= RULE_ASSIGN )+ ( (lv_value_2_0= RULE_TEXT ) ) )
            {
            // InternalExample.g:209:2: ( ( (lv_varName_0_0= RULE_ID ) )+ (this_ASSIGN_1= RULE_ASSIGN )+ ( (lv_value_2_0= RULE_TEXT ) ) )
            // InternalExample.g:210:3: ( (lv_varName_0_0= RULE_ID ) )+ (this_ASSIGN_1= RULE_ASSIGN )+ ( (lv_value_2_0= RULE_TEXT ) )
            {
            // InternalExample.g:210:3: ( (lv_varName_0_0= RULE_ID ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalExample.g:211:4: (lv_varName_0_0= RULE_ID )
            	    {
            	    // InternalExample.g:211:4: (lv_varName_0_0= RULE_ID )
            	    // InternalExample.g:212:5: lv_varName_0_0= RULE_ID
            	    {
            	    lv_varName_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    					newLeafNode(lv_varName_0_0, grammarAccess.getLineAccess().getVarNameIDTerminalRuleCall_0_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getLineRule());
            	    					}
            	    					setWithLastConsumed(
            	    						current,
            	    						"varName",
            	    						lv_varName_0_0,
            	    						"org.eclipse.ice.example.Example.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            // InternalExample.g:228:3: (this_ASSIGN_1= RULE_ASSIGN )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ASSIGN) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExample.g:229:4: this_ASSIGN_1= RULE_ASSIGN
            	    {
            	    this_ASSIGN_1=(Token)match(input,RULE_ASSIGN,FOLLOW_11); 

            	    				newLeafNode(this_ASSIGN_1, grammarAccess.getLineAccess().getASSIGNTerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalExample.g:234:3: ( (lv_value_2_0= RULE_TEXT ) )
            // InternalExample.g:235:4: (lv_value_2_0= RULE_TEXT )
            {
            // InternalExample.g:235:4: (lv_value_2_0= RULE_TEXT )
            // InternalExample.g:236:5: lv_value_2_0= RULE_TEXT
            {
            lv_value_2_0=(Token)match(input,RULE_TEXT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getLineAccess().getValueTEXTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.ice.example.Example.TEXT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\uffff\1\2\2\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\1\4\1\6\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\1\1\2\1\3",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 158:3: ( (this_NEWLINE_3= RULE_NEWLINE )+ ( (lv_lines_4_0= ruleLine ) ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000300L});

}