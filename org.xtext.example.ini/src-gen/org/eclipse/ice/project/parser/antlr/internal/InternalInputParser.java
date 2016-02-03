package org.eclipse.ice.project.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.ice.project.services.InputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_OPEN", "RULE_ID", "RULE_CLOSE", "RULE_WHITESPACE", "RULE_ASSIGN", "RULE_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_CLOSE=7;
    public static final int RULE_ID=6;
    public static final int RULE_WS=15;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_OPEN=5;
    public static final int RULE_COMMENT=10;
    public static final int RULE_STRING=12;
    public static final int RULE_ASSIGN=9;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_WHITESPACE=8;

    // delegates
    // delegators


        public InternalInputParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInputParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInputParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInput.g"; }



     	private InputGrammarAccess grammarAccess;

        public InternalInputParser(TokenStream input, InputGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Input";
       	}

       	@Override
       	protected InputGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInput"
    // InternalInput.g:64:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalInput.g:64:46: (iv_ruleInput= ruleInput EOF )
            // InternalInput.g:65:2: iv_ruleInput= ruleInput EOF
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
    // InternalInput.g:71:1: ruleInput returns [EObject current=null] : ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token this_NEWLINE_1=null;
        EObject lv_sections_2_0 = null;



        	enterRule();

        try {
            // InternalInput.g:77:2: ( ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* ) )
            // InternalInput.g:78:2: ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* )
            {
            // InternalInput.g:78:2: ( () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )* )
            // InternalInput.g:79:3: () (this_NEWLINE_1= RULE_NEWLINE )* ( (lv_sections_2_0= ruleSection ) )*
            {
            // InternalInput.g:79:3: ()
            // InternalInput.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalInput.g:86:3: (this_NEWLINE_1= RULE_NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInput.g:87:4: this_NEWLINE_1= RULE_NEWLINE
            	    {
            	    this_NEWLINE_1=(Token)match(input,RULE_NEWLINE,FOLLOW_3); 

            	    				newLeafNode(this_NEWLINE_1, grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalInput.g:92:3: ( (lv_sections_2_0= ruleSection ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OPEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInput.g:93:4: (lv_sections_2_0= ruleSection )
            	    {
            	    // InternalInput.g:93:4: (lv_sections_2_0= ruleSection )
            	    // InternalInput.g:94:5: lv_sections_2_0= ruleSection
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
            	    						"org.eclipse.ice.project.Input.Section");
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
    // InternalInput.g:115:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // InternalInput.g:115:48: (iv_ruleSection= ruleSection EOF )
            // InternalInput.g:116:2: iv_ruleSection= ruleSection EOF
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
    // InternalInput.g:122:1: ruleSection returns [EObject current=null] : (this_OPEN_0= RULE_OPEN ( (lv_name_1_0= RULE_ID ) ) this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )* (this_NEWLINE_5= RULE_NEWLINE )* ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        Token this_OPEN_0=null;
        Token lv_name_1_0=null;
        Token this_CLOSE_2=null;
        Token this_NEWLINE_3=null;
        Token this_NEWLINE_5=null;
        EObject lv_lines_4_0 = null;



        	enterRule();

        try {
            // InternalInput.g:128:2: ( (this_OPEN_0= RULE_OPEN ( (lv_name_1_0= RULE_ID ) ) this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )* (this_NEWLINE_5= RULE_NEWLINE )* ) )
            // InternalInput.g:129:2: (this_OPEN_0= RULE_OPEN ( (lv_name_1_0= RULE_ID ) ) this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )* (this_NEWLINE_5= RULE_NEWLINE )* )
            {
            // InternalInput.g:129:2: (this_OPEN_0= RULE_OPEN ( (lv_name_1_0= RULE_ID ) ) this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )* (this_NEWLINE_5= RULE_NEWLINE )* )
            // InternalInput.g:130:3: this_OPEN_0= RULE_OPEN ( (lv_name_1_0= RULE_ID ) ) this_CLOSE_2= RULE_CLOSE ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )* (this_NEWLINE_5= RULE_NEWLINE )*
            {
            this_OPEN_0=(Token)match(input,RULE_OPEN,FOLLOW_5); 

            			newLeafNode(this_OPEN_0, grammarAccess.getSectionAccess().getOPENTerminalRuleCall_0());
            		
            // InternalInput.g:134:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInput.g:135:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInput.g:135:4: (lv_name_1_0= RULE_ID )
            // InternalInput.g:136:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.ice.project.Input.ID");
            				

            }


            }

            this_CLOSE_2=(Token)match(input,RULE_CLOSE,FOLLOW_7); 

            			newLeafNode(this_CLOSE_2, grammarAccess.getSectionAccess().getCLOSETerminalRuleCall_2());
            		
            // InternalInput.g:156:3: ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalInput.g:157:4: (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) )
            	    {
            	    // InternalInput.g:157:4: (this_NEWLINE_3= RULE_NEWLINE )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==RULE_NEWLINE) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalInput.g:158:5: this_NEWLINE_3= RULE_NEWLINE
            	    	    {
            	    	    this_NEWLINE_3=(Token)match(input,RULE_NEWLINE,FOLLOW_8); 

            	    	    					newLeafNode(this_NEWLINE_3, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    // InternalInput.g:163:4: ( (lv_lines_4_0= ruleLine ) )
            	    // InternalInput.g:164:5: (lv_lines_4_0= ruleLine )
            	    {
            	    // InternalInput.g:164:5: (lv_lines_4_0= ruleLine )
            	    // InternalInput.g:165:6: lv_lines_4_0= ruleLine
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
            	    							"org.eclipse.ice.project.Input.Line");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalInput.g:183:3: (this_NEWLINE_5= RULE_NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInput.g:184:4: this_NEWLINE_5= RULE_NEWLINE
            	    {
            	    this_NEWLINE_5=(Token)match(input,RULE_NEWLINE,FOLLOW_9); 

            	    				newLeafNode(this_NEWLINE_5, grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleLine"
    // InternalInput.g:193:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // InternalInput.g:193:45: (iv_ruleLine= ruleLine EOF )
            // InternalInput.g:194:2: iv_ruleLine= ruleLine EOF
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
    // InternalInput.g:200:1: ruleLine returns [EObject current=null] : ( (this_WHITESPACE_0= RULE_WHITESPACE )? ( (lv_name_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_value_3_0= RULE_ID ) ) ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        Token this_WHITESPACE_0=null;
        Token lv_name_1_0=null;
        Token this_ASSIGN_2=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalInput.g:206:2: ( ( (this_WHITESPACE_0= RULE_WHITESPACE )? ( (lv_name_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_value_3_0= RULE_ID ) ) ) )
            // InternalInput.g:207:2: ( (this_WHITESPACE_0= RULE_WHITESPACE )? ( (lv_name_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_value_3_0= RULE_ID ) ) )
            {
            // InternalInput.g:207:2: ( (this_WHITESPACE_0= RULE_WHITESPACE )? ( (lv_name_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_value_3_0= RULE_ID ) ) )
            // InternalInput.g:208:3: (this_WHITESPACE_0= RULE_WHITESPACE )? ( (lv_name_1_0= RULE_ID ) ) this_ASSIGN_2= RULE_ASSIGN ( (lv_value_3_0= RULE_ID ) )
            {
            // InternalInput.g:208:3: (this_WHITESPACE_0= RULE_WHITESPACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WHITESPACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInput.g:209:4: this_WHITESPACE_0= RULE_WHITESPACE
                    {
                    this_WHITESPACE_0=(Token)match(input,RULE_WHITESPACE,FOLLOW_5); 

                    				newLeafNode(this_WHITESPACE_0, grammarAccess.getLineAccess().getWHITESPACETerminalRuleCall_0());
                    			

                    }
                    break;

            }

            // InternalInput.g:214:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInput.g:215:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInput.g:215:4: (lv_name_1_0= RULE_ID )
            // InternalInput.g:216:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.ice.project.Input.ID");
            				

            }


            }

            this_ASSIGN_2=(Token)match(input,RULE_ASSIGN,FOLLOW_5); 

            			newLeafNode(this_ASSIGN_2, grammarAccess.getLineAccess().getASSIGNTerminalRuleCall_2());
            		
            // InternalInput.g:236:3: ( (lv_value_3_0= RULE_ID ) )
            // InternalInput.g:237:4: (lv_value_3_0= RULE_ID )
            {
            // InternalInput.g:237:4: (lv_value_3_0= RULE_ID )
            // InternalInput.g:238:5: lv_value_3_0= RULE_ID
            {
            lv_value_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getLineAccess().getValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.eclipse.ice.project.Input.ID");
            				

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\2\2\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\10\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\uffff\1\3",
            "\1\1\1\2\1\3\1\uffff\1\3",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 156:3: ( (this_NEWLINE_3= RULE_NEWLINE )* ( (lv_lines_4_0= ruleLine ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000152L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000150L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});

}