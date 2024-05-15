package su.nsk.iae.edtl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import su.nsk.iae.edtl.services.EdtlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEdtlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DECL_SYMB", "RULE_INTEGER", "RULE_DIRECT_VARIABLE", "RULE_ID", "RULE_BOOLEAN_LITERAL", "RULE_STRING", "RULE_OR_OPERATOR", "RULE_INTERVAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_OCTAL_DIGIT", "RULE_DIGIT", "RULE_LETTER", "RULE_BIT", "RULE_HEX_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BOOL'", "'INT'", "'VAR_INPUT'", "'INPUT_PORTS_COUNTER'", "';'", "'END_VAR'", "'VAR_OUTPUT'", "'OUTPUT_PORTS_COUNTER'", "'AT'", "':'", "'VAR_INIT'", "'ABBR'", "'END_ABBR'", "'MACROS'", "'('", "')'", "'END_MACROS'", "','", "'INTERVAL'", "'REQ'", "'TRIGGER'", "'NL:'", "'INVARIANT'", "'FINAL'", "'DELAY'", "'REACTION'", "'RELEASE'", "'END_REQ'", "'XOR'", "'&&'", "'AND'", "'FE'", "'RE'", "'HIGH'", "'LOW'", "'NOT'", "'!'", "'TAU'", "'T#'", "'=='", "'<>'", "'<'", "'>'", "'<='", "'>='"
    };
    public static final int T__50=50;
    public static final int RULE_INTERVAL=11;
    public static final int RULE_DECL_SYMB=4;
    public static final int RULE_BIT=17;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_DIRECT_SIZE_PREFIX=13;
    public static final int RULE_ID=7;
    public static final int RULE_BOOLEAN_LITERAL=8;
    public static final int RULE_DIGIT=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_DIRECT_VARIABLE=6;
    public static final int RULE_DIRECT_TYPE_PREFIX=12;
    public static final int RULE_STRING=9;
    public static final int RULE_OR_OPERATOR=10;
    public static final int RULE_SL_COMMENT=20;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=21;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_LETTER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=18;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_INTEGER=5;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEdtlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEdtlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEdtlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEdtl.g"; }



     	private EdtlGrammarAccess grammarAccess;

        public InternalEdtlParser(TokenStream input, EdtlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected EdtlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEdtl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEdtl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalEdtl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEdtl.g:72:1: ruleModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_declVarInput_1_0 = null;

        EObject lv_declVarOutput_2_0 = null;

        EObject lv_varInits_3_0 = null;

        EObject lv_abbrs_4_0 = null;

        EObject lv_macroses_5_0 = null;

        EObject lv_reqs_6_0 = null;

        EObject lv_globInterval_7_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:78:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) ) ) )
            // InternalEdtl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) ) )
            {
            // InternalEdtl.g:79:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) ) )
            // InternalEdtl.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) )
            {
            // InternalEdtl.g:80:3: ( ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* ) )
            // InternalEdtl.g:81:4: ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup());
            			
            // InternalEdtl.g:84:4: ( ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )* )
            // InternalEdtl.g:85:5: ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )*
            {
            // InternalEdtl.g:85:5: ( ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) ) )*
            loop7:
            do {
                int alt7=8;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5) ) {
                    alt7=6;
                }
                else if ( LA7_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6) ) {
                    alt7=7;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEdtl.g:86:3: ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:86:3: ({...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ ) )
            	    // InternalEdtl.g:87:4: {...}? => ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalEdtl.g:87:99: ( ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+ )
            	    // InternalEdtl.g:88:5: ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalEdtl.g:91:8: ({...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==25) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalEdtl.g:91:9: {...}? => ( (lv_declVarInput_1_0= ruleDeclVarInput ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:91:18: ( (lv_declVarInput_1_0= ruleDeclVarInput ) )
            	    	    // InternalEdtl.g:91:19: (lv_declVarInput_1_0= ruleDeclVarInput )
            	    	    {
            	    	    // InternalEdtl.g:91:19: (lv_declVarInput_1_0= ruleDeclVarInput )
            	    	    // InternalEdtl.g:92:9: lv_declVarInput_1_0= ruleDeclVarInput
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getDeclVarInputDeclVarInputParserRuleCall_0_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_declVarInput_1_0=ruleDeclVarInput();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"declVarInput",
            	    	    										lv_declVarInput_1_0,
            	    	    										"su.nsk.iae.edtl.Edtl.DeclVarInput");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEdtl.g:114:3: ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:114:3: ({...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ ) )
            	    // InternalEdtl.g:115:4: {...}? => ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalEdtl.g:115:99: ( ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+ )
            	    // InternalEdtl.g:116:5: ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalEdtl.g:119:8: ({...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==29) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalEdtl.g:119:9: {...}? => ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:119:18: ( (lv_declVarOutput_2_0= ruleDeclVarOutput ) )
            	    	    // InternalEdtl.g:119:19: (lv_declVarOutput_2_0= ruleDeclVarOutput )
            	    	    {
            	    	    // InternalEdtl.g:119:19: (lv_declVarOutput_2_0= ruleDeclVarOutput )
            	    	    // InternalEdtl.g:120:9: lv_declVarOutput_2_0= ruleDeclVarOutput
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getDeclVarOutputDeclVarOutputParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_declVarOutput_2_0=ruleDeclVarOutput();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"declVarOutput",
            	    	    										lv_declVarOutput_2_0,
            	    	    										"su.nsk.iae.edtl.Edtl.DeclVarOutput");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEdtl.g:142:3: ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:142:3: ({...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ ) )
            	    // InternalEdtl.g:143:4: {...}? => ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalEdtl.g:143:99: ( ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+ )
            	    // InternalEdtl.g:144:5: ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalEdtl.g:147:8: ({...}? => ( (lv_varInits_3_0= ruleVarInit ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==33) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalEdtl.g:147:9: {...}? => ( (lv_varInits_3_0= ruleVarInit ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:147:18: ( (lv_varInits_3_0= ruleVarInit ) )
            	    	    // InternalEdtl.g:147:19: (lv_varInits_3_0= ruleVarInit )
            	    	    {
            	    	    // InternalEdtl.g:147:19: (lv_varInits_3_0= ruleVarInit )
            	    	    // InternalEdtl.g:148:9: lv_varInits_3_0= ruleVarInit
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getVarInitsVarInitParserRuleCall_2_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_varInits_3_0=ruleVarInit();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"varInits",
            	    	    										lv_varInits_3_0,
            	    	    										"su.nsk.iae.edtl.Edtl.VarInit");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEdtl.g:170:3: ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:170:3: ({...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ ) )
            	    // InternalEdtl.g:171:4: {...}? => ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalEdtl.g:171:99: ( ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+ )
            	    // InternalEdtl.g:172:5: ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalEdtl.g:175:8: ({...}? => ( (lv_abbrs_4_0= ruleAbbr ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==34) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalEdtl.g:175:9: {...}? => ( (lv_abbrs_4_0= ruleAbbr ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:175:18: ( (lv_abbrs_4_0= ruleAbbr ) )
            	    	    // InternalEdtl.g:175:19: (lv_abbrs_4_0= ruleAbbr )
            	    	    {
            	    	    // InternalEdtl.g:175:19: (lv_abbrs_4_0= ruleAbbr )
            	    	    // InternalEdtl.g:176:9: lv_abbrs_4_0= ruleAbbr
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getAbbrsAbbrParserRuleCall_3_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_abbrs_4_0=ruleAbbr();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"abbrs",
            	    	    										lv_abbrs_4_0,
            	    	    										"su.nsk.iae.edtl.Edtl.Abbr");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEdtl.g:198:3: ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:198:3: ({...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ ) )
            	    // InternalEdtl.g:199:4: {...}? => ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalEdtl.g:199:99: ( ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+ )
            	    // InternalEdtl.g:200:5: ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalEdtl.g:203:8: ({...}? => ( (lv_macroses_5_0= ruleMacros ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==36) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalEdtl.g:203:9: {...}? => ( (lv_macroses_5_0= ruleMacros ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:203:18: ( (lv_macroses_5_0= ruleMacros ) )
            	    	    // InternalEdtl.g:203:19: (lv_macroses_5_0= ruleMacros )
            	    	    {
            	    	    // InternalEdtl.g:203:19: (lv_macroses_5_0= ruleMacros )
            	    	    // InternalEdtl.g:204:9: lv_macroses_5_0= ruleMacros
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getMacrosesMacrosParserRuleCall_4_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_macroses_5_0=ruleMacros();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"macroses",
            	    	    										lv_macroses_5_0,
            	    	    										"su.nsk.iae.edtl.Edtl.Macros");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEdtl.g:226:3: ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) )
            	    {
            	    // InternalEdtl.g:226:3: ({...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ ) )
            	    // InternalEdtl.g:227:4: {...}? => ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalEdtl.g:227:99: ( ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+ )
            	    // InternalEdtl.g:228:5: ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalEdtl.g:231:8: ({...}? => ( (lv_reqs_6_0= ruleRequirement ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==42) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalEdtl.g:231:9: {...}? => ( (lv_reqs_6_0= ruleRequirement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    	    }
            	    	    // InternalEdtl.g:231:18: ( (lv_reqs_6_0= ruleRequirement ) )
            	    	    // InternalEdtl.g:231:19: (lv_reqs_6_0= ruleRequirement )
            	    	    {
            	    	    // InternalEdtl.g:231:19: (lv_reqs_6_0= ruleRequirement )
            	    	    // InternalEdtl.g:232:9: lv_reqs_6_0= ruleRequirement
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getModelAccess().getReqsRequirementParserRuleCall_5_0());
            	    	    								
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_reqs_6_0=ruleRequirement();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"reqs",
            	    	    										lv_reqs_6_0,
            	    	    										"su.nsk.iae.edtl.Edtl.Requirement");
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalEdtl.g:254:3: ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) )
            	    {
            	    // InternalEdtl.g:254:3: ({...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) ) )
            	    // InternalEdtl.g:255:4: {...}? => ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalEdtl.g:255:99: ( ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) ) )
            	    // InternalEdtl.g:256:5: ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalEdtl.g:259:8: ({...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) ) )
            	    // InternalEdtl.g:259:9: {...}? => ( (lv_globInterval_7_0= ruleGlobInterval ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleModel", "true");
            	    }
            	    // InternalEdtl.g:259:18: ( (lv_globInterval_7_0= ruleGlobInterval ) )
            	    // InternalEdtl.g:259:19: (lv_globInterval_7_0= ruleGlobInterval )
            	    {
            	    // InternalEdtl.g:259:19: (lv_globInterval_7_0= ruleGlobInterval )
            	    // InternalEdtl.g:260:9: lv_globInterval_7_0= ruleGlobInterval
            	    {

            	    									newCompositeNode(grammarAccess.getModelAccess().getGlobIntervalGlobIntervalParserRuleCall_6_0());
            	    								
            	    pushFollow(FOLLOW_3);
            	    lv_globInterval_7_0=ruleGlobInterval();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getModelRule());
            	    									}
            	    									set(
            	    										current,
            	    										"globInterval",
            	    										lv_globInterval_7_0,
            	    										"su.nsk.iae.edtl.Edtl.GlobInterval");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleVariableType"
    // InternalEdtl.g:292:1: entryRuleVariableType returns [String current=null] : iv_ruleVariableType= ruleVariableType EOF ;
    public final String entryRuleVariableType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVariableType = null;


        try {
            // InternalEdtl.g:292:52: (iv_ruleVariableType= ruleVariableType EOF )
            // InternalEdtl.g:293:2: iv_ruleVariableType= ruleVariableType EOF
            {
             newCompositeNode(grammarAccess.getVariableTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableType=ruleVariableType();

            state._fsp--;

             current =iv_ruleVariableType.getText(); 
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
    // $ANTLR end "entryRuleVariableType"


    // $ANTLR start "ruleVariableType"
    // InternalEdtl.g:299:1: ruleVariableType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'BOOL' | kw= 'INT' ) ;
    public final AntlrDatatypeRuleToken ruleVariableType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:305:2: ( (kw= 'BOOL' | kw= 'INT' ) )
            // InternalEdtl.g:306:2: (kw= 'BOOL' | kw= 'INT' )
            {
            // InternalEdtl.g:306:2: (kw= 'BOOL' | kw= 'INT' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEdtl.g:307:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getBOOLKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:313:3: kw= 'INT'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVariableTypeAccess().getINTKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleVariableType"


    // $ANTLR start "entryRuleDeclVarInput"
    // InternalEdtl.g:322:1: entryRuleDeclVarInput returns [EObject current=null] : iv_ruleDeclVarInput= ruleDeclVarInput EOF ;
    public final EObject entryRuleDeclVarInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarInput = null;


        try {
            // InternalEdtl.g:322:53: (iv_ruleDeclVarInput= ruleDeclVarInput EOF )
            // InternalEdtl.g:323:2: iv_ruleDeclVarInput= ruleDeclVarInput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarInput=ruleDeclVarInput();

            state._fsp--;

             current =iv_ruleDeclVarInput; 
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
    // $ANTLR end "entryRuleDeclVarInput"


    // $ANTLR start "ruleDeclVarInput"
    // InternalEdtl.g:329:1: ruleDeclVarInput returns [EObject current=null] : ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_inputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:335:2: ( ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:336:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:336:2: ( () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:337:3: () otherlv_1= 'VAR_INPUT' (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:337:3: ()
            // InternalEdtl.g:338:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarInputAccess().getDeclVarInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarInputAccess().getVAR_INPUTKeyword_1());
            		
            // InternalEdtl.g:348:3: (otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEdtl.g:349:4: otherlv_2= 'INPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_inputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarInputAccess().getINPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarInputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:357:4: ( (lv_inputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:358:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:358:5: (lv_inputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:359:6: lv_inputCounter_4_0= RULE_INTEGER
                    {
                    lv_inputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_inputCounter_4_0, grammarAccess.getDeclVarInputAccess().getInputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarInputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"inputCounter",
                    							lv_inputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:380:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEdtl.g:381:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:381:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:382:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:382:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:383:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarInputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarInputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarInputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarInputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarInput"


    // $ANTLR start "entryRuleDeclVarOutput"
    // InternalEdtl.g:413:1: entryRuleDeclVarOutput returns [EObject current=null] : iv_ruleDeclVarOutput= ruleDeclVarOutput EOF ;
    public final EObject entryRuleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclVarOutput = null;


        try {
            // InternalEdtl.g:413:54: (iv_ruleDeclVarOutput= ruleDeclVarOutput EOF )
            // InternalEdtl.g:414:2: iv_ruleDeclVarOutput= ruleDeclVarOutput EOF
            {
             newCompositeNode(grammarAccess.getDeclVarOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclVarOutput=ruleDeclVarOutput();

            state._fsp--;

             current =iv_ruleDeclVarOutput; 
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
    // $ANTLR end "entryRuleDeclVarOutput"


    // $ANTLR start "ruleDeclVarOutput"
    // InternalEdtl.g:420:1: ruleDeclVarOutput returns [EObject current=null] : ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) ;
    public final EObject ruleDeclVarOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_DECL_SYMB_3=null;
        Token lv_outputCounter_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_varDecls_6_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:426:2: ( ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' ) )
            // InternalEdtl.g:427:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            {
            // InternalEdtl.g:427:2: ( () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR' )
            // InternalEdtl.g:428:3: () otherlv_1= 'VAR_OUTPUT' (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )? ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )* otherlv_8= 'END_VAR'
            {
            // InternalEdtl.g:428:3: ()
            // InternalEdtl.g:429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeclVarOutputAccess().getDeclVarOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclVarOutputAccess().getVAR_OUTPUTKeyword_1());
            		
            // InternalEdtl.g:439:3: (otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEdtl.g:440:4: otherlv_2= 'OUTPUT_PORTS_COUNTER' this_DECL_SYMB_3= RULE_DECL_SYMB ( (lv_outputCounter_4_0= RULE_INTEGER ) ) otherlv_5= ';'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getDeclVarOutputAccess().getOUTPUT_PORTS_COUNTERKeyword_2_0());
                    			
                    this_DECL_SYMB_3=(Token)match(input,RULE_DECL_SYMB,FOLLOW_6); 

                    				newLeafNode(this_DECL_SYMB_3, grammarAccess.getDeclVarOutputAccess().getDECL_SYMBTerminalRuleCall_2_1());
                    			
                    // InternalEdtl.g:448:4: ( (lv_outputCounter_4_0= RULE_INTEGER ) )
                    // InternalEdtl.g:449:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    {
                    // InternalEdtl.g:449:5: (lv_outputCounter_4_0= RULE_INTEGER )
                    // InternalEdtl.g:450:6: lv_outputCounter_4_0= RULE_INTEGER
                    {
                    lv_outputCounter_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_7); 

                    						newLeafNode(lv_outputCounter_4_0, grammarAccess.getDeclVarOutputAccess().getOutputCounterINTEGERTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclVarOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"outputCounter",
                    							lv_outputCounter_4_0,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalEdtl.g:471:3: ( ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEdtl.g:472:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) ) otherlv_7= ';'
            	    {
            	    // InternalEdtl.g:472:4: ( (lv_varDecls_6_0= ruleVarDeclaration ) )
            	    // InternalEdtl.g:473:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    {
            	    // InternalEdtl.g:473:5: (lv_varDecls_6_0= ruleVarDeclaration )
            	    // InternalEdtl.g:474:6: lv_varDecls_6_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getDeclVarOutputAccess().getVarDeclsVarDeclarationParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varDecls_6_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclVarOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varDecls",
            	    							lv_varDecls_6_0,
            	    							"su.nsk.iae.edtl.Edtl.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDeclVarOutputAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeclVarOutputAccess().getEND_VARKeyword_4());
            		

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
    // $ANTLR end "ruleDeclVarOutput"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalEdtl.g:504:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalEdtl.g:504:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalEdtl.g:505:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalEdtl.g:511:1: ruleVarDeclaration returns [EObject current=null] : ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        EObject lv_v_0_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:517:2: ( ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) ) )
            // InternalEdtl.g:518:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            {
            // InternalEdtl.g:518:2: ( ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) ) )
            // InternalEdtl.g:519:3: ( (lv_v_0_0= ruleVariable ) ) (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )? otherlv_3= ':' ( (lv_type_4_0= ruleVariableType ) )
            {
            // InternalEdtl.g:519:3: ( (lv_v_0_0= ruleVariable ) )
            // InternalEdtl.g:520:4: (lv_v_0_0= ruleVariable )
            {
            // InternalEdtl.g:520:4: (lv_v_0_0= ruleVariable )
            // InternalEdtl.g:521:5: lv_v_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getVVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_v_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"v",
            						lv_v_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:538:3: (otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEdtl.g:539:4: otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_11); 

                    				newLeafNode(otherlv_1, grammarAccess.getVarDeclarationAccess().getATKeyword_1_0());
                    			
                    // InternalEdtl.g:543:4: ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
                    // InternalEdtl.g:544:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    {
                    // InternalEdtl.g:544:5: (lv_location_2_0= RULE_DIRECT_VARIABLE )
                    // InternalEdtl.g:545:6: lv_location_2_0= RULE_DIRECT_VARIABLE
                    {
                    lv_location_2_0=(Token)match(input,RULE_DIRECT_VARIABLE,FOLLOW_12); 

                    						newLeafNode(lv_location_2_0, grammarAccess.getVarDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarDeclarationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"location",
                    							lv_location_2_0,
                    							"su.nsk.iae.edtl.Edtl.DIRECT_VARIABLE");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getColonKeyword_2());
            		
            // InternalEdtl.g:566:3: ( (lv_type_4_0= ruleVariableType ) )
            // InternalEdtl.g:567:4: (lv_type_4_0= ruleVariableType )
            {
            // InternalEdtl.g:567:4: (lv_type_4_0= ruleVariableType )
            // InternalEdtl.g:568:5: lv_type_4_0= ruleVariableType
            {

            					newCompositeNode(grammarAccess.getVarDeclarationAccess().getTypeVariableTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleVariableType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"su.nsk.iae.edtl.Edtl.VariableType");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleVarInit"
    // InternalEdtl.g:589:1: entryRuleVarInit returns [EObject current=null] : iv_ruleVarInit= ruleVarInit EOF ;
    public final EObject entryRuleVarInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInit = null;


        try {
            // InternalEdtl.g:589:48: (iv_ruleVarInit= ruleVarInit EOF )
            // InternalEdtl.g:590:2: iv_ruleVarInit= ruleVarInit EOF
            {
             newCompositeNode(grammarAccess.getVarInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarInit=ruleVarInit();

            state._fsp--;

             current =iv_ruleVarInit; 
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
    // $ANTLR end "entryRuleVarInit"


    // $ANTLR start "ruleVarInit"
    // InternalEdtl.g:596:1: ruleVarInit returns [EObject current=null] : ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleVarInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_varAssign_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:602:2: ( ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalEdtl.g:603:2: ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalEdtl.g:603:2: ( () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalEdtl.g:604:3: () otherlv_1= 'VAR_INIT' ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            // InternalEdtl.g:604:3: ()
            // InternalEdtl.g:605:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarInitAccess().getVarInitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getVarInitAccess().getVAR_INITKeyword_1());
            		
            // InternalEdtl.g:615:3: ( ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEdtl.g:616:4: ( (lv_varAssign_2_0= ruleVarAssign ) ) otherlv_3= ';'
            	    {
            	    // InternalEdtl.g:616:4: ( (lv_varAssign_2_0= ruleVarAssign ) )
            	    // InternalEdtl.g:617:5: (lv_varAssign_2_0= ruleVarAssign )
            	    {
            	    // InternalEdtl.g:617:5: (lv_varAssign_2_0= ruleVarAssign )
            	    // InternalEdtl.g:618:6: lv_varAssign_2_0= ruleVarAssign
            	    {

            	    						newCompositeNode(grammarAccess.getVarInitAccess().getVarAssignVarAssignParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_varAssign_2_0=ruleVarAssign();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarInitRule());
            	    						}
            	    						add(
            	    							current,
            	    							"varAssign",
            	    							lv_varAssign_2_0,
            	    							"su.nsk.iae.edtl.Edtl.VarAssign");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,27,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVarInitAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVarInitAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleVarInit"


    // $ANTLR start "entryRuleVarAssign"
    // InternalEdtl.g:648:1: entryRuleVarAssign returns [EObject current=null] : iv_ruleVarAssign= ruleVarAssign EOF ;
    public final EObject entryRuleVarAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarAssign = null;


        try {
            // InternalEdtl.g:648:50: (iv_ruleVarAssign= ruleVarAssign EOF )
            // InternalEdtl.g:649:2: iv_ruleVarAssign= ruleVarAssign EOF
            {
             newCompositeNode(grammarAccess.getVarAssignRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarAssign=ruleVarAssign();

            state._fsp--;

             current =iv_ruleVarAssign; 
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
    // $ANTLR end "entryRuleVarAssign"


    // $ANTLR start "ruleVarAssign"
    // InternalEdtl.g:655:1: ruleVarAssign returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) ) ;
    public final EObject ruleVarAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DECL_SYMB_1=null;
        Token lv_value_2_1=null;
        Token lv_value_2_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:661:2: ( ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) ) )
            // InternalEdtl.g:662:2: ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) )
            {
            // InternalEdtl.g:662:2: ( ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) ) )
            // InternalEdtl.g:663:3: ( (otherlv_0= RULE_ID ) ) this_DECL_SYMB_1= RULE_DECL_SYMB ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) )
            {
            // InternalEdtl.g:663:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:664:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:664:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:665:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarAssignRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(otherlv_0, grammarAccess.getVarAssignAccess().getVariableVariableCrossReference_0_0());
            				

            }


            }

            this_DECL_SYMB_1=(Token)match(input,RULE_DECL_SYMB,FOLLOW_15); 

            			newLeafNode(this_DECL_SYMB_1, grammarAccess.getVarAssignAccess().getDECL_SYMBTerminalRuleCall_1());
            		
            // InternalEdtl.g:680:3: ( ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) ) )
            // InternalEdtl.g:681:4: ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) )
            {
            // InternalEdtl.g:681:4: ( (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL ) )
            // InternalEdtl.g:682:5: (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL )
            {
            // InternalEdtl.g:682:5: (lv_value_2_1= RULE_INTEGER | lv_value_2_2= RULE_BOOLEAN_LITERAL )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INTEGER) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_BOOLEAN_LITERAL) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEdtl.g:683:6: lv_value_2_1= RULE_INTEGER
                    {
                    lv_value_2_1=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    						newLeafNode(lv_value_2_1, grammarAccess.getVarAssignAccess().getValueINTEGERTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_1,
                    							"su.nsk.iae.edtl.Edtl.INTEGER");
                    					

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:698:6: lv_value_2_2= RULE_BOOLEAN_LITERAL
                    {
                    lv_value_2_2=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    						newLeafNode(lv_value_2_2, grammarAccess.getVarAssignAccess().getValueBOOLEAN_LITERALTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarAssignRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_2_2,
                    							"su.nsk.iae.edtl.Edtl.BOOLEAN_LITERAL");
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleVarAssign"


    // $ANTLR start "entryRuleAbbr"
    // InternalEdtl.g:719:1: entryRuleAbbr returns [EObject current=null] : iv_ruleAbbr= ruleAbbr EOF ;
    public final EObject entryRuleAbbr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbbr = null;


        try {
            // InternalEdtl.g:719:45: (iv_ruleAbbr= ruleAbbr EOF )
            // InternalEdtl.g:720:2: iv_ruleAbbr= ruleAbbr EOF
            {
             newCompositeNode(grammarAccess.getAbbrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbbr=ruleAbbr();

            state._fsp--;

             current =iv_ruleAbbr; 
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
    // $ANTLR end "entryRuleAbbr"


    // $ANTLR start "ruleAbbr"
    // InternalEdtl.g:726:1: ruleAbbr returns [EObject current=null] : (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) ;
    public final EObject ruleAbbr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:732:2: ( (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' ) )
            // InternalEdtl.g:733:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            {
            // InternalEdtl.g:733:2: (otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR' )
            // InternalEdtl.g:734:3: otherlv_0= 'ABBR' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= 'END_ABBR'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getAbbrAccess().getABBRKeyword_0());
            		
            // InternalEdtl.g:738:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:739:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:739:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:740:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAbbrAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAbbrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:756:3: ( (lv_expr_2_0= ruleExpression ) )
            // InternalEdtl.g:757:4: (lv_expr_2_0= ruleExpression )
            {
            // InternalEdtl.g:757:4: (lv_expr_2_0= ruleExpression )
            // InternalEdtl.g:758:5: lv_expr_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAbbrAccess().getExprExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_expr_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbbrRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_2_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAbbrAccess().getEND_ABBRKeyword_3());
            		

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
    // $ANTLR end "ruleAbbr"


    // $ANTLR start "entryRuleMacros"
    // InternalEdtl.g:783:1: entryRuleMacros returns [EObject current=null] : iv_ruleMacros= ruleMacros EOF ;
    public final EObject entryRuleMacros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMacros = null;


        try {
            // InternalEdtl.g:783:47: (iv_ruleMacros= ruleMacros EOF )
            // InternalEdtl.g:784:2: iv_ruleMacros= ruleMacros EOF
            {
             newCompositeNode(grammarAccess.getMacrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMacros=ruleMacros();

            state._fsp--;

             current =iv_ruleMacros; 
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
    // $ANTLR end "entryRuleMacros"


    // $ANTLR start "ruleMacros"
    // InternalEdtl.g:790:1: ruleMacros returns [EObject current=null] : (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) ;
    public final EObject ruleMacros() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_args_3_0 = null;

        EObject lv_expr_5_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:796:2: ( (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' ) )
            // InternalEdtl.g:797:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            {
            // InternalEdtl.g:797:2: (otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS' )
            // InternalEdtl.g:798:3: otherlv_0= 'MACROS' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_args_3_0= ruleVarList ) )? otherlv_4= ')' ( (lv_expr_5_0= ruleExpression ) ) otherlv_6= 'END_MACROS'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMacrosAccess().getMACROSKeyword_0());
            		
            // InternalEdtl.g:802:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:803:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:803:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:804:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMacrosAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMacrosRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMacrosAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEdtl.g:824:3: ( (lv_args_3_0= ruleVarList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEdtl.g:825:4: (lv_args_3_0= ruleVarList )
                    {
                    // InternalEdtl.g:825:4: (lv_args_3_0= ruleVarList )
                    // InternalEdtl.g:826:5: lv_args_3_0= ruleVarList
                    {

                    					newCompositeNode(grammarAccess.getMacrosAccess().getArgsVarListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_20);
                    lv_args_3_0=ruleVarList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMacrosRule());
                    					}
                    					set(
                    						current,
                    						"args",
                    						lv_args_3_0,
                    						"su.nsk.iae.edtl.Edtl.VarList");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMacrosAccess().getRightParenthesisKeyword_4());
            		
            // InternalEdtl.g:847:3: ( (lv_expr_5_0= ruleExpression ) )
            // InternalEdtl.g:848:4: (lv_expr_5_0= ruleExpression )
            {
            // InternalEdtl.g:848:4: (lv_expr_5_0= ruleExpression )
            // InternalEdtl.g:849:5: lv_expr_5_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMacrosAccess().getExprExpressionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_21);
            lv_expr_5_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMacrosRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_5_0,
            						"su.nsk.iae.edtl.Edtl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMacrosAccess().getEND_MACROSKeyword_6());
            		

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
    // $ANTLR end "ruleMacros"


    // $ANTLR start "entryRuleVarList"
    // InternalEdtl.g:874:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalEdtl.g:874:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalEdtl.g:875:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
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
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalEdtl.g:881:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:887:2: ( ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* ) )
            // InternalEdtl.g:888:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            {
            // InternalEdtl.g:888:2: ( ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )* )
            // InternalEdtl.g:889:3: ( (lv_vars_0_0= ruleVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            {
            // InternalEdtl.g:889:3: ( (lv_vars_0_0= ruleVariable ) )
            // InternalEdtl.g:890:4: (lv_vars_0_0= ruleVariable )
            {
            // InternalEdtl.g:890:4: (lv_vars_0_0= ruleVariable )
            // InternalEdtl.g:891:5: lv_vars_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_vars_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"su.nsk.iae.edtl.Edtl.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEdtl.g:908:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==40) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEdtl.g:909:4: otherlv_1= ',' ( (lv_vars_2_0= ruleVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:913:4: ( (lv_vars_2_0= ruleVariable ) )
            	    // InternalEdtl.g:914:5: (lv_vars_2_0= ruleVariable )
            	    {
            	    // InternalEdtl.g:914:5: (lv_vars_2_0= ruleVariable )
            	    // InternalEdtl.g:915:6: lv_vars_2_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_vars_2_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.edtl.Edtl.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleGlobInterval"
    // InternalEdtl.g:937:1: entryRuleGlobInterval returns [EObject current=null] : iv_ruleGlobInterval= ruleGlobInterval EOF ;
    public final EObject entryRuleGlobInterval() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobInterval = null;


        try {
            // InternalEdtl.g:937:53: (iv_ruleGlobInterval= ruleGlobInterval EOF )
            // InternalEdtl.g:938:2: iv_ruleGlobInterval= ruleGlobInterval EOF
            {
             newCompositeNode(grammarAccess.getGlobIntervalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobInterval=ruleGlobInterval();

            state._fsp--;

             current =iv_ruleGlobInterval; 
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
    // $ANTLR end "entryRuleGlobInterval"


    // $ANTLR start "ruleGlobInterval"
    // InternalEdtl.g:944:1: ruleGlobInterval returns [EObject current=null] : (otherlv_0= 'INTERVAL' this_DECL_SYMB_1= RULE_DECL_SYMB ( (lv_globInterval_2_0= ruleTimeLiteral ) ) otherlv_3= ';' ) ;
    public final EObject ruleGlobInterval() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_DECL_SYMB_1=null;
        Token otherlv_3=null;
        EObject lv_globInterval_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:950:2: ( (otherlv_0= 'INTERVAL' this_DECL_SYMB_1= RULE_DECL_SYMB ( (lv_globInterval_2_0= ruleTimeLiteral ) ) otherlv_3= ';' ) )
            // InternalEdtl.g:951:2: (otherlv_0= 'INTERVAL' this_DECL_SYMB_1= RULE_DECL_SYMB ( (lv_globInterval_2_0= ruleTimeLiteral ) ) otherlv_3= ';' )
            {
            // InternalEdtl.g:951:2: (otherlv_0= 'INTERVAL' this_DECL_SYMB_1= RULE_DECL_SYMB ( (lv_globInterval_2_0= ruleTimeLiteral ) ) otherlv_3= ';' )
            // InternalEdtl.g:952:3: otherlv_0= 'INTERVAL' this_DECL_SYMB_1= RULE_DECL_SYMB ( (lv_globInterval_2_0= ruleTimeLiteral ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobIntervalAccess().getINTERVALKeyword_0());
            		
            this_DECL_SYMB_1=(Token)match(input,RULE_DECL_SYMB,FOLLOW_23); 

            			newLeafNode(this_DECL_SYMB_1, grammarAccess.getGlobIntervalAccess().getDECL_SYMBTerminalRuleCall_1());
            		
            // InternalEdtl.g:960:3: ( (lv_globInterval_2_0= ruleTimeLiteral ) )
            // InternalEdtl.g:961:4: (lv_globInterval_2_0= ruleTimeLiteral )
            {
            // InternalEdtl.g:961:4: (lv_globInterval_2_0= ruleTimeLiteral )
            // InternalEdtl.g:962:5: lv_globInterval_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getGlobIntervalAccess().getGlobIntervalTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_globInterval_2_0=ruleTimeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobIntervalRule());
            					}
            					set(
            						current,
            						"globInterval",
            						lv_globInterval_2_0,
            						"su.nsk.iae.edtl.Edtl.TimeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobIntervalAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleGlobInterval"


    // $ANTLR start "entryRuleRequirement"
    // InternalEdtl.g:987:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalEdtl.g:987:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalEdtl.g:988:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalEdtl.g:994:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) ) otherlv_45= 'END_REQ' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token this_DECL_SYMB_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_nlTrig_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_DECL_SYMB_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_nlInv_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_DECL_SYMB_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_nlFinal_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_DECL_SYMB_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_nlDelay_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token this_DECL_SYMB_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token lv_nlReac_36_0=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token this_DECL_SYMB_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_nlRel_43_0=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        EObject lv_trigExpr_5_0 = null;

        EObject lv_invExpr_12_0 = null;

        EObject lv_finalExpr_19_0 = null;

        EObject lv_delayExpr_26_0 = null;

        EObject lv_reacExpr_33_0 = null;

        EObject lv_relExpr_40_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1000:2: ( (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) ) otherlv_45= 'END_REQ' ) )
            // InternalEdtl.g:1001:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) ) otherlv_45= 'END_REQ' )
            {
            // InternalEdtl.g:1001:2: (otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) ) otherlv_45= 'END_REQ' )
            // InternalEdtl.g:1002:3: otherlv_0= 'REQ' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) ) otherlv_45= 'END_REQ'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getREQKeyword_0());
            		
            // InternalEdtl.g:1006:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEdtl.g:1007:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEdtl.g:1007:4: (lv_name_1_0= RULE_ID )
            // InternalEdtl.g:1008:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequirementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.edtl.Edtl.ID");
            				

            }


            }

            // InternalEdtl.g:1024:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) ) )
            // InternalEdtl.g:1025:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) )
            {
            // InternalEdtl.g:1025:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* ) )
            // InternalEdtl.g:1026:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            				
            // InternalEdtl.g:1029:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )* )
            // InternalEdtl.g:1030:6: ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )*
            {
            // InternalEdtl.g:1030:6: ( ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) ) )*
            loop24:
            do {
                int alt24=7;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
                    alt24=4;
                }
                else if ( LA24_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
                    alt24=6;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEdtl.g:1031:4: ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1031:4: ({...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) ) )
            	    // InternalEdtl.g:1032:5: {...}? => ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalEdtl.g:1032:108: ( ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) ) )
            	    // InternalEdtl.g:1033:6: ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalEdtl.g:1036:9: ({...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? ) )
            	    // InternalEdtl.g:1036:10: {...}? => (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1036:19: (otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )? )
            	    // InternalEdtl.g:1036:20: otherlv_3= 'TRIGGER' this_DECL_SYMB_4= RULE_DECL_SYMB ( (lv_trigExpr_5_0= ruleExpression ) ) otherlv_6= ';' (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )?
            	    {
            	    otherlv_3=(Token)match(input,43,FOLLOW_5); 

            	    									newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getTRIGGERKeyword_2_0_0());
            	    								
            	    this_DECL_SYMB_4=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_4, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_0_1());
            	    								
            	    // InternalEdtl.g:1044:9: ( (lv_trigExpr_5_0= ruleExpression ) )
            	    // InternalEdtl.g:1045:10: (lv_trigExpr_5_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1045:10: (lv_trigExpr_5_0= ruleExpression )
            	    // InternalEdtl.g:1046:11: lv_trigExpr_5_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getTrigExprExpressionParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_trigExpr_5_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"trigExpr",
            	    												lv_trigExpr_5_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_0_3());
            	    								
            	    // InternalEdtl.g:1067:9: (otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==44) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalEdtl.g:1068:10: otherlv_7= 'NL:' ( (lv_nlTrig_8_0= RULE_STRING ) ) otherlv_9= ';'
            	            {
            	            otherlv_7=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getNLKeyword_2_0_4_0());
            	            									
            	            // InternalEdtl.g:1072:10: ( (lv_nlTrig_8_0= RULE_STRING ) )
            	            // InternalEdtl.g:1073:11: (lv_nlTrig_8_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1073:11: (lv_nlTrig_8_0= RULE_STRING )
            	            // InternalEdtl.g:1074:12: lv_nlTrig_8_0= RULE_STRING
            	            {
            	            lv_nlTrig_8_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlTrig_8_0, grammarAccess.getRequirementAccess().getNlTrigSTRINGTerminalRuleCall_2_0_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlTrig",
            	            													lv_nlTrig_8_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_9=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_0_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEdtl.g:1101:4: ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1101:4: ({...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) ) )
            	    // InternalEdtl.g:1102:5: {...}? => ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalEdtl.g:1102:108: ( ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) ) )
            	    // InternalEdtl.g:1103:6: ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalEdtl.g:1106:9: ({...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? ) )
            	    // InternalEdtl.g:1106:10: {...}? => (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1106:19: (otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )? )
            	    // InternalEdtl.g:1106:20: otherlv_10= 'INVARIANT' this_DECL_SYMB_11= RULE_DECL_SYMB ( (lv_invExpr_12_0= ruleExpression ) ) otherlv_13= ';' (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )?
            	    {
            	    otherlv_10=(Token)match(input,45,FOLLOW_5); 

            	    									newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getINVARIANTKeyword_2_1_0());
            	    								
            	    this_DECL_SYMB_11=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_11, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_1_1());
            	    								
            	    // InternalEdtl.g:1114:9: ( (lv_invExpr_12_0= ruleExpression ) )
            	    // InternalEdtl.g:1115:10: (lv_invExpr_12_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1115:10: (lv_invExpr_12_0= ruleExpression )
            	    // InternalEdtl.g:1116:11: lv_invExpr_12_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getInvExprExpressionParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_invExpr_12_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"invExpr",
            	    												lv_invExpr_12_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_13=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_1_3());
            	    								
            	    // InternalEdtl.g:1137:9: (otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==44) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalEdtl.g:1138:10: otherlv_14= 'NL:' ( (lv_nlInv_15_0= RULE_STRING ) ) otherlv_16= ';'
            	            {
            	            otherlv_14=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getNLKeyword_2_1_4_0());
            	            									
            	            // InternalEdtl.g:1142:10: ( (lv_nlInv_15_0= RULE_STRING ) )
            	            // InternalEdtl.g:1143:11: (lv_nlInv_15_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1143:11: (lv_nlInv_15_0= RULE_STRING )
            	            // InternalEdtl.g:1144:12: lv_nlInv_15_0= RULE_STRING
            	            {
            	            lv_nlInv_15_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlInv_15_0, grammarAccess.getRequirementAccess().getNlInvSTRINGTerminalRuleCall_2_1_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlInv",
            	            													lv_nlInv_15_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_16=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_1_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalEdtl.g:1171:4: ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1171:4: ({...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) ) )
            	    // InternalEdtl.g:1172:5: {...}? => ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalEdtl.g:1172:108: ( ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) ) )
            	    // InternalEdtl.g:1173:6: ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalEdtl.g:1176:9: ({...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? ) )
            	    // InternalEdtl.g:1176:10: {...}? => (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1176:19: (otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )? )
            	    // InternalEdtl.g:1176:20: otherlv_17= 'FINAL' this_DECL_SYMB_18= RULE_DECL_SYMB ( (lv_finalExpr_19_0= ruleExpression ) ) otherlv_20= ';' (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )?
            	    {
            	    otherlv_17=(Token)match(input,46,FOLLOW_5); 

            	    									newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getFINALKeyword_2_2_0());
            	    								
            	    this_DECL_SYMB_18=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_18, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_2_1());
            	    								
            	    // InternalEdtl.g:1184:9: ( (lv_finalExpr_19_0= ruleExpression ) )
            	    // InternalEdtl.g:1185:10: (lv_finalExpr_19_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1185:10: (lv_finalExpr_19_0= ruleExpression )
            	    // InternalEdtl.g:1186:11: lv_finalExpr_19_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getFinalExprExpressionParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_finalExpr_19_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"finalExpr",
            	    												lv_finalExpr_19_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_20=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_2_3());
            	    								
            	    // InternalEdtl.g:1207:9: (otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==44) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalEdtl.g:1208:10: otherlv_21= 'NL:' ( (lv_nlFinal_22_0= RULE_STRING ) ) otherlv_23= ';'
            	            {
            	            otherlv_21=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getNLKeyword_2_2_4_0());
            	            									
            	            // InternalEdtl.g:1212:10: ( (lv_nlFinal_22_0= RULE_STRING ) )
            	            // InternalEdtl.g:1213:11: (lv_nlFinal_22_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1213:11: (lv_nlFinal_22_0= RULE_STRING )
            	            // InternalEdtl.g:1214:12: lv_nlFinal_22_0= RULE_STRING
            	            {
            	            lv_nlFinal_22_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlFinal_22_0, grammarAccess.getRequirementAccess().getNlFinalSTRINGTerminalRuleCall_2_2_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlFinal",
            	            													lv_nlFinal_22_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_23=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_2_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalEdtl.g:1241:4: ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1241:4: ({...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) ) )
            	    // InternalEdtl.g:1242:5: {...}? => ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalEdtl.g:1242:108: ( ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) ) )
            	    // InternalEdtl.g:1243:6: ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalEdtl.g:1246:9: ({...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? ) )
            	    // InternalEdtl.g:1246:10: {...}? => (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1246:19: (otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )? )
            	    // InternalEdtl.g:1246:20: otherlv_24= 'DELAY' this_DECL_SYMB_25= RULE_DECL_SYMB ( (lv_delayExpr_26_0= ruleExpression ) ) otherlv_27= ';' (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            	    {
            	    otherlv_24=(Token)match(input,47,FOLLOW_5); 

            	    									newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getDELAYKeyword_2_3_0());
            	    								
            	    this_DECL_SYMB_25=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_25, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_3_1());
            	    								
            	    // InternalEdtl.g:1254:9: ( (lv_delayExpr_26_0= ruleExpression ) )
            	    // InternalEdtl.g:1255:10: (lv_delayExpr_26_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1255:10: (lv_delayExpr_26_0= ruleExpression )
            	    // InternalEdtl.g:1256:11: lv_delayExpr_26_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getDelayExprExpressionParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_delayExpr_26_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"delayExpr",
            	    												lv_delayExpr_26_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_27=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_3_3());
            	    								
            	    // InternalEdtl.g:1277:9: (otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==44) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalEdtl.g:1278:10: otherlv_28= 'NL:' ( (lv_nlDelay_29_0= RULE_STRING ) ) otherlv_30= ';'
            	            {
            	            otherlv_28=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getNLKeyword_2_3_4_0());
            	            									
            	            // InternalEdtl.g:1282:10: ( (lv_nlDelay_29_0= RULE_STRING ) )
            	            // InternalEdtl.g:1283:11: (lv_nlDelay_29_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1283:11: (lv_nlDelay_29_0= RULE_STRING )
            	            // InternalEdtl.g:1284:12: lv_nlDelay_29_0= RULE_STRING
            	            {
            	            lv_nlDelay_29_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlDelay_29_0, grammarAccess.getRequirementAccess().getNlDelaySTRINGTerminalRuleCall_2_3_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlDelay",
            	            													lv_nlDelay_29_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_30=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_30, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_3_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalEdtl.g:1311:4: ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1311:4: ({...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) ) )
            	    // InternalEdtl.g:1312:5: {...}? => ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalEdtl.g:1312:108: ( ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) ) )
            	    // InternalEdtl.g:1313:6: ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalEdtl.g:1316:9: ({...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? ) )
            	    // InternalEdtl.g:1316:10: {...}? => (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1316:19: (otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )? )
            	    // InternalEdtl.g:1316:20: otherlv_31= 'REACTION' this_DECL_SYMB_32= RULE_DECL_SYMB ( (lv_reacExpr_33_0= ruleExpression ) ) otherlv_34= ';' (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )?
            	    {
            	    otherlv_31=(Token)match(input,48,FOLLOW_5); 

            	    									newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getREACTIONKeyword_2_4_0());
            	    								
            	    this_DECL_SYMB_32=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_32, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_4_1());
            	    								
            	    // InternalEdtl.g:1324:9: ( (lv_reacExpr_33_0= ruleExpression ) )
            	    // InternalEdtl.g:1325:10: (lv_reacExpr_33_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1325:10: (lv_reacExpr_33_0= ruleExpression )
            	    // InternalEdtl.g:1326:11: lv_reacExpr_33_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getReacExprExpressionParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_reacExpr_33_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"reacExpr",
            	    												lv_reacExpr_33_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_34=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_34, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_4_3());
            	    								
            	    // InternalEdtl.g:1347:9: (otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==44) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalEdtl.g:1348:10: otherlv_35= 'NL:' ( (lv_nlReac_36_0= RULE_STRING ) ) otherlv_37= ';'
            	            {
            	            otherlv_35=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getNLKeyword_2_4_4_0());
            	            									
            	            // InternalEdtl.g:1352:10: ( (lv_nlReac_36_0= RULE_STRING ) )
            	            // InternalEdtl.g:1353:11: (lv_nlReac_36_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1353:11: (lv_nlReac_36_0= RULE_STRING )
            	            // InternalEdtl.g:1354:12: lv_nlReac_36_0= RULE_STRING
            	            {
            	            lv_nlReac_36_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlReac_36_0, grammarAccess.getRequirementAccess().getNlReacSTRINGTerminalRuleCall_2_4_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlReac",
            	            													lv_nlReac_36_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_37=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_4_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalEdtl.g:1381:4: ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) )
            	    {
            	    // InternalEdtl.g:1381:4: ({...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) ) )
            	    // InternalEdtl.g:1382:5: {...}? => ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalEdtl.g:1382:108: ( ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) ) )
            	    // InternalEdtl.g:1383:6: ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalEdtl.g:1386:9: ({...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? ) )
            	    // InternalEdtl.g:1386:10: {...}? => (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // InternalEdtl.g:1386:19: (otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )? )
            	    // InternalEdtl.g:1386:20: otherlv_38= 'RELEASE' this_DECL_SYMB_39= RULE_DECL_SYMB ( (lv_relExpr_40_0= ruleExpression ) ) otherlv_41= ';' (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )?
            	    {
            	    otherlv_38=(Token)match(input,49,FOLLOW_5); 

            	    									newLeafNode(otherlv_38, grammarAccess.getRequirementAccess().getRELEASEKeyword_2_5_0());
            	    								
            	    this_DECL_SYMB_39=(Token)match(input,RULE_DECL_SYMB,FOLLOW_16); 

            	    									newLeafNode(this_DECL_SYMB_39, grammarAccess.getRequirementAccess().getDECL_SYMBTerminalRuleCall_2_5_1());
            	    								
            	    // InternalEdtl.g:1394:9: ( (lv_relExpr_40_0= ruleExpression ) )
            	    // InternalEdtl.g:1395:10: (lv_relExpr_40_0= ruleExpression )
            	    {
            	    // InternalEdtl.g:1395:10: (lv_relExpr_40_0= ruleExpression )
            	    // InternalEdtl.g:1396:11: lv_relExpr_40_0= ruleExpression
            	    {

            	    											newCompositeNode(grammarAccess.getRequirementAccess().getRelExprExpressionParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_7);
            	    lv_relExpr_40_0=ruleExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    											}
            	    											set(
            	    												current,
            	    												"relExpr",
            	    												lv_relExpr_40_0,
            	    												"su.nsk.iae.edtl.Edtl.Expression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_41=(Token)match(input,27,FOLLOW_25); 

            	    									newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_5_3());
            	    								
            	    // InternalEdtl.g:1417:9: (otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==44) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalEdtl.g:1418:10: otherlv_42= 'NL:' ( (lv_nlRel_43_0= RULE_STRING ) ) otherlv_44= ';'
            	            {
            	            otherlv_42=(Token)match(input,44,FOLLOW_26); 

            	            										newLeafNode(otherlv_42, grammarAccess.getRequirementAccess().getNLKeyword_2_5_4_0());
            	            									
            	            // InternalEdtl.g:1422:10: ( (lv_nlRel_43_0= RULE_STRING ) )
            	            // InternalEdtl.g:1423:11: (lv_nlRel_43_0= RULE_STRING )
            	            {
            	            // InternalEdtl.g:1423:11: (lv_nlRel_43_0= RULE_STRING )
            	            // InternalEdtl.g:1424:12: lv_nlRel_43_0= RULE_STRING
            	            {
            	            lv_nlRel_43_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            	            												newLeafNode(lv_nlRel_43_0, grammarAccess.getRequirementAccess().getNlRelSTRINGTerminalRuleCall_2_5_4_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getRequirementRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"nlRel",
            	            													lv_nlRel_43_0,
            	            													"su.nsk.iae.edtl.Edtl.STRING");
            	            											

            	            }


            	            }

            	            otherlv_44=(Token)match(input,27,FOLLOW_24); 

            	            										newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getSemicolonKeyword_2_5_4_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            				

            }

            otherlv_45=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_45, grammarAccess.getRequirementAccess().getEND_REQKeyword_3());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleVariable"
    // InternalEdtl.g:1466:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalEdtl.g:1466:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalEdtl.g:1467:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalEdtl.g:1473:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:1479:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEdtl.g:1480:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEdtl.g:1480:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEdtl.g:1481:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEdtl.g:1481:3: (lv_name_0_0= RULE_ID )
            // InternalEdtl.g:1482:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"su.nsk.iae.edtl.Edtl.ID");
            			

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // InternalEdtl.g:1501:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEdtl.g:1501:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEdtl.g:1502:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEdtl.g:1508:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_orOp_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1514:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalEdtl.g:1515:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalEdtl.g:1515:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalEdtl.g:1516:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1524:3: ( () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_OR_OPERATOR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEdtl.g:1525:4: () ( (lv_orOp_2_0= RULE_OR_OPERATOR ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalEdtl.g:1525:4: ()
            	    // InternalEdtl.g:1526:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1532:4: ( (lv_orOp_2_0= RULE_OR_OPERATOR ) )
            	    // InternalEdtl.g:1533:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    {
            	    // InternalEdtl.g:1533:5: (lv_orOp_2_0= RULE_OR_OPERATOR )
            	    // InternalEdtl.g:1534:6: lv_orOp_2_0= RULE_OR_OPERATOR
            	    {
            	    lv_orOp_2_0=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_16); 

            	    						newLeafNode(lv_orOp_2_0, grammarAccess.getExpressionAccess().getOrOpOR_OPERATORTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getExpressionRule());
            	    						}
            	    						setWithLastConsumed(
            	    							current,
            	    							"orOp",
            	    							lv_orOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.OR_OPERATOR");
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1550:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalEdtl.g:1551:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalEdtl.g:1551:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalEdtl.g:1552:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalEdtl.g:1574:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalEdtl.g:1574:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalEdtl.g:1575:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalEdtl.g:1581:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1587:2: ( (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1588:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1588:2: (this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1589:3: this_AndExpression_0= ruleAndExpression ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1597:3: ( () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEdtl.g:1598:4: () ruleXOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1598:4: ()
            	    // InternalEdtl.g:1599:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }


            	    				newCompositeNode(grammarAccess.getXorExpressionAccess().getXOR_OPERATORParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_16);
            	    ruleXOR_OPERATOR();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			
            	    // InternalEdtl.g:1612:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1613:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1613:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1614:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleXOR_OPERATOR"
    // InternalEdtl.g:1636:1: entryRuleXOR_OPERATOR returns [String current=null] : iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF ;
    public final String entryRuleXOR_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXOR_OPERATOR = null;


        try {
            // InternalEdtl.g:1636:52: (iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF )
            // InternalEdtl.g:1637:2: iv_ruleXOR_OPERATOR= ruleXOR_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getXOR_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXOR_OPERATOR=ruleXOR_OPERATOR();

            state._fsp--;

             current =iv_ruleXOR_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleXOR_OPERATOR"


    // $ANTLR start "ruleXOR_OPERATOR"
    // InternalEdtl.g:1643:1: ruleXOR_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'XOR' ;
    public final AntlrDatatypeRuleToken ruleXOR_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1649:2: (kw= 'XOR' )
            // InternalEdtl.g:1650:2: kw= 'XOR'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXOR_OPERATORAccess().getXORKeyword());
            	

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
    // $ANTLR end "ruleXOR_OPERATOR"


    // $ANTLR start "entryRuleAndExpression"
    // InternalEdtl.g:1658:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalEdtl.g:1658:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalEdtl.g:1659:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalEdtl.g:1665:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CompExpression_0 = null;

        AntlrDatatypeRuleToken lv_andOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1671:2: ( (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalEdtl.g:1672:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalEdtl.g:1672:2: (this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalEdtl.g:1673:3: this_CompExpression_0= ruleCompExpression ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1681:3: ( () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==52) ) {
                    alt27=1;
                }
                else if ( (LA27_0==53) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEdtl.g:1682:4: () ( (lv_andOp_2_0= ruleAND_OPERATOR ) ) ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalEdtl.g:1682:4: ()
            	    // InternalEdtl.g:1683:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1689:4: ( (lv_andOp_2_0= ruleAND_OPERATOR ) )
            	    // InternalEdtl.g:1690:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    {
            	    // InternalEdtl.g:1690:5: (lv_andOp_2_0= ruleAND_OPERATOR )
            	    // InternalEdtl.g:1691:6: lv_andOp_2_0= ruleAND_OPERATOR
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getAndOpAND_OPERATORParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_andOp_2_0=ruleAND_OPERATOR();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"andOp",
            	    							lv_andOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.AND_OPERATOR");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1708:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalEdtl.g:1709:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalEdtl.g:1709:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalEdtl.g:1710:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAND_OPERATOR"
    // InternalEdtl.g:1732:1: entryRuleAND_OPERATOR returns [String current=null] : iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF ;
    public final String entryRuleAND_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAND_OPERATOR = null;


        try {
            // InternalEdtl.g:1732:52: (iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF )
            // InternalEdtl.g:1733:2: iv_ruleAND_OPERATOR= ruleAND_OPERATOR EOF
            {
             newCompositeNode(grammarAccess.getAND_OPERATORRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAND_OPERATOR=ruleAND_OPERATOR();

            state._fsp--;

             current =iv_ruleAND_OPERATOR.getText(); 
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
    // $ANTLR end "entryRuleAND_OPERATOR"


    // $ANTLR start "ruleAND_OPERATOR"
    // InternalEdtl.g:1739:1: ruleAND_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'AND' ) ;
    public final AntlrDatatypeRuleToken ruleAND_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1745:2: ( (kw= '&&' | kw= 'AND' ) )
            // InternalEdtl.g:1746:2: (kw= '&&' | kw= 'AND' )
            {
            // InternalEdtl.g:1746:2: (kw= '&&' | kw= 'AND' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            else if ( (LA28_0==53) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalEdtl.g:1747:3: kw= '&&'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getAmpersandAmpersandKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1753:3: kw= 'AND'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAND_OPERATORAccess().getANDKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleAND_OPERATOR"


    // $ANTLR start "entryRuleCompExpression"
    // InternalEdtl.g:1762:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalEdtl.g:1762:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalEdtl.g:1763:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalEdtl.g:1769:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1775:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalEdtl.g:1776:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalEdtl.g:1776:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalEdtl.g:1777:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1785:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                switch ( input.LA(1) ) {
                case 64:
                    {
                    alt29=1;
                    }
                    break;
                case 65:
                    {
                    alt29=1;
                    }
                    break;
                case 66:
                    {
                    alt29=1;
                    }
                    break;
                case 67:
                    {
                    alt29=1;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // InternalEdtl.g:1786:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalEdtl.g:1786:4: ()
            	    // InternalEdtl.g:1787:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1793:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalEdtl.g:1794:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalEdtl.g:1794:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalEdtl.g:1795:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_compOp_2_0=ruleCompOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compOp",
            	    							lv_compOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.CompOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1812:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalEdtl.g:1813:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalEdtl.g:1813:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalEdtl.g:1814:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalEdtl.g:1836:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalEdtl.g:1836:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalEdtl.g:1837:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
             newCompositeNode(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;

             current =iv_ruleEquExpression; 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalEdtl.g:1843:1: ruleEquExpression returns [EObject current=null] : (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_UnExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1849:2: ( (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* ) )
            // InternalEdtl.g:1850:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            {
            // InternalEdtl.g:1850:2: (this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )* )
            // InternalEdtl.g:1851:3: this_UnExpression_0= ruleUnExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getUnExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_UnExpression_0=ruleUnExpression();

            state._fsp--;


            			current = this_UnExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:1859:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=62 && LA30_0<=63)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEdtl.g:1860:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleUnExpression ) )
            	    {
            	    // InternalEdtl.g:1860:4: ()
            	    // InternalEdtl.g:1861:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalEdtl.g:1867:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalEdtl.g:1868:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalEdtl.g:1868:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalEdtl.g:1869:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_equOp_2_0=ruleEquOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"equOp",
            	    							lv_equOp_2_0,
            	    							"su.nsk.iae.edtl.Edtl.EquOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalEdtl.g:1886:4: ( (lv_right_3_0= ruleUnExpression ) )
            	    // InternalEdtl.g:1887:5: (lv_right_3_0= ruleUnExpression )
            	    {
            	    // InternalEdtl.g:1887:5: (lv_right_3_0= ruleUnExpression )
            	    // InternalEdtl.g:1888:6: lv_right_3_0= ruleUnExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightUnExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleUnExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.edtl.Edtl.UnExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleUnOperator"
    // InternalEdtl.g:1910:1: entryRuleUnOperator returns [String current=null] : iv_ruleUnOperator= ruleUnOperator EOF ;
    public final String entryRuleUnOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnOperator = null;


        try {
            // InternalEdtl.g:1910:50: (iv_ruleUnOperator= ruleUnOperator EOF )
            // InternalEdtl.g:1911:2: iv_ruleUnOperator= ruleUnOperator EOF
            {
             newCompositeNode(grammarAccess.getUnOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnOperator=ruleUnOperator();

            state._fsp--;

             current =iv_ruleUnOperator.getText(); 
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
    // $ANTLR end "entryRuleUnOperator"


    // $ANTLR start "ruleUnOperator"
    // InternalEdtl.g:1917:1: ruleUnOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) ;
    public final AntlrDatatypeRuleToken ruleUnOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NotOperator_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:1923:2: ( (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' ) )
            // InternalEdtl.g:1924:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            {
            // InternalEdtl.g:1924:2: (this_NotOperator_0= ruleNotOperator | kw= 'FE' | kw= 'RE' | kw= 'HIGH' | kw= 'LOW' )
            int alt31=5;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt31=1;
                }
                break;
            case 54:
                {
                alt31=2;
                }
                break;
            case 55:
                {
                alt31=3;
                }
                break;
            case 56:
                {
                alt31=4;
                }
                break;
            case 57:
                {
                alt31=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalEdtl.g:1925:3: this_NotOperator_0= ruleNotOperator
                    {

                    			newCompositeNode(grammarAccess.getUnOperatorAccess().getNotOperatorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NotOperator_0=ruleNotOperator();

                    state._fsp--;


                    			current.merge(this_NotOperator_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1936:3: kw= 'FE'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getFEKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEdtl.g:1942:3: kw= 'RE'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getREKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalEdtl.g:1948:3: kw= 'HIGH'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getHIGHKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalEdtl.g:1954:3: kw= 'LOW'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getUnOperatorAccess().getLOWKeyword_4());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleUnOperator"


    // $ANTLR start "entryRuleNotOperator"
    // InternalEdtl.g:1963:1: entryRuleNotOperator returns [String current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final String entryRuleNotOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNotOperator = null;


        try {
            // InternalEdtl.g:1963:51: (iv_ruleNotOperator= ruleNotOperator EOF )
            // InternalEdtl.g:1964:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
             newCompositeNode(grammarAccess.getNotOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;

             current =iv_ruleNotOperator.getText(); 
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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalEdtl.g:1970:1: ruleNotOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'NOT' | kw= '!' ) ;
    public final AntlrDatatypeRuleToken ruleNotOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:1976:2: ( (kw= 'NOT' | kw= '!' ) )
            // InternalEdtl.g:1977:2: (kw= 'NOT' | kw= '!' )
            {
            // InternalEdtl.g:1977:2: (kw= 'NOT' | kw= '!' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==58) ) {
                alt32=1;
            }
            else if ( (LA32_0==59) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEdtl.g:1978:3: kw= 'NOT'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getNOTKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:1984:3: kw= '!'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleUnExpression"
    // InternalEdtl.g:1993:1: entryRuleUnExpression returns [EObject current=null] : iv_ruleUnExpression= ruleUnExpression EOF ;
    public final EObject entryRuleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnExpression = null;


        try {
            // InternalEdtl.g:1993:53: (iv_ruleUnExpression= ruleUnExpression EOF )
            // InternalEdtl.g:1994:2: iv_ruleUnExpression= ruleUnExpression EOF
            {
             newCompositeNode(grammarAccess.getUnExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnExpression=ruleUnExpression();

            state._fsp--;

             current =iv_ruleUnExpression; 
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
    // $ANTLR end "entryRuleUnExpression"


    // $ANTLR start "ruleUnExpression"
    // InternalEdtl.g:2000:1: ruleUnExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        AntlrDatatypeRuleToken lv_unOp_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:2006:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalEdtl.g:2007:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalEdtl.g:2007:2: (this_PrimaryExpression_0= rulePrimaryExpression | ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INTEGER||(LA33_0>=RULE_ID && LA33_0<=RULE_BOOLEAN_LITERAL)||LA33_0==37||LA33_0==60) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=54 && LA33_0<=59)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalEdtl.g:2008:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2017:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalEdtl.g:2017:3: ( ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalEdtl.g:2018:4: ( (lv_unOp_1_0= ruleUnOperator ) ) ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    // InternalEdtl.g:2018:4: ( (lv_unOp_1_0= ruleUnOperator ) )
                    // InternalEdtl.g:2019:5: (lv_unOp_1_0= ruleUnOperator )
                    {
                    // InternalEdtl.g:2019:5: (lv_unOp_1_0= ruleUnOperator )
                    // InternalEdtl.g:2020:6: lv_unOp_1_0= ruleUnOperator
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getUnOpUnOperatorParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_unOp_1_0=ruleUnOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"unOp",
                    							lv_unOp_1_0,
                    							"su.nsk.iae.edtl.Edtl.UnOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEdtl.g:2037:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalEdtl.g:2038:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalEdtl.g:2038:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalEdtl.g:2039:6: lv_right_2_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.edtl.Edtl.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleUnExpression"


    // $ANTLR start "entryRuleTauExpression"
    // InternalEdtl.g:2061:1: entryRuleTauExpression returns [EObject current=null] : iv_ruleTauExpression= ruleTauExpression EOF ;
    public final EObject entryRuleTauExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTauExpression = null;


        try {
            // InternalEdtl.g:2061:54: (iv_ruleTauExpression= ruleTauExpression EOF )
            // InternalEdtl.g:2062:2: iv_ruleTauExpression= ruleTauExpression EOF
            {
             newCompositeNode(grammarAccess.getTauExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTauExpression=ruleTauExpression();

            state._fsp--;

             current =iv_ruleTauExpression; 
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
    // $ANTLR end "entryRuleTauExpression"


    // $ANTLR start "ruleTauExpression"
    // InternalEdtl.g:2068:1: ruleTauExpression returns [EObject current=null] : (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) ;
    public final EObject ruleTauExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:2074:2: ( (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' ) )
            // InternalEdtl.g:2075:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            {
            // InternalEdtl.g:2075:2: (otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')' )
            // InternalEdtl.g:2076:3: otherlv_0= 'TAU' otherlv_1= '(' ( (lv_time_2_0= ruleTimeLiteral ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getTauExpressionAccess().getTAUKeyword_0());
            		
            otherlv_1=(Token)match(input,37,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTauExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEdtl.g:2084:3: ( (lv_time_2_0= ruleTimeLiteral ) )
            // InternalEdtl.g:2085:4: (lv_time_2_0= ruleTimeLiteral )
            {
            // InternalEdtl.g:2085:4: (lv_time_2_0= ruleTimeLiteral )
            // InternalEdtl.g:2086:5: lv_time_2_0= ruleTimeLiteral
            {

            					newCompositeNode(grammarAccess.getTauExpressionAccess().getTimeTimeLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_time_2_0=ruleTimeLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTauExpressionRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"su.nsk.iae.edtl.Edtl.TimeLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTauExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTauExpression"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalEdtl.g:2111:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalEdtl.g:2111:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalEdtl.g:2112:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;

             current =iv_ruleTimeLiteral; 
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
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalEdtl.g:2118:1: ruleTimeLiteral returns [EObject current=null] : ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_interval_1_0=null;


        	enterRule();

        try {
            // InternalEdtl.g:2124:2: ( ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) ) )
            // InternalEdtl.g:2125:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            {
            // InternalEdtl.g:2125:2: ( ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) ) )
            // InternalEdtl.g:2126:3: ruleTIME_PREF_LITERAL ( (lv_interval_1_0= RULE_INTERVAL ) )
            {

            			newCompositeNode(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            ruleTIME_PREF_LITERAL();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalEdtl.g:2133:3: ( (lv_interval_1_0= RULE_INTERVAL ) )
            // InternalEdtl.g:2134:4: (lv_interval_1_0= RULE_INTERVAL )
            {
            // InternalEdtl.g:2134:4: (lv_interval_1_0= RULE_INTERVAL )
            // InternalEdtl.g:2135:5: lv_interval_1_0= RULE_INTERVAL
            {
            lv_interval_1_0=(Token)match(input,RULE_INTERVAL,FOLLOW_2); 

            					newLeafNode(lv_interval_1_0, grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_1_0,
            						"su.nsk.iae.edtl.Edtl.INTERVAL");
            				

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
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleTIME_PREF_LITERAL"
    // InternalEdtl.g:2155:1: entryRuleTIME_PREF_LITERAL returns [String current=null] : iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF ;
    public final String entryRuleTIME_PREF_LITERAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTIME_PREF_LITERAL = null;


        try {
            // InternalEdtl.g:2155:57: (iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF )
            // InternalEdtl.g:2156:2: iv_ruleTIME_PREF_LITERAL= ruleTIME_PREF_LITERAL EOF
            {
             newCompositeNode(grammarAccess.getTIME_PREF_LITERALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTIME_PREF_LITERAL=ruleTIME_PREF_LITERAL();

            state._fsp--;

             current =iv_ruleTIME_PREF_LITERAL.getText(); 
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
    // $ANTLR end "entryRuleTIME_PREF_LITERAL"


    // $ANTLR start "ruleTIME_PREF_LITERAL"
    // InternalEdtl.g:2162:1: ruleTIME_PREF_LITERAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'T#' ;
    public final AntlrDatatypeRuleToken ruleTIME_PREF_LITERAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEdtl.g:2168:2: (kw= 'T#' )
            // InternalEdtl.g:2169:2: kw= 'T#'
            {
            kw=(Token)match(input,61,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTIME_PREF_LITERALAccess().getTKeyword());
            	

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
    // $ANTLR end "ruleTIME_PREF_LITERAL"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalEdtl.g:2177:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalEdtl.g:2177:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalEdtl.g:2178:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalEdtl.g:2184:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_constant_0_0 = null;

        EObject lv_tau_1_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_nestExpr_8_0 = null;



        	enterRule();

        try {
            // InternalEdtl.g:2190:2: ( ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) ) )
            // InternalEdtl.g:2191:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            {
            // InternalEdtl.g:2191:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_tau_1_0= ruleTauExpression ) ) | ( (otherlv_2= RULE_ID ) ) | ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' ) )
            int alt35=5;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_BOOLEAN_LITERAL:
                {
                alt35=1;
                }
                break;
            case 60:
                {
                alt35=2;
                }
                break;
            case RULE_ID:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==EOF||LA35_3==RULE_OR_OPERATOR||LA35_3==27||LA35_3==35||(LA35_3>=38 && LA35_3<=39)||(LA35_3>=51 && LA35_3<=53)||(LA35_3>=62 && LA35_3<=67)) ) {
                    alt35=3;
                }
                else if ( (LA35_3==37) ) {
                    alt35=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                alt35=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEdtl.g:2192:3: ( (lv_constant_0_0= ruleConstant ) )
                    {
                    // InternalEdtl.g:2192:3: ( (lv_constant_0_0= ruleConstant ) )
                    // InternalEdtl.g:2193:4: (lv_constant_0_0= ruleConstant )
                    {
                    // InternalEdtl.g:2193:4: (lv_constant_0_0= ruleConstant )
                    // InternalEdtl.g:2194:5: lv_constant_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_0_0,
                    						"su.nsk.iae.edtl.Edtl.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2212:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    {
                    // InternalEdtl.g:2212:3: ( (lv_tau_1_0= ruleTauExpression ) )
                    // InternalEdtl.g:2213:4: (lv_tau_1_0= ruleTauExpression )
                    {
                    // InternalEdtl.g:2213:4: (lv_tau_1_0= ruleTauExpression )
                    // InternalEdtl.g:2214:5: lv_tau_1_0= ruleTauExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTauTauExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tau_1_0=ruleTauExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"tau",
                    						lv_tau_1_0,
                    						"su.nsk.iae.edtl.Edtl.TauExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:2232:3: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalEdtl.g:2232:3: ( (otherlv_2= RULE_ID ) )
                    // InternalEdtl.g:2233:4: (otherlv_2= RULE_ID )
                    {
                    // InternalEdtl.g:2233:4: (otherlv_2= RULE_ID )
                    // InternalEdtl.g:2234:5: otherlv_2= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getVCrossVarAbbrCrossReference_2_0());
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:2246:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    {
                    // InternalEdtl.g:2246:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')' )
                    // InternalEdtl.g:2247:4: ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( (lv_args_5_0= ruleParamAssignmentElements ) )? otherlv_6= ')'
                    {
                    // InternalEdtl.g:2247:4: ( (otherlv_3= RULE_ID ) )
                    // InternalEdtl.g:2248:5: (otherlv_3= RULE_ID )
                    {
                    // InternalEdtl.g:2248:5: (otherlv_3= RULE_ID )
                    // InternalEdtl.g:2249:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getMacrosMacrosCrossReference_3_0_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalEdtl.g:2264:4: ( (lv_args_5_0= ruleParamAssignmentElements ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_ID) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalEdtl.g:2265:5: (lv_args_5_0= ruleParamAssignmentElements )
                            {
                            // InternalEdtl.g:2265:5: (lv_args_5_0= ruleParamAssignmentElements )
                            // InternalEdtl.g:2266:6: lv_args_5_0= ruleParamAssignmentElements
                            {

                            						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArgsParamAssignmentElementsParserRuleCall_3_2_0());
                            					
                            pushFollow(FOLLOW_20);
                            lv_args_5_0=ruleParamAssignmentElements();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                            						}
                            						set(
                            							current,
                            							"args",
                            							lv_args_5_0,
                            							"su.nsk.iae.edtl.Edtl.ParamAssignmentElements");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEdtl.g:2289:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    {
                    // InternalEdtl.g:2289:3: (otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')' )
                    // InternalEdtl.g:2290:4: otherlv_7= '(' ( (lv_nestExpr_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalEdtl.g:2294:4: ( (lv_nestExpr_8_0= ruleExpression ) )
                    // InternalEdtl.g:2295:5: (lv_nestExpr_8_0= ruleExpression )
                    {
                    // InternalEdtl.g:2295:5: (lv_nestExpr_8_0= ruleExpression )
                    // InternalEdtl.g:2296:6: lv_nestExpr_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_nestExpr_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"nestExpr",
                    							lv_nestExpr_8_0,
                    							"su.nsk.iae.edtl.Edtl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_4_2());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleConstant"
    // InternalEdtl.g:2322:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalEdtl.g:2322:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalEdtl.g:2323:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalEdtl.g:2329:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_BOOLEAN_LITERAL_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:2335:2: ( (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL ) )
            // InternalEdtl.g:2336:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            {
            // InternalEdtl.g:2336:2: (this_INTEGER_0= RULE_INTEGER | this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INTEGER) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_BOOLEAN_LITERAL) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEdtl.g:2337:3: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    			current.merge(this_INTEGER_0);
                    		

                    			newLeafNode(this_INTEGER_0, grammarAccess.getConstantAccess().getINTEGERTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2345:3: this_BOOLEAN_LITERAL_1= RULE_BOOLEAN_LITERAL
                    {
                    this_BOOLEAN_LITERAL_1=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_LITERAL_1);
                    		

                    			newLeafNode(this_BOOLEAN_LITERAL_1, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleParamAssignmentElements"
    // InternalEdtl.g:2356:1: entryRuleParamAssignmentElements returns [EObject current=null] : iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF ;
    public final EObject entryRuleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamAssignmentElements = null;


        try {
            // InternalEdtl.g:2356:64: (iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF )
            // InternalEdtl.g:2357:2: iv_ruleParamAssignmentElements= ruleParamAssignmentElements EOF
            {
             newCompositeNode(grammarAccess.getParamAssignmentElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamAssignmentElements=ruleParamAssignmentElements();

            state._fsp--;

             current =iv_ruleParamAssignmentElements; 
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
    // $ANTLR end "entryRuleParamAssignmentElements"


    // $ANTLR start "ruleParamAssignmentElements"
    // InternalEdtl.g:2363:1: ruleParamAssignmentElements returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleParamAssignmentElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalEdtl.g:2369:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalEdtl.g:2370:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalEdtl.g:2370:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalEdtl.g:2371:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalEdtl.g:2371:3: ( (otherlv_0= RULE_ID ) )
            // InternalEdtl.g:2372:4: (otherlv_0= RULE_ID )
            {
            // InternalEdtl.g:2372:4: (otherlv_0= RULE_ID )
            // InternalEdtl.g:2373:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_0_0());
            				

            }


            }

            // InternalEdtl.g:2384:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEdtl.g:2385:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getParamAssignmentElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalEdtl.g:2389:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalEdtl.g:2390:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalEdtl.g:2390:5: (otherlv_2= RULE_ID )
            	    // InternalEdtl.g:2391:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParamAssignmentElementsRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    						newLeafNode(otherlv_2, grammarAccess.getParamAssignmentElementsAccess().getElementsCrossVarAbbrCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleParamAssignmentElements"


    // $ANTLR start "ruleEquOperator"
    // InternalEdtl.g:2407:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEdtl.g:2413:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) ) )
            // InternalEdtl.g:2414:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalEdtl.g:2414:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<>' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==62) ) {
                alt38=1;
            }
            else if ( (LA38_0==63) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEdtl.g:2415:3: (enumLiteral_0= '==' )
                    {
                    // InternalEdtl.g:2415:3: (enumLiteral_0= '==' )
                    // InternalEdtl.g:2416:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2423:3: (enumLiteral_1= '<>' )
                    {
                    // InternalEdtl.g:2423:3: (enumLiteral_1= '<>' )
                    // InternalEdtl.g:2424:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEquOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleCompOperator"
    // InternalEdtl.g:2434:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEdtl.g:2440:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalEdtl.g:2441:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalEdtl.g:2441:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt39=1;
                }
                break;
            case 65:
                {
                alt39=2;
                }
                break;
            case 66:
                {
                alt39=3;
                }
                break;
            case 67:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalEdtl.g:2442:3: (enumLiteral_0= '<' )
                    {
                    // InternalEdtl.g:2442:3: (enumLiteral_0= '<' )
                    // InternalEdtl.g:2443:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEdtl.g:2450:3: (enumLiteral_1= '>' )
                    {
                    // InternalEdtl.g:2450:3: (enumLiteral_1= '>' )
                    // InternalEdtl.g:2451:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEdtl.g:2458:3: (enumLiteral_2= '<=' )
                    {
                    // InternalEdtl.g:2458:3: (enumLiteral_2= '<=' )
                    // InternalEdtl.g:2459:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEdtl.g:2466:3: (enumLiteral_3= '>=' )
                    {
                    // InternalEdtl.g:2466:3: (enumLiteral_3= '>=' )
                    // InternalEdtl.g:2467:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleCompOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000061622000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000014000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000050000080L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1FC00020000001A0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0007E80000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0007F80000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x10000020000001A0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000800L});

}
