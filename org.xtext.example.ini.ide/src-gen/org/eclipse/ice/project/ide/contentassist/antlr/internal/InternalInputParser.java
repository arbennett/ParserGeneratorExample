package org.eclipse.ice.project.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.ice.project.services.InputGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalInputParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NEWLINE", "RULE_OPEN", "RULE_CLOSE", "RULE_WHITESPACE", "RULE_ASSIGN", "RULE_ID", "RULE_COMMENT", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_CLOSE=6;
    public static final int RULE_ID=9;
    public static final int RULE_WS=15;
    public static final int RULE_NEWLINE=4;
    public static final int RULE_OPEN=5;
    public static final int RULE_COMMENT=10;
    public static final int RULE_STRING=12;
    public static final int RULE_ASSIGN=8;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_INT=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_WHITESPACE=7;

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

    	public void setGrammarAccess(InputGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInput"
    // InternalInput.g:53:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // InternalInput.g:54:1: ( ruleInput EOF )
            // InternalInput.g:55:1: ruleInput EOF
            {
             before(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            ruleInput();

            state._fsp--;

             after(grammarAccess.getInputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalInput.g:62:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:66:2: ( ( ( rule__Input__Group__0 ) ) )
            // InternalInput.g:67:2: ( ( rule__Input__Group__0 ) )
            {
            // InternalInput.g:67:2: ( ( rule__Input__Group__0 ) )
            // InternalInput.g:68:3: ( rule__Input__Group__0 )
            {
             before(grammarAccess.getInputAccess().getGroup()); 
            // InternalInput.g:69:3: ( rule__Input__Group__0 )
            // InternalInput.g:69:4: rule__Input__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleSection"
    // InternalInput.g:78:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // InternalInput.g:79:1: ( ruleSection EOF )
            // InternalInput.g:80:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // InternalInput.g:87:1: ruleSection : ( ( rule__Section__Group__0 ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:91:2: ( ( ( rule__Section__Group__0 ) ) )
            // InternalInput.g:92:2: ( ( rule__Section__Group__0 ) )
            {
            // InternalInput.g:92:2: ( ( rule__Section__Group__0 ) )
            // InternalInput.g:93:3: ( rule__Section__Group__0 )
            {
             before(grammarAccess.getSectionAccess().getGroup()); 
            // InternalInput.g:94:3: ( rule__Section__Group__0 )
            // InternalInput.g:94:4: rule__Section__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleLine"
    // InternalInput.g:103:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalInput.g:104:1: ( ruleLine EOF )
            // InternalInput.g:105:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalInput.g:112:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:116:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalInput.g:117:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalInput.g:117:2: ( ( rule__Line__Group__0 ) )
            // InternalInput.g:118:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalInput.g:119:3: ( rule__Line__Group__0 )
            // InternalInput.g:119:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "rule__Input__Group__0"
    // InternalInput.g:127:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:131:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // InternalInput.g:132:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // InternalInput.g:139:1: rule__Input__Group__0__Impl : ( () ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:143:1: ( ( () ) )
            // InternalInput.g:144:1: ( () )
            {
            // InternalInput.g:144:1: ( () )
            // InternalInput.g:145:2: ()
            {
             before(grammarAccess.getInputAccess().getInputAction_0()); 
            // InternalInput.g:146:2: ()
            // InternalInput.g:146:3: 
            {
            }

             after(grammarAccess.getInputAccess().getInputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // InternalInput.g:154:1: rule__Input__Group__1 : rule__Input__Group__1__Impl rule__Input__Group__2 ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:158:1: ( rule__Input__Group__1__Impl rule__Input__Group__2 )
            // InternalInput.g:159:2: rule__Input__Group__1__Impl rule__Input__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Input__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Input__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // InternalInput.g:166:1: rule__Input__Group__1__Impl : ( ( RULE_NEWLINE )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:170:1: ( ( ( RULE_NEWLINE )* ) )
            // InternalInput.g:171:1: ( ( RULE_NEWLINE )* )
            {
            // InternalInput.g:171:1: ( ( RULE_NEWLINE )* )
            // InternalInput.g:172:2: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1()); 
            // InternalInput.g:173:2: ( RULE_NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NEWLINE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalInput.g:173:3: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getNEWLINETerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group__2"
    // InternalInput.g:181:1: rule__Input__Group__2 : rule__Input__Group__2__Impl ;
    public final void rule__Input__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:185:1: ( rule__Input__Group__2__Impl )
            // InternalInput.g:186:2: rule__Input__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Input__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2"


    // $ANTLR start "rule__Input__Group__2__Impl"
    // InternalInput.g:192:1: rule__Input__Group__2__Impl : ( ( rule__Input__SectionsAssignment_2 )* ) ;
    public final void rule__Input__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:196:1: ( ( ( rule__Input__SectionsAssignment_2 )* ) )
            // InternalInput.g:197:1: ( ( rule__Input__SectionsAssignment_2 )* )
            {
            // InternalInput.g:197:1: ( ( rule__Input__SectionsAssignment_2 )* )
            // InternalInput.g:198:2: ( rule__Input__SectionsAssignment_2 )*
            {
             before(grammarAccess.getInputAccess().getSectionsAssignment_2()); 
            // InternalInput.g:199:2: ( rule__Input__SectionsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_OPEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInput.g:199:3: rule__Input__SectionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Input__SectionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInputAccess().getSectionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__0"
    // InternalInput.g:208:1: rule__Section__Group__0 : rule__Section__Group__0__Impl rule__Section__Group__1 ;
    public final void rule__Section__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:212:1: ( rule__Section__Group__0__Impl rule__Section__Group__1 )
            // InternalInput.g:213:2: rule__Section__Group__0__Impl rule__Section__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Section__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0"


    // $ANTLR start "rule__Section__Group__0__Impl"
    // InternalInput.g:220:1: rule__Section__Group__0__Impl : ( RULE_OPEN ) ;
    public final void rule__Section__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:224:1: ( ( RULE_OPEN ) )
            // InternalInput.g:225:1: ( RULE_OPEN )
            {
            // InternalInput.g:225:1: ( RULE_OPEN )
            // InternalInput.g:226:2: RULE_OPEN
            {
             before(grammarAccess.getSectionAccess().getOPENTerminalRuleCall_0()); 
            match(input,RULE_OPEN,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getOPENTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__0__Impl"


    // $ANTLR start "rule__Section__Group__1"
    // InternalInput.g:235:1: rule__Section__Group__1 : rule__Section__Group__1__Impl rule__Section__Group__2 ;
    public final void rule__Section__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:239:1: ( rule__Section__Group__1__Impl rule__Section__Group__2 )
            // InternalInput.g:240:2: rule__Section__Group__1__Impl rule__Section__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Section__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1"


    // $ANTLR start "rule__Section__Group__1__Impl"
    // InternalInput.g:247:1: rule__Section__Group__1__Impl : ( ( rule__Section__NameAssignment_1 ) ) ;
    public final void rule__Section__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:251:1: ( ( ( rule__Section__NameAssignment_1 ) ) )
            // InternalInput.g:252:1: ( ( rule__Section__NameAssignment_1 ) )
            {
            // InternalInput.g:252:1: ( ( rule__Section__NameAssignment_1 ) )
            // InternalInput.g:253:2: ( rule__Section__NameAssignment_1 )
            {
             before(grammarAccess.getSectionAccess().getNameAssignment_1()); 
            // InternalInput.g:254:2: ( rule__Section__NameAssignment_1 )
            // InternalInput.g:254:3: rule__Section__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__1__Impl"


    // $ANTLR start "rule__Section__Group__2"
    // InternalInput.g:262:1: rule__Section__Group__2 : rule__Section__Group__2__Impl rule__Section__Group__3 ;
    public final void rule__Section__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:266:1: ( rule__Section__Group__2__Impl rule__Section__Group__3 )
            // InternalInput.g:267:2: rule__Section__Group__2__Impl rule__Section__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2"


    // $ANTLR start "rule__Section__Group__2__Impl"
    // InternalInput.g:274:1: rule__Section__Group__2__Impl : ( RULE_CLOSE ) ;
    public final void rule__Section__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:278:1: ( ( RULE_CLOSE ) )
            // InternalInput.g:279:1: ( RULE_CLOSE )
            {
            // InternalInput.g:279:1: ( RULE_CLOSE )
            // InternalInput.g:280:2: RULE_CLOSE
            {
             before(grammarAccess.getSectionAccess().getCLOSETerminalRuleCall_2()); 
            match(input,RULE_CLOSE,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getCLOSETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__2__Impl"


    // $ANTLR start "rule__Section__Group__3"
    // InternalInput.g:289:1: rule__Section__Group__3 : rule__Section__Group__3__Impl rule__Section__Group__4 ;
    public final void rule__Section__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:293:1: ( rule__Section__Group__3__Impl rule__Section__Group__4 )
            // InternalInput.g:294:2: rule__Section__Group__3__Impl rule__Section__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3"


    // $ANTLR start "rule__Section__Group__3__Impl"
    // InternalInput.g:301:1: rule__Section__Group__3__Impl : ( ( rule__Section__Group_3__0 )* ) ;
    public final void rule__Section__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:305:1: ( ( ( rule__Section__Group_3__0 )* ) )
            // InternalInput.g:306:1: ( ( rule__Section__Group_3__0 )* )
            {
            // InternalInput.g:306:1: ( ( rule__Section__Group_3__0 )* )
            // InternalInput.g:307:2: ( rule__Section__Group_3__0 )*
            {
             before(grammarAccess.getSectionAccess().getGroup_3()); 
            // InternalInput.g:308:2: ( rule__Section__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalInput.g:308:3: rule__Section__Group_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Section__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__3__Impl"


    // $ANTLR start "rule__Section__Group__4"
    // InternalInput.g:316:1: rule__Section__Group__4 : rule__Section__Group__4__Impl ;
    public final void rule__Section__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:320:1: ( rule__Section__Group__4__Impl )
            // InternalInput.g:321:2: rule__Section__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4"


    // $ANTLR start "rule__Section__Group__4__Impl"
    // InternalInput.g:327:1: rule__Section__Group__4__Impl : ( ( RULE_NEWLINE )* ) ;
    public final void rule__Section__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:331:1: ( ( ( RULE_NEWLINE )* ) )
            // InternalInput.g:332:1: ( ( RULE_NEWLINE )* )
            {
            // InternalInput.g:332:1: ( ( RULE_NEWLINE )* )
            // InternalInput.g:333:2: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4()); 
            // InternalInput.g:334:2: ( RULE_NEWLINE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NEWLINE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalInput.g:334:3: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group__4__Impl"


    // $ANTLR start "rule__Section__Group_3__0"
    // InternalInput.g:343:1: rule__Section__Group_3__0 : rule__Section__Group_3__0__Impl rule__Section__Group_3__1 ;
    public final void rule__Section__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:347:1: ( rule__Section__Group_3__0__Impl rule__Section__Group_3__1 )
            // InternalInput.g:348:2: rule__Section__Group_3__0__Impl rule__Section__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Section__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Section__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__0"


    // $ANTLR start "rule__Section__Group_3__0__Impl"
    // InternalInput.g:355:1: rule__Section__Group_3__0__Impl : ( ( RULE_NEWLINE )* ) ;
    public final void rule__Section__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:359:1: ( ( ( RULE_NEWLINE )* ) )
            // InternalInput.g:360:1: ( ( RULE_NEWLINE )* )
            {
            // InternalInput.g:360:1: ( ( RULE_NEWLINE )* )
            // InternalInput.g:361:2: ( RULE_NEWLINE )*
            {
             before(grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0()); 
            // InternalInput.g:362:2: ( RULE_NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInput.g:362:3: RULE_NEWLINE
            	    {
            	    match(input,RULE_NEWLINE,FOLLOW_4); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSectionAccess().getNEWLINETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__0__Impl"


    // $ANTLR start "rule__Section__Group_3__1"
    // InternalInput.g:370:1: rule__Section__Group_3__1 : rule__Section__Group_3__1__Impl ;
    public final void rule__Section__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:374:1: ( rule__Section__Group_3__1__Impl )
            // InternalInput.g:375:2: rule__Section__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Section__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__1"


    // $ANTLR start "rule__Section__Group_3__1__Impl"
    // InternalInput.g:381:1: rule__Section__Group_3__1__Impl : ( ( rule__Section__LinesAssignment_3_1 ) ) ;
    public final void rule__Section__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:385:1: ( ( ( rule__Section__LinesAssignment_3_1 ) ) )
            // InternalInput.g:386:1: ( ( rule__Section__LinesAssignment_3_1 ) )
            {
            // InternalInput.g:386:1: ( ( rule__Section__LinesAssignment_3_1 ) )
            // InternalInput.g:387:2: ( rule__Section__LinesAssignment_3_1 )
            {
             before(grammarAccess.getSectionAccess().getLinesAssignment_3_1()); 
            // InternalInput.g:388:2: ( rule__Section__LinesAssignment_3_1 )
            // InternalInput.g:388:3: rule__Section__LinesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Section__LinesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getLinesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__Group_3__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalInput.g:397:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:401:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalInput.g:402:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalInput.g:409:1: rule__Line__Group__0__Impl : ( ( RULE_WHITESPACE )? ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:413:1: ( ( ( RULE_WHITESPACE )? ) )
            // InternalInput.g:414:1: ( ( RULE_WHITESPACE )? )
            {
            // InternalInput.g:414:1: ( ( RULE_WHITESPACE )? )
            // InternalInput.g:415:2: ( RULE_WHITESPACE )?
            {
             before(grammarAccess.getLineAccess().getWHITESPACETerminalRuleCall_0()); 
            // InternalInput.g:416:2: ( RULE_WHITESPACE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_WHITESPACE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInput.g:416:3: RULE_WHITESPACE
                    {
                    match(input,RULE_WHITESPACE,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLineAccess().getWHITESPACETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalInput.g:424:1: rule__Line__Group__1 : rule__Line__Group__1__Impl rule__Line__Group__2 ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:428:1: ( rule__Line__Group__1__Impl rule__Line__Group__2 )
            // InternalInput.g:429:2: rule__Line__Group__1__Impl rule__Line__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Line__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalInput.g:436:1: rule__Line__Group__1__Impl : ( ( rule__Line__NameAssignment_1 ) ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:440:1: ( ( ( rule__Line__NameAssignment_1 ) ) )
            // InternalInput.g:441:1: ( ( rule__Line__NameAssignment_1 ) )
            {
            // InternalInput.g:441:1: ( ( rule__Line__NameAssignment_1 ) )
            // InternalInput.g:442:2: ( rule__Line__NameAssignment_1 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_1()); 
            // InternalInput.g:443:2: ( rule__Line__NameAssignment_1 )
            // InternalInput.g:443:3: rule__Line__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__2"
    // InternalInput.g:451:1: rule__Line__Group__2 : rule__Line__Group__2__Impl rule__Line__Group__3 ;
    public final void rule__Line__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:455:1: ( rule__Line__Group__2__Impl rule__Line__Group__3 )
            // InternalInput.g:456:2: rule__Line__Group__2__Impl rule__Line__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Line__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2"


    // $ANTLR start "rule__Line__Group__2__Impl"
    // InternalInput.g:463:1: rule__Line__Group__2__Impl : ( RULE_ASSIGN ) ;
    public final void rule__Line__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:467:1: ( ( RULE_ASSIGN ) )
            // InternalInput.g:468:1: ( RULE_ASSIGN )
            {
            // InternalInput.g:468:1: ( RULE_ASSIGN )
            // InternalInput.g:469:2: RULE_ASSIGN
            {
             before(grammarAccess.getLineAccess().getASSIGNTerminalRuleCall_2()); 
            match(input,RULE_ASSIGN,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getASSIGNTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__2__Impl"


    // $ANTLR start "rule__Line__Group__3"
    // InternalInput.g:478:1: rule__Line__Group__3 : rule__Line__Group__3__Impl ;
    public final void rule__Line__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:482:1: ( rule__Line__Group__3__Impl )
            // InternalInput.g:483:2: rule__Line__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3"


    // $ANTLR start "rule__Line__Group__3__Impl"
    // InternalInput.g:489:1: rule__Line__Group__3__Impl : ( ( rule__Line__ValueAssignment_3 ) ) ;
    public final void rule__Line__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:493:1: ( ( ( rule__Line__ValueAssignment_3 ) ) )
            // InternalInput.g:494:1: ( ( rule__Line__ValueAssignment_3 ) )
            {
            // InternalInput.g:494:1: ( ( rule__Line__ValueAssignment_3 ) )
            // InternalInput.g:495:2: ( rule__Line__ValueAssignment_3 )
            {
             before(grammarAccess.getLineAccess().getValueAssignment_3()); 
            // InternalInput.g:496:2: ( rule__Line__ValueAssignment_3 )
            // InternalInput.g:496:3: rule__Line__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Line__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__3__Impl"


    // $ANTLR start "rule__Input__SectionsAssignment_2"
    // InternalInput.g:505:1: rule__Input__SectionsAssignment_2 : ( ruleSection ) ;
    public final void rule__Input__SectionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:509:1: ( ( ruleSection ) )
            // InternalInput.g:510:2: ( ruleSection )
            {
            // InternalInput.g:510:2: ( ruleSection )
            // InternalInput.g:511:3: ruleSection
            {
             before(grammarAccess.getInputAccess().getSectionsSectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getInputAccess().getSectionsSectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__SectionsAssignment_2"


    // $ANTLR start "rule__Section__NameAssignment_1"
    // InternalInput.g:520:1: rule__Section__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:524:1: ( ( RULE_ID ) )
            // InternalInput.g:525:2: ( RULE_ID )
            {
            // InternalInput.g:525:2: ( RULE_ID )
            // InternalInput.g:526:3: RULE_ID
            {
             before(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSectionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__NameAssignment_1"


    // $ANTLR start "rule__Section__LinesAssignment_3_1"
    // InternalInput.g:535:1: rule__Section__LinesAssignment_3_1 : ( ruleLine ) ;
    public final void rule__Section__LinesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:539:1: ( ( ruleLine ) )
            // InternalInput.g:540:2: ( ruleLine )
            {
            // InternalInput.g:540:2: ( ruleLine )
            // InternalInput.g:541:3: ruleLine
            {
             before(grammarAccess.getSectionAccess().getLinesLineParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getSectionAccess().getLinesLineParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Section__LinesAssignment_3_1"


    // $ANTLR start "rule__Line__NameAssignment_1"
    // InternalInput.g:550:1: rule__Line__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Line__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:554:1: ( ( RULE_ID ) )
            // InternalInput.g:555:2: ( RULE_ID )
            {
            // InternalInput.g:555:2: ( RULE_ID )
            // InternalInput.g:556:3: RULE_ID
            {
             before(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__NameAssignment_1"


    // $ANTLR start "rule__Line__ValueAssignment_3"
    // InternalInput.g:565:1: rule__Line__ValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__Line__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInput.g:569:1: ( ( RULE_ID ) )
            // InternalInput.g:570:2: ( RULE_ID )
            {
            // InternalInput.g:570:2: ( RULE_ID )
            // InternalInput.g:571:3: RULE_ID
            {
             before(grammarAccess.getLineAccess().getValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getValueIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__ValueAssignment_3"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\2\2\2\uffff";
    static final String dfa_3s = "\2\4\2\uffff";
    static final String dfa_4s = "\2\11\2\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\1";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\uffff\1\3\1\uffff\1\3",
            "\1\1\1\2\1\uffff\1\3\1\uffff\1\3",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 308:2: ( rule__Section__Group_3__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000290L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000292L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000100L});

}