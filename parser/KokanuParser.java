// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A=1, In=2, Le=3, Men=4, O=5, Ta=6, Te=7, We=8, Win=9, Wo=10, Lijule=11, 
		Pese=12, Kapaja=13, Kilima=14, Sito=15, Iman=16, Tasuwi=17, Akiki=18, 
		Ukun=19, Aja=20, Sala=21, Talika=22, Kapan=23, Kisa=24, Mu=25, Mata=26, 
		Mutakin=27, Mita=28, Jasa=29, Jamin=30, Apaki=31, Luwa=32, Konpa=33, Kela=34, 
		Lika=35, Otota=36, Ka=37, Tisilin=38, Janlu=39, Jamu=40, Pututi=41, Minuli=42, 
		Oti=43, Kota=44, Pani=45, Unitu=46, Loso=47, Kima=48, Pi=49, Anan=50, 
		Tenkin=51, Patun=52, Sikin=53, Usen=54, Panli=55, Tunti=56, Sinsi=57, 
		Wanku=58, Papon=59, Junja=60, Jati=61, Unsi=62, Nan=63, Ju=64, Anpipi=65, 
		Mese=66, Ten=67, Puka=68, Kanisa=69, Pulusi=70, Muwesi=71, Moto=72, Pankosi=73, 
		Nula=74, Pela=75, Otan=76, Kujo=77, Tan=78, Tun=79, Ela=80, Kemika=81, 
		Po=82, Mani=83, No=84, Oke=85, Wan=86, Suwi=87, Sin=88, Tati=89, Tolu=90, 
		Lipu=91, Osa=92, Tomiwa=93, Pesuwan=94, Ken=95, Tepu=96, Anwije=97, Lisi=98, 
		Lan=99, Soto=100, Eme=101, Nin=102, Lijo=103, Toki=104, An=105, Ato=106, 
		Kumi=107, Kapu=108, Un=109, Polan=110, Wisan=111, Mijalo=112, Neso=113, 
		Kaso=114, Tawe=115, Konen=116, Kikuwa=117, Kiju=118, Jone=119, Akoli=120, 
		Mamaki=121, Lana=122, Wa=123, Ja=124, Wiki=125, Naki=126, Sone=127, Katin=128, 
		Kula=129, Kun=130, Kusa=131, Tanwa=132, Tipa=133, Teka=134, Tile=135, 
		Tusa=136, Tijante=137, Nankin=138, Nalan=139, Niwa=140, Pite=141, Pasan=142, 
		Pintu=143, Pula=144, Mepu=145, Luka=146, Laki=147, Lekin=148, Wita=149, 
		Saminta=150, Sanpanti=151, Saman=152, Satalan=153, Sula=154, Sitija=155, 
		Lima=156, Jan=157, Makan=158, Keke=159, Latito=160, Ankolo=161, Poloko=162, 
		Komo=163, Matiko=164, Mi=165, Nelo=166, Powele=167, Peko=168, Sapole=169, 
		Kate=170, Sopa=171, Suki=172, Osole=173, Umami=174, Juka=175, Apijo=176, 
		Niku=177, Musi=178, Kaki=179, Akasa=180, Tenti=181, Kawa=182, Penpe=183, 
		Kumon=184, Namu=185, Tuko=186, Tuwi=187, Olon=188, Alu=189, Kuto=190, 
		Kosan=191, Alijun=192, Tu=193, Wija=194, Asa=195, Kijata=196, Malo=197, 
		Sena=198, Leseka=199, Pintan=200, Inkatan=201, Ke=202, Pen=203, San=204, 
		Kuwan=205, Sipa=206, Sintuwan=207, Iwe=208, Pansin=209, Si=210, Joli=211, 
		Putun=212, Kuwosi=213, Tonsa=214, Kuwanko=215, Timi=216, Limijen=217, 
		Tajen=218, Kan=219, Na=220, Tunpu=221, Matuwa=222, Pa=223, Taka=224, Kali=225, 
		Tune=226, Tene=227, Namuna=228, Nile=229, Panta=230, Jon=231, Tonko=232, 
		Sunkan=233, Onja=234, Ukama=235, Koton=236, Mitin=237, Lito=238, Lamo=239, 
		Aluko=240, Konpute=241, Nepa=242, Kuku=243, Meja=244, Momu=245, Neje=246, 
		Pawo=247, Tutu=248, Ukiki=249, Wonpa=250, Peman=251, Napa=252, Nase=253, 
		Je=254, Jatan=255, Kisowa=256, Lenka=257, Pasu=258, Lansa=259, Menu=260, 
		Opotu=261, Uta=262, Maku=263, Pelete=264, Pitijo=265, Sapi=266, Ili=267, 
		Tula=268, Pata=269, Pumi=270, Matija=271, Waju=272, Salila=273, Sila=274, 
		Ko=275, Setan=276, Suwina=277, Samo=278, Tenja=279, Ipuwe=280, Muku=281, 
		Kalawa=282, Konje=283, Sa=284, Saka=285, Wala=286, Asete=287, Akala=288, 
		Amo=289, Kanta=290, Sekano=291, Sijen=292, Toso=293, Kenelo=294, Onko=295, 
		Umo=296, Pikante=297, Posa=298, Anta=299, Takuwa=300, Tawapu=301, Lanki=302, 
		Titi=303, Tiju=304, Tapala=305, Talili=306, Lipan=307, Lunti=308, Takilo=309, 
		Kalan=310, Ulokan=311, Etu=312, Kontatu=313, Nanku=314, Mulu=315, Watan=316, 
		Wili=317, Ani=318, Iputu=319, Tina=320, Ne=321, Titan=322, Pon=323, Pan=324, 
		Len=325, Santi=326, Sankan=327, One=328, Tanu=329, Sepo=330, Teneme=331, 
		Solu=332, Tope=333, Tamaka=334, Tuntan=335, Niju=336, Non=337, So=338, 
		Ewin=339, Enteken=340, Menwa=341, Sun=342, Muntu=343, Insu=344, Onton=345, 
		Kikolo=346, Lo=347, Tiku=348, Ikama=349, Inpali=350, Nenka=351, ContentWord=352, 
		BaseVerb=353, BaseNoun=354, BaseModifier=355, Preposition=356, Connector=357, 
		Quantity=358;
	public static final int
		RULE_sentence = 0, RULE_leadingSubject = 1, RULE_modifiers = 2, RULE_adjectiveClause = 3, 
		RULE_verb = 4, RULE_prepositions = 5, RULE_noun = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "leadingSubject", "modifiers", "adjectiveClause", "verb", 
			"prepositions", "noun"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'a'", "'in'", "'le'", "'men'", "'o'", "'ta'", "'te'", "'we'", 
			"'win'", "'wo'", "'lijule'", "'pese'", "'kapaja'", "'kilima'", "'sito'", 
			"'iman'", "'tasuwi'", "'akiki'", "'ukun'", "'aja'", "'sala'", "'talika'", 
			"'kapan'", "'kisa'", "'mu'", "'mata'", "'mutakin'", "'mita'", "'jasa'", 
			"'jamin'", "'apaki'", "'luwa'", "'konpa'", "'kela'", "'lika'", "'otota'", 
			"'ka'", "'tisilin'", "'janlu'", "'jamu'", "'pututi'", "'minuli'", "'oti'", 
			"'kota'", "'pani'", "'unitu'", "'loso'", "'kima'", "'pi'", "'anan'", 
			"'tenkin'", "'patun'", "'sikin'", "'usen'", "'panli'", "'tunti'", "'sinsi'", 
			"'wanku'", "'papon'", "'junja'", "'jati'", "'unsi'", "'nan'", "'ju'", 
			"'anpipi'", "'mese'", "'ten'", "'puka'", "'kanisa'", "'pulusi'", "'muwesi'", 
			"'moto'", "'pankosi'", "'nula'", "'pela'", "'otan'", "'kujo'", "'tan'", 
			"'tun'", "'ela'", "'kemika'", "'po'", "'mani'", "'no'", "'oke'", "'wan'", 
			"'suwi'", "'sin'", "'tati'", "'tolu'", "'lipu'", "'osa'", "'tomiwa'", 
			"'pesuwan'", "'ken'", "'tepu'", "'anwije'", "'lisi'", "'lan'", "'soto'", 
			"'eme'", "'nin'", "'lijo'", "'toki'", "'an'", "'ato'", "'kumi'", "'kapu'", 
			"'un'", "'polan'", "'wisan'", "'mijalo'", "'neso'", "'kaso'", "'tawe'", 
			"'konen'", "'kikuwa'", "'kiju'", "'jone'", "'akoli'", "'mamaki'", "'lana'", 
			"'wa'", "'ja'", "'wiki'", "'naki'", "'sone'", "'katin'", "'kula'", "'kun'", 
			"'kusa'", "'tanwa'", "'tipa'", "'teka'", "'tile'", "'tusa'", "'tijante'", 
			"'nankin'", "'nalan'", "'niwa'", "'pite'", "'pasan'", "'pintu'", "'pula'", 
			"'mepu'", "'luka'", "'laki'", "'lekin'", "'wita'", "'saminta'", "'sanpanti'", 
			"'saman'", "'satalan'", "'sula'", "'sitija'", "'lima'", "'jan'", "'makan'", 
			"'keke'", "'latito'", "'ankolo'", "'poloko'", "'komo'", "'matiko'", "'mi'", 
			"'nelo'", "'powele'", "'peko'", "'sapole'", "'kate'", "'sopa'", "'suki'", 
			"'osole'", "'umami'", "'juka'", "'apijo'", "'niku'", "'musi'", "'kaki'", 
			"'akasa'", "'tenti'", "'kawa'", "'penpe'", "'kumon'", "'namu'", "'tuko'", 
			"'tuwi'", "'olon'", "'alu'", "'kuto'", "'kosan'", "'alijun'", "'tu'", 
			"'wija'", "'asa'", "'kijata'", "'malo'", "'sena'", "'leseka'", "'pintan'", 
			"'inkatan'", "'ke'", "'pen'", "'san'", "'kuwan'", "'sipa'", "'sintuwan'", 
			"'iwe'", "'pansin'", "'si'", "'joli'", "'putun'", "'kuwosi'", "'tonsa'", 
			"'kuwanko'", "'timi'", "'limijen'", "'tajen'", "'kan'", "'na'", "'tunpu'", 
			"'matuwa'", "'pa'", "'taka'", "'kali'", "'tune'", "'tene'", "'namuna'", 
			"'nile'", "'panta'", "'jon'", "'tonko'", "'sunkan'", "'onja'", "'ukama'", 
			"'koton'", "'mitin'", "'lito'", "'lamo'", "'aluko'", "'konpute'", "'nepa'", 
			"'kuku'", "'meja'", "'momu'", "'neje'", "'pawo'", "'tutu'", "'ukiki'", 
			"'wonpa'", "'peman'", "'napa'", "'nase'", "'je'", "'jatan'", "'kisowa'", 
			"'lenka'", "'pasu'", "'lansa'", "'menu'", "'opotu'", "'uta'", "'maku'", 
			"'pelete'", "'pitijo'", "'sapi'", "'ili'", "'tula'", "'pata'", "'pumi'", 
			"'matija'", "'waju'", "'salila'", "'sila'", "'ko'", "'setan'", "'suwina'", 
			"'samo'", "'tenja'", "'ipuwe'", "'muku'", "'kalawa'", "'konje'", "'sa'", 
			"'saka'", "'wala'", "'asete'", "'akala'", "'amo'", "'kanta'", "'sekano'", 
			"'sijen'", "'toso'", "'kenelo'", "'onko'", "'umo'", "'pikante'", "'posa'", 
			"'anta'", "'takuwa'", "'tawapu'", "'lanki'", "'titi'", "'tiju'", "'tapala'", 
			"'talili'", "'lipan'", "'lunti'", "'takilo'", "'kalan'", "'ulokan'", 
			"'etu'", "'kontatu'", "'nanku'", "'mulu'", "'watan'", "'wili'", "'ani'", 
			"'iputu'", "'tina'", "'ne'", "'titan'", "'pon'", "'pan'", "'len'", "'santi'", 
			"'sankan'", "'one'", "'tanu'", "'sepo'", "'teneme'", "'solu'", "'tope'", 
			"'tamaka'", "'tuntan'", "'niju'", "'non'", "'so'", "'ewin'", "'enteken'", 
			"'menwa'", "'sun'", "'muntu'", "'insu'", "'onton'", "'kikolo'", "'lo'", 
			"'tiku'", "'ikama'", "'inpali'", "'nenka'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "A", "In", "Le", "Men", "O", "Ta", "Te", "We", "Win", "Wo", "Lijule", 
			"Pese", "Kapaja", "Kilima", "Sito", "Iman", "Tasuwi", "Akiki", "Ukun", 
			"Aja", "Sala", "Talika", "Kapan", "Kisa", "Mu", "Mata", "Mutakin", "Mita", 
			"Jasa", "Jamin", "Apaki", "Luwa", "Konpa", "Kela", "Lika", "Otota", "Ka", 
			"Tisilin", "Janlu", "Jamu", "Pututi", "Minuli", "Oti", "Kota", "Pani", 
			"Unitu", "Loso", "Kima", "Pi", "Anan", "Tenkin", "Patun", "Sikin", "Usen", 
			"Panli", "Tunti", "Sinsi", "Wanku", "Papon", "Junja", "Jati", "Unsi", 
			"Nan", "Ju", "Anpipi", "Mese", "Ten", "Puka", "Kanisa", "Pulusi", "Muwesi", 
			"Moto", "Pankosi", "Nula", "Pela", "Otan", "Kujo", "Tan", "Tun", "Ela", 
			"Kemika", "Po", "Mani", "No", "Oke", "Wan", "Suwi", "Sin", "Tati", "Tolu", 
			"Lipu", "Osa", "Tomiwa", "Pesuwan", "Ken", "Tepu", "Anwije", "Lisi", 
			"Lan", "Soto", "Eme", "Nin", "Lijo", "Toki", "An", "Ato", "Kumi", "Kapu", 
			"Un", "Polan", "Wisan", "Mijalo", "Neso", "Kaso", "Tawe", "Konen", "Kikuwa", 
			"Kiju", "Jone", "Akoli", "Mamaki", "Lana", "Wa", "Ja", "Wiki", "Naki", 
			"Sone", "Katin", "Kula", "Kun", "Kusa", "Tanwa", "Tipa", "Teka", "Tile", 
			"Tusa", "Tijante", "Nankin", "Nalan", "Niwa", "Pite", "Pasan", "Pintu", 
			"Pula", "Mepu", "Luka", "Laki", "Lekin", "Wita", "Saminta", "Sanpanti", 
			"Saman", "Satalan", "Sula", "Sitija", "Lima", "Jan", "Makan", "Keke", 
			"Latito", "Ankolo", "Poloko", "Komo", "Matiko", "Mi", "Nelo", "Powele", 
			"Peko", "Sapole", "Kate", "Sopa", "Suki", "Osole", "Umami", "Juka", "Apijo", 
			"Niku", "Musi", "Kaki", "Akasa", "Tenti", "Kawa", "Penpe", "Kumon", "Namu", 
			"Tuko", "Tuwi", "Olon", "Alu", "Kuto", "Kosan", "Alijun", "Tu", "Wija", 
			"Asa", "Kijata", "Malo", "Sena", "Leseka", "Pintan", "Inkatan", "Ke", 
			"Pen", "San", "Kuwan", "Sipa", "Sintuwan", "Iwe", "Pansin", "Si", "Joli", 
			"Putun", "Kuwosi", "Tonsa", "Kuwanko", "Timi", "Limijen", "Tajen", "Kan", 
			"Na", "Tunpu", "Matuwa", "Pa", "Taka", "Kali", "Tune", "Tene", "Namuna", 
			"Nile", "Panta", "Jon", "Tonko", "Sunkan", "Onja", "Ukama", "Koton", 
			"Mitin", "Lito", "Lamo", "Aluko", "Konpute", "Nepa", "Kuku", "Meja", 
			"Momu", "Neje", "Pawo", "Tutu", "Ukiki", "Wonpa", "Peman", "Napa", "Nase", 
			"Je", "Jatan", "Kisowa", "Lenka", "Pasu", "Lansa", "Menu", "Opotu", "Uta", 
			"Maku", "Pelete", "Pitijo", "Sapi", "Ili", "Tula", "Pata", "Pumi", "Matija", 
			"Waju", "Salila", "Sila", "Ko", "Setan", "Suwina", "Samo", "Tenja", "Ipuwe", 
			"Muku", "Kalawa", "Konje", "Sa", "Saka", "Wala", "Asete", "Akala", "Amo", 
			"Kanta", "Sekano", "Sijen", "Toso", "Kenelo", "Onko", "Umo", "Pikante", 
			"Posa", "Anta", "Takuwa", "Tawapu", "Lanki", "Titi", "Tiju", "Tapala", 
			"Talili", "Lipan", "Lunti", "Takilo", "Kalan", "Ulokan", "Etu", "Kontatu", 
			"Nanku", "Mulu", "Watan", "Wili", "Ani", "Iputu", "Tina", "Ne", "Titan", 
			"Pon", "Pan", "Len", "Santi", "Sankan", "One", "Tanu", "Sepo", "Teneme", 
			"Solu", "Tope", "Tamaka", "Tuntan", "Niju", "Non", "So", "Ewin", "Enteken", 
			"Menwa", "Sun", "Muntu", "Insu", "Onton", "Kikolo", "Lo", "Tiku", "Ikama", 
			"Inpali", "Nenka", "ContentWord", "BaseVerb", "BaseNoun", "BaseModifier", 
			"Preposition", "Connector", "Quantity"
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

	public static class SentenceContext extends ParserRuleContext {
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public LeadingSubjectContext leadingSubject() {
			return getRuleContext(LeadingSubjectContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public List<PrepositionsContext> prepositions() {
			return getRuleContexts(PrepositionsContext.class);
		}
		public PrepositionsContext prepositions(int i) {
			return getRuleContext(PrepositionsContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Te || _la==ContentWord) {
				{
				setState(14);
				leadingSubject();
				}
			}

			setState(17);
			verb();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Te || _la==ContentWord) {
				{
				{
				setState(18);
				modifiers();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Preposition) {
				{
				{
				setState(24);
				prepositions();
				}
				}
				setState(29);
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

	public static class LeadingSubjectContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public LeadingSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leadingSubject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterLeadingSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitLeadingSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitLeadingSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeadingSubjectContext leadingSubject() throws RecognitionException {
		LeadingSubjectContext _localctx = new LeadingSubjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_leadingSubject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			noun();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Te || _la==ContentWord) {
				{
				{
				setState(31);
				modifiers();
				}
				}
				setState(36);
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

	public static class ModifiersContext extends ParserRuleContext {
		public List<TerminalNode> ContentWord() { return getTokens(KokanuParser.ContentWord); }
		public TerminalNode ContentWord(int i) {
			return getToken(KokanuParser.ContentWord, i);
		}
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public List<PrepositionsContext> prepositions() {
			return getRuleContexts(PrepositionsContext.class);
		}
		public PrepositionsContext prepositions(int i) {
			return getRuleContext(PrepositionsContext.class,i);
		}
		public ModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifiersContext modifiers() throws RecognitionException {
		ModifiersContext _localctx = new ModifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifiers);
		try {
			int _alt;
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ContentWord:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						match(ContentWord);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Te:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(Te);
				setState(43);
				verb();
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(44);
						prepositions();
						}
						} 
					}
					setState(49);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AdjectiveClauseContext extends ParserRuleContext {
		public TerminalNode Ta() { return getToken(KokanuParser.Ta, 0); }
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public TerminalNode ContentWord() { return getToken(KokanuParser.ContentWord, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public AdjectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterAdjectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitAdjectiveClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitAdjectiveClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveClauseContext adjectiveClause() throws RecognitionException {
		AdjectiveClauseContext _localctx = new AdjectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_adjectiveClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(Ta);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ContentWord) {
				{
				setState(53);
				match(ContentWord);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Te || _la==ContentWord) {
					{
					{
					setState(54);
					modifiers();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(62);
			verb();
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode Le() { return getToken(KokanuParser.Le, 0); }
		public TerminalNode ContentWord() { return getToken(KokanuParser.ContentWord, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public TerminalNode O() { return getToken(KokanuParser.O, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verb);
		try {
			int _alt;
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Le:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(Le);
				setState(65);
				match(ContentWord);
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(66);
						modifiers();
						}
						} 
					}
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(O);
				setState(73);
				match(ContentWord);
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(74);
						modifiers();
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class PrepositionsContext extends ParserRuleContext {
		public TerminalNode Preposition() { return getToken(KokanuParser.Preposition, 0); }
		public TerminalNode ContentWord() { return getToken(KokanuParser.ContentWord, 0); }
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public PrepositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterPrepositions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitPrepositions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitPrepositions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionsContext prepositions() throws RecognitionException {
		PrepositionsContext _localctx = new PrepositionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prepositions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Preposition);
			setState(83);
			match(ContentWord);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					modifiers();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class NounContext extends ParserRuleContext {
		public TerminalNode ContentWord() { return getToken(KokanuParser.ContentWord, 0); }
		public List<AdjectiveClauseContext> adjectiveClause() {
			return getRuleContexts(AdjectiveClauseContext.class);
		}
		public AdjectiveClauseContext adjectiveClause(int i) {
			return getRuleContext(AdjectiveClauseContext.class,i);
		}
		public List<ModifiersContext> modifiers() {
			return getRuleContexts(ModifiersContext.class);
		}
		public ModifiersContext modifiers(int i) {
			return getRuleContext(ModifiersContext.class,i);
		}
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public List<PrepositionsContext> prepositions() {
			return getRuleContexts(PrepositionsContext.class);
		}
		public PrepositionsContext prepositions(int i) {
			return getRuleContext(PrepositionsContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KokanuParserVisitor ) return ((KokanuParserVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_noun);
		int _la;
		try {
			int _alt;
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ContentWord:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ContentWord);
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(93);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Ta:
							{
							setState(91);
							adjectiveClause();
							}
							break;
						case Te:
						case ContentWord:
							{
							setState(92);
							modifiers();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case Te:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(Te);
				setState(99);
				verb();
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						modifiers();
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Preposition) {
					{
					{
					setState(106);
					prepositions();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0166s\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0003\u0000\u0010"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000\f\u0000"+
		"\u0017\t\u0000\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001"+
		"$\t\u0001\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t"+
		"\u0002\u0003\u00023\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0003\u0003=\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004D\b\u0004"+
		"\n\u0004\f\u0004G\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"L\b\u0004\n\u0004\f\u0004O\t\u0004\u0003\u0004Q\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006^\b\u0006\n\u0006\f\u0006a\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006f\b\u0006\n\u0006"+
		"\f\u0006i\t\u0006\u0001\u0006\u0005\u0006l\b\u0006\n\u0006\f\u0006o\t"+
		"\u0006\u0003\u0006q\b\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0000}\u0000\u000f\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u00064\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000"+
		"\fp\u0001\u0000\u0000\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f"+
		"\u000e\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0015\u0003\b\u0004\u0000\u0012\u0014"+
		"\u0003\u0004\u0002\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017"+
		"\u0001\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0001\u0000\u0000\u0000\u0016\u001b\u0001\u0000\u0000\u0000\u0017\u0015"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0003\n\u0005\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0001\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\"\u0003\f"+
		"\u0006\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0005"+
		"\u0160\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)3\u0001\u0000\u0000"+
		"\u0000*+\u0005\u0007\u0000\u0000+/\u0003\b\u0004\u0000,.\u0003\n\u0005"+
		"\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001"+
		"\u0000\u0000\u00002&\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u0000"+
		"3\u0005\u0001\u0000\u0000\u00004<\u0005\u0006\u0000\u000059\u0005\u0160"+
		"\u0000\u000068\u0003\u0004\u0002\u000076\u0001\u0000\u0000\u00008;\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0003\b\u0004"+
		"\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\u0003\u0000\u0000AE\u0005"+
		"\u0160\u0000\u0000BD\u0003\u0004\u0002\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FQ\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005\u0005"+
		"\u0000\u0000IM\u0005\u0160\u0000\u0000JL\u0003\u0004\u0002\u0000KJ\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000P@\u0001\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000Q\t\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0164\u0000\u0000SW\u0005\u0160\u0000\u0000TV\u0003"+
		"\u0004\u0002\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z_\u0005\u0160\u0000\u0000[^\u0003"+
		"\u0006\u0003\u0000\\^\u0003\u0004\u0002\u0000][\u0001\u0000\u0000\u0000"+
		"]\\\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`q\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0007\u0000\u0000cg\u0003\b\u0004\u0000df\u0003\u0004"+
		"\u0002\u0000ed\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hm\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000jl\u0003\n\u0005\u0000kj\u0001\u0000\u0000\u0000"+
		"lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pZ\u0001\u0000"+
		"\u0000\u0000pb\u0001\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000\u0012"+
		"\u000f\u0015\u001b\"(/29<EMPW]_gmp";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}