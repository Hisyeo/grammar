// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KokanuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ProperNoun=2, Comma=3, Colon=4, Period=5, A=6, In=7, Le=8, Men=9, 
		O=10, Ta=11, Te=12, We=13, Win=14, Wo=15, Lijule=16, Pese=17, Kapaja=18, 
		Kilima=19, Sito=20, Iman=21, Tasuwi=22, Akiki=23, Ukun=24, Aja=25, Sala=26, 
		Talika=27, Kapan=28, Kisa=29, Mu=30, Mata=31, Mutakin=32, Mita=33, Jasa=34, 
		Jamin=35, Apaki=36, Luwa=37, Konpa=38, Kela=39, Lika=40, Otota=41, Ka=42, 
		Tisilin=43, Janlu=44, Jamu=45, Pututi=46, Minuli=47, Oti=48, Kota=49, 
		Pani=50, Unitu=51, Loso=52, Kima=53, Pi=54, Anan=55, Tenkin=56, Patun=57, 
		Sikin=58, Usen=59, Panli=60, Tunti=61, Sinsi=62, Wanku=63, Papon=64, Junja=65, 
		Jati=66, Unsi=67, Nan=68, Ju=69, Anpipi=70, Mese=71, Ten=72, Puka=73, 
		Kanisa=74, Pulusi=75, Muwesi=76, Moto=77, Pankosi=78, Nula=79, Pela=80, 
		Otan=81, Kujo=82, Tan=83, Tun=84, Ela=85, Kemika=86, Po=87, Mani=88, No=89, 
		Oke=90, Wan=91, Suwi=92, Sin=93, Tati=94, Tolu=95, Lipu=96, Osa=97, Tomiwa=98, 
		Pesuwan=99, Ken=100, Tepu=101, Anwije=102, Lisi=103, Lan=104, Soto=105, 
		Eme=106, Nin=107, Lijo=108, Toki=109, An=110, Ato=111, Kumi=112, Kapu=113, 
		Un=114, Polan=115, Wisan=116, Mijalo=117, Neso=118, Kaso=119, Tawe=120, 
		Konen=121, Kikuwa=122, Kiju=123, Jone=124, Akoli=125, Mamaki=126, Lana=127, 
		Wa=128, Ja=129, Wiki=130, Naki=131, Sone=132, Katin=133, Kula=134, Kun=135, 
		Kusa=136, Tanwa=137, Tipa=138, Teka=139, Tile=140, Tusa=141, Tijante=142, 
		Nankin=143, Nalan=144, Niwa=145, Pite=146, Pasan=147, Pintu=148, Pula=149, 
		Mepu=150, Luka=151, Laki=152, Lekin=153, Wita=154, Saminta=155, Sanpanti=156, 
		Saman=157, Satalan=158, Sula=159, Sitija=160, Lima=161, Jan=162, Makan=163, 
		Keke=164, Latito=165, Ankolo=166, Poloko=167, Komo=168, Matiko=169, Mi=170, 
		Nelo=171, Powele=172, Peko=173, Sapole=174, Kate=175, Sopa=176, Suki=177, 
		Osole=178, Umami=179, Juka=180, Apijo=181, Niku=182, Musi=183, Kaki=184, 
		Akasa=185, Tenti=186, Kawa=187, Penpe=188, Kumon=189, Namu=190, Tuko=191, 
		Tuwi=192, Olon=193, Alu=194, Kuto=195, Kosan=196, Alijun=197, Tu=198, 
		Wija=199, Asa=200, Kijata=201, Malo=202, Sena=203, Leseka=204, Pintan=205, 
		Inkatan=206, Ke=207, Pen=208, San=209, Kuwan=210, Sipa=211, Sintuwan=212, 
		Iwe=213, Pansin=214, Si=215, Joli=216, Putun=217, Kuwosi=218, Tonsa=219, 
		Kuwanko=220, Timi=221, Limijen=222, Tajen=223, Kan=224, Na=225, Tunpu=226, 
		Matuwa=227, Pa=228, Taka=229, Kali=230, Tune=231, Tene=232, Namuna=233, 
		Nile=234, Panta=235, Jon=236, Tonko=237, Sunkan=238, Onja=239, Ukama=240, 
		Koton=241, Mitin=242, Lito=243, Lamo=244, Aluko=245, Konpute=246, Nepa=247, 
		Kuku=248, Meja=249, Momu=250, Neje=251, Pawo=252, Tutu=253, Ukiki=254, 
		Wonpa=255, Peman=256, Napa=257, Nase=258, Je=259, Jatan=260, Kisowa=261, 
		Lenka=262, Pasu=263, Lansa=264, Menu=265, Opotu=266, Uta=267, Maku=268, 
		Pelete=269, Pitijo=270, Sapi=271, Ili=272, Tula=273, Pata=274, Pumi=275, 
		Matija=276, Waju=277, Salila=278, Sila=279, Ko=280, Setan=281, Suwina=282, 
		Samo=283, Tenja=284, Ipuwe=285, Muku=286, Kalawa=287, Konje=288, Sa=289, 
		Saka=290, Wala=291, Asete=292, Akala=293, Amo=294, Kanta=295, Sekano=296, 
		Sijen=297, Toso=298, Kenelo=299, Onko=300, Umo=301, Pikante=302, Posa=303, 
		Anta=304, Takuwa=305, Tawapu=306, Lanki=307, Titi=308, Tiju=309, Tapala=310, 
		Talili=311, Lipan=312, Lunti=313, Takilo=314, Kalan=315, Ulokan=316, Etu=317, 
		Kontatu=318, Nanku=319, Mulu=320, Watan=321, Wili=322, Ani=323, Iputu=324, 
		Tina=325, Ne=326, Titan=327, Pon=328, Pan=329, Len=330, Santi=331, Sankan=332, 
		One=333, Tanu=334, Sepo=335, Teneme=336, Solu=337, Tope=338, Tamaka=339, 
		Tuntan=340, Niju=341, Non=342, So=343, Ewin=344, Enteken=345, Menwa=346, 
		Sun=347, Muntu=348, Insu=349, Onton=350, Kikolo=351, Lo=352, Tiku=353, 
		Ikama=354, Inpali=355, Nenka=356;
	public static final int
		RULE_sentences = 0, RULE_sentence = 1, RULE_sentenceClause = 2, RULE_noun = 3, 
		RULE_nounClause = 4, RULE_modifierClause = 5, RULE_newAgentAdjClause = 6, 
		RULE_sameAgentAdjClause = 7, RULE_terminator = 8, RULE_verb = 9, RULE_transVerbPhrase = 10, 
		RULE_quantity = 11, RULE_preposition = 12, RULE_prepClause = 13, RULE_contentWord = 14, 
		RULE_expandedWord = 15, RULE_pronoun = 16, RULE_contentParticles = 17, 
		RULE_baseVerb = 18, RULE_rawVerbs = 19, RULE_baseNoun = 20, RULE_rawNouns = 21, 
		RULE_baseModifier = 22, RULE_rawModifiers = 23, RULE_connector = 24, RULE_relativeQuantity = 25, 
		RULE_nominalQuantity = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentences", "sentence", "sentenceClause", "noun", "nounClause", "modifierClause", 
			"newAgentAdjClause", "sameAgentAdjClause", "terminator", "verb", "transVerbPhrase", 
			"quantity", "preposition", "prepClause", "contentWord", "expandedWord", 
			"pronoun", "contentParticles", "baseVerb", "rawVerbs", "baseNoun", "rawNouns", 
			"baseModifier", "rawModifiers", "connector", "relativeQuantity", "nominalQuantity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "','", null, "'.'", "'a'", "'in'", "'le'", "'men'", 
			"'o'", "'ta'", "'te'", "'we'", "'win'", "'wo'", "'lijule'", "'pese'", 
			"'kapaja'", "'kilima'", "'sito'", "'iman'", "'tasuwi'", "'akiki'", "'ukun'", 
			"'aja'", "'sala'", "'talika'", "'kapan'", "'kisa'", "'mu'", "'mata'", 
			"'mutakin'", "'mita'", "'jasa'", "'jamin'", "'apaki'", "'luwa'", "'konpa'", 
			"'kela'", "'lika'", "'otota'", "'ka'", "'tisilin'", "'janlu'", "'jamu'", 
			"'pututi'", "'minuli'", "'oti'", "'kota'", "'pani'", "'unitu'", "'loso'", 
			"'kima'", "'pi'", "'anan'", "'tenkin'", "'patun'", "'sikin'", "'usen'", 
			"'panli'", "'tunti'", "'sinsi'", "'wanku'", "'papon'", "'junja'", "'jati'", 
			"'unsi'", "'nan'", "'ju'", "'anpipi'", "'mese'", "'ten'", "'puka'", "'kanisa'", 
			"'pulusi'", "'muwesi'", "'moto'", "'pankosi'", "'nula'", "'pela'", "'otan'", 
			"'kujo'", "'tan'", "'tun'", "'ela'", "'kemika'", "'po'", "'mani'", "'no'", 
			"'oke'", "'wan'", "'suwi'", "'sin'", "'tati'", "'tolu'", "'lipu'", "'osa'", 
			"'tomiwa'", "'pesuwan'", "'ken'", "'tepu'", "'anwije'", "'lisi'", "'lan'", 
			"'soto'", "'eme'", "'nin'", "'lijo'", "'toki'", "'an'", "'ato'", "'kumi'", 
			"'kapu'", "'un'", "'polan'", "'wisan'", "'mijalo'", "'neso'", "'kaso'", 
			"'tawe'", "'konen'", "'kikuwa'", "'kiju'", "'jone'", "'akoli'", "'mamaki'", 
			"'lana'", "'wa'", "'ja'", "'wiki'", "'naki'", "'sone'", "'katin'", "'kula'", 
			"'kun'", "'kusa'", "'tanwa'", "'tipa'", "'teka'", "'tile'", "'tusa'", 
			"'tijante'", "'nankin'", "'nalan'", "'niwa'", "'pite'", "'pasan'", "'pintu'", 
			"'pula'", "'mepu'", "'luka'", "'laki'", "'lekin'", "'wita'", "'saminta'", 
			"'sanpanti'", "'saman'", "'satalan'", "'sula'", "'sitija'", "'lima'", 
			"'jan'", "'makan'", "'keke'", "'latito'", "'ankolo'", "'poloko'", "'komo'", 
			"'matiko'", "'mi'", "'nelo'", "'powele'", "'peko'", "'sapole'", "'kate'", 
			"'sopa'", "'suki'", "'osole'", "'umami'", "'juka'", "'apijo'", "'niku'", 
			"'musi'", "'kaki'", "'akasa'", "'tenti'", "'kawa'", "'penpe'", "'kumon'", 
			"'namu'", "'tuko'", "'tuwi'", "'olon'", "'alu'", "'kuto'", "'kosan'", 
			"'alijun'", "'tu'", "'wija'", "'asa'", "'kijata'", "'malo'", "'sena'", 
			"'leseka'", "'pintan'", "'inkatan'", "'ke'", "'pen'", "'san'", "'kuwan'", 
			"'sipa'", "'sintuwan'", "'iwe'", "'pansin'", "'si'", "'joli'", "'putun'", 
			"'kuwosi'", "'tonsa'", "'kuwanko'", "'timi'", "'limijen'", "'tajen'", 
			"'kan'", "'na'", "'tunpu'", "'matuwa'", "'pa'", "'taka'", "'kali'", "'tune'", 
			"'tene'", "'namuna'", "'nile'", "'panta'", "'jon'", "'tonko'", "'sunkan'", 
			"'onja'", "'ukama'", "'koton'", "'mitin'", "'lito'", "'lamo'", "'aluko'", 
			"'konpute'", "'nepa'", "'kuku'", "'meja'", "'momu'", "'neje'", "'pawo'", 
			"'tutu'", "'ukiki'", "'wonpa'", "'peman'", "'napa'", "'nase'", "'je'", 
			"'jatan'", "'kisowa'", "'lenka'", "'pasu'", "'lansa'", "'menu'", "'opotu'", 
			"'uta'", "'maku'", "'pelete'", "'pitijo'", "'sapi'", "'ili'", "'tula'", 
			"'pata'", "'pumi'", "'matija'", "'waju'", "'salila'", "'sila'", "'ko'", 
			"'setan'", "'suwina'", "'samo'", "'tenja'", "'ipuwe'", "'muku'", "'kalawa'", 
			"'konje'", "'sa'", "'saka'", "'wala'", "'asete'", "'akala'", "'amo'", 
			"'kanta'", "'sekano'", "'sijen'", "'toso'", "'kenelo'", "'onko'", "'umo'", 
			"'pikante'", "'posa'", "'anta'", "'takuwa'", "'tawapu'", "'lanki'", "'titi'", 
			"'tiju'", "'tapala'", "'talili'", "'lipan'", "'lunti'", "'takilo'", "'kalan'", 
			"'ulokan'", "'etu'", "'kontatu'", "'nanku'", "'mulu'", "'watan'", "'wili'", 
			"'ani'", "'iputu'", "'tina'", "'ne'", "'titan'", "'pon'", "'pan'", "'len'", 
			"'santi'", "'sankan'", "'one'", "'tanu'", "'sepo'", "'teneme'", "'solu'", 
			"'tope'", "'tamaka'", "'tuntan'", "'niju'", "'non'", "'so'", "'ewin'", 
			"'enteken'", "'menwa'", "'sun'", "'muntu'", "'insu'", "'onton'", "'kikolo'", 
			"'lo'", "'tiku'", "'ikama'", "'inpali'", "'nenka'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "ProperNoun", "Comma", "Colon", "Period", "A", "In", "Le", 
			"Men", "O", "Ta", "Te", "We", "Win", "Wo", "Lijule", "Pese", "Kapaja", 
			"Kilima", "Sito", "Iman", "Tasuwi", "Akiki", "Ukun", "Aja", "Sala", "Talika", 
			"Kapan", "Kisa", "Mu", "Mata", "Mutakin", "Mita", "Jasa", "Jamin", "Apaki", 
			"Luwa", "Konpa", "Kela", "Lika", "Otota", "Ka", "Tisilin", "Janlu", "Jamu", 
			"Pututi", "Minuli", "Oti", "Kota", "Pani", "Unitu", "Loso", "Kima", "Pi", 
			"Anan", "Tenkin", "Patun", "Sikin", "Usen", "Panli", "Tunti", "Sinsi", 
			"Wanku", "Papon", "Junja", "Jati", "Unsi", "Nan", "Ju", "Anpipi", "Mese", 
			"Ten", "Puka", "Kanisa", "Pulusi", "Muwesi", "Moto", "Pankosi", "Nula", 
			"Pela", "Otan", "Kujo", "Tan", "Tun", "Ela", "Kemika", "Po", "Mani", 
			"No", "Oke", "Wan", "Suwi", "Sin", "Tati", "Tolu", "Lipu", "Osa", "Tomiwa", 
			"Pesuwan", "Ken", "Tepu", "Anwije", "Lisi", "Lan", "Soto", "Eme", "Nin", 
			"Lijo", "Toki", "An", "Ato", "Kumi", "Kapu", "Un", "Polan", "Wisan", 
			"Mijalo", "Neso", "Kaso", "Tawe", "Konen", "Kikuwa", "Kiju", "Jone", 
			"Akoli", "Mamaki", "Lana", "Wa", "Ja", "Wiki", "Naki", "Sone", "Katin", 
			"Kula", "Kun", "Kusa", "Tanwa", "Tipa", "Teka", "Tile", "Tusa", "Tijante", 
			"Nankin", "Nalan", "Niwa", "Pite", "Pasan", "Pintu", "Pula", "Mepu", 
			"Luka", "Laki", "Lekin", "Wita", "Saminta", "Sanpanti", "Saman", "Satalan", 
			"Sula", "Sitija", "Lima", "Jan", "Makan", "Keke", "Latito", "Ankolo", 
			"Poloko", "Komo", "Matiko", "Mi", "Nelo", "Powele", "Peko", "Sapole", 
			"Kate", "Sopa", "Suki", "Osole", "Umami", "Juka", "Apijo", "Niku", "Musi", 
			"Kaki", "Akasa", "Tenti", "Kawa", "Penpe", "Kumon", "Namu", "Tuko", "Tuwi", 
			"Olon", "Alu", "Kuto", "Kosan", "Alijun", "Tu", "Wija", "Asa", "Kijata", 
			"Malo", "Sena", "Leseka", "Pintan", "Inkatan", "Ke", "Pen", "San", "Kuwan", 
			"Sipa", "Sintuwan", "Iwe", "Pansin", "Si", "Joli", "Putun", "Kuwosi", 
			"Tonsa", "Kuwanko", "Timi", "Limijen", "Tajen", "Kan", "Na", "Tunpu", 
			"Matuwa", "Pa", "Taka", "Kali", "Tune", "Tene", "Namuna", "Nile", "Panta", 
			"Jon", "Tonko", "Sunkan", "Onja", "Ukama", "Koton", "Mitin", "Lito", 
			"Lamo", "Aluko", "Konpute", "Nepa", "Kuku", "Meja", "Momu", "Neje", "Pawo", 
			"Tutu", "Ukiki", "Wonpa", "Peman", "Napa", "Nase", "Je", "Jatan", "Kisowa", 
			"Lenka", "Pasu", "Lansa", "Menu", "Opotu", "Uta", "Maku", "Pelete", "Pitijo", 
			"Sapi", "Ili", "Tula", "Pata", "Pumi", "Matija", "Waju", "Salila", "Sila", 
			"Ko", "Setan", "Suwina", "Samo", "Tenja", "Ipuwe", "Muku", "Kalawa", 
			"Konje", "Sa", "Saka", "Wala", "Asete", "Akala", "Amo", "Kanta", "Sekano", 
			"Sijen", "Toso", "Kenelo", "Onko", "Umo", "Pikante", "Posa", "Anta", 
			"Takuwa", "Tawapu", "Lanki", "Titi", "Tiju", "Tapala", "Talili", "Lipan", 
			"Lunti", "Takilo", "Kalan", "Ulokan", "Etu", "Kontatu", "Nanku", "Mulu", 
			"Watan", "Wili", "Ani", "Iputu", "Tina", "Ne", "Titan", "Pon", "Pan", 
			"Len", "Santi", "Sankan", "One", "Tanu", "Sepo", "Teneme", "Solu", "Tope", 
			"Tamaka", "Tuntan", "Niju", "Non", "So", "Ewin", "Enteken", "Menwa", 
			"Sun", "Muntu", "Insu", "Onton", "Kikolo", "Lo", "Tiku", "Ikama", "Inpali", 
			"Nenka"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KokanuParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KokanuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<TerminalNode> Period() { return getTokens(KokanuParser.Period); }
		public TerminalNode Period(int i) {
			return getToken(KokanuParser.Period, i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitSentences(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentences);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			sentence();
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					match(Period);
					setState(56);
					sentence();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Period) {
				{
				setState(62);
				match(Period);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceContext extends ParserRuleContext {
		public List<SentenceClauseContext> sentenceClause() {
			return getRuleContexts(SentenceClauseContext.class);
		}
		public SentenceClauseContext sentenceClause(int i) {
			return getRuleContext(SentenceClauseContext.class,i);
		}
		public List<ConnectorContext> connector() {
			return getRuleContexts(ConnectorContext.class);
		}
		public ConnectorContext connector(int i) {
			return getRuleContext(ConnectorContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			sentenceClause();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tan || _la==Un || _la==Lekin || _la==Ili) {
				{
				{
				setState(66);
				connector();
				setState(67);
				sentenceClause();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenceClauseContext extends ParserRuleContext {
		public List<PrepositionContext> preposition() {
			return getRuleContexts(PrepositionContext.class);
		}
		public PrepositionContext preposition(int i) {
			return getRuleContext(PrepositionContext.class,i);
		}
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
		}
		public List<TransVerbPhraseContext> transVerbPhrase() {
			return getRuleContexts(TransVerbPhraseContext.class);
		}
		public TransVerbPhraseContext transVerbPhrase(int i) {
			return getRuleContext(TransVerbPhraseContext.class,i);
		}
		public List<VerbContext> verb() {
			return getRuleContexts(VerbContext.class);
		}
		public VerbContext verb(int i) {
			return getRuleContext(VerbContext.class,i);
		}
		public List<ConnectorContext> connector() {
			return getRuleContexts(ConnectorContext.class);
		}
		public ConnectorContext connector(int i) {
			return getRuleContext(ConnectorContext.class,i);
		}
		public List<TerminalNode> Le() { return getTokens(KokanuParser.Le); }
		public TerminalNode Le(int i) {
			return getToken(KokanuParser.Le, i);
		}
		public List<TerminalNode> O() { return getTokens(KokanuParser.O); }
		public TerminalNode O(int i) {
			return getToken(KokanuParser.O, i);
		}
		public List<TerminalNode> No() { return getTokens(KokanuParser.No); }
		public TerminalNode No(int i) {
			return getToken(KokanuParser.No, i);
		}
		public List<NewAgentAdjClauseContext> newAgentAdjClause() {
			return getRuleContexts(NewAgentAdjClauseContext.class);
		}
		public NewAgentAdjClauseContext newAgentAdjClause(int i) {
			return getRuleContext(NewAgentAdjClauseContext.class,i);
		}
		public List<TerminatorContext> terminator() {
			return getRuleContexts(TerminatorContext.class);
		}
		public TerminatorContext terminator(int i) {
			return getRuleContext(TerminatorContext.class,i);
		}
		public SentenceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterSentenceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitSentenceClause(this);
		}
	}

	public final SentenceClauseContext sentenceClause() throws RecognitionException {
		SentenceClauseContext _localctx = new SentenceClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentenceClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(74);
				preposition();
				}
				break;
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -51196L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1196268693487617L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -35184405643265L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -4295000193L) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -65545L) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & 68576869887L) != 0)) {
				{
				{
				setState(77);
				noun();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Tan || _la==Un || _la==Lekin || _la==Ili) {
					{
					{
					setState(78);
					connector();
					setState(79);
					noun();
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17024L) != 0) || _la==Po || _la==An || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 33554689L) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & 8209L) != 0)) {
				{
				setState(91);
				preposition();
				}
			}

			setState(109); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(94);
						_la = _input.LA(1);
						if ( !(_la==Le || _la==O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==No) {
							{
							setState(95);
							match(No);
							}
						}

						setState(98);
						transVerbPhrase();
						setState(102);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
						case 1:
							{
							setState(99);
							newAgentAdjClause();
							setState(100);
							terminator();
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==Le || _la==O) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==No) {
							{
							setState(105);
							match(No);
							}
						}

						setState(108);
						verb();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(111); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(113);
				preposition();
				}
				break;
			}
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					connector();
					setState(117);
					preposition();
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NounContext extends ParserRuleContext {
		public NounClauseContext nounClause() {
			return getRuleContext(NounClauseContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public List<ModifierClauseContext> modifierClause() {
			return getRuleContexts(ModifierClauseContext.class);
		}
		public ModifierClauseContext modifierClause(int i) {
			return getRuleContext(ModifierClauseContext.class,i);
		}
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitNoun(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_noun);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4398080073761L) != 0) || _la==Lima || _la==San || ((((_la - 265)) & ~0x3f) == 0 && ((1L << (_la - 265)) & 310765979393130497L) != 0) || _la==Niju) {
					{
					setState(124);
					quantity();
					}
				}

				setState(127);
				nounClause();
				setState(128);
				terminator();
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(129);
						modifierClause();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(135);
					quantity();
					}
					break;
				}
				setState(138);
				expandedWord();
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(139);
						modifierClause();
						}
						} 
					}
					setState(144);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NounClauseContext extends ParserRuleContext {
		public SameAgentAdjClauseContext sameAgentAdjClause() {
			return getRuleContext(SameAgentAdjClauseContext.class,0);
		}
		public NewAgentAdjClauseContext newAgentAdjClause() {
			return getRuleContext(NewAgentAdjClauseContext.class,0);
		}
		public NounClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterNounClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitNounClause(this);
		}
	}

	public final NounClauseContext nounClause() throws RecognitionException {
		NounClauseContext _localctx = new NounClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nounClause);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Te:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				sameAgentAdjClause();
				}
				break;
			case Ta:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				newAgentAdjClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierClauseContext extends ParserRuleContext {
		public TerminalNode Je() { return getToken(KokanuParser.Je, 0); }
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public SameAgentAdjClauseContext sameAgentAdjClause() {
			return getRuleContext(SameAgentAdjClauseContext.class,0);
		}
		public NewAgentAdjClauseContext newAgentAdjClause() {
			return getRuleContext(NewAgentAdjClauseContext.class,0);
		}
		public List<ModifierClauseContext> modifierClause() {
			return getRuleContexts(ModifierClauseContext.class);
		}
		public ModifierClauseContext modifierClause(int i) {
			return getRuleContext(ModifierClauseContext.class,i);
		}
		public TerminalNode Wo() { return getToken(KokanuParser.Wo, 0); }
		public TerminalNode Comma() { return getToken(KokanuParser.Comma, 0); }
		public ModifierClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterModifierClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitModifierClause(this);
		}
	}

	public final ModifierClauseContext modifierClause() throws RecognitionException {
		ModifierClauseContext _localctx = new ModifierClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modifierClause);
		try {
			int _alt;
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Je:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(Je);
				setState(161);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ProperNoun:
				case We:
				case Lijule:
				case Pese:
				case Kapaja:
				case Kilima:
				case Sito:
				case Iman:
				case Tasuwi:
				case Akiki:
				case Ukun:
				case Aja:
				case Sala:
				case Talika:
				case Kapan:
				case Kisa:
				case Mu:
				case Mata:
				case Mutakin:
				case Mita:
				case Jasa:
				case Jamin:
				case Apaki:
				case Luwa:
				case Konpa:
				case Kela:
				case Lika:
				case Otota:
				case Ka:
				case Tisilin:
				case Janlu:
				case Jamu:
				case Pututi:
				case Minuli:
				case Oti:
				case Kota:
				case Pani:
				case Unitu:
				case Loso:
				case Kima:
				case Pi:
				case Anan:
				case Tenkin:
				case Patun:
				case Sikin:
				case Usen:
				case Panli:
				case Tunti:
				case Sinsi:
				case Wanku:
				case Papon:
				case Junja:
				case Jati:
				case Unsi:
				case Nan:
				case Ju:
				case Anpipi:
				case Mese:
				case Ten:
				case Puka:
				case Kanisa:
				case Pulusi:
				case Muwesi:
				case Moto:
				case Pankosi:
				case Nula:
				case Pela:
				case Otan:
				case Kujo:
				case Tun:
				case Ela:
				case Kemika:
				case Mani:
				case Oke:
				case Wan:
				case Suwi:
				case Sin:
				case Tati:
				case Tolu:
				case Lipu:
				case Osa:
				case Tomiwa:
				case Pesuwan:
				case Ken:
				case Tepu:
				case Anwije:
				case Lisi:
				case Lan:
				case Soto:
				case Eme:
				case Nin:
				case Lijo:
				case Toki:
				case Ato:
				case Kumi:
				case Kapu:
				case Polan:
				case Wisan:
				case Mijalo:
				case Neso:
				case Kaso:
				case Tawe:
				case Konen:
				case Kikuwa:
				case Kiju:
				case Jone:
				case Akoli:
				case Mamaki:
				case Lana:
				case Wa:
				case Ja:
				case Wiki:
				case Naki:
				case Sone:
				case Katin:
				case Kula:
				case Kun:
				case Kusa:
				case Tanwa:
				case Tipa:
				case Teka:
				case Tile:
				case Tusa:
				case Tijante:
				case Nankin:
				case Nalan:
				case Niwa:
				case Pite:
				case Pasan:
				case Pintu:
				case Pula:
				case Mepu:
				case Luka:
				case Laki:
				case Wita:
				case Saminta:
				case Sanpanti:
				case Saman:
				case Satalan:
				case Sula:
				case Sitija:
				case Lima:
				case Jan:
				case Makan:
				case Keke:
				case Latito:
				case Ankolo:
				case Poloko:
				case Komo:
				case Matiko:
				case Mi:
				case Nelo:
				case Powele:
				case Sapole:
				case Kate:
				case Sopa:
				case Suki:
				case Osole:
				case Umami:
				case Juka:
				case Apijo:
				case Niku:
				case Musi:
				case Kaki:
				case Akasa:
				case Tenti:
				case Kawa:
				case Penpe:
				case Kumon:
				case Namu:
				case Tuko:
				case Tuwi:
				case Olon:
				case Alu:
				case Kuto:
				case Kosan:
				case Alijun:
				case Tu:
				case Asa:
				case Kijata:
				case Malo:
				case Sena:
				case Leseka:
				case Pintan:
				case Inkatan:
				case Pen:
				case San:
				case Kuwan:
				case Sipa:
				case Sintuwan:
				case Iwe:
				case Pansin:
				case Si:
				case Joli:
				case Putun:
				case Kuwosi:
				case Tonsa:
				case Kuwanko:
				case Timi:
				case Limijen:
				case Tajen:
				case Na:
				case Tunpu:
				case Matuwa:
				case Pa:
				case Taka:
				case Kali:
				case Tune:
				case Tene:
				case Namuna:
				case Nile:
				case Panta:
				case Jon:
				case Tonko:
				case Sunkan:
				case Onja:
				case Ukama:
				case Koton:
				case Mitin:
				case Lito:
				case Lamo:
				case Aluko:
				case Konpute:
				case Nepa:
				case Kuku:
				case Meja:
				case Momu:
				case Neje:
				case Pawo:
				case Tutu:
				case Ukiki:
				case Wonpa:
				case Peman:
				case Napa:
				case Nase:
				case Jatan:
				case Kisowa:
				case Lenka:
				case Pasu:
				case Lansa:
				case Menu:
				case Opotu:
				case Uta:
				case Maku:
				case Pelete:
				case Pitijo:
				case Sapi:
				case Tula:
				case Pata:
				case Pumi:
				case Matija:
				case Waju:
				case Salila:
				case Sila:
				case Ko:
				case Setan:
				case Suwina:
				case Samo:
				case Tenja:
				case Ipuwe:
				case Muku:
				case Kalawa:
				case Konje:
				case Sa:
				case Saka:
				case Wala:
				case Asete:
				case Akala:
				case Amo:
				case Kanta:
				case Sekano:
				case Sijen:
				case Toso:
				case Kenelo:
				case Onko:
				case Umo:
				case Pikante:
				case Posa:
				case Anta:
				case Takuwa:
				case Tawapu:
				case Lanki:
				case Titi:
				case Tiju:
				case Tapala:
				case Talili:
				case Lipan:
				case Lunti:
				case Takilo:
				case Kalan:
				case Ulokan:
				case Etu:
				case Kontatu:
				case Nanku:
				case Mulu:
				case Watan:
				case Wili:
				case Ani:
				case Iputu:
				case Tina:
				case Ne:
				case Titan:
				case Pon:
				case Len:
				case Santi:
				case Sankan:
				case One:
				case Tanu:
				case Sepo:
				case Teneme:
				case Solu:
				case Tope:
				case Tamaka:
				case Tuntan:
				case Niju:
				case Non:
				case Ewin:
				case Enteken:
				case Menwa:
				case Muntu:
				case Insu:
				case Onton:
				case Kikolo:
				case Lo:
				case Tiku:
				case Ikama:
				case Inpali:
					{
					setState(152);
					expandedWord();
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(153);
							modifierClause();
							}
							} 
						}
						setState(158);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					}
					}
					break;
				case Te:
					{
					setState(159);
					sameAgentAdjClause();
					}
					break;
				case Ta:
					{
					setState(160);
					newAgentAdjClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Wo:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(Wo);
				setState(173);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ProperNoun:
				case We:
				case Lijule:
				case Pese:
				case Kapaja:
				case Kilima:
				case Sito:
				case Iman:
				case Tasuwi:
				case Akiki:
				case Ukun:
				case Aja:
				case Sala:
				case Talika:
				case Kapan:
				case Kisa:
				case Mu:
				case Mata:
				case Mutakin:
				case Mita:
				case Jasa:
				case Jamin:
				case Apaki:
				case Luwa:
				case Konpa:
				case Kela:
				case Lika:
				case Otota:
				case Ka:
				case Tisilin:
				case Janlu:
				case Jamu:
				case Pututi:
				case Minuli:
				case Oti:
				case Kota:
				case Pani:
				case Unitu:
				case Loso:
				case Kima:
				case Pi:
				case Anan:
				case Tenkin:
				case Patun:
				case Sikin:
				case Usen:
				case Panli:
				case Tunti:
				case Sinsi:
				case Wanku:
				case Papon:
				case Junja:
				case Jati:
				case Unsi:
				case Nan:
				case Ju:
				case Anpipi:
				case Mese:
				case Ten:
				case Puka:
				case Kanisa:
				case Pulusi:
				case Muwesi:
				case Moto:
				case Pankosi:
				case Nula:
				case Pela:
				case Otan:
				case Kujo:
				case Tun:
				case Ela:
				case Kemika:
				case Mani:
				case Oke:
				case Wan:
				case Suwi:
				case Sin:
				case Tati:
				case Tolu:
				case Lipu:
				case Osa:
				case Tomiwa:
				case Pesuwan:
				case Ken:
				case Tepu:
				case Anwije:
				case Lisi:
				case Lan:
				case Soto:
				case Eme:
				case Nin:
				case Lijo:
				case Toki:
				case Ato:
				case Kumi:
				case Kapu:
				case Polan:
				case Wisan:
				case Mijalo:
				case Neso:
				case Kaso:
				case Tawe:
				case Konen:
				case Kikuwa:
				case Kiju:
				case Jone:
				case Akoli:
				case Mamaki:
				case Lana:
				case Wa:
				case Ja:
				case Wiki:
				case Naki:
				case Sone:
				case Katin:
				case Kula:
				case Kun:
				case Kusa:
				case Tanwa:
				case Tipa:
				case Teka:
				case Tile:
				case Tusa:
				case Tijante:
				case Nankin:
				case Nalan:
				case Niwa:
				case Pite:
				case Pasan:
				case Pintu:
				case Pula:
				case Mepu:
				case Luka:
				case Laki:
				case Wita:
				case Saminta:
				case Sanpanti:
				case Saman:
				case Satalan:
				case Sula:
				case Sitija:
				case Lima:
				case Jan:
				case Makan:
				case Keke:
				case Latito:
				case Ankolo:
				case Poloko:
				case Komo:
				case Matiko:
				case Mi:
				case Nelo:
				case Powele:
				case Sapole:
				case Kate:
				case Sopa:
				case Suki:
				case Osole:
				case Umami:
				case Juka:
				case Apijo:
				case Niku:
				case Musi:
				case Kaki:
				case Akasa:
				case Tenti:
				case Kawa:
				case Penpe:
				case Kumon:
				case Namu:
				case Tuko:
				case Tuwi:
				case Olon:
				case Alu:
				case Kuto:
				case Kosan:
				case Alijun:
				case Tu:
				case Asa:
				case Kijata:
				case Malo:
				case Sena:
				case Leseka:
				case Pintan:
				case Inkatan:
				case Pen:
				case San:
				case Kuwan:
				case Sipa:
				case Sintuwan:
				case Iwe:
				case Pansin:
				case Si:
				case Joli:
				case Putun:
				case Kuwosi:
				case Tonsa:
				case Kuwanko:
				case Timi:
				case Limijen:
				case Tajen:
				case Na:
				case Tunpu:
				case Matuwa:
				case Pa:
				case Taka:
				case Kali:
				case Tune:
				case Tene:
				case Namuna:
				case Nile:
				case Panta:
				case Jon:
				case Tonko:
				case Sunkan:
				case Onja:
				case Ukama:
				case Koton:
				case Mitin:
				case Lito:
				case Lamo:
				case Aluko:
				case Konpute:
				case Nepa:
				case Kuku:
				case Meja:
				case Momu:
				case Neje:
				case Pawo:
				case Tutu:
				case Ukiki:
				case Wonpa:
				case Peman:
				case Napa:
				case Nase:
				case Jatan:
				case Kisowa:
				case Lenka:
				case Pasu:
				case Lansa:
				case Menu:
				case Opotu:
				case Uta:
				case Maku:
				case Pelete:
				case Pitijo:
				case Sapi:
				case Tula:
				case Pata:
				case Pumi:
				case Matija:
				case Waju:
				case Salila:
				case Sila:
				case Ko:
				case Setan:
				case Suwina:
				case Samo:
				case Tenja:
				case Ipuwe:
				case Muku:
				case Kalawa:
				case Konje:
				case Sa:
				case Saka:
				case Wala:
				case Asete:
				case Akala:
				case Amo:
				case Kanta:
				case Sekano:
				case Sijen:
				case Toso:
				case Kenelo:
				case Onko:
				case Umo:
				case Pikante:
				case Posa:
				case Anta:
				case Takuwa:
				case Tawapu:
				case Lanki:
				case Titi:
				case Tiju:
				case Tapala:
				case Talili:
				case Lipan:
				case Lunti:
				case Takilo:
				case Kalan:
				case Ulokan:
				case Etu:
				case Kontatu:
				case Nanku:
				case Mulu:
				case Watan:
				case Wili:
				case Ani:
				case Iputu:
				case Tina:
				case Ne:
				case Titan:
				case Pon:
				case Len:
				case Santi:
				case Sankan:
				case One:
				case Tanu:
				case Sepo:
				case Teneme:
				case Solu:
				case Tope:
				case Tamaka:
				case Tuntan:
				case Niju:
				case Non:
				case Ewin:
				case Enteken:
				case Menwa:
				case Muntu:
				case Insu:
				case Onton:
				case Kikolo:
				case Lo:
				case Tiku:
				case Ikama:
				case Inpali:
					{
					setState(164);
					expandedWord();
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(165);
							modifierClause();
							}
							} 
						}
						setState(170);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
					}
					}
					break;
				case Te:
					{
					setState(171);
					sameAgentAdjClause();
					}
					break;
				case Ta:
					{
					setState(172);
					newAgentAdjClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case ProperNoun:
			case Ta:
			case Te:
			case We:
			case Lijule:
			case Pese:
			case Kapaja:
			case Kilima:
			case Sito:
			case Iman:
			case Tasuwi:
			case Akiki:
			case Ukun:
			case Aja:
			case Sala:
			case Talika:
			case Kapan:
			case Kisa:
			case Mu:
			case Mata:
			case Mutakin:
			case Mita:
			case Jasa:
			case Jamin:
			case Apaki:
			case Luwa:
			case Konpa:
			case Kela:
			case Lika:
			case Otota:
			case Ka:
			case Tisilin:
			case Janlu:
			case Jamu:
			case Pututi:
			case Minuli:
			case Oti:
			case Kota:
			case Pani:
			case Unitu:
			case Loso:
			case Kima:
			case Pi:
			case Anan:
			case Tenkin:
			case Patun:
			case Sikin:
			case Usen:
			case Panli:
			case Tunti:
			case Sinsi:
			case Wanku:
			case Papon:
			case Junja:
			case Jati:
			case Unsi:
			case Nan:
			case Ju:
			case Anpipi:
			case Mese:
			case Ten:
			case Puka:
			case Kanisa:
			case Pulusi:
			case Muwesi:
			case Moto:
			case Pankosi:
			case Nula:
			case Pela:
			case Otan:
			case Kujo:
			case Tun:
			case Ela:
			case Kemika:
			case Mani:
			case Oke:
			case Wan:
			case Suwi:
			case Sin:
			case Tati:
			case Tolu:
			case Lipu:
			case Osa:
			case Tomiwa:
			case Pesuwan:
			case Ken:
			case Tepu:
			case Anwije:
			case Lisi:
			case Lan:
			case Soto:
			case Eme:
			case Nin:
			case Lijo:
			case Toki:
			case Ato:
			case Kumi:
			case Kapu:
			case Polan:
			case Wisan:
			case Mijalo:
			case Neso:
			case Kaso:
			case Tawe:
			case Konen:
			case Kikuwa:
			case Kiju:
			case Jone:
			case Akoli:
			case Mamaki:
			case Lana:
			case Wa:
			case Ja:
			case Wiki:
			case Naki:
			case Sone:
			case Katin:
			case Kula:
			case Kun:
			case Kusa:
			case Tanwa:
			case Tipa:
			case Teka:
			case Tile:
			case Tusa:
			case Tijante:
			case Nankin:
			case Nalan:
			case Niwa:
			case Pite:
			case Pasan:
			case Pintu:
			case Pula:
			case Mepu:
			case Luka:
			case Laki:
			case Wita:
			case Saminta:
			case Sanpanti:
			case Saman:
			case Satalan:
			case Sula:
			case Sitija:
			case Lima:
			case Jan:
			case Makan:
			case Keke:
			case Latito:
			case Ankolo:
			case Poloko:
			case Komo:
			case Matiko:
			case Mi:
			case Nelo:
			case Powele:
			case Sapole:
			case Kate:
			case Sopa:
			case Suki:
			case Osole:
			case Umami:
			case Juka:
			case Apijo:
			case Niku:
			case Musi:
			case Kaki:
			case Akasa:
			case Tenti:
			case Kawa:
			case Penpe:
			case Kumon:
			case Namu:
			case Tuko:
			case Tuwi:
			case Olon:
			case Alu:
			case Kuto:
			case Kosan:
			case Alijun:
			case Tu:
			case Asa:
			case Kijata:
			case Malo:
			case Sena:
			case Leseka:
			case Pintan:
			case Inkatan:
			case Pen:
			case San:
			case Kuwan:
			case Sipa:
			case Sintuwan:
			case Iwe:
			case Pansin:
			case Si:
			case Joli:
			case Putun:
			case Kuwosi:
			case Tonsa:
			case Kuwanko:
			case Timi:
			case Limijen:
			case Tajen:
			case Na:
			case Tunpu:
			case Matuwa:
			case Pa:
			case Taka:
			case Kali:
			case Tune:
			case Tene:
			case Namuna:
			case Nile:
			case Panta:
			case Jon:
			case Tonko:
			case Sunkan:
			case Onja:
			case Ukama:
			case Koton:
			case Mitin:
			case Lito:
			case Lamo:
			case Aluko:
			case Konpute:
			case Nepa:
			case Kuku:
			case Meja:
			case Momu:
			case Neje:
			case Pawo:
			case Tutu:
			case Ukiki:
			case Wonpa:
			case Peman:
			case Napa:
			case Nase:
			case Jatan:
			case Kisowa:
			case Lenka:
			case Pasu:
			case Lansa:
			case Menu:
			case Opotu:
			case Uta:
			case Maku:
			case Pelete:
			case Pitijo:
			case Sapi:
			case Tula:
			case Pata:
			case Pumi:
			case Matija:
			case Waju:
			case Salila:
			case Sila:
			case Ko:
			case Setan:
			case Suwina:
			case Samo:
			case Tenja:
			case Ipuwe:
			case Muku:
			case Kalawa:
			case Konje:
			case Sa:
			case Saka:
			case Wala:
			case Asete:
			case Akala:
			case Amo:
			case Kanta:
			case Sekano:
			case Sijen:
			case Toso:
			case Kenelo:
			case Onko:
			case Umo:
			case Pikante:
			case Posa:
			case Anta:
			case Takuwa:
			case Tawapu:
			case Lanki:
			case Titi:
			case Tiju:
			case Tapala:
			case Talili:
			case Lipan:
			case Lunti:
			case Takilo:
			case Kalan:
			case Ulokan:
			case Etu:
			case Kontatu:
			case Nanku:
			case Mulu:
			case Watan:
			case Wili:
			case Ani:
			case Iputu:
			case Tina:
			case Ne:
			case Titan:
			case Pon:
			case Len:
			case Santi:
			case Sankan:
			case One:
			case Tanu:
			case Sepo:
			case Teneme:
			case Solu:
			case Tope:
			case Tamaka:
			case Tuntan:
			case Niju:
			case Non:
			case Ewin:
			case Enteken:
			case Menwa:
			case Muntu:
			case Insu:
			case Onton:
			case Kikolo:
			case Lo:
			case Tiku:
			case Ikama:
			case Inpali:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ProperNoun:
				case We:
				case Lijule:
				case Pese:
				case Kapaja:
				case Kilima:
				case Sito:
				case Iman:
				case Tasuwi:
				case Akiki:
				case Ukun:
				case Aja:
				case Sala:
				case Talika:
				case Kapan:
				case Kisa:
				case Mu:
				case Mata:
				case Mutakin:
				case Mita:
				case Jasa:
				case Jamin:
				case Apaki:
				case Luwa:
				case Konpa:
				case Kela:
				case Lika:
				case Otota:
				case Ka:
				case Tisilin:
				case Janlu:
				case Jamu:
				case Pututi:
				case Minuli:
				case Oti:
				case Kota:
				case Pani:
				case Unitu:
				case Loso:
				case Kima:
				case Pi:
				case Anan:
				case Tenkin:
				case Patun:
				case Sikin:
				case Usen:
				case Panli:
				case Tunti:
				case Sinsi:
				case Wanku:
				case Papon:
				case Junja:
				case Jati:
				case Unsi:
				case Nan:
				case Ju:
				case Anpipi:
				case Mese:
				case Ten:
				case Puka:
				case Kanisa:
				case Pulusi:
				case Muwesi:
				case Moto:
				case Pankosi:
				case Nula:
				case Pela:
				case Otan:
				case Kujo:
				case Tun:
				case Ela:
				case Kemika:
				case Mani:
				case Oke:
				case Wan:
				case Suwi:
				case Sin:
				case Tati:
				case Tolu:
				case Lipu:
				case Osa:
				case Tomiwa:
				case Pesuwan:
				case Ken:
				case Tepu:
				case Anwije:
				case Lisi:
				case Lan:
				case Soto:
				case Eme:
				case Nin:
				case Lijo:
				case Toki:
				case Ato:
				case Kumi:
				case Kapu:
				case Polan:
				case Wisan:
				case Mijalo:
				case Neso:
				case Kaso:
				case Tawe:
				case Konen:
				case Kikuwa:
				case Kiju:
				case Jone:
				case Akoli:
				case Mamaki:
				case Lana:
				case Wa:
				case Ja:
				case Wiki:
				case Naki:
				case Sone:
				case Katin:
				case Kula:
				case Kun:
				case Kusa:
				case Tanwa:
				case Tipa:
				case Teka:
				case Tile:
				case Tusa:
				case Tijante:
				case Nankin:
				case Nalan:
				case Niwa:
				case Pite:
				case Pasan:
				case Pintu:
				case Pula:
				case Mepu:
				case Luka:
				case Laki:
				case Wita:
				case Saminta:
				case Sanpanti:
				case Saman:
				case Satalan:
				case Sula:
				case Sitija:
				case Lima:
				case Jan:
				case Makan:
				case Keke:
				case Latito:
				case Ankolo:
				case Poloko:
				case Komo:
				case Matiko:
				case Mi:
				case Nelo:
				case Powele:
				case Sapole:
				case Kate:
				case Sopa:
				case Suki:
				case Osole:
				case Umami:
				case Juka:
				case Apijo:
				case Niku:
				case Musi:
				case Kaki:
				case Akasa:
				case Tenti:
				case Kawa:
				case Penpe:
				case Kumon:
				case Namu:
				case Tuko:
				case Tuwi:
				case Olon:
				case Alu:
				case Kuto:
				case Kosan:
				case Alijun:
				case Tu:
				case Asa:
				case Kijata:
				case Malo:
				case Sena:
				case Leseka:
				case Pintan:
				case Inkatan:
				case Pen:
				case San:
				case Kuwan:
				case Sipa:
				case Sintuwan:
				case Iwe:
				case Pansin:
				case Si:
				case Joli:
				case Putun:
				case Kuwosi:
				case Tonsa:
				case Kuwanko:
				case Timi:
				case Limijen:
				case Tajen:
				case Na:
				case Tunpu:
				case Matuwa:
				case Pa:
				case Taka:
				case Kali:
				case Tune:
				case Tene:
				case Namuna:
				case Nile:
				case Panta:
				case Jon:
				case Tonko:
				case Sunkan:
				case Onja:
				case Ukama:
				case Koton:
				case Mitin:
				case Lito:
				case Lamo:
				case Aluko:
				case Konpute:
				case Nepa:
				case Kuku:
				case Meja:
				case Momu:
				case Neje:
				case Pawo:
				case Tutu:
				case Ukiki:
				case Wonpa:
				case Peman:
				case Napa:
				case Nase:
				case Jatan:
				case Kisowa:
				case Lenka:
				case Pasu:
				case Lansa:
				case Menu:
				case Opotu:
				case Uta:
				case Maku:
				case Pelete:
				case Pitijo:
				case Sapi:
				case Tula:
				case Pata:
				case Pumi:
				case Matija:
				case Waju:
				case Salila:
				case Sila:
				case Ko:
				case Setan:
				case Suwina:
				case Samo:
				case Tenja:
				case Ipuwe:
				case Muku:
				case Kalawa:
				case Konje:
				case Sa:
				case Saka:
				case Wala:
				case Asete:
				case Akala:
				case Amo:
				case Kanta:
				case Sekano:
				case Sijen:
				case Toso:
				case Kenelo:
				case Onko:
				case Umo:
				case Pikante:
				case Posa:
				case Anta:
				case Takuwa:
				case Tawapu:
				case Lanki:
				case Titi:
				case Tiju:
				case Tapala:
				case Talili:
				case Lipan:
				case Lunti:
				case Takilo:
				case Kalan:
				case Ulokan:
				case Etu:
				case Kontatu:
				case Nanku:
				case Mulu:
				case Watan:
				case Wili:
				case Ani:
				case Iputu:
				case Tina:
				case Ne:
				case Titan:
				case Pon:
				case Len:
				case Santi:
				case Sankan:
				case One:
				case Tanu:
				case Sepo:
				case Teneme:
				case Solu:
				case Tope:
				case Tamaka:
				case Tuntan:
				case Niju:
				case Non:
				case Ewin:
				case Enteken:
				case Menwa:
				case Muntu:
				case Insu:
				case Onton:
				case Kikolo:
				case Lo:
				case Tiku:
				case Ikama:
				case Inpali:
					{
					setState(175);
					expandedWord();
					}
					break;
				case Te:
					{
					setState(176);
					sameAgentAdjClause();
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(177);
						match(Comma);
						}
						break;
					}
					}
					break;
				case Ta:
					{
					setState(180);
					newAgentAdjClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewAgentAdjClauseContext extends ParserRuleContext {
		public TerminalNode Ta() { return getToken(KokanuParser.Ta, 0); }
		public SentenceClauseContext sentenceClause() {
			return getRuleContext(SentenceClauseContext.class,0);
		}
		public NewAgentAdjClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newAgentAdjClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterNewAgentAdjClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitNewAgentAdjClause(this);
		}
	}

	public final NewAgentAdjClauseContext newAgentAdjClause() throws RecognitionException {
		NewAgentAdjClauseContext _localctx = new NewAgentAdjClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_newAgentAdjClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Ta);
			setState(186);
			sentenceClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SameAgentAdjClauseContext extends ParserRuleContext {
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
		public TransVerbPhraseContext transVerbPhrase() {
			return getRuleContext(TransVerbPhraseContext.class,0);
		}
		public TerminalNode We() { return getToken(KokanuParser.We, 0); }
		public NewAgentAdjClauseContext newAgentAdjClause() {
			return getRuleContext(NewAgentAdjClauseContext.class,0);
		}
		public PrepositionContext preposition() {
			return getRuleContext(PrepositionContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public SameAgentAdjClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameAgentAdjClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterSameAgentAdjClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitSameAgentAdjClause(this);
		}
	}

	public final SameAgentAdjClauseContext sameAgentAdjClause() throws RecognitionException {
		SameAgentAdjClauseContext _localctx = new SameAgentAdjClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sameAgentAdjClause);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(Te);
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(189);
					match(We);
					}
					break;
				}
				setState(192);
				transVerbPhrase();
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(193);
					newAgentAdjClause();
					}
					break;
				}
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(196);
					preposition();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(Te);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(200);
					match(We);
					}
					break;
				}
				setState(203);
				verb();
				setState(205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(204);
					preposition();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(KokanuParser.Comma, 0); }
		public TerminalNode Period() { return getToken(KokanuParser.Period, 0); }
		public TerminalNode EOF() { return getToken(KokanuParser.EOF, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terminator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & 81L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbContext extends ParserRuleContext {
		public BaseModifierContext baseModifier() {
			return getRuleContext(BaseModifierContext.class,0);
		}
		public List<ModifierClauseContext> modifierClause() {
			return getRuleContexts(ModifierClauseContext.class);
		}
		public ModifierClauseContext modifierClause(int i) {
			return getRuleContext(ModifierClauseContext.class,i);
		}
		public BaseNounContext baseNoun() {
			return getRuleContext(BaseNounContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_verb);
		try {
			int _alt;
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				baseModifier();
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(212);
						modifierClause();
						}
						} 
					}
					setState(217);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				baseNoun();
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						modifierClause();
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransVerbPhraseContext extends ParserRuleContext {
		public BaseVerbContext baseVerb() {
			return getRuleContext(BaseVerbContext.class,0);
		}
		public List<ModifierClauseContext> modifierClause() {
			return getRuleContexts(ModifierClauseContext.class);
		}
		public ModifierClauseContext modifierClause(int i) {
			return getRuleContext(ModifierClauseContext.class,i);
		}
		public TransVerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transVerbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterTransVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitTransVerbPhrase(this);
		}
	}

	public final TransVerbPhraseContext transVerbPhrase() throws RecognitionException {
		TransVerbPhraseContext _localctx = new TransVerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transVerbPhrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			baseVerb();
			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					modifierClause();
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantityContext extends ParserRuleContext {
		public RelativeQuantityContext relativeQuantity() {
			return getRuleContext(RelativeQuantityContext.class,0);
		}
		public List<NominalQuantityContext> nominalQuantity() {
			return getRuleContexts(NominalQuantityContext.class);
		}
		public NominalQuantityContext nominalQuantity(int i) {
			return getRuleContext(NominalQuantityContext.class,i);
		}
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_quantity);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Jati || _la==Mese || _la==Menu || _la==Ani || _la==Niju) {
				{
				setState(234);
				relativeQuantity();
				}
			}

			setState(238); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(237);
					nominalQuantity();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(240); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrepositionContext extends ParserRuleContext {
		public List<PrepClauseContext> prepClause() {
			return getRuleContexts(PrepClauseContext.class);
		}
		public PrepClauseContext prepClause(int i) {
			return getRuleContext(PrepClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(KokanuParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(KokanuParser.Comma, i);
		}
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitPreposition(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_preposition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			prepClause();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(243);
						match(Comma);
						}
					}

					setState(246);
					prepClause();
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrepClauseContext extends ParserRuleContext {
		public List<NounContext> noun() {
			return getRuleContexts(NounContext.class);
		}
		public NounContext noun(int i) {
			return getRuleContext(NounContext.class,i);
		}
		public TerminalNode In() { return getToken(KokanuParser.In, 0); }
		public TerminalNode Men() { return getToken(KokanuParser.Men, 0); }
		public TerminalNode Win() { return getToken(KokanuParser.Win, 0); }
		public TerminalNode Po() { return getToken(KokanuParser.Po, 0); }
		public TerminalNode An() { return getToken(KokanuParser.An, 0); }
		public TerminalNode Wija() { return getToken(KokanuParser.Wija, 0); }
		public TerminalNode Ke() { return getToken(KokanuParser.Ke, 0); }
		public TerminalNode Kan() { return getToken(KokanuParser.Kan, 0); }
		public TerminalNode So() { return getToken(KokanuParser.So, 0); }
		public TerminalNode Sun() { return getToken(KokanuParser.Sun, 0); }
		public TerminalNode Nenka() { return getToken(KokanuParser.Nenka, 0); }
		public TerminalNode No() { return getToken(KokanuParser.No, 0); }
		public List<ConnectorContext> connector() {
			return getRuleContexts(ConnectorContext.class);
		}
		public ConnectorContext connector(int i) {
			return getRuleContext(ConnectorContext.class,i);
		}
		public PrepClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterPrepClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitPrepClause(this);
		}
	}

	public final PrepClauseContext prepClause() throws RecognitionException {
		PrepClauseContext _localctx = new PrepClauseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prepClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17024L) != 0) || _la==Po || _la==An || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & 33554689L) != 0) || ((((_la - 343)) & ~0x3f) == 0 && ((1L << (_la - 343)) & 8209L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==No) {
				{
				setState(253);
				match(No);
				}
			}

			setState(256);
			noun();
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					connector();
					setState(258);
					noun();
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentWordContext extends ParserRuleContext {
		public BaseNounContext baseNoun() {
			return getRuleContext(BaseNounContext.class,0);
		}
		public BaseVerbContext baseVerb() {
			return getRuleContext(BaseVerbContext.class,0);
		}
		public BaseModifierContext baseModifier() {
			return getRuleContext(BaseModifierContext.class,0);
		}
		public ContentWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterContentWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitContentWord(this);
		}
	}

	public final ContentWordContext contentWord() throws RecognitionException {
		ContentWordContext _localctx = new ContentWordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_contentWord);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				baseNoun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				baseVerb();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				baseModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpandedWordContext extends ParserRuleContext {
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public RelativeQuantityContext relativeQuantity() {
			return getRuleContext(RelativeQuantityContext.class,0);
		}
		public NominalQuantityContext nominalQuantity() {
			return getRuleContext(NominalQuantityContext.class,0);
		}
		public ContentWordContext contentWord() {
			return getRuleContext(ContentWordContext.class,0);
		}
		public TerminalNode ProperNoun() { return getToken(KokanuParser.ProperNoun, 0); }
		public ExpandedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterExpandedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitExpandedWord(this);
		}
	}

	public final ExpandedWordContext expandedWord() throws RecognitionException {
		ExpandedWordContext _localctx = new ExpandedWordContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expandedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ka:
			case Usen:
			case Ja:
			case Mi:
			case Tu:
			case Na:
			case Sa:
			case Ne:
				{
				setState(270);
				pronoun();
				}
				break;
			case Jati:
			case Mese:
			case Menu:
			case Ani:
			case Niju:
				{
				setState(271);
				relativeQuantity();
				}
				break;
			case Nula:
			case Wan:
			case Lijo:
			case Lima:
			case San:
			case Setan:
			case Saka:
			case Sijen:
			case Toso:
			case Tiju:
			case Etu:
			case Nanku:
				{
				setState(272);
				nominalQuantity();
				}
				break;
			case We:
			case Lijule:
			case Pese:
			case Kapaja:
			case Kilima:
			case Sito:
			case Iman:
			case Tasuwi:
			case Akiki:
			case Ukun:
			case Aja:
			case Sala:
			case Talika:
			case Kapan:
			case Kisa:
			case Mu:
			case Mata:
			case Mutakin:
			case Mita:
			case Jasa:
			case Jamin:
			case Apaki:
			case Luwa:
			case Konpa:
			case Kela:
			case Lika:
			case Otota:
			case Tisilin:
			case Janlu:
			case Jamu:
			case Pututi:
			case Minuli:
			case Oti:
			case Kota:
			case Pani:
			case Unitu:
			case Loso:
			case Kima:
			case Pi:
			case Anan:
			case Tenkin:
			case Patun:
			case Sikin:
			case Panli:
			case Tunti:
			case Sinsi:
			case Wanku:
			case Papon:
			case Junja:
			case Unsi:
			case Nan:
			case Ju:
			case Anpipi:
			case Ten:
			case Puka:
			case Kanisa:
			case Pulusi:
			case Muwesi:
			case Moto:
			case Pankosi:
			case Pela:
			case Otan:
			case Kujo:
			case Tun:
			case Ela:
			case Kemika:
			case Mani:
			case Oke:
			case Suwi:
			case Sin:
			case Tati:
			case Tolu:
			case Lipu:
			case Osa:
			case Tomiwa:
			case Pesuwan:
			case Ken:
			case Tepu:
			case Anwije:
			case Lisi:
			case Lan:
			case Soto:
			case Eme:
			case Nin:
			case Toki:
			case Ato:
			case Kumi:
			case Kapu:
			case Polan:
			case Wisan:
			case Mijalo:
			case Neso:
			case Kaso:
			case Tawe:
			case Konen:
			case Kikuwa:
			case Kiju:
			case Jone:
			case Akoli:
			case Mamaki:
			case Lana:
			case Wa:
			case Wiki:
			case Naki:
			case Sone:
			case Katin:
			case Kula:
			case Kun:
			case Kusa:
			case Tanwa:
			case Tipa:
			case Teka:
			case Tile:
			case Tusa:
			case Tijante:
			case Nankin:
			case Nalan:
			case Niwa:
			case Pite:
			case Pasan:
			case Pintu:
			case Pula:
			case Mepu:
			case Luka:
			case Laki:
			case Wita:
			case Saminta:
			case Sanpanti:
			case Saman:
			case Satalan:
			case Sula:
			case Sitija:
			case Jan:
			case Makan:
			case Keke:
			case Latito:
			case Ankolo:
			case Poloko:
			case Komo:
			case Matiko:
			case Nelo:
			case Powele:
			case Sapole:
			case Kate:
			case Sopa:
			case Suki:
			case Osole:
			case Umami:
			case Juka:
			case Apijo:
			case Niku:
			case Musi:
			case Kaki:
			case Akasa:
			case Tenti:
			case Kawa:
			case Penpe:
			case Kumon:
			case Namu:
			case Tuko:
			case Tuwi:
			case Olon:
			case Alu:
			case Kuto:
			case Kosan:
			case Alijun:
			case Asa:
			case Kijata:
			case Malo:
			case Sena:
			case Leseka:
			case Pintan:
			case Inkatan:
			case Pen:
			case Kuwan:
			case Sipa:
			case Sintuwan:
			case Iwe:
			case Pansin:
			case Si:
			case Joli:
			case Putun:
			case Kuwosi:
			case Tonsa:
			case Kuwanko:
			case Timi:
			case Limijen:
			case Tajen:
			case Tunpu:
			case Matuwa:
			case Pa:
			case Taka:
			case Kali:
			case Tune:
			case Tene:
			case Namuna:
			case Nile:
			case Panta:
			case Jon:
			case Tonko:
			case Sunkan:
			case Onja:
			case Ukama:
			case Koton:
			case Mitin:
			case Lito:
			case Lamo:
			case Aluko:
			case Konpute:
			case Nepa:
			case Kuku:
			case Meja:
			case Momu:
			case Neje:
			case Pawo:
			case Tutu:
			case Ukiki:
			case Wonpa:
			case Peman:
			case Napa:
			case Nase:
			case Jatan:
			case Kisowa:
			case Lenka:
			case Pasu:
			case Lansa:
			case Opotu:
			case Uta:
			case Maku:
			case Pelete:
			case Pitijo:
			case Sapi:
			case Tula:
			case Pata:
			case Pumi:
			case Matija:
			case Waju:
			case Salila:
			case Sila:
			case Ko:
			case Suwina:
			case Samo:
			case Tenja:
			case Ipuwe:
			case Muku:
			case Kalawa:
			case Konje:
			case Wala:
			case Asete:
			case Akala:
			case Amo:
			case Kanta:
			case Sekano:
			case Kenelo:
			case Onko:
			case Umo:
			case Pikante:
			case Posa:
			case Anta:
			case Takuwa:
			case Tawapu:
			case Lanki:
			case Titi:
			case Tapala:
			case Talili:
			case Lipan:
			case Lunti:
			case Takilo:
			case Kalan:
			case Ulokan:
			case Kontatu:
			case Mulu:
			case Watan:
			case Wili:
			case Iputu:
			case Tina:
			case Titan:
			case Pon:
			case Len:
			case Santi:
			case Sankan:
			case One:
			case Tanu:
			case Sepo:
			case Teneme:
			case Solu:
			case Tope:
			case Tamaka:
			case Tuntan:
			case Non:
			case Ewin:
			case Enteken:
			case Menwa:
			case Muntu:
			case Insu:
			case Onton:
			case Kikolo:
			case Lo:
			case Tiku:
			case Ikama:
			case Inpali:
				{
				setState(273);
				contentWord();
				}
				break;
			case ProperNoun:
				{
				setState(274);
				match(ProperNoun);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PronounContext extends ParserRuleContext {
		public TerminalNode Ja() { return getToken(KokanuParser.Ja, 0); }
		public TerminalNode Ka() { return getToken(KokanuParser.Ka, 0); }
		public TerminalNode Mi() { return getToken(KokanuParser.Mi, 0); }
		public TerminalNode Na() { return getToken(KokanuParser.Na, 0); }
		public TerminalNode Ne() { return getToken(KokanuParser.Ne, 0); }
		public TerminalNode Sa() { return getToken(KokanuParser.Sa, 0); }
		public TerminalNode Tu() { return getToken(KokanuParser.Tu, 0); }
		public TerminalNode Usen() { return getToken(KokanuParser.Usen, 0); }
		public PronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterPronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitPronoun(this);
		}
	}

	public final PronounContext pronoun() throws RecognitionException {
		PronounContext _localctx = new PronounContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==Ka || _la==Usen || _la==Ja || _la==Mi || _la==Tu || _la==Na || _la==Sa || _la==Ne) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentParticlesContext extends ParserRuleContext {
		public TerminalNode We() { return getToken(KokanuParser.We, 0); }
		public List<TerminalNode> No() { return getTokens(KokanuParser.No); }
		public TerminalNode No(int i) {
			return getToken(KokanuParser.No, i);
		}
		public TerminalNode Mu() { return getToken(KokanuParser.Mu, 0); }
		public ContentParticlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentParticles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterContentParticles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitContentParticles(this);
		}
	}

	public final ContentParticlesContext contentParticles() throws RecognitionException {
		ContentParticlesContext _localctx = new ContentParticlesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_contentParticles);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case We:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(We);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==No) {
					{
					setState(280);
					match(No);
					}
				}

				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Mu) {
					{
					setState(283);
					match(Mu);
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==No) {
						{
						setState(284);
						match(No);
						}
					}

					}
				}

				}
				break;
			case Mu:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(Mu);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==No) {
					{
					setState(290);
					match(No);
					}
				}

				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==We) {
					{
					setState(293);
					match(We);
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==No) {
						{
						setState(294);
						match(No);
						}
					}

					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseVerbContext extends ParserRuleContext {
		public RawVerbsContext rawVerbs() {
			return getRuleContext(RawVerbsContext.class,0);
		}
		public ContentParticlesContext contentParticles() {
			return getRuleContext(ContentParticlesContext.class,0);
		}
		public BaseVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterBaseVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitBaseVerb(this);
		}
	}

	public final BaseVerbContext baseVerb() throws RecognitionException {
		BaseVerbContext _localctx = new BaseVerbContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_baseVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==We || _la==Mu) {
				{
				setState(301);
				contentParticles();
				}
			}

			setState(304);
			rawVerbs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RawVerbsContext extends ParserRuleContext {
		public TerminalNode Pese() { return getToken(KokanuParser.Pese, 0); }
		public TerminalNode Kilima() { return getToken(KokanuParser.Kilima, 0); }
		public TerminalNode Iman() { return getToken(KokanuParser.Iman, 0); }
		public TerminalNode Tasuwi() { return getToken(KokanuParser.Tasuwi, 0); }
		public TerminalNode Ukun() { return getToken(KokanuParser.Ukun, 0); }
		public TerminalNode Kisa() { return getToken(KokanuParser.Kisa, 0); }
		public TerminalNode Kela() { return getToken(KokanuParser.Kela, 0); }
		public TerminalNode Lika() { return getToken(KokanuParser.Lika, 0); }
		public TerminalNode Tisilin() { return getToken(KokanuParser.Tisilin, 0); }
		public TerminalNode Kota() { return getToken(KokanuParser.Kota, 0); }
		public TerminalNode Pi() { return getToken(KokanuParser.Pi, 0); }
		public TerminalNode Anan() { return getToken(KokanuParser.Anan, 0); }
		public TerminalNode Tenkin() { return getToken(KokanuParser.Tenkin, 0); }
		public TerminalNode Papon() { return getToken(KokanuParser.Papon, 0); }
		public TerminalNode Junja() { return getToken(KokanuParser.Junja, 0); }
		public TerminalNode Nan() { return getToken(KokanuParser.Nan, 0); }
		public TerminalNode Ju() { return getToken(KokanuParser.Ju, 0); }
		public TerminalNode Kanisa() { return getToken(KokanuParser.Kanisa, 0); }
		public TerminalNode Pela() { return getToken(KokanuParser.Pela, 0); }
		public TerminalNode Tun() { return getToken(KokanuParser.Tun, 0); }
		public TerminalNode Oke() { return getToken(KokanuParser.Oke, 0); }
		public TerminalNode Pesuwan() { return getToken(KokanuParser.Pesuwan, 0); }
		public TerminalNode Ato() { return getToken(KokanuParser.Ato, 0); }
		public TerminalNode Wisan() { return getToken(KokanuParser.Wisan, 0); }
		public TerminalNode Kun() { return getToken(KokanuParser.Kun, 0); }
		public TerminalNode Teka() { return getToken(KokanuParser.Teka, 0); }
		public TerminalNode Tijante() { return getToken(KokanuParser.Tijante, 0); }
		public TerminalNode Niwa() { return getToken(KokanuParser.Niwa, 0); }
		public TerminalNode Sitija() { return getToken(KokanuParser.Sitija, 0); }
		public TerminalNode Makan() { return getToken(KokanuParser.Makan, 0); }
		public TerminalNode Sapole() { return getToken(KokanuParser.Sapole, 0); }
		public TerminalNode Suki() { return getToken(KokanuParser.Suki, 0); }
		public TerminalNode Apijo() { return getToken(KokanuParser.Apijo, 0); }
		public TerminalNode Alu() { return getToken(KokanuParser.Alu, 0); }
		public TerminalNode Kosan() { return getToken(KokanuParser.Kosan, 0); }
		public TerminalNode Inkatan() { return getToken(KokanuParser.Inkatan, 0); }
		public TerminalNode Pen() { return getToken(KokanuParser.Pen, 0); }
		public TerminalNode Iwe() { return getToken(KokanuParser.Iwe, 0); }
		public TerminalNode Putun() { return getToken(KokanuParser.Putun, 0); }
		public TerminalNode Tajen() { return getToken(KokanuParser.Tajen, 0); }
		public TerminalNode Pa() { return getToken(KokanuParser.Pa, 0); }
		public TerminalNode Tene() { return getToken(KokanuParser.Tene, 0); }
		public TerminalNode Jon() { return getToken(KokanuParser.Jon, 0); }
		public TerminalNode Peman() { return getToken(KokanuParser.Peman, 0); }
		public TerminalNode Jatan() { return getToken(KokanuParser.Jatan, 0); }
		public TerminalNode Lansa() { return getToken(KokanuParser.Lansa, 0); }
		public TerminalNode Sapi() { return getToken(KokanuParser.Sapi, 0); }
		public TerminalNode Pata() { return getToken(KokanuParser.Pata, 0); }
		public TerminalNode Akala() { return getToken(KokanuParser.Akala, 0); }
		public TerminalNode Amo() { return getToken(KokanuParser.Amo, 0); }
		public TerminalNode Kanta() { return getToken(KokanuParser.Kanta, 0); }
		public TerminalNode Posa() { return getToken(KokanuParser.Posa, 0); }
		public TerminalNode Anta() { return getToken(KokanuParser.Anta, 0); }
		public TerminalNode Takuwa() { return getToken(KokanuParser.Takuwa, 0); }
		public TerminalNode Tawapu() { return getToken(KokanuParser.Tawapu, 0); }
		public TerminalNode Kalan() { return getToken(KokanuParser.Kalan, 0); }
		public TerminalNode Kontatu() { return getToken(KokanuParser.Kontatu, 0); }
		public TerminalNode Pon() { return getToken(KokanuParser.Pon, 0); }
		public TerminalNode Teneme() { return getToken(KokanuParser.Teneme, 0); }
		public TerminalNode Solu() { return getToken(KokanuParser.Solu, 0); }
		public TerminalNode Onton() { return getToken(KokanuParser.Onton, 0); }
		public RawVerbsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawVerbs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRawVerbs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRawVerbs(this);
		}
	}

	public final RawVerbsContext rawVerbs() throws RecognitionException {
		RawVerbsContext _localctx = new RawVerbsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rawVerbs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & -9072078270425460555L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2632353986627272769L) != 0) || ((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & -9069897719901700087L) != 0) || ((((_la - 228)) & ~0x3f) == 0 && ((1L << (_la - 228)) & 79238120079633L) != 0) || ((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & 144141610752424967L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseNounContext extends ParserRuleContext {
		public RawNounsContext rawNouns() {
			return getRuleContext(RawNounsContext.class,0);
		}
		public ContentParticlesContext contentParticles() {
			return getRuleContext(ContentParticlesContext.class,0);
		}
		public BaseNounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseNoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterBaseNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitBaseNoun(this);
		}
	}

	public final BaseNounContext baseNoun() throws RecognitionException {
		BaseNounContext _localctx = new BaseNounContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_baseNoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==We || _la==Mu) {
				{
				setState(308);
				contentParticles();
				}
			}

			setState(311);
			rawNouns();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RawNounsContext extends ParserRuleContext {
		public TerminalNode Kapaja() { return getToken(KokanuParser.Kapaja, 0); }
		public TerminalNode Sito() { return getToken(KokanuParser.Sito, 0); }
		public TerminalNode Sala() { return getToken(KokanuParser.Sala, 0); }
		public TerminalNode Talika() { return getToken(KokanuParser.Talika, 0); }
		public TerminalNode Mata() { return getToken(KokanuParser.Mata, 0); }
		public TerminalNode Mita() { return getToken(KokanuParser.Mita, 0); }
		public TerminalNode Jasa() { return getToken(KokanuParser.Jasa, 0); }
		public TerminalNode Jamin() { return getToken(KokanuParser.Jamin, 0); }
		public TerminalNode Apaki() { return getToken(KokanuParser.Apaki, 0); }
		public TerminalNode Luwa() { return getToken(KokanuParser.Luwa, 0); }
		public TerminalNode Otota() { return getToken(KokanuParser.Otota, 0); }
		public TerminalNode Oti() { return getToken(KokanuParser.Oti, 0); }
		public TerminalNode Pani() { return getToken(KokanuParser.Pani, 0); }
		public TerminalNode Sikin() { return getToken(KokanuParser.Sikin, 0); }
		public TerminalNode Sinsi() { return getToken(KokanuParser.Sinsi, 0); }
		public TerminalNode Anpipi() { return getToken(KokanuParser.Anpipi, 0); }
		public TerminalNode Ten() { return getToken(KokanuParser.Ten, 0); }
		public TerminalNode Pulusi() { return getToken(KokanuParser.Pulusi, 0); }
		public TerminalNode Muwesi() { return getToken(KokanuParser.Muwesi, 0); }
		public TerminalNode Moto() { return getToken(KokanuParser.Moto, 0); }
		public TerminalNode Kemika() { return getToken(KokanuParser.Kemika, 0); }
		public TerminalNode Mani() { return getToken(KokanuParser.Mani, 0); }
		public TerminalNode Sin() { return getToken(KokanuParser.Sin, 0); }
		public TerminalNode Tolu() { return getToken(KokanuParser.Tolu, 0); }
		public TerminalNode Lipu() { return getToken(KokanuParser.Lipu, 0); }
		public TerminalNode Osa() { return getToken(KokanuParser.Osa, 0); }
		public TerminalNode Ken() { return getToken(KokanuParser.Ken, 0); }
		public TerminalNode Lan() { return getToken(KokanuParser.Lan, 0); }
		public TerminalNode Soto() { return getToken(KokanuParser.Soto, 0); }
		public TerminalNode Nin() { return getToken(KokanuParser.Nin, 0); }
		public TerminalNode Toki() { return getToken(KokanuParser.Toki, 0); }
		public TerminalNode Kumi() { return getToken(KokanuParser.Kumi, 0); }
		public TerminalNode Polan() { return getToken(KokanuParser.Polan, 0); }
		public TerminalNode Mijalo() { return getToken(KokanuParser.Mijalo, 0); }
		public TerminalNode Tawe() { return getToken(KokanuParser.Tawe, 0); }
		public TerminalNode Kiju() { return getToken(KokanuParser.Kiju, 0); }
		public TerminalNode Jone() { return getToken(KokanuParser.Jone, 0); }
		public TerminalNode Akoli() { return getToken(KokanuParser.Akoli, 0); }
		public TerminalNode Lana() { return getToken(KokanuParser.Lana, 0); }
		public TerminalNode Wa() { return getToken(KokanuParser.Wa, 0); }
		public TerminalNode Tanwa() { return getToken(KokanuParser.Tanwa, 0); }
		public TerminalNode Tipa() { return getToken(KokanuParser.Tipa, 0); }
		public TerminalNode Pite() { return getToken(KokanuParser.Pite, 0); }
		public TerminalNode Pintu() { return getToken(KokanuParser.Pintu, 0); }
		public TerminalNode Laki() { return getToken(KokanuParser.Laki, 0); }
		public TerminalNode Jan() { return getToken(KokanuParser.Jan, 0); }
		public TerminalNode Keke() { return getToken(KokanuParser.Keke, 0); }
		public TerminalNode Latito() { return getToken(KokanuParser.Latito, 0); }
		public TerminalNode Ankolo() { return getToken(KokanuParser.Ankolo, 0); }
		public TerminalNode Poloko() { return getToken(KokanuParser.Poloko, 0); }
		public TerminalNode Komo() { return getToken(KokanuParser.Komo, 0); }
		public TerminalNode Powele() { return getToken(KokanuParser.Powele, 0); }
		public TerminalNode Sopa() { return getToken(KokanuParser.Sopa, 0); }
		public TerminalNode Niku() { return getToken(KokanuParser.Niku, 0); }
		public TerminalNode Musi() { return getToken(KokanuParser.Musi, 0); }
		public TerminalNode Kaki() { return getToken(KokanuParser.Kaki, 0); }
		public TerminalNode Akasa() { return getToken(KokanuParser.Akasa, 0); }
		public TerminalNode Kumon() { return getToken(KokanuParser.Kumon, 0); }
		public TerminalNode Namu() { return getToken(KokanuParser.Namu, 0); }
		public TerminalNode Tuwi() { return getToken(KokanuParser.Tuwi, 0); }
		public TerminalNode Alijun() { return getToken(KokanuParser.Alijun, 0); }
		public TerminalNode Malo() { return getToken(KokanuParser.Malo, 0); }
		public TerminalNode Leseka() { return getToken(KokanuParser.Leseka, 0); }
		public TerminalNode Pintan() { return getToken(KokanuParser.Pintan, 0); }
		public TerminalNode Kuwan() { return getToken(KokanuParser.Kuwan, 0); }
		public TerminalNode Sintuwan() { return getToken(KokanuParser.Sintuwan, 0); }
		public TerminalNode Pansin() { return getToken(KokanuParser.Pansin, 0); }
		public TerminalNode Kuwosi() { return getToken(KokanuParser.Kuwosi, 0); }
		public TerminalNode Limijen() { return getToken(KokanuParser.Limijen, 0); }
		public TerminalNode Matuwa() { return getToken(KokanuParser.Matuwa, 0); }
		public TerminalNode Kali() { return getToken(KokanuParser.Kali, 0); }
		public TerminalNode Namuna() { return getToken(KokanuParser.Namuna, 0); }
		public TerminalNode Onja() { return getToken(KokanuParser.Onja, 0); }
		public TerminalNode Ukama() { return getToken(KokanuParser.Ukama, 0); }
		public TerminalNode Koton() { return getToken(KokanuParser.Koton, 0); }
		public TerminalNode Mitin() { return getToken(KokanuParser.Mitin, 0); }
		public TerminalNode Konpute() { return getToken(KokanuParser.Konpute, 0); }
		public TerminalNode Kuku() { return getToken(KokanuParser.Kuku, 0); }
		public TerminalNode Meja() { return getToken(KokanuParser.Meja, 0); }
		public TerminalNode Momu() { return getToken(KokanuParser.Momu, 0); }
		public TerminalNode Neje() { return getToken(KokanuParser.Neje, 0); }
		public TerminalNode Pawo() { return getToken(KokanuParser.Pawo, 0); }
		public TerminalNode Ukiki() { return getToken(KokanuParser.Ukiki, 0); }
		public TerminalNode Lenka() { return getToken(KokanuParser.Lenka, 0); }
		public TerminalNode Pelete() { return getToken(KokanuParser.Pelete, 0); }
		public TerminalNode Pitijo() { return getToken(KokanuParser.Pitijo, 0); }
		public TerminalNode Pumi() { return getToken(KokanuParser.Pumi, 0); }
		public TerminalNode Matija() { return getToken(KokanuParser.Matija, 0); }
		public TerminalNode Waju() { return getToken(KokanuParser.Waju, 0); }
		public TerminalNode Salila() { return getToken(KokanuParser.Salila, 0); }
		public TerminalNode Sila() { return getToken(KokanuParser.Sila, 0); }
		public TerminalNode Ko() { return getToken(KokanuParser.Ko, 0); }
		public TerminalNode Suwina() { return getToken(KokanuParser.Suwina, 0); }
		public TerminalNode Ipuwe() { return getToken(KokanuParser.Ipuwe, 0); }
		public TerminalNode Muku() { return getToken(KokanuParser.Muku, 0); }
		public TerminalNode Kalawa() { return getToken(KokanuParser.Kalawa, 0); }
		public TerminalNode Wala() { return getToken(KokanuParser.Wala, 0); }
		public TerminalNode Asete() { return getToken(KokanuParser.Asete, 0); }
		public TerminalNode Kenelo() { return getToken(KokanuParser.Kenelo, 0); }
		public TerminalNode Onko() { return getToken(KokanuParser.Onko, 0); }
		public TerminalNode Umo() { return getToken(KokanuParser.Umo, 0); }
		public TerminalNode Lanki() { return getToken(KokanuParser.Lanki, 0); }
		public TerminalNode Titi() { return getToken(KokanuParser.Titi, 0); }
		public TerminalNode Tapala() { return getToken(KokanuParser.Tapala, 0); }
		public TerminalNode Talili() { return getToken(KokanuParser.Talili, 0); }
		public TerminalNode Takilo() { return getToken(KokanuParser.Takilo, 0); }
		public TerminalNode Ulokan() { return getToken(KokanuParser.Ulokan, 0); }
		public TerminalNode Watan() { return getToken(KokanuParser.Watan, 0); }
		public TerminalNode Titan() { return getToken(KokanuParser.Titan, 0); }
		public TerminalNode Tamaka() { return getToken(KokanuParser.Tamaka, 0); }
		public TerminalNode Non() { return getToken(KokanuParser.Non, 0); }
		public TerminalNode Ewin() { return getToken(KokanuParser.Ewin, 0); }
		public TerminalNode Enteken() { return getToken(KokanuParser.Enteken, 0); }
		public TerminalNode Menwa() { return getToken(KokanuParser.Menwa, 0); }
		public TerminalNode Insu() { return getToken(KokanuParser.Insu, 0); }
		public TerminalNode Ikama() { return getToken(KokanuParser.Ikama, 0); }
		public TerminalNode Inpali() { return getToken(KokanuParser.Inpali, 0); }
		public RawNounsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawNouns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRawNouns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRawNouns(this);
		}
	}

	public final RawNounsContext rawNouns() throws RecognitionException {
		RawNounsContext _localctx = new RawNounsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_rawNouns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4901326237124001792L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 496702918876266725L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 1202989454399146499L) != 0) || ((((_la - 202)) & ~0x3f) == 0 && ((1L << (_la - 202)) & 1159626191524664589L) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & 292917326872260547L) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & 99561L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BaseModifierContext extends ParserRuleContext {
		public RawModifiersContext rawModifiers() {
			return getRuleContext(RawModifiersContext.class,0);
		}
		public ContentParticlesContext contentParticles() {
			return getRuleContext(ContentParticlesContext.class,0);
		}
		public BaseModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterBaseModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitBaseModifier(this);
		}
	}

	public final BaseModifierContext baseModifier() throws RecognitionException {
		BaseModifierContext _localctx = new BaseModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_baseModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==We || _la==Mu) {
				{
				setState(315);
				contentParticles();
				}
			}

			setState(318);
			rawModifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RawModifiersContext extends ParserRuleContext {
		public TerminalNode Lijule() { return getToken(KokanuParser.Lijule, 0); }
		public TerminalNode Akiki() { return getToken(KokanuParser.Akiki, 0); }
		public TerminalNode Aja() { return getToken(KokanuParser.Aja, 0); }
		public TerminalNode Kapan() { return getToken(KokanuParser.Kapan, 0); }
		public TerminalNode Mutakin() { return getToken(KokanuParser.Mutakin, 0); }
		public TerminalNode Konpa() { return getToken(KokanuParser.Konpa, 0); }
		public TerminalNode Janlu() { return getToken(KokanuParser.Janlu, 0); }
		public TerminalNode Jamu() { return getToken(KokanuParser.Jamu, 0); }
		public TerminalNode Pututi() { return getToken(KokanuParser.Pututi, 0); }
		public TerminalNode Minuli() { return getToken(KokanuParser.Minuli, 0); }
		public TerminalNode Unitu() { return getToken(KokanuParser.Unitu, 0); }
		public TerminalNode Loso() { return getToken(KokanuParser.Loso, 0); }
		public TerminalNode Kima() { return getToken(KokanuParser.Kima, 0); }
		public TerminalNode Patun() { return getToken(KokanuParser.Patun, 0); }
		public TerminalNode Panli() { return getToken(KokanuParser.Panli, 0); }
		public TerminalNode Tunti() { return getToken(KokanuParser.Tunti, 0); }
		public TerminalNode Wanku() { return getToken(KokanuParser.Wanku, 0); }
		public TerminalNode Unsi() { return getToken(KokanuParser.Unsi, 0); }
		public TerminalNode Puka() { return getToken(KokanuParser.Puka, 0); }
		public TerminalNode Pankosi() { return getToken(KokanuParser.Pankosi, 0); }
		public TerminalNode Otan() { return getToken(KokanuParser.Otan, 0); }
		public TerminalNode Kujo() { return getToken(KokanuParser.Kujo, 0); }
		public TerminalNode Ela() { return getToken(KokanuParser.Ela, 0); }
		public TerminalNode Suwi() { return getToken(KokanuParser.Suwi, 0); }
		public TerminalNode Tati() { return getToken(KokanuParser.Tati, 0); }
		public TerminalNode Tomiwa() { return getToken(KokanuParser.Tomiwa, 0); }
		public TerminalNode Tepu() { return getToken(KokanuParser.Tepu, 0); }
		public TerminalNode Anwije() { return getToken(KokanuParser.Anwije, 0); }
		public TerminalNode Lisi() { return getToken(KokanuParser.Lisi, 0); }
		public TerminalNode Eme() { return getToken(KokanuParser.Eme, 0); }
		public TerminalNode Kapu() { return getToken(KokanuParser.Kapu, 0); }
		public TerminalNode Neso() { return getToken(KokanuParser.Neso, 0); }
		public TerminalNode Kaso() { return getToken(KokanuParser.Kaso, 0); }
		public TerminalNode Konen() { return getToken(KokanuParser.Konen, 0); }
		public TerminalNode Kikuwa() { return getToken(KokanuParser.Kikuwa, 0); }
		public TerminalNode Mamaki() { return getToken(KokanuParser.Mamaki, 0); }
		public TerminalNode Wiki() { return getToken(KokanuParser.Wiki, 0); }
		public TerminalNode Naki() { return getToken(KokanuParser.Naki, 0); }
		public TerminalNode Sone() { return getToken(KokanuParser.Sone, 0); }
		public TerminalNode Katin() { return getToken(KokanuParser.Katin, 0); }
		public TerminalNode Kula() { return getToken(KokanuParser.Kula, 0); }
		public TerminalNode Kusa() { return getToken(KokanuParser.Kusa, 0); }
		public TerminalNode Tile() { return getToken(KokanuParser.Tile, 0); }
		public TerminalNode Tusa() { return getToken(KokanuParser.Tusa, 0); }
		public TerminalNode Nankin() { return getToken(KokanuParser.Nankin, 0); }
		public TerminalNode Nalan() { return getToken(KokanuParser.Nalan, 0); }
		public TerminalNode Pasan() { return getToken(KokanuParser.Pasan, 0); }
		public TerminalNode Pula() { return getToken(KokanuParser.Pula, 0); }
		public TerminalNode Mepu() { return getToken(KokanuParser.Mepu, 0); }
		public TerminalNode Luka() { return getToken(KokanuParser.Luka, 0); }
		public TerminalNode Wita() { return getToken(KokanuParser.Wita, 0); }
		public TerminalNode Saminta() { return getToken(KokanuParser.Saminta, 0); }
		public TerminalNode Sanpanti() { return getToken(KokanuParser.Sanpanti, 0); }
		public TerminalNode Saman() { return getToken(KokanuParser.Saman, 0); }
		public TerminalNode Satalan() { return getToken(KokanuParser.Satalan, 0); }
		public TerminalNode Sula() { return getToken(KokanuParser.Sula, 0); }
		public TerminalNode Matiko() { return getToken(KokanuParser.Matiko, 0); }
		public TerminalNode Nelo() { return getToken(KokanuParser.Nelo, 0); }
		public TerminalNode Kate() { return getToken(KokanuParser.Kate, 0); }
		public TerminalNode Osole() { return getToken(KokanuParser.Osole, 0); }
		public TerminalNode Umami() { return getToken(KokanuParser.Umami, 0); }
		public TerminalNode Juka() { return getToken(KokanuParser.Juka, 0); }
		public TerminalNode Tenti() { return getToken(KokanuParser.Tenti, 0); }
		public TerminalNode Kawa() { return getToken(KokanuParser.Kawa, 0); }
		public TerminalNode Penpe() { return getToken(KokanuParser.Penpe, 0); }
		public TerminalNode Tuko() { return getToken(KokanuParser.Tuko, 0); }
		public TerminalNode Olon() { return getToken(KokanuParser.Olon, 0); }
		public TerminalNode Kuto() { return getToken(KokanuParser.Kuto, 0); }
		public TerminalNode Asa() { return getToken(KokanuParser.Asa, 0); }
		public TerminalNode Kijata() { return getToken(KokanuParser.Kijata, 0); }
		public TerminalNode Sena() { return getToken(KokanuParser.Sena, 0); }
		public TerminalNode Sipa() { return getToken(KokanuParser.Sipa, 0); }
		public TerminalNode Si() { return getToken(KokanuParser.Si, 0); }
		public TerminalNode Joli() { return getToken(KokanuParser.Joli, 0); }
		public TerminalNode Tonsa() { return getToken(KokanuParser.Tonsa, 0); }
		public TerminalNode Kuwanko() { return getToken(KokanuParser.Kuwanko, 0); }
		public TerminalNode Timi() { return getToken(KokanuParser.Timi, 0); }
		public TerminalNode Tunpu() { return getToken(KokanuParser.Tunpu, 0); }
		public TerminalNode Taka() { return getToken(KokanuParser.Taka, 0); }
		public TerminalNode Tune() { return getToken(KokanuParser.Tune, 0); }
		public TerminalNode Nile() { return getToken(KokanuParser.Nile, 0); }
		public TerminalNode Panta() { return getToken(KokanuParser.Panta, 0); }
		public TerminalNode Tonko() { return getToken(KokanuParser.Tonko, 0); }
		public TerminalNode Sunkan() { return getToken(KokanuParser.Sunkan, 0); }
		public TerminalNode Lito() { return getToken(KokanuParser.Lito, 0); }
		public TerminalNode Lamo() { return getToken(KokanuParser.Lamo, 0); }
		public TerminalNode Aluko() { return getToken(KokanuParser.Aluko, 0); }
		public TerminalNode Nepa() { return getToken(KokanuParser.Nepa, 0); }
		public TerminalNode Tutu() { return getToken(KokanuParser.Tutu, 0); }
		public TerminalNode Wonpa() { return getToken(KokanuParser.Wonpa, 0); }
		public TerminalNode Napa() { return getToken(KokanuParser.Napa, 0); }
		public TerminalNode Nase() { return getToken(KokanuParser.Nase, 0); }
		public TerminalNode Kisowa() { return getToken(KokanuParser.Kisowa, 0); }
		public TerminalNode Pasu() { return getToken(KokanuParser.Pasu, 0); }
		public TerminalNode Opotu() { return getToken(KokanuParser.Opotu, 0); }
		public TerminalNode Uta() { return getToken(KokanuParser.Uta, 0); }
		public TerminalNode Maku() { return getToken(KokanuParser.Maku, 0); }
		public TerminalNode Tula() { return getToken(KokanuParser.Tula, 0); }
		public TerminalNode Samo() { return getToken(KokanuParser.Samo, 0); }
		public TerminalNode Tenja() { return getToken(KokanuParser.Tenja, 0); }
		public TerminalNode Konje() { return getToken(KokanuParser.Konje, 0); }
		public TerminalNode Sekano() { return getToken(KokanuParser.Sekano, 0); }
		public TerminalNode Pikante() { return getToken(KokanuParser.Pikante, 0); }
		public TerminalNode Lipan() { return getToken(KokanuParser.Lipan, 0); }
		public TerminalNode Lunti() { return getToken(KokanuParser.Lunti, 0); }
		public TerminalNode Mulu() { return getToken(KokanuParser.Mulu, 0); }
		public TerminalNode Wili() { return getToken(KokanuParser.Wili, 0); }
		public TerminalNode Iputu() { return getToken(KokanuParser.Iputu, 0); }
		public TerminalNode Tina() { return getToken(KokanuParser.Tina, 0); }
		public TerminalNode Len() { return getToken(KokanuParser.Len, 0); }
		public TerminalNode Santi() { return getToken(KokanuParser.Santi, 0); }
		public TerminalNode Sankan() { return getToken(KokanuParser.Sankan, 0); }
		public TerminalNode One() { return getToken(KokanuParser.One, 0); }
		public TerminalNode Tanu() { return getToken(KokanuParser.Tanu, 0); }
		public TerminalNode Sepo() { return getToken(KokanuParser.Sepo, 0); }
		public TerminalNode Tope() { return getToken(KokanuParser.Tope, 0); }
		public TerminalNode Tuntan() { return getToken(KokanuParser.Tuntan, 0); }
		public TerminalNode Muntu() { return getToken(KokanuParser.Muntu, 0); }
		public TerminalNode Kikolo() { return getToken(KokanuParser.Kikolo, 0); }
		public TerminalNode Lo() { return getToken(KokanuParser.Lo, 0); }
		public TerminalNode Tiku() { return getToken(KokanuParser.Tiku, 0); }
		public RawModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRawModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRawModifiers(this);
		}
	}

	public final RawModifiersContext rawModifiers() throws RecognitionException {
		RawModifiersContext _localctx = new RawModifiersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rawModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -5604465573988597760L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & -8586041648507205567L) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & 6017813231691445807L) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & -3164045281630027423L) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & -6334310642366803739L) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & 478193633L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectorContext extends ParserRuleContext {
		public TerminalNode Tan() { return getToken(KokanuParser.Tan, 0); }
		public TerminalNode Un() { return getToken(KokanuParser.Un, 0); }
		public TerminalNode Lekin() { return getToken(KokanuParser.Lekin, 0); }
		public TerminalNode Ili() { return getToken(KokanuParser.Ili, 0); }
		public ConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitConnector(this);
		}
	}

	public final ConnectorContext connector() throws RecognitionException {
		ConnectorContext _localctx = new ConnectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_connector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_la = _input.LA(1);
			if ( !(_la==Tan || _la==Un || _la==Lekin || _la==Ili) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelativeQuantityContext extends ParserRuleContext {
		public TerminalNode Jati() { return getToken(KokanuParser.Jati, 0); }
		public TerminalNode Mese() { return getToken(KokanuParser.Mese, 0); }
		public TerminalNode Menu() { return getToken(KokanuParser.Menu, 0); }
		public TerminalNode Niju() { return getToken(KokanuParser.Niju, 0); }
		public TerminalNode Ani() { return getToken(KokanuParser.Ani, 0); }
		public RelativeQuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeQuantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRelativeQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRelativeQuantity(this);
		}
	}

	public final RelativeQuantityContext relativeQuantity() throws RecognitionException {
		RelativeQuantityContext _localctx = new RelativeQuantityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relativeQuantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_la = _input.LA(1);
			if ( !(_la==Jati || _la==Mese || _la==Menu || _la==Ani || _la==Niju) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NominalQuantityContext extends ParserRuleContext {
		public TerminalNode Nula() { return getToken(KokanuParser.Nula, 0); }
		public TerminalNode Wan() { return getToken(KokanuParser.Wan, 0); }
		public TerminalNode Toso() { return getToken(KokanuParser.Toso, 0); }
		public TerminalNode San() { return getToken(KokanuParser.San, 0); }
		public TerminalNode Lijo() { return getToken(KokanuParser.Lijo, 0); }
		public TerminalNode Lima() { return getToken(KokanuParser.Lima, 0); }
		public TerminalNode Saka() { return getToken(KokanuParser.Saka, 0); }
		public TerminalNode Setan() { return getToken(KokanuParser.Setan, 0); }
		public TerminalNode Etu() { return getToken(KokanuParser.Etu, 0); }
		public TerminalNode Nanku() { return getToken(KokanuParser.Nanku, 0); }
		public TerminalNode Sijen() { return getToken(KokanuParser.Sijen, 0); }
		public TerminalNode Tiju() { return getToken(KokanuParser.Tiju, 0); }
		public NominalQuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nominalQuantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterNominalQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitNominalQuantity(this);
		}
	}

	public final NominalQuantityContext nominalQuantity() throws RecognitionException {
		NominalQuantityContext _localctx = new NominalQuantityContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nominalQuantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 536875009L) != 0) || _la==Lima || _la==San || ((((_la - 281)) & ~0x3f) == 0 && ((1L << (_la - 281)) & 343866016257L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0164\u0149\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001"+
		"\u0000\u0003\u0000@\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0002\u0003"+
		"\u0002L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002R\b\u0002\n\u0002\f\u0002U\t\u0002\u0005\u0002W\b\u0002\n\u0002"+
		"\f\u0002Z\t\u0002\u0001\u0002\u0003\u0002]\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002a\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002g\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002k\b\u0002\u0001"+
		"\u0002\u0004\u0002n\b\u0002\u000b\u0002\f\u0002o\u0001\u0002\u0003\u0002"+
		"s\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002"+
		"\f\u0002{\t\u0002\u0001\u0003\u0003\u0003~\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u0083\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0001"+
		"\u0003\u0003\u0003\u0089\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008d"+
		"\b\u0003\n\u0003\f\u0003\u0090\t\u0003\u0003\u0003\u0092\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u009b\b\u0005\n\u0005\f\u0005\u009e\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00a2\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00a7\b\u0005\n\u0005\f\u0005\u00aa\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ae\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00b3\b\u0005\u0001\u0005\u0003\u0005\u00b6\b\u0005\u0003\u0005"+
		"\u00b8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00bf\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c3\b"+
		"\u0007\u0001\u0007\u0003\u0007\u00c6\b\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00ca\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007"+
		"\u0003\u0007\u00d0\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00d6"+
		"\b\t\n\t\f\t\u00d9\t\t\u0001\t\u0001\t\u0005\t\u00dd\b\t\n\t\f\t\u00e0"+
		"\t\t\u0003\t\u00e2\b\t\u0001\n\u0001\n\u0005\n\u00e6\b\n\n\n\f\n\u00e9"+
		"\t\n\u0001\u000b\u0003\u000b\u00ec\b\u000b\u0001\u000b\u0004\u000b\u00ef"+
		"\b\u000b\u000b\u000b\f\u000b\u00f0\u0001\f\u0001\f\u0003\f\u00f5\b\f\u0001"+
		"\f\u0005\f\u00f8\b\f\n\f\f\f\u00fb\t\f\u0001\r\u0001\r\u0003\r\u00ff\b"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0105\b\r\n\r\f\r\u0108\t\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010d\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0114\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u011a\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u011e\b\u0011\u0003\u0011\u0120\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0124\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0128\b\u0011\u0003\u0011\u012a\b\u0011\u0003\u0011"+
		"\u012c\b\u0011\u0001\u0012\u0003\u0012\u012f\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u0136\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016\u013d"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000"+
		"\u0000\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\n\u0002\u0000\b\b\n\n\u0002"+
		"\u0001\u0003\u0003\u0005\u0005\u000b\u0000\u0007\u0007\t\t\u000e\u000e"+
		"WWnn\u00c7\u00c7\u00cf\u00cf\u00e0\u00e0\u0157\u0157\u015b\u015b\u0164"+
		"\u0164\b\u0000**;;\u0081\u0081\u00aa\u00aa\u00c6\u00c6\u00e1\u00e1\u0121"+
		"\u0121\u0146\u01461\u0000\u0011\u0011\u0013\u0013\u0015\u0016\u0018\u0018"+
		"\u001d\u001d\'(++1168@ADEJJPPTTZZccoott\u0087\u0087\u008b\u008b\u008e"+
		"\u008e\u0091\u0091\u00a0\u00a0\u00a3\u00a3\u00ae\u00ae\u00b1\u00b1\u00b5"+
		"\u00b5\u00c2\u00c2\u00c4\u00c4\u00ce\u00ce\u00d0\u00d0\u00d5\u00d5\u00d9"+
		"\u00d9\u00df\u00df\u00e4\u00e4\u00e8\u00e8\u00ec\u00ec\u0100\u0100\u0104"+
		"\u0104\u0108\u0108\u010f\u010f\u0112\u0112\u0125\u0127\u012f\u0132\u013b"+
		"\u013b\u013e\u013e\u0148\u0148\u0150\u0151\u015e\u015eG\u0000\u0012\u0012"+
		"\u0014\u0014\u001a\u001b\u001f\u001f!%))0022::>>FFHHKMVVXX]]_addhikkm"+
		"mppssuuxx{}\u007f\u0080\u0089\u008a\u0092\u0092\u0094\u0094\u0098\u0098"+
		"\u00a2\u00a2\u00a4\u00a8\u00ac\u00ac\u00b0\u00b0\u00b6\u00b9\u00bd\u00be"+
		"\u00c0\u00c0\u00c5\u00c5\u00ca\u00ca\u00cc\u00cd\u00d2\u00d2\u00d4\u00d4"+
		"\u00d6\u00d6\u00da\u00da\u00de\u00de\u00e3\u00e3\u00e6\u00e6\u00e9\u00e9"+
		"\u00ef\u00f2\u00f6\u00f6\u00f8\u00fc\u00fe\u00fe\u0106\u0106\u010d\u010e"+
		"\u0113\u0118\u011a\u011a\u011d\u011f\u0123\u0124\u012b\u012d\u0133\u0134"+
		"\u0136\u0137\u013a\u013a\u013c\u013c\u0141\u0141\u0147\u0147\u0153\u0153"+
		"\u0156\u0156\u0158\u015a\u015d\u015d\u0162\u0163H\u0000\u0010\u0010\u0017"+
		"\u0017\u0019\u0019\u001c\u001c  &&,/3599<=??CCIINNQRUU\\\\^^bbegjjqqv"+
		"wyz~~\u0082\u0086\u0088\u0088\u008c\u008d\u008f\u0090\u0093\u0093\u0095"+
		"\u0097\u009a\u009f\u00a9\u00a9\u00ab\u00ab\u00af\u00af\u00b2\u00b4\u00ba"+
		"\u00bc\u00bf\u00bf\u00c1\u00c1\u00c3\u00c3\u00c8\u00c9\u00cb\u00cb\u00d3"+
		"\u00d3\u00d7\u00d8\u00db\u00dd\u00e2\u00e2\u00e5\u00e5\u00e7\u00e7\u00ea"+
		"\u00eb\u00ed\u00ee\u00f3\u00f5\u00f7\u00f7\u00fd\u00fd\u00ff\u00ff\u0101"+
		"\u0102\u0105\u0105\u0107\u0107\u010a\u010c\u0111\u0111\u011b\u011c\u0120"+
		"\u0120\u0128\u0128\u012e\u012e\u0138\u0139\u0140\u0140\u0142\u0142\u0144"+
		"\u0145\u014a\u014f\u0152\u0152\u0154\u0154\u015c\u015c\u015f\u0161\u0004"+
		"\u0000SSrr\u0099\u0099\u0110\u0110\u0005\u0000BBGG\u0109\u0109\u0143\u0143"+
		"\u0155\u0155\u000b\u0000OO[[ll\u00a1\u00a1\u00d1\u00d1\u0119\u0119\u0122"+
		"\u0122\u0129\u012a\u0135\u0135\u013d\u013d\u013f\u013f\u016c\u00006\u0001"+
		"\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004K\u0001\u0000\u0000"+
		"\u0000\u0006\u0091\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000\u0000\u0000"+
		"\n\u00b7\u0001\u0000\u0000\u0000\f\u00b9\u0001\u0000\u0000\u0000\u000e"+
		"\u00cf\u0001\u0000\u0000\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012"+
		"\u00e1\u0001\u0000\u0000\u0000\u0014\u00e3\u0001\u0000\u0000\u0000\u0016"+
		"\u00eb\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000\u0000\u0000\u001a"+
		"\u00fc\u0001\u0000\u0000\u0000\u001c\u010c\u0001\u0000\u0000\u0000\u001e"+
		"\u0113\u0001\u0000\u0000\u0000 \u0115\u0001\u0000\u0000\u0000\"\u012b"+
		"\u0001\u0000\u0000\u0000$\u012e\u0001\u0000\u0000\u0000&\u0132\u0001\u0000"+
		"\u0000\u0000(\u0135\u0001\u0000\u0000\u0000*\u0139\u0001\u0000\u0000\u0000"+
		",\u013c\u0001\u0000\u0000\u0000.\u0140\u0001\u0000\u0000\u00000\u0142"+
		"\u0001\u0000\u0000\u00002\u0144\u0001\u0000\u0000\u00004\u0146\u0001\u0000"+
		"\u0000\u00006;\u0003\u0002\u0001\u000078\u0005\u0005\u0000\u00008:\u0003"+
		"\u0002\u0001\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>@\u0005\u0005\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0001\u0001\u0000\u0000\u0000"+
		"AG\u0003\u0004\u0002\u0000BC\u00030\u0018\u0000CD\u0003\u0004\u0002\u0000"+
		"DF\u0001\u0000\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0003\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JL\u0003\u0018\f\u0000KJ\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LX\u0001\u0000\u0000\u0000"+
		"MS\u0003\u0006\u0003\u0000NO\u00030\u0018\u0000OP\u0003\u0006\u0003\u0000"+
		"PR\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000VM\u0001\u0000\u0000\u0000WZ\u0001"+
		"\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"Y\\\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[]\u0003\u0018\f"+
		"\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]m\u0001\u0000"+
		"\u0000\u0000^`\u0007\u0000\u0000\u0000_a\u0005Y\u0000\u0000`_\u0001\u0000"+
		"\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bf\u0003"+
		"\u0014\n\u0000cd\u0003\f\u0006\u0000de\u0003\u0010\b\u0000eg\u0001\u0000"+
		"\u0000\u0000fc\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gn\u0001"+
		"\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ik\u0005Y\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000"+
		"ln\u0003\u0012\t\u0000m^\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qs\u0003\u0018\f\u0000rq\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000sy\u0001\u0000\u0000\u0000tu\u00030\u0018"+
		"\u0000uv\u0003\u0018\f\u0000vx\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z\u0005\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"|~\u0003\u0016\u000b\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0003\b\u0004\u0000"+
		"\u0080\u0084\u0003\u0010\b\u0000\u0081\u0083\u0003\n\u0005\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0092\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087"+
		"\u0089\u0003\u0016\u000b\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008e\u0003\u001e\u000f\u0000\u008b\u008d\u0003\n\u0005\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091}\u0001"+
		"\u0000\u0000\u0000\u0091\u0088\u0001\u0000\u0000\u0000\u0092\u0007\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0003\u000e\u0007\u0000\u0094\u0096\u0003"+
		"\f\u0006\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\t\u0001\u0000\u0000\u0000\u0097\u00a1\u0005\u0103\u0000"+
		"\u0000\u0098\u009c\u0003\u001e\u000f\u0000\u0099\u009b\u0003\n\u0005\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a2\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0003\u000e\u0007\u0000\u00a0\u00a2\u0003\f\u0006\u0000\u00a1"+
		"\u0098\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00b8\u0001\u0000\u0000\u0000\u00a3"+
		"\u00ad\u0005\u000f\u0000\u0000\u00a4\u00a8\u0003\u001e\u000f\u0000\u00a5"+
		"\u00a7\u0003\n\u0005\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ae\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ae\u0003\u000e\u0007\u0000\u00ac\u00ae"+
		"\u0003\f\u0006\u0000\u00ad\u00a4\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b8\u0001"+
		"\u0000\u0000\u0000\u00af\u00b6\u0003\u001e\u000f\u0000\u00b0\u00b2\u0003"+
		"\u000e\u0007\u0000\u00b1\u00b3\u0005\u0003\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b6\u0003\f\u0006\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u0097\u0001\u0000"+
		"\u0000\u0000\u00b7\u00a3\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b8\u000b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000b"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0004\u0002\u0000\u00bb\r\u0001\u0000\u0000"+
		"\u0000\u00bc\u00be\u0005\f\u0000\u0000\u00bd\u00bf\u0005\r\u0000\u0000"+
		"\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003\u0014\n\u0000\u00c1"+
		"\u00c3\u0003\f\u0006\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0003\u0018\f\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c6\u00d0\u0001\u0000\u0000\u0000\u00c7\u00c9\u0005"+
		"\f\u0000\u0000\u00c8\u00ca\u0005\r\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cd\u0003\u0012\t\u0000\u00cc\u00ce\u0003\u0018\f"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00bc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000\u00d0\u000f\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0007\u0001\u0000\u0000\u00d2\u0011\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d7\u0003,\u0016\u0000\u00d4\u00d6\u0003\n\u0005\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00e2\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00de\u0003(\u0014\u0000\u00db\u00dd\u0003\n\u0005\u0000\u00dc"+
		"\u00db\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000\u0000\u00e2"+
		"\u0013\u0001\u0000\u0000\u0000\u00e3\u00e7\u0003$\u0012\u0000\u00e4\u00e6"+
		"\u0003\n\u0005\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u0015\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ec\u00032\u0019\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ef\u00034\u001a\u0000\u00ee\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0017\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f9\u0003\u001a\r\u0000\u00f3\u00f5\u0005\u0003\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0003\u001a\r\u0000\u00f7"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u0019\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fe\u0007\u0002\u0000\u0000\u00fd\u00ff\u0005Y\u0000\u0000\u00fe\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u0001\u0000\u0000\u0000\u0100\u0106\u0003\u0006\u0003\u0000\u0101\u0102"+
		"\u00030\u0018\u0000\u0102\u0103\u0003\u0006\u0003\u0000\u0103\u0105\u0001"+
		"\u0000\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u0108\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001"+
		"\u0000\u0000\u0000\u0107\u001b\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0109\u010d\u0003(\u0014\u0000\u010a\u010d\u0003$\u0012"+
		"\u0000\u010b\u010d\u0003,\u0016\u0000\u010c\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u001d\u0001\u0000\u0000\u0000\u010e\u0114\u0003 \u0010\u0000\u010f"+
		"\u0114\u00032\u0019\u0000\u0110\u0114\u00034\u001a\u0000\u0111\u0114\u0003"+
		"\u001c\u000e\u0000\u0112\u0114\u0005\u0002\u0000\u0000\u0113\u010e\u0001"+
		"\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0110\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0114\u001f\u0001\u0000\u0000\u0000\u0115\u0116\u0007"+
		"\u0003\u0000\u0000\u0116!\u0001\u0000\u0000\u0000\u0117\u0119\u0005\r"+
		"\u0000\u0000\u0118\u011a\u0005Y\u0000\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011f\u0001\u0000\u0000"+
		"\u0000\u011b\u011d\u0005\u001e\u0000\u0000\u011c\u011e\u0005Y\u0000\u0000"+
		"\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000"+
		"\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011b\u0001\u0000\u0000\u0000"+
		"\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u012c\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u0005\u001e\u0000\u0000\u0122\u0124\u0005Y\u0000\u0000\u0123"+
		"\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124"+
		"\u0129\u0001\u0000\u0000\u0000\u0125\u0127\u0005\r\u0000\u0000\u0126\u0128"+
		"\u0005Y\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0125\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u0117\u0001\u0000\u0000\u0000\u012b\u0121\u0001"+
		"\u0000\u0000\u0000\u012c#\u0001\u0000\u0000\u0000\u012d\u012f\u0003\""+
		"\u0011\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0003&\u0013"+
		"\u0000\u0131%\u0001\u0000\u0000\u0000\u0132\u0133\u0007\u0004\u0000\u0000"+
		"\u0133\'\u0001\u0000\u0000\u0000\u0134\u0136\u0003\"\u0011\u0000\u0135"+
		"\u0134\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0003*\u0015\u0000\u0138)\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0007\u0005\u0000\u0000\u013a+\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0003\"\u0011\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0003.\u0017\u0000\u013f-\u0001\u0000\u0000\u0000\u0140"+
		"\u0141\u0007\u0006\u0000\u0000\u0141/\u0001\u0000\u0000\u0000\u0142\u0143"+
		"\u0007\u0007\u0000\u0000\u01431\u0001\u0000\u0000\u0000\u0144\u0145\u0007"+
		"\b\u0000\u0000\u01453\u0001\u0000\u0000\u0000\u0146\u0147\u0007\t\u0000"+
		"\u0000\u01475\u0001\u0000\u0000\u00007;?GKSX\\`fjmory}\u0084\u0088\u008e"+
		"\u0091\u0095\u009c\u00a1\u00a8\u00ad\u00b2\u00b5\u00b7\u00be\u00c2\u00c5"+
		"\u00c9\u00cd\u00cf\u00d7\u00de\u00e1\u00e7\u00eb\u00f0\u00f4\u00f9\u00fe"+
		"\u0106\u010c\u0113\u0119\u011d\u011f\u0123\u0127\u0129\u012b\u012e\u0135"+
		"\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}