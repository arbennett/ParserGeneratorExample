package org.eclipse.ice.example.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExampleLexer extends Lexer {
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

    public InternalExampleLexer() {;} 
    public InternalExampleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalExampleLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalExample.g"; }

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:255:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' ) )
            // InternalExample.g:255:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '_' | '-' | '0' .. '9' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_TEXT"
    public final void mRULE_TEXT() throws RecognitionException {
        try {
            int _type = RULE_TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:257:11: ( ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )* )
            // InternalExample.g:257:13: ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )*
            {
            // InternalExample.g:257:13: ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }
                else if ( (LA3_0=='\"'||LA3_0=='\'') ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalExample.g:257:14: ( RULE_WHITESPACE )+
            	    {
            	    // InternalExample.g:257:14: ( RULE_WHITESPACE )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0=='\t'||LA1_0==' ') ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalExample.g:257:14: RULE_WHITESPACE
            	    	    {
            	    	    mRULE_WHITESPACE(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);


            	    }
            	    break;
            	case 2 :
            	    // InternalExample.g:257:31: ( RULE_STRING )+
            	    {
            	    // InternalExample.g:257:31: ( RULE_STRING )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0=='\"') ) {
            	            alt2=1;
            	        }
            	        else if ( (LA2_0=='\'') ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalExample.g:257:31: RULE_STRING
            	    	    {
            	    	    mRULE_STRING(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEXT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:259:14: ( ( '\\r' )? ( '\\n' )+ )
            // InternalExample.g:259:16: ( '\\r' )? ( '\\n' )+
            {
            // InternalExample.g:259:16: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExample.g:259:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            // InternalExample.g:259:22: ( '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalExample.g:259:22: '\\n'
            	    {
            	    match('\n'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_WHITESPACE"
    public final void mRULE_WHITESPACE() throws RecognitionException {
        try {
            int _type = RULE_WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:261:17: ( ( ' ' | '\\t' )+ )
            // InternalExample.g:261:19: ( ' ' | '\\t' )+
            {
            // InternalExample.g:261:19: ( ' ' | '\\t' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExample.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHITESPACE"

    // $ANTLR start "RULE_OPEN"
    public final void mRULE_OPEN() throws RecognitionException {
        try {
            int _type = RULE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:263:11: ( '[' )
            // InternalExample.g:263:13: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPEN"

    // $ANTLR start "RULE_CLOSE"
    public final void mRULE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:265:12: ( ']' )
            // InternalExample.g:265:14: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSE"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:267:13: ( '=' )
            // InternalExample.g:267:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:269:14: ( '#' ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )* )
            // InternalExample.g:269:16: '#' ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )*
            {
            match('#'); 
            // InternalExample.g:269:20: ( ( RULE_WHITESPACE )+ | ( RULE_STRING )+ )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\t'||LA9_0==' ') ) {
                    alt9=1;
                }
                else if ( (LA9_0=='\"'||LA9_0=='\'') ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalExample.g:269:21: ( RULE_WHITESPACE )+
            	    {
            	    // InternalExample.g:269:21: ( RULE_WHITESPACE )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0=='\t'||LA7_0==' ') ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalExample.g:269:21: RULE_WHITESPACE
            	    	    {
            	    	    mRULE_WHITESPACE(); 

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
            	    break;
            	case 2 :
            	    // InternalExample.g:269:38: ( RULE_STRING )+
            	    {
            	    // InternalExample.g:269:38: ( RULE_STRING )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0=='\"') ) {
            	            alt8=1;
            	        }
            	        else if ( (LA8_0=='\'') ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalExample.g:269:38: RULE_STRING
            	    	    {
            	    	    mRULE_STRING(); 

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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:271:10: ( ( '0' .. '9' )+ )
            // InternalExample.g:271:12: ( '0' .. '9' )+
            {
            // InternalExample.g:271:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalExample.g:271:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            // InternalExample.g:273:22: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalExample.g:273:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalExample.g:273:24: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalExample.g:273:25: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalExample.g:273:29: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalExample.g:273:30: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExample.g:273:37: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalExample.g:273:57: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalExample.g:273:62: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalExample.g:273:63: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalExample.g:273:70: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:275:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalExample.g:275:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalExample.g:275:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExample.g:275:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:277:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalExample.g:277:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalExample.g:277:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExample.g:277:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalExample.g:277:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalExample.g:277:41: ( '\\r' )? '\\n'
                    {
                    // InternalExample.g:277:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalExample.g:277:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:279:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalExample.g:279:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalExample.g:279:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalExample.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalExample.g:281:16: ( . )
            // InternalExample.g:281:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalExample.g:1:8: ( RULE_ID | RULE_TEXT | RULE_NEWLINE | RULE_WHITESPACE | RULE_OPEN | RULE_CLOSE | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=13;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalExample.g:1:10: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 2 :
                // InternalExample.g:1:18: RULE_TEXT
                {
                mRULE_TEXT(); 

                }
                break;
            case 3 :
                // InternalExample.g:1:28: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 4 :
                // InternalExample.g:1:41: RULE_WHITESPACE
                {
                mRULE_WHITESPACE(); 

                }
                break;
            case 5 :
                // InternalExample.g:1:57: RULE_OPEN
                {
                mRULE_OPEN(); 

                }
                break;
            case 6 :
                // InternalExample.g:1:67: RULE_CLOSE
                {
                mRULE_CLOSE(); 

                }
                break;
            case 7 :
                // InternalExample.g:1:78: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 8 :
                // InternalExample.g:1:90: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 9 :
                // InternalExample.g:1:103: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // InternalExample.g:1:112: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalExample.g:1:128: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalExample.g:1:144: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalExample.g:1:152: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\5\1\16\1\5\2\16\1\uffff\1\21\1\23\5\uffff\1\16\2\uffff\1\5\1\uffff\1\23\10\uffff";
    static final String DFA19_eofS =
        "\33\uffff";
    static final String DFA19_minS =
        "\1\0\1\55\1\11\2\0\1\uffff\1\12\1\11\5\uffff\1\52\2\uffff\1\11\1\uffff\1\11\10\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\172\1\40\2\uffff\1\uffff\1\12\1\40\5\uffff\1\57\2\uffff\1\40\1\uffff\1\40\10\uffff";
    static final String DFA19_acceptS =
        "\5\uffff\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\1\uffff\1\15\1\1\1\uffff\1\14\1\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA19_specialS =
        "\1\1\2\uffff\1\0\1\2\26\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\16\1\2\1\7\2\16\1\6\22\16\1\2\1\16\1\3\1\13\3\16\1\4\7\16\1\15\12\14\3\16\1\12\3\16\32\1\1\10\1\16\1\11\3\16\32\1\uff85\16",
            "\1\17\2\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\20\1\21\2\uffff\1\21\22\uffff\1\20",
            "\0\5",
            "\0\5",
            "",
            "\1\22",
            "\1\21\1\22\2\uffff\1\21\22\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\31\4\uffff\1\32",
            "",
            "",
            "\1\20\1\21\2\uffff\1\21\22\uffff\1\20",
            "",
            "\1\21\1\22\2\uffff\1\21\22\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ID | RULE_TEXT | RULE_NEWLINE | RULE_WHITESPACE | RULE_OPEN | RULE_CLOSE | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_3 = input.LA(1);

                        s = -1;
                        if ( ((LA19_3>='\u0000' && LA19_3<='\uFFFF')) ) {s = 5;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( ((LA19_0>='A' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {s = 1;}

                        else if ( (LA19_0=='\t'||LA19_0==' ') ) {s = 2;}

                        else if ( (LA19_0=='\"') ) {s = 3;}

                        else if ( (LA19_0=='\'') ) {s = 4;}

                        else if ( (LA19_0=='\r') ) {s = 6;}

                        else if ( (LA19_0=='\n') ) {s = 7;}

                        else if ( (LA19_0=='[') ) {s = 8;}

                        else if ( (LA19_0==']') ) {s = 9;}

                        else if ( (LA19_0=='=') ) {s = 10;}

                        else if ( (LA19_0=='#') ) {s = 11;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 12;}

                        else if ( (LA19_0=='/') ) {s = 13;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='$' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='.')||(LA19_0>=':' && LA19_0<='<')||(LA19_0>='>' && LA19_0<='@')||LA19_0=='\\'||(LA19_0>='^' && LA19_0<='`')||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 14;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_4 = input.LA(1);

                        s = -1;
                        if ( ((LA19_4>='\u0000' && LA19_4<='\uFFFF')) ) {s = 5;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}