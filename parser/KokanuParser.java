// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KokanuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, Comma=2, Colon=3, Period=4, A=5, In=6, Le=7, Men=8, O=9, Ta=10, 
		Te=11, We=12, Win=13, Wo=14, Lijule=15, Pese=16, Kapaja=17, Kilima=18, 
		Sito=19, Iman=20, Tasuwi=21, Akiki=22, Ukun=23, Aja=24, Sala=25, Talika=26, 
		Kapan=27, Kisa=28, Mu=29, Mata=30, Mutakin=31, Mita=32, Jasa=33, Jamin=34, 
		Apaki=35, Luwa=36, Konpa=37, Kela=38, Lika=39, Otota=40, Ka=41, Tisilin=42, 
		Janlu=43, Jamu=44, Pututi=45, Minuli=46, Oti=47, Kota=48, Pani=49, Unitu=50, 
		Loso=51, Kima=52, Pi=53, Anan=54, Tenkin=55, Patun=56, Sikin=57, Usen=58, 
		Panli=59, Tunti=60, Sinsi=61, Wanku=62, Papon=63, Junja=64, Jati=65, Unsi=66, 
		Nan=67, Ju=68, Anpipi=69, Mese=70, Ten=71, Puka=72, Kanisa=73, Pulusi=74, 
		Muwesi=75, Moto=76, Pankosi=77, Nula=78, Pela=79, Otan=80, Kujo=81, Tan=82, 
		Tun=83, Ela=84, Kemika=85, Po=86, Mani=87, No=88, Oke=89, Wan=90, Suwi=91, 
		Sin=92, Tati=93, Tolu=94, Lipu=95, Osa=96, Tomiwa=97, Pesuwan=98, Ken=99, 
		Tepu=100, Anwije=101, Lisi=102, Lan=103, Soto=104, Eme=105, Nin=106, Lijo=107, 
		Toki=108, An=109, Ato=110, Kumi=111, Kapu=112, Un=113, Polan=114, Wisan=115, 
		Mijalo=116, Neso=117, Kaso=118, Tawe=119, Konen=120, Kikuwa=121, Kiju=122, 
		Jone=123, Akoli=124, Mamaki=125, Lana=126, Wa=127, Ja=128, Wiki=129, Naki=130, 
		Sone=131, Katin=132, Kula=133, Kun=134, Kusa=135, Tanwa=136, Tipa=137, 
		Teka=138, Tile=139, Tusa=140, Tijante=141, Nankin=142, Nalan=143, Niwa=144, 
		Pite=145, Pasan=146, Pintu=147, Pula=148, Mepu=149, Luka=150, Laki=151, 
		Lekin=152, Wita=153, Saminta=154, Sanpanti=155, Saman=156, Satalan=157, 
		Sula=158, Sitija=159, Lima=160, Jan=161, Makan=162, Keke=163, Latito=164, 
		Ankolo=165, Poloko=166, Komo=167, Matiko=168, Mi=169, Nelo=170, Powele=171, 
		Peko=172, Sapole=173, Kate=174, Sopa=175, Suki=176, Osole=177, Umami=178, 
		Juka=179, Apijo=180, Niku=181, Musi=182, Kaki=183, Akasa=184, Tenti=185, 
		Kawa=186, Penpe=187, Kumon=188, Namu=189, Tuko=190, Tuwi=191, Olon=192, 
		Alu=193, Kuto=194, Kosan=195, Alijun=196, Tu=197, Wija=198, Asa=199, Kijata=200, 
		Malo=201, Sena=202, Leseka=203, Pintan=204, Inkatan=205, Ke=206, Pen=207, 
		San=208, Kuwan=209, Sipa=210, Sintuwan=211, Iwe=212, Pansin=213, Si=214, 
		Joli=215, Putun=216, Kuwosi=217, Tonsa=218, Kuwanko=219, Timi=220, Limijen=221, 
		Tajen=222, Kan=223, Na=224, Tunpu=225, Matuwa=226, Pa=227, Taka=228, Kali=229, 
		Tune=230, Tene=231, Namuna=232, Nile=233, Panta=234, Jon=235, Tonko=236, 
		Sunkan=237, Onja=238, Ukama=239, Koton=240, Mitin=241, Lito=242, Lamo=243, 
		Aluko=244, Konpute=245, Nepa=246, Kuku=247, Meja=248, Momu=249, Neje=250, 
		Pawo=251, Tutu=252, Ukiki=253, Wonpa=254, Peman=255, Napa=256, Nase=257, 
		Je=258, Jatan=259, Kisowa=260, Lenka=261, Pasu=262, Lansa=263, Menu=264, 
		Opotu=265, Uta=266, Maku=267, Pelete=268, Pitijo=269, Sapi=270, Ili=271, 
		Tula=272, Pata=273, Pumi=274, Matija=275, Waju=276, Salila=277, Sila=278, 
		Ko=279, Setan=280, Suwina=281, Samo=282, Tenja=283, Ipuwe=284, Muku=285, 
		Kalawa=286, Konje=287, Sa=288, Saka=289, Wala=290, Asete=291, Akala=292, 
		Amo=293, Kanta=294, Sekano=295, Sijen=296, Toso=297, Kenelo=298, Onko=299, 
		Umo=300, Pikante=301, Posa=302, Anta=303, Takuwa=304, Tawapu=305, Lanki=306, 
		Titi=307, Tiju=308, Tapala=309, Talili=310, Lipan=311, Lunti=312, Takilo=313, 
		Kalan=314, Ulokan=315, Etu=316, Kontatu=317, Nanku=318, Mulu=319, Watan=320, 
		Wili=321, Ani=322, Iputu=323, Tina=324, Ne=325, Titan=326, Pon=327, Pan=328, 
		Len=329, Santi=330, Sankan=331, One=332, Tanu=333, Sepo=334, Teneme=335, 
		Solu=336, Tope=337, Tamaka=338, Tuntan=339, Niju=340, Non=341, So=342, 
		Ewin=343, Enteken=344, Menwa=345, Sun=346, Muntu=347, Insu=348, Onton=349, 
		Kikolo=350, Lo=351, Tiku=352, Ikama=353, Inpali=354, Nenka=355;
	public static final int
		RULE_sentences = 0, RULE_sentence = 1, RULE_sentenceClause = 2, RULE_nounPhrase = 3, 
		RULE_modPhrase = 4, RULE_relativeVerbClause = 5, RULE_terminator = 6, 
		RULE_relativeClause = 7, RULE_verbPhrase = 8, RULE_quantityPhrase = 9, 
		RULE_prepClause = 10, RULE_contentWord = 11, RULE_expandedWord = 12, RULE_baseVerb = 13, 
		RULE_pronoun = 14, RULE_baseNoun = 15, RULE_baseModifier = 16, RULE_connector = 17, 
		RULE_relativeQuantity = 18, RULE_nominalQuantity = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentences", "sentence", "sentenceClause", "nounPhrase", "modPhrase", 
			"relativeVerbClause", "terminator", "relativeClause", "verbPhrase", "quantityPhrase", 
			"prepClause", "contentWord", "expandedWord", "baseVerb", "pronoun", "baseNoun", 
			"baseModifier", "connector", "relativeQuantity", "nominalQuantity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", null, "'.'", "'a'", "'in'", "'le'", "'men'", "'o'", 
			"'ta'", "'te'", "'we'", "'win'", "'wo'", "'lijule'", "'pese'", "'kapaja'", 
			"'kilima'", "'sito'", "'iman'", "'tasuwi'", "'akiki'", "'ukun'", "'aja'", 
			"'sala'", "'talika'", "'kapan'", "'kisa'", "'mu'", "'mata'", "'mutakin'", 
			"'mita'", "'jasa'", "'jamin'", "'apaki'", "'luwa'", "'konpa'", "'kela'", 
			"'lika'", "'otota'", "'ka'", "'tisilin'", "'janlu'", "'jamu'", "'pututi'", 
			"'minuli'", "'oti'", "'kota'", "'pani'", "'unitu'", "'loso'", "'kima'", 
			"'pi'", "'anan'", "'tenkin'", "'patun'", "'sikin'", "'usen'", "'panli'", 
			"'tunti'", "'sinsi'", "'wanku'", "'papon'", "'junja'", "'jati'", "'unsi'", 
			"'nan'", "'ju'", "'anpipi'", "'mese'", "'ten'", "'puka'", "'kanisa'", 
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
			null, "WS", "Comma", "Colon", "Period", "A", "In", "Le", "Men", "O", 
			"Ta", "Te", "We", "Win", "Wo", "Lijule", "Pese", "Kapaja", "Kilima", 
			"Sito", "Iman", "Tasuwi", "Akiki", "Ukun", "Aja", "Sala", "Talika", "Kapan", 
			"Kisa", "Mu", "Mata", "Mutakin", "Mita", "Jasa", "Jamin", "Apaki", "Luwa", 
			"Konpa", "Kela", "Lika", "Otota", "Ka", "Tisilin", "Janlu", "Jamu", "Pututi", 
			"Minuli", "Oti", "Kota", "Pani", "Unitu", "Loso", "Kima", "Pi", "Anan", 
			"Tenkin", "Patun", "Sikin", "Usen", "Panli", "Tunti", "Sinsi", "Wanku", 
			"Papon", "Junja", "Jati", "Unsi", "Nan", "Ju", "Anpipi", "Mese", "Ten", 
			"Puka", "Kanisa", "Pulusi", "Muwesi", "Moto", "Pankosi", "Nula", "Pela", 
			"Otan", "Kujo", "Tan", "Tun", "Ela", "Kemika", "Po", "Mani", "No", "Oke", 
			"Wan", "Suwi", "Sin", "Tati", "Tolu", "Lipu", "Osa", "Tomiwa", "Pesuwan", 
			"Ken", "Tepu", "Anwije", "Lisi", "Lan", "Soto", "Eme", "Nin", "Lijo", 
			"Toki", "An", "Ato", "Kumi", "Kapu", "Un", "Polan", "Wisan", "Mijalo", 
			"Neso", "Kaso", "Tawe", "Konen", "Kikuwa", "Kiju", "Jone", "Akoli", "Mamaki", 
			"Lana", "Wa", "Ja", "Wiki", "Naki", "Sone", "Katin", "Kula", "Kun", "Kusa", 
			"Tanwa", "Tipa", "Teka", "Tile", "Tusa", "Tijante", "Nankin", "Nalan", 
			"Niwa", "Pite", "Pasan", "Pintu", "Pula", "Mepu", "Luka", "Laki", "Lekin", 
			"Wita", "Saminta", "Sanpanti", "Saman", "Satalan", "Sula", "Sitija", 
			"Lima", "Jan", "Makan", "Keke", "Latito", "Ankolo", "Poloko", "Komo", 
			"Matiko", "Mi", "Nelo", "Powele", "Peko", "Sapole", "Kate", "Sopa", "Suki", 
			"Osole", "Umami", "Juka", "Apijo", "Niku", "Musi", "Kaki", "Akasa", "Tenti", 
			"Kawa", "Penpe", "Kumon", "Namu", "Tuko", "Tuwi", "Olon", "Alu", "Kuto", 
			"Kosan", "Alijun", "Tu", "Wija", "Asa", "Kijata", "Malo", "Sena", "Leseka", 
			"Pintan", "Inkatan", "Ke", "Pen", "San", "Kuwan", "Sipa", "Sintuwan", 
			"Iwe", "Pansin", "Si", "Joli", "Putun", "Kuwosi", "Tonsa", "Kuwanko", 
			"Timi", "Limijen", "Tajen", "Kan", "Na", "Tunpu", "Matuwa", "Pa", "Taka", 
			"Kali", "Tune", "Tene", "Namuna", "Nile", "Panta", "Jon", "Tonko", "Sunkan", 
			"Onja", "Ukama", "Koton", "Mitin", "Lito", "Lamo", "Aluko", "Konpute", 
			"Nepa", "Kuku", "Meja", "Momu", "Neje", "Pawo", "Tutu", "Ukiki", "Wonpa", 
			"Peman", "Napa", "Nase", "Je", "Jatan", "Kisowa", "Lenka", "Pasu", "Lansa", 
			"Menu", "Opotu", "Uta", "Maku", "Pelete", "Pitijo", "Sapi", "Ili", "Tula", 
			"Pata", "Pumi", "Matija", "Waju", "Salila", "Sila", "Ko", "Setan", "Suwina", 
			"Samo", "Tenja", "Ipuwe", "Muku", "Kalawa", "Konje", "Sa", "Saka", "Wala", 
			"Asete", "Akala", "Amo", "Kanta", "Sekano", "Sijen", "Toso", "Kenelo", 
			"Onko", "Umo", "Pikante", "Posa", "Anta", "Takuwa", "Tawapu", "Lanki", 
			"Titi", "Tiju", "Tapala", "Talili", "Lipan", "Lunti", "Takilo", "Kalan", 
			"Ulokan", "Etu", "Kontatu", "Nanku", "Mulu", "Watan", "Wili", "Ani", 
			"Iputu", "Tina", "Ne", "Titan", "Pon", "Pan", "Len", "Santi", "Sankan", 
			"One", "Tanu", "Sepo", "Teneme", "Solu", "Tope", "Tamaka", "Tuntan", 
			"Niju", "Non", "So", "Ewin", "Enteken", "Menwa", "Sun", "Muntu", "Insu", 
			"Onton", "Kikolo", "Lo", "Tiku", "Ikama", "Inpali", "Nenka"
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

	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode EOF() { return getToken(KokanuParser.EOF, 0); }
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
			setState(40);
			sentence();
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					match(Period);
					setState(42);
					sentence();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Period) {
				{
				setState(48);
				match(Period);
				}
			}

			setState(51);
			match(EOF);
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
			setState(53);
			sentenceClause();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tan || _la==Un || _la==Lekin || _la==Ili) {
				{
				{
				setState(54);
				connector();
				setState(55);
				sentenceClause();
				}
				}
				setState(61);
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

	public static class SentenceClauseContext extends ParserRuleContext {
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public List<PrepClauseContext> prepClause() {
			return getRuleContexts(PrepClauseContext.class);
		}
		public PrepClauseContext prepClause(int i) {
			return getRuleContext(PrepClauseContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Te) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Junja - 64)) | (1L << (Jati - 64)) | (1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Mese - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Nula - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Wan - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Lijo - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Ja - 128)) | (1L << (Wiki - 128)) | (1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Lima - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Olon - 192)) | (1L << (Alu - 192)) | (1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (San - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Napa - 256)) | (1L << (Nase - 256)) | (1L << (Jatan - 256)) | (1L << (Kisowa - 256)) | (1L << (Lenka - 256)) | (1L << (Pasu - 256)) | (1L << (Lansa - 256)) | (1L << (Menu - 256)) | (1L << (Opotu - 256)) | (1L << (Uta - 256)) | (1L << (Maku - 256)) | (1L << (Pelete - 256)) | (1L << (Pitijo - 256)) | (1L << (Sapi - 256)) | (1L << (Tula - 256)) | (1L << (Pata - 256)) | (1L << (Pumi - 256)) | (1L << (Matija - 256)) | (1L << (Waju - 256)) | (1L << (Salila - 256)) | (1L << (Sila - 256)) | (1L << (Ko - 256)) | (1L << (Setan - 256)) | (1L << (Suwina - 256)) | (1L << (Samo - 256)) | (1L << (Tenja - 256)) | (1L << (Ipuwe - 256)) | (1L << (Muku - 256)) | (1L << (Kalawa - 256)) | (1L << (Konje - 256)) | (1L << (Sa - 256)) | (1L << (Saka - 256)) | (1L << (Wala - 256)) | (1L << (Asete - 256)) | (1L << (Akala - 256)) | (1L << (Amo - 256)) | (1L << (Kanta - 256)) | (1L << (Sekano - 256)) | (1L << (Sijen - 256)) | (1L << (Toso - 256)) | (1L << (Kenelo - 256)) | (1L << (Onko - 256)) | (1L << (Umo - 256)) | (1L << (Pikante - 256)) | (1L << (Posa - 256)) | (1L << (Anta - 256)) | (1L << (Takuwa - 256)) | (1L << (Tawapu - 256)) | (1L << (Lanki - 256)) | (1L << (Titi - 256)) | (1L << (Tiju - 256)) | (1L << (Tapala - 256)) | (1L << (Talili - 256)) | (1L << (Lipan - 256)) | (1L << (Lunti - 256)) | (1L << (Takilo - 256)) | (1L << (Kalan - 256)) | (1L << (Ulokan - 256)) | (1L << (Etu - 256)) | (1L << (Kontatu - 256)) | (1L << (Nanku - 256)) | (1L << (Mulu - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Watan - 320)) | (1L << (Wili - 320)) | (1L << (Ani - 320)) | (1L << (Iputu - 320)) | (1L << (Tina - 320)) | (1L << (Ne - 320)) | (1L << (Titan - 320)) | (1L << (Pon - 320)) | (1L << (Len - 320)) | (1L << (Santi - 320)) | (1L << (Sankan - 320)) | (1L << (One - 320)) | (1L << (Tanu - 320)) | (1L << (Sepo - 320)) | (1L << (Teneme - 320)) | (1L << (Solu - 320)) | (1L << (Tope - 320)) | (1L << (Tamaka - 320)) | (1L << (Tuntan - 320)) | (1L << (Niju - 320)) | (1L << (Non - 320)) | (1L << (Ewin - 320)) | (1L << (Enteken - 320)) | (1L << (Menwa - 320)) | (1L << (Muntu - 320)) | (1L << (Insu - 320)) | (1L << (Onton - 320)) | (1L << (Kikolo - 320)) | (1L << (Lo - 320)) | (1L << (Tiku - 320)) | (1L << (Ikama - 320)) | (1L << (Inpali - 320)))) != 0)) {
				{
				setState(62);
				nounPhrase();
				}
			}

			setState(65);
			verbPhrase();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << In) | (1L << Men) | (1L << Ta) | (1L << Te) | (1L << Win))) != 0) || _la==Po || _la==An || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (Wija - 198)) | (1L << (Ke - 198)) | (1L << (Kan - 198)))) != 0) || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (So - 342)) | (1L << (Sun - 342)) | (1L << (Nenka - 342)))) != 0)) {
				{
				{
				setState(66);
				prepClause();
				}
				}
				setState(71);
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

	public static class NounPhraseContext extends ParserRuleContext {
		public RelativeVerbClauseContext relativeVerbClause() {
			return getRuleContext(RelativeVerbClauseContext.class,0);
		}
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public QuantityPhraseContext quantityPhrase() {
			return getRuleContext(QuantityPhraseContext.class,0);
		}
		public List<RelativeClauseContext> relativeClause() {
			return getRuleContexts(RelativeClauseContext.class);
		}
		public RelativeClauseContext relativeClause(int i) {
			return getRuleContext(RelativeClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(KokanuParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(KokanuParser.Comma, i);
		}
		public List<ModPhraseContext> modPhrase() {
			return getRuleContexts(ModPhraseContext.class);
		}
		public ModPhraseContext modPhrase(int i) {
			return getRuleContext(ModPhraseContext.class,i);
		}
		public NounPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nounPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterNounPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitNounPhrase(this);
		}
	}

	public final NounPhraseContext nounPhrase() throws RecognitionException {
		NounPhraseContext _localctx = new NounPhraseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nounPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(72);
				quantityPhrase();
				}
				break;
			}
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Te:
				{
				setState(75);
				relativeVerbClause();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(76);
					match(Comma);
					}
				}

				}
				break;
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
				setState(79);
				expandedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ta) | (1L << Te) | (1L << Wo) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Junja - 64)) | (1L << (Jati - 64)) | (1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Mese - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Nula - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Wan - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Lijo - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Ja - 128)) | (1L << (Wiki - 128)) | (1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Lima - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Olon - 192)) | (1L << (Alu - 192)) | (1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (San - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Napa - 256)) | (1L << (Nase - 256)) | (1L << (Je - 256)) | (1L << (Jatan - 256)) | (1L << (Kisowa - 256)) | (1L << (Lenka - 256)) | (1L << (Pasu - 256)) | (1L << (Lansa - 256)) | (1L << (Menu - 256)) | (1L << (Opotu - 256)) | (1L << (Uta - 256)) | (1L << (Maku - 256)) | (1L << (Pelete - 256)) | (1L << (Pitijo - 256)) | (1L << (Sapi - 256)) | (1L << (Tula - 256)) | (1L << (Pata - 256)) | (1L << (Pumi - 256)) | (1L << (Matija - 256)) | (1L << (Waju - 256)) | (1L << (Salila - 256)) | (1L << (Sila - 256)) | (1L << (Ko - 256)) | (1L << (Setan - 256)) | (1L << (Suwina - 256)) | (1L << (Samo - 256)) | (1L << (Tenja - 256)) | (1L << (Ipuwe - 256)) | (1L << (Muku - 256)) | (1L << (Kalawa - 256)) | (1L << (Konje - 256)) | (1L << (Sa - 256)) | (1L << (Saka - 256)) | (1L << (Wala - 256)) | (1L << (Asete - 256)) | (1L << (Akala - 256)) | (1L << (Amo - 256)) | (1L << (Kanta - 256)) | (1L << (Sekano - 256)) | (1L << (Sijen - 256)) | (1L << (Toso - 256)) | (1L << (Kenelo - 256)) | (1L << (Onko - 256)) | (1L << (Umo - 256)) | (1L << (Pikante - 256)) | (1L << (Posa - 256)) | (1L << (Anta - 256)) | (1L << (Takuwa - 256)) | (1L << (Tawapu - 256)) | (1L << (Lanki - 256)) | (1L << (Titi - 256)) | (1L << (Tiju - 256)) | (1L << (Tapala - 256)) | (1L << (Talili - 256)) | (1L << (Lipan - 256)) | (1L << (Lunti - 256)) | (1L << (Takilo - 256)) | (1L << (Kalan - 256)) | (1L << (Ulokan - 256)) | (1L << (Etu - 256)) | (1L << (Kontatu - 256)) | (1L << (Nanku - 256)) | (1L << (Mulu - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (Watan - 320)) | (1L << (Wili - 320)) | (1L << (Ani - 320)) | (1L << (Iputu - 320)) | (1L << (Tina - 320)) | (1L << (Ne - 320)) | (1L << (Titan - 320)) | (1L << (Pon - 320)) | (1L << (Len - 320)) | (1L << (Santi - 320)) | (1L << (Sankan - 320)) | (1L << (One - 320)) | (1L << (Tanu - 320)) | (1L << (Sepo - 320)) | (1L << (Teneme - 320)) | (1L << (Solu - 320)) | (1L << (Tope - 320)) | (1L << (Tamaka - 320)) | (1L << (Tuntan - 320)) | (1L << (Niju - 320)) | (1L << (Non - 320)) | (1L << (Ewin - 320)) | (1L << (Enteken - 320)) | (1L << (Menwa - 320)) | (1L << (Muntu - 320)) | (1L << (Insu - 320)) | (1L << (Onton - 320)) | (1L << (Kikolo - 320)) | (1L << (Lo - 320)) | (1L << (Tiku - 320)) | (1L << (Ikama - 320)) | (1L << (Inpali - 320)))) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(82);
					relativeClause();
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(83);
						match(Comma);
						}
					}

					}
					break;
				case 2:
					{
					setState(87); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(86);
							modPhrase();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(89); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				setState(95);
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

	public static class ModPhraseContext extends ParserRuleContext {
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public RelativeClauseContext relativeClause() {
			return getRuleContext(RelativeClauseContext.class,0);
		}
		public TerminalNode Je() { return getToken(KokanuParser.Je, 0); }
		public TerminalNode Wo() { return getToken(KokanuParser.Wo, 0); }
		public ModPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterModPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitModPhrase(this);
		}
	}

	public final ModPhraseContext modPhrase() throws RecognitionException {
		ModPhraseContext _localctx = new ModPhraseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modPhrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Wo || _la==Je) {
				{
				setState(96);
				_la = _input.LA(1);
				if ( !(_la==Wo || _la==Je) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(99);
				expandedWord();
				}
				break;
			case Ta:
			case Te:
				{
				setState(100);
				relativeClause();
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

	public static class RelativeVerbClauseContext extends ParserRuleContext {
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public List<RelativeClauseContext> relativeClause() {
			return getRuleContexts(RelativeClauseContext.class);
		}
		public RelativeClauseContext relativeClause(int i) {
			return getRuleContext(RelativeClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(KokanuParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(KokanuParser.Comma, i);
		}
		public List<PrepClauseContext> prepClause() {
			return getRuleContexts(PrepClauseContext.class);
		}
		public PrepClauseContext prepClause(int i) {
			return getRuleContext(PrepClauseContext.class,i);
		}
		public List<ModPhraseContext> modPhrase() {
			return getRuleContexts(ModPhraseContext.class);
		}
		public ModPhraseContext modPhrase(int i) {
			return getRuleContext(ModPhraseContext.class,i);
		}
		public RelativeVerbClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeVerbClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRelativeVerbClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRelativeVerbClause(this);
		}
	}

	public final RelativeVerbClauseContext relativeVerbClause() throws RecognitionException {
		RelativeVerbClauseContext _localctx = new RelativeVerbClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relativeVerbClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(Te);
			setState(104);
			expandedWord();
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(105);
						relativeClause();
						setState(107);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(106);
							match(Comma);
							}
							break;
						}
						}
						break;
					case 2:
						{
						setState(115); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								setState(115);
								_errHandler.sync(this);
								switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
								case 1:
									{
									setState(109);
									prepClause();
									}
									break;
								case 2:
									{
									setState(111); 
									_errHandler.sync(this);
									_alt = 1;
									do {
										switch (_alt) {
										case 1:
											{
											{
											setState(110);
											modPhrase();
											}
											}
											break;
										default:
											throw new NoViableAltException(this);
										}
										setState(113); 
										_errHandler.sync(this);
										_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
									} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
									}
									break;
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(117); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 12, RULE_terminator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (Comma - -1)) | (1L << (Period - -1)))) != 0)) ) {
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

	public static class RelativeClauseContext extends ParserRuleContext {
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public TerminalNode Ta() { return getToken(KokanuParser.Ta, 0); }
		public SentenceClauseContext sentenceClause() {
			return getRuleContext(SentenceClauseContext.class,0);
		}
		public RelativeVerbClauseContext relativeVerbClause() {
			return getRuleContext(RelativeVerbClauseContext.class,0);
		}
		public RelativeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterRelativeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitRelativeClause(this);
		}
	}

	public final RelativeClauseContext relativeClause() throws RecognitionException {
		RelativeClauseContext _localctx = new RelativeClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relativeClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ta:
				{
				setState(126);
				match(Ta);
				setState(127);
				sentenceClause();
				}
				break;
			case Te:
				{
				setState(128);
				relativeVerbClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(131);
			terminator();
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

	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode Le() { return getToken(KokanuParser.Le, 0); }
		public ContentWordContext contentWord() {
			return getRuleContext(ContentWordContext.class,0);
		}
		public ModPhraseContext modPhrase() {
			return getRuleContext(ModPhraseContext.class,0);
		}
		public TerminalNode O() { return getToken(KokanuParser.O, 0); }
		public VerbPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterVerbPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitVerbPhrase(this);
		}
	}

	public final VerbPhraseContext verbPhrase() throws RecognitionException {
		VerbPhraseContext _localctx = new VerbPhraseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verbPhrase);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Le:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(Le);
				setState(134);
				contentWord();
				setState(136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(135);
					modPhrase();
					}
					break;
				}
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(O);
				setState(139);
				contentWord();
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(140);
					modPhrase();
					}
					break;
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

	public static class QuantityPhraseContext extends ParserRuleContext {
		public RelativeQuantityContext relativeQuantity() {
			return getRuleContext(RelativeQuantityContext.class,0);
		}
		public List<NominalQuantityContext> nominalQuantity() {
			return getRuleContexts(NominalQuantityContext.class);
		}
		public NominalQuantityContext nominalQuantity(int i) {
			return getRuleContext(NominalQuantityContext.class,i);
		}
		public QuantityPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantityPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterQuantityPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitQuantityPhrase(this);
		}
	}

	public final QuantityPhraseContext quantityPhrase() throws RecognitionException {
		QuantityPhraseContext _localctx = new QuantityPhraseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_quantityPhrase);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Jati || _la==Mese || _la==Menu || _la==Ani || _la==Niju) {
				{
				setState(145);
				relativeQuantity();
				}
			}

			setState(149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(148);
					nominalQuantity();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class PrepClauseContext extends ParserRuleContext {
		public TerminalNode In() { return getToken(KokanuParser.In, 0); }
		public ExpandedWordContext expandedWord() {
			return getRuleContext(ExpandedWordContext.class,0);
		}
		public List<ModPhraseContext> modPhrase() {
			return getRuleContexts(ModPhraseContext.class);
		}
		public ModPhraseContext modPhrase(int i) {
			return getRuleContext(ModPhraseContext.class,i);
		}
		public RelativeClauseContext relativeClause() {
			return getRuleContext(RelativeClauseContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_prepClause);
		int _la;
		try {
			int _alt;
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(In);
				setState(154);
				expandedWord();
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(155);
						modPhrase();
						}
						} 
					}
					setState(160);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==In) {
					{
					setState(161);
					match(In);
					}
				}

				setState(164);
				relativeClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(Men);
				setState(166);
				expandedWord();
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						modPhrase();
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(Win);
				setState(174);
				expandedWord();
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						modPhrase();
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(Po);
				setState(182);
				expandedWord();
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						modPhrase();
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(An);
				setState(190);
				expandedWord();
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						modPhrase();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				match(Wija);
				setState(198);
				expandedWord();
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(199);
						modPhrase();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				match(Ke);
				setState(206);
				expandedWord();
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						modPhrase();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(213);
				match(Kan);
				setState(214);
				expandedWord();
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						modPhrase();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(221);
				match(So);
				setState(222);
				expandedWord();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						modPhrase();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(229);
				match(Sun);
				setState(230);
				expandedWord();
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						modPhrase();
						}
						} 
					}
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(237);
				match(Nenka);
				setState(238);
				expandedWord();
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(239);
						modPhrase();
						}
						} 
					}
					setState(244);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 22, RULE_contentWord);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Kapaja:
			case Sito:
			case Sala:
			case Talika:
			case Mata:
			case Mita:
			case Jasa:
			case Jamin:
			case Apaki:
			case Luwa:
			case Otota:
			case Oti:
			case Pani:
			case Sikin:
			case Sinsi:
			case Anpipi:
			case Ten:
			case Pulusi:
			case Muwesi:
			case Moto:
			case Kemika:
			case Mani:
			case Sin:
			case Tolu:
			case Lipu:
			case Osa:
			case Ken:
			case Lan:
			case Soto:
			case Nin:
			case Toki:
			case Kumi:
			case Polan:
			case Mijalo:
			case Tawe:
			case Kiju:
			case Jone:
			case Akoli:
			case Lana:
			case Wa:
			case Tanwa:
			case Tipa:
			case Pite:
			case Pintu:
			case Laki:
			case Jan:
			case Keke:
			case Latito:
			case Ankolo:
			case Poloko:
			case Komo:
			case Powele:
			case Sopa:
			case Niku:
			case Musi:
			case Kaki:
			case Akasa:
			case Kumon:
			case Namu:
			case Tuwi:
			case Alijun:
			case Malo:
			case Leseka:
			case Pintan:
			case Kuwan:
			case Sintuwan:
			case Pansin:
			case Kuwosi:
			case Limijen:
			case Matuwa:
			case Kali:
			case Namuna:
			case Onja:
			case Ukama:
			case Koton:
			case Mitin:
			case Konpute:
			case Kuku:
			case Meja:
			case Momu:
			case Neje:
			case Pawo:
			case Ukiki:
			case Lenka:
			case Pelete:
			case Pitijo:
			case Pumi:
			case Matija:
			case Waju:
			case Salila:
			case Sila:
			case Ko:
			case Suwina:
			case Ipuwe:
			case Muku:
			case Kalawa:
			case Wala:
			case Asete:
			case Kenelo:
			case Onko:
			case Umo:
			case Lanki:
			case Titi:
			case Tapala:
			case Talili:
			case Takilo:
			case Ulokan:
			case Watan:
			case Titan:
			case Tamaka:
			case Non:
			case Ewin:
			case Enteken:
			case Menwa:
			case Insu:
			case Ikama:
			case Inpali:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				baseNoun();
				}
				break;
			case Pese:
			case Kilima:
			case Iman:
			case Tasuwi:
			case Ukun:
			case Kisa:
			case Kela:
			case Lika:
			case Tisilin:
			case Kota:
			case Pi:
			case Anan:
			case Tenkin:
			case Papon:
			case Junja:
			case Nan:
			case Ju:
			case Kanisa:
			case Pela:
			case Tun:
			case Oke:
			case Pesuwan:
			case Ato:
			case Wisan:
			case Kun:
			case Teka:
			case Tijante:
			case Niwa:
			case Sitija:
			case Makan:
			case Sapole:
			case Suki:
			case Apijo:
			case Alu:
			case Kosan:
			case Inkatan:
			case Pen:
			case Iwe:
			case Putun:
			case Tajen:
			case Pa:
			case Tene:
			case Jon:
			case Peman:
			case Jatan:
			case Lansa:
			case Sapi:
			case Pata:
			case Akala:
			case Amo:
			case Kanta:
			case Posa:
			case Anta:
			case Takuwa:
			case Tawapu:
			case Kalan:
			case Kontatu:
			case Pon:
			case Teneme:
			case Solu:
			case Onton:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				baseVerb();
				}
				break;
			case Lijule:
			case Akiki:
			case Aja:
			case Kapan:
			case Mutakin:
			case Konpa:
			case Janlu:
			case Jamu:
			case Pututi:
			case Minuli:
			case Unitu:
			case Loso:
			case Kima:
			case Patun:
			case Panli:
			case Tunti:
			case Wanku:
			case Unsi:
			case Puka:
			case Pankosi:
			case Otan:
			case Kujo:
			case Ela:
			case Suwi:
			case Tati:
			case Tomiwa:
			case Tepu:
			case Anwije:
			case Lisi:
			case Eme:
			case Kapu:
			case Neso:
			case Kaso:
			case Konen:
			case Kikuwa:
			case Mamaki:
			case Wiki:
			case Naki:
			case Sone:
			case Katin:
			case Kula:
			case Kusa:
			case Tile:
			case Tusa:
			case Nankin:
			case Nalan:
			case Pasan:
			case Pula:
			case Mepu:
			case Luka:
			case Wita:
			case Saminta:
			case Sanpanti:
			case Saman:
			case Satalan:
			case Sula:
			case Matiko:
			case Nelo:
			case Kate:
			case Osole:
			case Umami:
			case Juka:
			case Tenti:
			case Kawa:
			case Penpe:
			case Tuko:
			case Olon:
			case Kuto:
			case Asa:
			case Kijata:
			case Sena:
			case Sipa:
			case Si:
			case Joli:
			case Tonsa:
			case Kuwanko:
			case Timi:
			case Tunpu:
			case Taka:
			case Tune:
			case Nile:
			case Panta:
			case Tonko:
			case Sunkan:
			case Lito:
			case Lamo:
			case Aluko:
			case Nepa:
			case Tutu:
			case Wonpa:
			case Napa:
			case Nase:
			case Kisowa:
			case Pasu:
			case Opotu:
			case Uta:
			case Maku:
			case Tula:
			case Samo:
			case Tenja:
			case Konje:
			case Sekano:
			case Pikante:
			case Lipan:
			case Lunti:
			case Mulu:
			case Wili:
			case Iputu:
			case Tina:
			case Len:
			case Santi:
			case Sankan:
			case One:
			case Tanu:
			case Sepo:
			case Tope:
			case Tuntan:
			case Muntu:
			case Kikolo:
			case Lo:
			case Tiku:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				baseModifier();
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
		enterRule(_localctx, 24, RULE_expandedWord);
		try {
			setState(256);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				pronoun();
				}
				break;
			case Jati:
			case Mese:
			case Menu:
			case Ani:
			case Niju:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				nominalQuantity();
				}
				break;
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
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				contentWord();
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

	public static class BaseVerbContext extends ParserRuleContext {
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
		enterRule(_localctx, 26, RULE_baseVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & ((1L << (Pese - 16)) | (1L << (Kilima - 16)) | (1L << (Iman - 16)) | (1L << (Tasuwi - 16)) | (1L << (Ukun - 16)) | (1L << (Kisa - 16)) | (1L << (Kela - 16)) | (1L << (Lika - 16)) | (1L << (Tisilin - 16)) | (1L << (Kota - 16)) | (1L << (Pi - 16)) | (1L << (Anan - 16)) | (1L << (Tenkin - 16)) | (1L << (Papon - 16)) | (1L << (Junja - 16)) | (1L << (Nan - 16)) | (1L << (Ju - 16)) | (1L << (Kanisa - 16)) | (1L << (Pela - 16)))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Tun - 83)) | (1L << (Oke - 83)) | (1L << (Pesuwan - 83)) | (1L << (Ato - 83)) | (1L << (Wisan - 83)) | (1L << (Kun - 83)) | (1L << (Teka - 83)) | (1L << (Tijante - 83)) | (1L << (Niwa - 83)))) != 0) || ((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (Sitija - 159)) | (1L << (Makan - 159)) | (1L << (Sapole - 159)) | (1L << (Suki - 159)) | (1L << (Apijo - 159)) | (1L << (Alu - 159)) | (1L << (Kosan - 159)) | (1L << (Inkatan - 159)) | (1L << (Pen - 159)) | (1L << (Iwe - 159)) | (1L << (Putun - 159)) | (1L << (Tajen - 159)))) != 0) || ((((_la - 227)) & ~0x3f) == 0 && ((1L << (_la - 227)) & ((1L << (Pa - 227)) | (1L << (Tene - 227)) | (1L << (Jon - 227)) | (1L << (Peman - 227)) | (1L << (Jatan - 227)) | (1L << (Lansa - 227)) | (1L << (Sapi - 227)) | (1L << (Pata - 227)))) != 0) || ((((_la - 292)) & ~0x3f) == 0 && ((1L << (_la - 292)) & ((1L << (Akala - 292)) | (1L << (Amo - 292)) | (1L << (Kanta - 292)) | (1L << (Posa - 292)) | (1L << (Anta - 292)) | (1L << (Takuwa - 292)) | (1L << (Tawapu - 292)) | (1L << (Kalan - 292)) | (1L << (Kontatu - 292)) | (1L << (Pon - 292)) | (1L << (Teneme - 292)) | (1L << (Solu - 292)) | (1L << (Onton - 292)))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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

	public static class BaseNounContext extends ParserRuleContext {
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
		enterRule(_localctx, 30, RULE_baseNoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Kapaja) | (1L << Sito) | (1L << Sala) | (1L << Talika) | (1L << Mata) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Otota) | (1L << Oti) | (1L << Pani) | (1L << Sikin) | (1L << Sinsi))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Anpipi - 69)) | (1L << (Ten - 69)) | (1L << (Pulusi - 69)) | (1L << (Muwesi - 69)) | (1L << (Moto - 69)) | (1L << (Kemika - 69)) | (1L << (Mani - 69)) | (1L << (Sin - 69)) | (1L << (Tolu - 69)) | (1L << (Lipu - 69)) | (1L << (Osa - 69)) | (1L << (Ken - 69)) | (1L << (Lan - 69)) | (1L << (Soto - 69)) | (1L << (Nin - 69)) | (1L << (Toki - 69)) | (1L << (Kumi - 69)) | (1L << (Polan - 69)) | (1L << (Mijalo - 69)) | (1L << (Tawe - 69)) | (1L << (Kiju - 69)) | (1L << (Jone - 69)) | (1L << (Akoli - 69)) | (1L << (Lana - 69)) | (1L << (Wa - 69)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (Tanwa - 136)) | (1L << (Tipa - 136)) | (1L << (Pite - 136)) | (1L << (Pintu - 136)) | (1L << (Laki - 136)) | (1L << (Jan - 136)) | (1L << (Keke - 136)) | (1L << (Latito - 136)) | (1L << (Ankolo - 136)) | (1L << (Poloko - 136)) | (1L << (Komo - 136)) | (1L << (Powele - 136)) | (1L << (Sopa - 136)) | (1L << (Niku - 136)) | (1L << (Musi - 136)) | (1L << (Kaki - 136)) | (1L << (Akasa - 136)) | (1L << (Kumon - 136)) | (1L << (Namu - 136)) | (1L << (Tuwi - 136)) | (1L << (Alijun - 136)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (Malo - 201)) | (1L << (Leseka - 201)) | (1L << (Pintan - 201)) | (1L << (Kuwan - 201)) | (1L << (Sintuwan - 201)) | (1L << (Pansin - 201)) | (1L << (Kuwosi - 201)) | (1L << (Limijen - 201)) | (1L << (Matuwa - 201)) | (1L << (Kali - 201)) | (1L << (Namuna - 201)) | (1L << (Onja - 201)) | (1L << (Ukama - 201)) | (1L << (Koton - 201)) | (1L << (Mitin - 201)) | (1L << (Konpute - 201)) | (1L << (Kuku - 201)) | (1L << (Meja - 201)) | (1L << (Momu - 201)) | (1L << (Neje - 201)) | (1L << (Pawo - 201)) | (1L << (Ukiki - 201)) | (1L << (Lenka - 201)))) != 0) || ((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (Pelete - 268)) | (1L << (Pitijo - 268)) | (1L << (Pumi - 268)) | (1L << (Matija - 268)) | (1L << (Waju - 268)) | (1L << (Salila - 268)) | (1L << (Sila - 268)) | (1L << (Ko - 268)) | (1L << (Suwina - 268)) | (1L << (Ipuwe - 268)) | (1L << (Muku - 268)) | (1L << (Kalawa - 268)) | (1L << (Wala - 268)) | (1L << (Asete - 268)) | (1L << (Kenelo - 268)) | (1L << (Onko - 268)) | (1L << (Umo - 268)) | (1L << (Lanki - 268)) | (1L << (Titi - 268)) | (1L << (Tapala - 268)) | (1L << (Talili - 268)) | (1L << (Takilo - 268)) | (1L << (Ulokan - 268)) | (1L << (Watan - 268)) | (1L << (Titan - 268)))) != 0) || ((((_la - 338)) & ~0x3f) == 0 && ((1L << (_la - 338)) & ((1L << (Tamaka - 338)) | (1L << (Non - 338)) | (1L << (Ewin - 338)) | (1L << (Enteken - 338)) | (1L << (Menwa - 338)) | (1L << (Insu - 338)) | (1L << (Ikama - 338)) | (1L << (Inpali - 338)))) != 0)) ) {
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

	public static class BaseModifierContext extends ParserRuleContext {
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
		enterRule(_localctx, 32, RULE_baseModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lijule) | (1L << Akiki) | (1L << Aja) | (1L << Kapan) | (1L << Mutakin) | (1L << Konpa) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Patun) | (1L << Panli) | (1L << Tunti) | (1L << Wanku))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Unsi - 66)) | (1L << (Puka - 66)) | (1L << (Pankosi - 66)) | (1L << (Otan - 66)) | (1L << (Kujo - 66)) | (1L << (Ela - 66)) | (1L << (Suwi - 66)) | (1L << (Tati - 66)) | (1L << (Tomiwa - 66)) | (1L << (Tepu - 66)) | (1L << (Anwije - 66)) | (1L << (Lisi - 66)) | (1L << (Eme - 66)) | (1L << (Kapu - 66)) | (1L << (Neso - 66)) | (1L << (Kaso - 66)) | (1L << (Konen - 66)) | (1L << (Kikuwa - 66)) | (1L << (Mamaki - 66)) | (1L << (Wiki - 66)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (Naki - 130)) | (1L << (Sone - 130)) | (1L << (Katin - 130)) | (1L << (Kula - 130)) | (1L << (Kusa - 130)) | (1L << (Tile - 130)) | (1L << (Tusa - 130)) | (1L << (Nankin - 130)) | (1L << (Nalan - 130)) | (1L << (Pasan - 130)) | (1L << (Pula - 130)) | (1L << (Mepu - 130)) | (1L << (Luka - 130)) | (1L << (Wita - 130)) | (1L << (Saminta - 130)) | (1L << (Sanpanti - 130)) | (1L << (Saman - 130)) | (1L << (Satalan - 130)) | (1L << (Sula - 130)) | (1L << (Matiko - 130)) | (1L << (Nelo - 130)) | (1L << (Kate - 130)) | (1L << (Osole - 130)) | (1L << (Umami - 130)) | (1L << (Juka - 130)) | (1L << (Tenti - 130)) | (1L << (Kawa - 130)) | (1L << (Penpe - 130)) | (1L << (Tuko - 130)) | (1L << (Olon - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (Kuto - 194)) | (1L << (Asa - 194)) | (1L << (Kijata - 194)) | (1L << (Sena - 194)) | (1L << (Sipa - 194)) | (1L << (Si - 194)) | (1L << (Joli - 194)) | (1L << (Tonsa - 194)) | (1L << (Kuwanko - 194)) | (1L << (Timi - 194)) | (1L << (Tunpu - 194)) | (1L << (Taka - 194)) | (1L << (Tune - 194)) | (1L << (Nile - 194)) | (1L << (Panta - 194)) | (1L << (Tonko - 194)) | (1L << (Sunkan - 194)) | (1L << (Lito - 194)) | (1L << (Lamo - 194)) | (1L << (Aluko - 194)) | (1L << (Nepa - 194)) | (1L << (Tutu - 194)) | (1L << (Wonpa - 194)) | (1L << (Napa - 194)) | (1L << (Nase - 194)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (Kisowa - 260)) | (1L << (Pasu - 260)) | (1L << (Opotu - 260)) | (1L << (Uta - 260)) | (1L << (Maku - 260)) | (1L << (Tula - 260)) | (1L << (Samo - 260)) | (1L << (Tenja - 260)) | (1L << (Konje - 260)) | (1L << (Sekano - 260)) | (1L << (Pikante - 260)) | (1L << (Lipan - 260)) | (1L << (Lunti - 260)) | (1L << (Mulu - 260)) | (1L << (Wili - 260)) | (1L << (Iputu - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (Tina - 324)) | (1L << (Len - 324)) | (1L << (Santi - 324)) | (1L << (Sankan - 324)) | (1L << (One - 324)) | (1L << (Tanu - 324)) | (1L << (Sepo - 324)) | (1L << (Tope - 324)) | (1L << (Tuntan - 324)) | (1L << (Muntu - 324)) | (1L << (Kikolo - 324)) | (1L << (Lo - 324)) | (1L << (Tiku - 324)))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_connector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 36, RULE_relativeQuantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 38, RULE_nominalQuantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Nula - 78)) | (1L << (Wan - 78)) | (1L << (Lijo - 78)))) != 0) || _la==Lima || _la==San || ((((_la - 280)) & ~0x3f) == 0 && ((1L << (_la - 280)) & ((1L << (Setan - 280)) | (1L << (Saka - 280)) | (1L << (Sijen - 280)) | (1L << (Toso - 280)) | (1L << (Tiju - 280)) | (1L << (Etu - 280)) | (1L << (Nanku - 280)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0165\u0113\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3"+
		"\2\5\2\64\n\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\5\4"+
		"B\n\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\5\5\5L\n\5\3\5\3\5\5\5P\n\5\3"+
		"\5\5\5S\n\5\3\5\3\5\5\5W\n\5\3\5\6\5Z\n\5\r\5\16\5[\7\5^\n\5\f\5\16\5"+
		"a\13\5\3\6\5\6d\n\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7"+
		"\6\7r\n\7\r\7\16\7s\6\7v\n\7\r\7\16\7w\7\7z\n\7\f\7\16\7}\13\7\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u0084\n\t\3\t\3\t\3\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3"+
		"\n\5\n\u0090\n\n\5\n\u0092\n\n\3\13\5\13\u0095\n\13\3\13\6\13\u0098\n"+
		"\13\r\13\16\13\u0099\3\f\3\f\3\f\7\f\u009f\n\f\f\f\16\f\u00a2\13\f\3\f"+
		"\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\f\3"+
		"\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\f\3\f\3\f\7\f\u00bb\n\f\f\f"+
		"\16\f\u00be\13\f\3\f\3\f\3\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\3\f\3\f"+
		"\3\f\7\f\u00cb\n\f\f\f\16\f\u00ce\13\f\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16"+
		"\f\u00d6\13\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f\3\f\3"+
		"\f\7\f\u00e3\n\f\f\f\16\f\u00e6\13\f\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16"+
		"\f\u00ee\13\f\3\f\3\f\3\f\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f\5\f\u00f8"+
		"\n\f\3\r\3\r\3\r\5\r\u00fd\n\r\3\16\3\16\3\16\3\16\5\16\u0103\n\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\13\4\2\20\20\u0104"+
		"\u0104\4\3\4\4\6\6\63\2\22\22\24\24\26\27\31\31\36\36(),,\62\62\679AB"+
		"EFKKQQUU[[ddppuu\u0088\u0088\u008c\u008c\u008f\u008f\u0092\u0092\u00a1"+
		"\u00a1\u00a4\u00a4\u00af\u00af\u00b2\u00b2\u00b6\u00b6\u00c3\u00c3\u00c5"+
		"\u00c5\u00cf\u00cf\u00d1\u00d1\u00d6\u00d6\u00da\u00da\u00e0\u00e0\u00e5"+
		"\u00e5\u00e9\u00e9\u00ed\u00ed\u0101\u0101\u0105\u0105\u0109\u0109\u0110"+
		"\u0110\u0113\u0113\u0126\u0128\u0130\u0133\u013c\u013c\u013f\u013f\u0149"+
		"\u0149\u0151\u0152\u015f\u015f\n\2++<<\u0082\u0082\u00ab\u00ab\u00c7\u00c7"+
		"\u00e2\u00e2\u0122\u0122\u0147\u0147I\2\23\23\25\25\33\34  \"&**\61\61"+
		"\63\63;;??GGIILNWWYY^^`beeijllnnqqttvvyy|~\u0080\u0081\u008a\u008b\u0093"+
		"\u0093\u0095\u0095\u0099\u0099\u00a3\u00a3\u00a5\u00a9\u00ad\u00ad\u00b1"+
		"\u00b1\u00b7\u00ba\u00be\u00bf\u00c1\u00c1\u00c6\u00c6\u00cb\u00cb\u00cd"+
		"\u00ce\u00d3\u00d3\u00d5\u00d5\u00d7\u00d7\u00db\u00db\u00df\u00df\u00e4"+
		"\u00e4\u00e7\u00e7\u00ea\u00ea\u00f0\u00f3\u00f7\u00f7\u00f9\u00fd\u00ff"+
		"\u00ff\u0107\u0107\u010e\u010f\u0114\u0119\u011b\u011b\u011e\u0120\u0124"+
		"\u0125\u012c\u012e\u0134\u0135\u0137\u0138\u013b\u013b\u013d\u013d\u0142"+
		"\u0142\u0148\u0148\u0154\u0154\u0157\u0157\u0159\u015b\u015e\u015e\u0163"+
		"\u0164J\2\21\21\30\30\32\32\35\35!!\'\'-\60\64\66::=>@@DDJJOORSVV]]__"+
		"ccfhkkrrwxz{\177\177\u0083\u0087\u0089\u0089\u008d\u008e\u0090\u0091\u0094"+
		"\u0094\u0096\u0098\u009b\u00a0\u00aa\u00aa\u00ac\u00ac\u00b0\u00b0\u00b3"+
		"\u00b5\u00bb\u00bd\u00c0\u00c0\u00c2\u00c2\u00c4\u00c4\u00c9\u00ca\u00cc"+
		"\u00cc\u00d4\u00d4\u00d8\u00d9\u00dc\u00de\u00e3\u00e3\u00e6\u00e6\u00e8"+
		"\u00e8\u00eb\u00ec\u00ee\u00ef\u00f4\u00f6\u00f8\u00f8\u00fe\u00fe\u0100"+
		"\u0100\u0102\u0103\u0106\u0106\u0108\u0108\u010b\u010d\u0112\u0112\u011c"+
		"\u011d\u0121\u0121\u0129\u0129\u012f\u012f\u0139\u013a\u0141\u0141\u0143"+
		"\u0143\u0145\u0146\u014b\u0150\u0153\u0153\u0155\u0155\u015d\u015d\u0160"+
		"\u0162\6\2TTss\u009a\u009a\u0111\u0111\7\2CCHH\u010a\u010a\u0144\u0144"+
		"\u0156\u0156\r\2PP\\\\mm\u00a2\u00a2\u00d2\u00d2\u011a\u011a\u0123\u0123"+
		"\u012a\u012b\u0136\u0136\u013e\u013e\u0140\u0140\2\u0134\2*\3\2\2\2\4"+
		"\67\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nc\3\2\2\2\fi\3\2\2\2\16~\3\2\2\2\20"+
		"\u0083\3\2\2\2\22\u0091\3\2\2\2\24\u0094\3\2\2\2\26\u00f7\3\2\2\2\30\u00fc"+
		"\3\2\2\2\32\u0102\3\2\2\2\34\u0104\3\2\2\2\36\u0106\3\2\2\2 \u0108\3\2"+
		"\2\2\"\u010a\3\2\2\2$\u010c\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2*/\5"+
		"\4\3\2+,\7\6\2\2,.\5\4\3\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2"+
		"\60\63\3\2\2\2\61/\3\2\2\2\62\64\7\6\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64"+
		"\65\3\2\2\2\65\66\7\2\2\3\66\3\3\2\2\2\67=\5\6\4\289\5$\23\29:\5\6\4\2"+
		":<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2"+
		"\2@B\5\b\5\2A@\3\2\2\2AB\3\2\2\2BC\3\2\2\2CG\5\22\n\2DF\5\26\f\2ED\3\2"+
		"\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IG\3\2\2\2JL\5\24\13\2KJ"+
		"\3\2\2\2KL\3\2\2\2LR\3\2\2\2MO\5\f\7\2NP\7\4\2\2ON\3\2\2\2OP\3\2\2\2P"+
		"S\3\2\2\2QS\5\32\16\2RM\3\2\2\2RQ\3\2\2\2S_\3\2\2\2TV\5\20\t\2UW\7\4\2"+
		"\2VU\3\2\2\2VW\3\2\2\2W^\3\2\2\2XZ\5\n\6\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2"+
		"\2[\\\3\2\2\2\\^\3\2\2\2]T\3\2\2\2]Y\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`\t\3\2\2\2a_\3\2\2\2bd\t\2\2\2cb\3\2\2\2cd\3\2\2\2dg\3\2\2\2eh\5"+
		"\32\16\2fh\5\20\t\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\7\r\2\2j{\5\32\16"+
		"\2km\5\20\t\2ln\7\4\2\2ml\3\2\2\2mn\3\2\2\2nz\3\2\2\2ov\5\26\f\2pr\5\n"+
		"\6\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uo\3\2\2\2uq\3\2"+
		"\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yk\3\2\2\2yu\3\2\2\2z}\3\2"+
		"\2\2{y\3\2\2\2{|\3\2\2\2|\r\3\2\2\2}{\3\2\2\2~\177\t\3\2\2\177\17\3\2"+
		"\2\2\u0080\u0081\7\f\2\2\u0081\u0084\5\6\4\2\u0082\u0084\5\f\7\2\u0083"+
		"\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\16"+
		"\b\2\u0086\21\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u008a\5\30\r\2\u0089\u008b"+
		"\5\n\6\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0092\3\2\2\2\u008c"+
		"\u008d\7\13\2\2\u008d\u008f\5\30\r\2\u008e\u0090\5\n\6\2\u008f\u008e\3"+
		"\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u0087\3\2\2\2\u0091"+
		"\u008c\3\2\2\2\u0092\23\3\2\2\2\u0093\u0095\5&\24\2\u0094\u0093\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\5(\25\2\u0097\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\25\3\2\2\2\u009b\u009c\7\b\2\2\u009c\u00a0\5\32\16\2\u009d\u009f\5\n"+
		"\6\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00f8\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7\b"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00f8\5\20\t\2\u00a7\u00a8\7\n\2\2\u00a8\u00ac\5\32\16\2\u00a9\u00ab"+
		"\5\n\6\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00f8\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\17"+
		"\2\2\u00b0\u00b4\5\32\16\2\u00b1\u00b3\5\n\6\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00f8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7X\2\2\u00b8\u00bc\5\32\16\2\u00b9"+
		"\u00bb\5\n\6\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00f8\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"\u00c0\7o\2\2\u00c0\u00c4\5\32\16\2\u00c1\u00c3\5\n\6\2\u00c2\u00c1\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00f8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\u00c8\2\2\u00c8\u00cc"+
		"\5\32\16\2\u00c9\u00cb\5\n\6\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2"+
		"\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00f8\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d0\7\u00d0\2\2\u00d0\u00d4\5\32\16\2\u00d1\u00d3\5\n"+
		"\6\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00f8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\u00e1"+
		"\2\2\u00d8\u00dc\5\32\16\2\u00d9\u00db\5\n\6\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00f8\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\u0158\2\2\u00e0\u00e4\5\32\16\2"+
		"\u00e1\u00e3\5\n\6\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00f8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7\u015c\2\2\u00e8\u00ec\5\32\16\2\u00e9\u00eb\5\n\6\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f8\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\u0165\2\2\u00f0\u00f4"+
		"\5\32\16\2\u00f1\u00f3\5\n\6\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u009b\3\2\2\2\u00f7\u00a4\3\2\2\2\u00f7\u00a7\3\2\2\2\u00f7"+
		"\u00af\3\2\2\2\u00f7\u00b7\3\2\2\2\u00f7\u00bf\3\2\2\2\u00f7\u00c7\3\2"+
		"\2\2\u00f7\u00cf\3\2\2\2\u00f7\u00d7\3\2\2\2\u00f7\u00df\3\2\2\2\u00f7"+
		"\u00e7\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f8\27\3\2\2\2\u00f9\u00fd\5 \21"+
		"\2\u00fa\u00fd\5\34\17\2\u00fb\u00fd\5\"\22\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\31\3\2\2\2\u00fe\u0103\5\36\20"+
		"\2\u00ff\u0103\5&\24\2\u0100\u0103\5(\25\2\u0101\u0103\5\30\r\2\u0102"+
		"\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2"+
		"\2\2\u0103\33\3\2\2\2\u0104\u0105\t\4\2\2\u0105\35\3\2\2\2\u0106\u0107"+
		"\t\5\2\2\u0107\37\3\2\2\2\u0108\u0109\t\6\2\2\u0109!\3\2\2\2\u010a\u010b"+
		"\t\7\2\2\u010b#\3\2\2\2\u010c\u010d\t\b\2\2\u010d%\3\2\2\2\u010e\u010f"+
		"\t\t\2\2\u010f\'\3\2\2\2\u0110\u0111\t\n\2\2\u0111)\3\2\2\2+/\63=AGKO"+
		"RV[]_cgmsuwy{\u0083\u008a\u008f\u0091\u0094\u0099\u00a0\u00a4\u00ac\u00b4"+
		"\u00bc\u00c4\u00cc\u00d4\u00dc\u00e4\u00ec\u00f4\u00f7\u00fc\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}