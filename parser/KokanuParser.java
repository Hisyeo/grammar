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
		WS=1, Terminator=2, A=3, In=4, Le=5, Men=6, O=7, Ta=8, Te=9, We=10, Win=11, 
		Wo=12, Lijule=13, Pese=14, Kapaja=15, Kilima=16, Sito=17, Iman=18, Tasuwi=19, 
		Akiki=20, Ukun=21, Aja=22, Sala=23, Talika=24, Kapan=25, Kisa=26, Mu=27, 
		Mata=28, Mutakin=29, Mita=30, Jasa=31, Jamin=32, Apaki=33, Luwa=34, Konpa=35, 
		Kela=36, Lika=37, Otota=38, Ka=39, Tisilin=40, Janlu=41, Jamu=42, Pututi=43, 
		Minuli=44, Oti=45, Kota=46, Pani=47, Unitu=48, Loso=49, Kima=50, Pi=51, 
		Anan=52, Tenkin=53, Patun=54, Sikin=55, Usen=56, Panli=57, Tunti=58, Sinsi=59, 
		Wanku=60, Papon=61, Junja=62, Jati=63, Unsi=64, Nan=65, Ju=66, Anpipi=67, 
		Mese=68, Ten=69, Puka=70, Kanisa=71, Pulusi=72, Muwesi=73, Moto=74, Pankosi=75, 
		Nula=76, Pela=77, Otan=78, Kujo=79, Tan=80, Tun=81, Ela=82, Kemika=83, 
		Po=84, Mani=85, No=86, Oke=87, Wan=88, Suwi=89, Sin=90, Tati=91, Tolu=92, 
		Lipu=93, Osa=94, Tomiwa=95, Pesuwan=96, Ken=97, Tepu=98, Anwije=99, Lisi=100, 
		Lan=101, Soto=102, Eme=103, Nin=104, Lijo=105, Toki=106, An=107, Ato=108, 
		Kumi=109, Kapu=110, Un=111, Polan=112, Wisan=113, Mijalo=114, Neso=115, 
		Kaso=116, Tawe=117, Konen=118, Kikuwa=119, Kiju=120, Jone=121, Akoli=122, 
		Mamaki=123, Lana=124, Wa=125, Ja=126, Wiki=127, Naki=128, Sone=129, Katin=130, 
		Kula=131, Kun=132, Kusa=133, Tanwa=134, Tipa=135, Teka=136, Tile=137, 
		Tusa=138, Tijante=139, Nankin=140, Nalan=141, Niwa=142, Pite=143, Pasan=144, 
		Pintu=145, Pula=146, Mepu=147, Luka=148, Laki=149, Lekin=150, Wita=151, 
		Saminta=152, Sanpanti=153, Saman=154, Satalan=155, Sula=156, Sitija=157, 
		Lima=158, Jan=159, Makan=160, Keke=161, Latito=162, Ankolo=163, Poloko=164, 
		Komo=165, Matiko=166, Mi=167, Nelo=168, Powele=169, Peko=170, Sapole=171, 
		Kate=172, Sopa=173, Suki=174, Osole=175, Umami=176, Juka=177, Apijo=178, 
		Niku=179, Musi=180, Kaki=181, Akasa=182, Tenti=183, Kawa=184, Penpe=185, 
		Kumon=186, Namu=187, Tuko=188, Tuwi=189, Olon=190, Alu=191, Kuto=192, 
		Kosan=193, Alijun=194, Tu=195, Wija=196, Asa=197, Kijata=198, Malo=199, 
		Sena=200, Leseka=201, Pintan=202, Inkatan=203, Ke=204, Pen=205, San=206, 
		Kuwan=207, Sipa=208, Sintuwan=209, Iwe=210, Pansin=211, Si=212, Joli=213, 
		Putun=214, Kuwosi=215, Tonsa=216, Kuwanko=217, Timi=218, Limijen=219, 
		Tajen=220, Kan=221, Na=222, Tunpu=223, Matuwa=224, Pa=225, Taka=226, Kali=227, 
		Tune=228, Tene=229, Namuna=230, Nile=231, Panta=232, Jon=233, Tonko=234, 
		Sunkan=235, Onja=236, Ukama=237, Koton=238, Mitin=239, Lito=240, Lamo=241, 
		Aluko=242, Konpute=243, Nepa=244, Kuku=245, Meja=246, Momu=247, Neje=248, 
		Pawo=249, Tutu=250, Ukiki=251, Wonpa=252, Peman=253, Napa=254, Nase=255, 
		Je=256, Jatan=257, Kisowa=258, Lenka=259, Pasu=260, Lansa=261, Menu=262, 
		Opotu=263, Uta=264, Maku=265, Pelete=266, Pitijo=267, Sapi=268, Ili=269, 
		Tula=270, Pata=271, Pumi=272, Matija=273, Waju=274, Salila=275, Sila=276, 
		Ko=277, Setan=278, Suwina=279, Samo=280, Tenja=281, Ipuwe=282, Muku=283, 
		Kalawa=284, Konje=285, Sa=286, Saka=287, Wala=288, Asete=289, Akala=290, 
		Amo=291, Kanta=292, Sekano=293, Sijen=294, Toso=295, Kenelo=296, Onko=297, 
		Umo=298, Pikante=299, Posa=300, Anta=301, Takuwa=302, Tawapu=303, Lanki=304, 
		Titi=305, Tiju=306, Tapala=307, Talili=308, Lipan=309, Lunti=310, Takilo=311, 
		Kalan=312, Ulokan=313, Etu=314, Kontatu=315, Nanku=316, Mulu=317, Watan=318, 
		Wili=319, Ani=320, Iputu=321, Tina=322, Ne=323, Titan=324, Pon=325, Pan=326, 
		Len=327, Santi=328, Sankan=329, One=330, Tanu=331, Sepo=332, Teneme=333, 
		Solu=334, Tope=335, Tamaka=336, Tuntan=337, Niju=338, Non=339, So=340, 
		Ewin=341, Enteken=342, Menwa=343, Sun=344, Muntu=345, Insu=346, Onton=347, 
		Kikolo=348, Lo=349, Tiku=350, Ikama=351, Inpali=352, Nenka=353;
	public static final int
		RULE_sentence = 0, RULE_nounPhrase = 1, RULE_modifierPhrase = 2, RULE_relativeClause = 3, 
		RULE_verbPhrase = 4, RULE_prepositionalClause = 5, RULE_contentWord = 6, 
		RULE_baseVerb = 7, RULE_pronoun = 8, RULE_baseNoun = 9, RULE_baseModifier = 10, 
		RULE_connector = 11, RULE_quantity = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"sentence", "nounPhrase", "modifierPhrase", "relativeClause", "verbPhrase", 
			"prepositionalClause", "contentWord", "baseVerb", "pronoun", "baseNoun", 
			"baseModifier", "connector", "quantity"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'a'", "'in'", "'le'", "'men'", "'o'", "'ta'", "'te'", 
			"'we'", "'win'", "'wo'", "'lijule'", "'pese'", "'kapaja'", "'kilima'", 
			"'sito'", "'iman'", "'tasuwi'", "'akiki'", "'ukun'", "'aja'", "'sala'", 
			"'talika'", "'kapan'", "'kisa'", "'mu'", "'mata'", "'mutakin'", "'mita'", 
			"'jasa'", "'jamin'", "'apaki'", "'luwa'", "'konpa'", "'kela'", "'lika'", 
			"'otota'", "'ka'", "'tisilin'", "'janlu'", "'jamu'", "'pututi'", "'minuli'", 
			"'oti'", "'kota'", "'pani'", "'unitu'", "'loso'", "'kima'", "'pi'", "'anan'", 
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
			null, "WS", "Terminator", "A", "In", "Le", "Men", "O", "Ta", "Te", "We", 
			"Win", "Wo", "Lijule", "Pese", "Kapaja", "Kilima", "Sito", "Iman", "Tasuwi", 
			"Akiki", "Ukun", "Aja", "Sala", "Talika", "Kapan", "Kisa", "Mu", "Mata", 
			"Mutakin", "Mita", "Jasa", "Jamin", "Apaki", "Luwa", "Konpa", "Kela", 
			"Lika", "Otota", "Ka", "Tisilin", "Janlu", "Jamu", "Pututi", "Minuli", 
			"Oti", "Kota", "Pani", "Unitu", "Loso", "Kima", "Pi", "Anan", "Tenkin", 
			"Patun", "Sikin", "Usen", "Panli", "Tunti", "Sinsi", "Wanku", "Papon", 
			"Junja", "Jati", "Unsi", "Nan", "Ju", "Anpipi", "Mese", "Ten", "Puka", 
			"Kanisa", "Pulusi", "Muwesi", "Moto", "Pankosi", "Nula", "Pela", "Otan", 
			"Kujo", "Tan", "Tun", "Ela", "Kemika", "Po", "Mani", "No", "Oke", "Wan", 
			"Suwi", "Sin", "Tati", "Tolu", "Lipu", "Osa", "Tomiwa", "Pesuwan", "Ken", 
			"Tepu", "Anwije", "Lisi", "Lan", "Soto", "Eme", "Nin", "Lijo", "Toki", 
			"An", "Ato", "Kumi", "Kapu", "Un", "Polan", "Wisan", "Mijalo", "Neso", 
			"Kaso", "Tawe", "Konen", "Kikuwa", "Kiju", "Jone", "Akoli", "Mamaki", 
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

	public static class SentenceContext extends ParserRuleContext {
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public NounPhraseContext nounPhrase() {
			return getRuleContext(NounPhraseContext.class,0);
		}
		public List<PrepositionalClauseContext> prepositionalClause() {
			return getRuleContexts(PrepositionalClauseContext.class);
		}
		public PrepositionalClauseContext prepositionalClause(int i) {
			return getRuleContext(PrepositionalClauseContext.class,i);
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
		enterRule(_localctx, 0, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Te) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon) | (1L << Junja))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)) | (1L << (Ja - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)) | (1L << (Olon - 128)) | (1L << (Alu - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (Jatan - 257)) | (1L << (Kisowa - 257)) | (1L << (Lenka - 257)) | (1L << (Pasu - 257)) | (1L << (Lansa - 257)) | (1L << (Opotu - 257)) | (1L << (Uta - 257)) | (1L << (Maku - 257)) | (1L << (Pelete - 257)) | (1L << (Pitijo - 257)) | (1L << (Sapi - 257)) | (1L << (Tula - 257)) | (1L << (Pata - 257)) | (1L << (Pumi - 257)) | (1L << (Matija - 257)) | (1L << (Waju - 257)) | (1L << (Salila - 257)) | (1L << (Sila - 257)) | (1L << (Ko - 257)) | (1L << (Suwina - 257)) | (1L << (Samo - 257)) | (1L << (Tenja - 257)) | (1L << (Ipuwe - 257)) | (1L << (Muku - 257)) | (1L << (Kalawa - 257)) | (1L << (Konje - 257)) | (1L << (Sa - 257)) | (1L << (Wala - 257)) | (1L << (Asete - 257)) | (1L << (Akala - 257)) | (1L << (Amo - 257)) | (1L << (Kanta - 257)) | (1L << (Sekano - 257)) | (1L << (Kenelo - 257)) | (1L << (Onko - 257)) | (1L << (Umo - 257)) | (1L << (Pikante - 257)) | (1L << (Posa - 257)) | (1L << (Anta - 257)) | (1L << (Takuwa - 257)) | (1L << (Tawapu - 257)) | (1L << (Lanki - 257)) | (1L << (Titi - 257)) | (1L << (Tapala - 257)) | (1L << (Talili - 257)) | (1L << (Lipan - 257)) | (1L << (Lunti - 257)) | (1L << (Takilo - 257)) | (1L << (Kalan - 257)) | (1L << (Ulokan - 257)) | (1L << (Kontatu - 257)) | (1L << (Mulu - 257)) | (1L << (Watan - 257)) | (1L << (Wili - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (Iputu - 321)) | (1L << (Tina - 321)) | (1L << (Ne - 321)) | (1L << (Titan - 321)) | (1L << (Pon - 321)) | (1L << (Len - 321)) | (1L << (Santi - 321)) | (1L << (Sankan - 321)) | (1L << (One - 321)) | (1L << (Tanu - 321)) | (1L << (Sepo - 321)) | (1L << (Teneme - 321)) | (1L << (Solu - 321)) | (1L << (Tope - 321)) | (1L << (Tamaka - 321)) | (1L << (Tuntan - 321)) | (1L << (Non - 321)) | (1L << (Ewin - 321)) | (1L << (Enteken - 321)) | (1L << (Menwa - 321)) | (1L << (Muntu - 321)) | (1L << (Insu - 321)) | (1L << (Onton - 321)) | (1L << (Kikolo - 321)) | (1L << (Lo - 321)) | (1L << (Tiku - 321)) | (1L << (Ikama - 321)) | (1L << (Inpali - 321)))) != 0)) {
				{
				setState(26);
				nounPhrase();
				}
			}

			setState(29);
			verbPhrase();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << In) | (1L << Men) | (1L << Win))) != 0) || _la==Po || _la==An || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (Wija - 196)) | (1L << (Ke - 196)) | (1L << (Kan - 196)))) != 0) || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & ((1L << (So - 340)) | (1L << (Sun - 340)) | (1L << (Nenka - 340)))) != 0)) {
				{
				{
				setState(30);
				prepositionalClause();
				}
				}
				setState(35);
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
		public ContentWordContext contentWord() {
			return getRuleContext(ContentWordContext.class,0);
		}
		public List<RelativeClauseContext> relativeClause() {
			return getRuleContexts(RelativeClauseContext.class);
		}
		public RelativeClauseContext relativeClause(int i) {
			return getRuleContext(RelativeClauseContext.class,i);
		}
		public List<ModifierPhraseContext> modifierPhrase() {
			return getRuleContexts(ModifierPhraseContext.class);
		}
		public ModifierPhraseContext modifierPhrase(int i) {
			return getRuleContext(ModifierPhraseContext.class,i);
		}
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
		public List<PrepositionalClauseContext> prepositionalClause() {
			return getRuleContexts(PrepositionalClauseContext.class);
		}
		public PrepositionalClauseContext prepositionalClause(int i) {
			return getRuleContext(PrepositionalClauseContext.class,i);
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
		enterRule(_localctx, 2, RULE_nounPhrase);
		int _la;
		try {
			setState(58);
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
			case Sa:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				contentWord();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ta) | (1L << Te) | (1L << Wo) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon) | (1L << Junja))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)) | (1L << (Ja - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)) | (1L << (Olon - 128)) | (1L << (Alu - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Je - 256)) | (1L << (Jatan - 256)) | (1L << (Kisowa - 256)) | (1L << (Lenka - 256)) | (1L << (Pasu - 256)) | (1L << (Lansa - 256)) | (1L << (Opotu - 256)) | (1L << (Uta - 256)) | (1L << (Maku - 256)) | (1L << (Pelete - 256)) | (1L << (Pitijo - 256)) | (1L << (Sapi - 256)) | (1L << (Tula - 256)) | (1L << (Pata - 256)) | (1L << (Pumi - 256)) | (1L << (Matija - 256)) | (1L << (Waju - 256)) | (1L << (Salila - 256)) | (1L << (Sila - 256)) | (1L << (Ko - 256)) | (1L << (Suwina - 256)) | (1L << (Samo - 256)) | (1L << (Tenja - 256)) | (1L << (Ipuwe - 256)) | (1L << (Muku - 256)) | (1L << (Kalawa - 256)) | (1L << (Konje - 256)) | (1L << (Sa - 256)) | (1L << (Wala - 256)) | (1L << (Asete - 256)) | (1L << (Akala - 256)) | (1L << (Amo - 256)) | (1L << (Kanta - 256)) | (1L << (Sekano - 256)) | (1L << (Kenelo - 256)) | (1L << (Onko - 256)) | (1L << (Umo - 256)) | (1L << (Pikante - 256)) | (1L << (Posa - 256)) | (1L << (Anta - 256)) | (1L << (Takuwa - 256)) | (1L << (Tawapu - 256)) | (1L << (Lanki - 256)) | (1L << (Titi - 256)) | (1L << (Tapala - 256)) | (1L << (Talili - 256)) | (1L << (Lipan - 256)) | (1L << (Lunti - 256)) | (1L << (Takilo - 256)) | (1L << (Kalan - 256)) | (1L << (Ulokan - 256)) | (1L << (Kontatu - 256)) | (1L << (Mulu - 256)) | (1L << (Watan - 256)) | (1L << (Wili - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (Iputu - 321)) | (1L << (Tina - 321)) | (1L << (Ne - 321)) | (1L << (Titan - 321)) | (1L << (Pon - 321)) | (1L << (Len - 321)) | (1L << (Santi - 321)) | (1L << (Sankan - 321)) | (1L << (One - 321)) | (1L << (Tanu - 321)) | (1L << (Sepo - 321)) | (1L << (Teneme - 321)) | (1L << (Solu - 321)) | (1L << (Tope - 321)) | (1L << (Tamaka - 321)) | (1L << (Tuntan - 321)) | (1L << (Non - 321)) | (1L << (Ewin - 321)) | (1L << (Enteken - 321)) | (1L << (Menwa - 321)) | (1L << (Muntu - 321)) | (1L << (Insu - 321)) | (1L << (Onton - 321)) | (1L << (Kikolo - 321)) | (1L << (Lo - 321)) | (1L << (Tiku - 321)) | (1L << (Ikama - 321)) | (1L << (Inpali - 321)))) != 0)) {
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(37);
						relativeClause();
						}
						break;
					case 2:
						{
						setState(38);
						modifierPhrase();
						}
						break;
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case Te:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(Te);
				setState(45);
				contentWord();
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ta) | (1L << Te) | (1L << Wo) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon) | (1L << Junja))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)) | (1L << (Ja - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)) | (1L << (Olon - 128)) | (1L << (Alu - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Je - 256)) | (1L << (Jatan - 256)) | (1L << (Kisowa - 256)) | (1L << (Lenka - 256)) | (1L << (Pasu - 256)) | (1L << (Lansa - 256)) | (1L << (Opotu - 256)) | (1L << (Uta - 256)) | (1L << (Maku - 256)) | (1L << (Pelete - 256)) | (1L << (Pitijo - 256)) | (1L << (Sapi - 256)) | (1L << (Tula - 256)) | (1L << (Pata - 256)) | (1L << (Pumi - 256)) | (1L << (Matija - 256)) | (1L << (Waju - 256)) | (1L << (Salila - 256)) | (1L << (Sila - 256)) | (1L << (Ko - 256)) | (1L << (Suwina - 256)) | (1L << (Samo - 256)) | (1L << (Tenja - 256)) | (1L << (Ipuwe - 256)) | (1L << (Muku - 256)) | (1L << (Kalawa - 256)) | (1L << (Konje - 256)) | (1L << (Sa - 256)) | (1L << (Wala - 256)) | (1L << (Asete - 256)) | (1L << (Akala - 256)) | (1L << (Amo - 256)) | (1L << (Kanta - 256)) | (1L << (Sekano - 256)) | (1L << (Kenelo - 256)) | (1L << (Onko - 256)) | (1L << (Umo - 256)) | (1L << (Pikante - 256)) | (1L << (Posa - 256)) | (1L << (Anta - 256)) | (1L << (Takuwa - 256)) | (1L << (Tawapu - 256)) | (1L << (Lanki - 256)) | (1L << (Titi - 256)) | (1L << (Tapala - 256)) | (1L << (Talili - 256)) | (1L << (Lipan - 256)) | (1L << (Lunti - 256)) | (1L << (Takilo - 256)) | (1L << (Kalan - 256)) | (1L << (Ulokan - 256)) | (1L << (Kontatu - 256)) | (1L << (Mulu - 256)) | (1L << (Watan - 256)) | (1L << (Wili - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (Iputu - 321)) | (1L << (Tina - 321)) | (1L << (Ne - 321)) | (1L << (Titan - 321)) | (1L << (Pon - 321)) | (1L << (Len - 321)) | (1L << (Santi - 321)) | (1L << (Sankan - 321)) | (1L << (One - 321)) | (1L << (Tanu - 321)) | (1L << (Sepo - 321)) | (1L << (Teneme - 321)) | (1L << (Solu - 321)) | (1L << (Tope - 321)) | (1L << (Tamaka - 321)) | (1L << (Tuntan - 321)) | (1L << (Non - 321)) | (1L << (Ewin - 321)) | (1L << (Enteken - 321)) | (1L << (Menwa - 321)) | (1L << (Muntu - 321)) | (1L << (Insu - 321)) | (1L << (Onton - 321)) | (1L << (Kikolo - 321)) | (1L << (Lo - 321)) | (1L << (Tiku - 321)) | (1L << (Ikama - 321)) | (1L << (Inpali - 321)))) != 0)) {
					{
					{
					setState(46);
					modifierPhrase();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << In) | (1L << Men) | (1L << Win))) != 0) || _la==Po || _la==An || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (Wija - 196)) | (1L << (Ke - 196)) | (1L << (Kan - 196)))) != 0) || ((((_la - 340)) & ~0x3f) == 0 && ((1L << (_la - 340)) & ((1L << (So - 340)) | (1L << (Sun - 340)) | (1L << (Nenka - 340)))) != 0)) {
					{
					{
					setState(52);
					prepositionalClause();
					}
					}
					setState(57);
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

	public static class ModifierPhraseContext extends ParserRuleContext {
		public List<ContentWordContext> contentWord() {
			return getRuleContexts(ContentWordContext.class);
		}
		public ContentWordContext contentWord(int i) {
			return getRuleContext(ContentWordContext.class,i);
		}
		public TerminalNode Je() { return getToken(KokanuParser.Je, 0); }
		public TerminalNode Wo() { return getToken(KokanuParser.Wo, 0); }
		public RelativeClauseContext relativeClause() {
			return getRuleContext(RelativeClauseContext.class,0);
		}
		public ModifierPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifierPhrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterModifierPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitModifierPhrase(this);
		}
	}

	public final ModifierPhraseContext modifierPhrase() throws RecognitionException {
		ModifierPhraseContext _localctx = new ModifierPhraseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modifierPhrase);
		int _la;
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Wo:
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
			case Je:
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
			case Sa:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Wo || _la==Je) {
					{
					setState(60);
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

				setState(64); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
						contentWord();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(66); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case Ta:
			case Te:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				relativeClause();
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

	public static class RelativeClauseContext extends ParserRuleContext {
		public TerminalNode Ta() { return getToken(KokanuParser.Ta, 0); }
		public VerbPhraseContext verbPhrase() {
			return getRuleContext(VerbPhraseContext.class,0);
		}
		public ContentWordContext contentWord() {
			return getRuleContext(ContentWordContext.class,0);
		}
		public List<PrepositionalClauseContext> prepositionalClause() {
			return getRuleContexts(PrepositionalClauseContext.class);
		}
		public PrepositionalClauseContext prepositionalClause(int i) {
			return getRuleContext(PrepositionalClauseContext.class,i);
		}
		public List<ModifierPhraseContext> modifierPhrase() {
			return getRuleContexts(ModifierPhraseContext.class);
		}
		public ModifierPhraseContext modifierPhrase(int i) {
			return getRuleContext(ModifierPhraseContext.class,i);
		}
		public TerminalNode Te() { return getToken(KokanuParser.Te, 0); }
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
		enterRule(_localctx, 6, RULE_relativeClause);
		int _la;
		try {
			int _alt;
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ta:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(Ta);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon) | (1L << Junja))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)) | (1L << (Ja - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)) | (1L << (Olon - 128)) | (1L << (Alu - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (Jatan - 257)) | (1L << (Kisowa - 257)) | (1L << (Lenka - 257)) | (1L << (Pasu - 257)) | (1L << (Lansa - 257)) | (1L << (Opotu - 257)) | (1L << (Uta - 257)) | (1L << (Maku - 257)) | (1L << (Pelete - 257)) | (1L << (Pitijo - 257)) | (1L << (Sapi - 257)) | (1L << (Tula - 257)) | (1L << (Pata - 257)) | (1L << (Pumi - 257)) | (1L << (Matija - 257)) | (1L << (Waju - 257)) | (1L << (Salila - 257)) | (1L << (Sila - 257)) | (1L << (Ko - 257)) | (1L << (Suwina - 257)) | (1L << (Samo - 257)) | (1L << (Tenja - 257)) | (1L << (Ipuwe - 257)) | (1L << (Muku - 257)) | (1L << (Kalawa - 257)) | (1L << (Konje - 257)) | (1L << (Sa - 257)) | (1L << (Wala - 257)) | (1L << (Asete - 257)) | (1L << (Akala - 257)) | (1L << (Amo - 257)) | (1L << (Kanta - 257)) | (1L << (Sekano - 257)) | (1L << (Kenelo - 257)) | (1L << (Onko - 257)) | (1L << (Umo - 257)) | (1L << (Pikante - 257)) | (1L << (Posa - 257)) | (1L << (Anta - 257)) | (1L << (Takuwa - 257)) | (1L << (Tawapu - 257)) | (1L << (Lanki - 257)) | (1L << (Titi - 257)) | (1L << (Tapala - 257)) | (1L << (Talili - 257)) | (1L << (Lipan - 257)) | (1L << (Lunti - 257)) | (1L << (Takilo - 257)) | (1L << (Kalan - 257)) | (1L << (Ulokan - 257)) | (1L << (Kontatu - 257)) | (1L << (Mulu - 257)) | (1L << (Watan - 257)) | (1L << (Wili - 257)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (Iputu - 321)) | (1L << (Tina - 321)) | (1L << (Ne - 321)) | (1L << (Titan - 321)) | (1L << (Pon - 321)) | (1L << (Len - 321)) | (1L << (Santi - 321)) | (1L << (Sankan - 321)) | (1L << (One - 321)) | (1L << (Tanu - 321)) | (1L << (Sepo - 321)) | (1L << (Teneme - 321)) | (1L << (Solu - 321)) | (1L << (Tope - 321)) | (1L << (Tamaka - 321)) | (1L << (Tuntan - 321)) | (1L << (Non - 321)) | (1L << (Ewin - 321)) | (1L << (Enteken - 321)) | (1L << (Menwa - 321)) | (1L << (Muntu - 321)) | (1L << (Insu - 321)) | (1L << (Onton - 321)) | (1L << (Kikolo - 321)) | (1L << (Lo - 321)) | (1L << (Tiku - 321)) | (1L << (Ikama - 321)) | (1L << (Inpali - 321)))) != 0)) {
					{
					setState(72);
					contentWord();
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ta) | (1L << Te) | (1L << Wo) | (1L << Lijule) | (1L << Pese) | (1L << Kapaja) | (1L << Kilima) | (1L << Sito) | (1L << Iman) | (1L << Tasuwi) | (1L << Akiki) | (1L << Ukun) | (1L << Aja) | (1L << Sala) | (1L << Talika) | (1L << Kapan) | (1L << Kisa) | (1L << Mata) | (1L << Mutakin) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Konpa) | (1L << Kela) | (1L << Lika) | (1L << Otota) | (1L << Ka) | (1L << Tisilin) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Oti) | (1L << Kota) | (1L << Pani) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Pi) | (1L << Anan) | (1L << Tenkin) | (1L << Patun) | (1L << Sikin) | (1L << Usen) | (1L << Panli) | (1L << Tunti) | (1L << Sinsi) | (1L << Wanku) | (1L << Papon) | (1L << Junja))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Nan - 64)) | (1L << (Ju - 64)) | (1L << (Anpipi - 64)) | (1L << (Ten - 64)) | (1L << (Puka - 64)) | (1L << (Kanisa - 64)) | (1L << (Pulusi - 64)) | (1L << (Muwesi - 64)) | (1L << (Moto - 64)) | (1L << (Pankosi - 64)) | (1L << (Pela - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Tun - 64)) | (1L << (Ela - 64)) | (1L << (Kemika - 64)) | (1L << (Mani - 64)) | (1L << (Oke - 64)) | (1L << (Suwi - 64)) | (1L << (Sin - 64)) | (1L << (Tati - 64)) | (1L << (Tolu - 64)) | (1L << (Lipu - 64)) | (1L << (Osa - 64)) | (1L << (Tomiwa - 64)) | (1L << (Pesuwan - 64)) | (1L << (Ken - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Lan - 64)) | (1L << (Soto - 64)) | (1L << (Eme - 64)) | (1L << (Nin - 64)) | (1L << (Toki - 64)) | (1L << (Ato - 64)) | (1L << (Kumi - 64)) | (1L << (Kapu - 64)) | (1L << (Polan - 64)) | (1L << (Wisan - 64)) | (1L << (Mijalo - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Tawe - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Kiju - 64)) | (1L << (Jone - 64)) | (1L << (Akoli - 64)) | (1L << (Mamaki - 64)) | (1L << (Lana - 64)) | (1L << (Wa - 64)) | (1L << (Ja - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kun - 128)) | (1L << (Kusa - 128)) | (1L << (Tanwa - 128)) | (1L << (Tipa - 128)) | (1L << (Teka - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Tijante - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Niwa - 128)) | (1L << (Pite - 128)) | (1L << (Pasan - 128)) | (1L << (Pintu - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Laki - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Sitija - 128)) | (1L << (Jan - 128)) | (1L << (Makan - 128)) | (1L << (Keke - 128)) | (1L << (Latito - 128)) | (1L << (Ankolo - 128)) | (1L << (Poloko - 128)) | (1L << (Komo - 128)) | (1L << (Matiko - 128)) | (1L << (Mi - 128)) | (1L << (Nelo - 128)) | (1L << (Powele - 128)) | (1L << (Sapole - 128)) | (1L << (Kate - 128)) | (1L << (Sopa - 128)) | (1L << (Suki - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Apijo - 128)) | (1L << (Niku - 128)) | (1L << (Musi - 128)) | (1L << (Kaki - 128)) | (1L << (Akasa - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Kumon - 128)) | (1L << (Namu - 128)) | (1L << (Tuko - 128)) | (1L << (Tuwi - 128)) | (1L << (Olon - 128)) | (1L << (Alu - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Kosan - 192)) | (1L << (Alijun - 192)) | (1L << (Tu - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Malo - 192)) | (1L << (Sena - 192)) | (1L << (Leseka - 192)) | (1L << (Pintan - 192)) | (1L << (Inkatan - 192)) | (1L << (Pen - 192)) | (1L << (Kuwan - 192)) | (1L << (Sipa - 192)) | (1L << (Sintuwan - 192)) | (1L << (Iwe - 192)) | (1L << (Pansin - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Putun - 192)) | (1L << (Kuwosi - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Limijen - 192)) | (1L << (Tajen - 192)) | (1L << (Na - 192)) | (1L << (Tunpu - 192)) | (1L << (Matuwa - 192)) | (1L << (Pa - 192)) | (1L << (Taka - 192)) | (1L << (Kali - 192)) | (1L << (Tune - 192)) | (1L << (Tene - 192)) | (1L << (Namuna - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Jon - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Onja - 192)) | (1L << (Ukama - 192)) | (1L << (Koton - 192)) | (1L << (Mitin - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Konpute - 192)) | (1L << (Nepa - 192)) | (1L << (Kuku - 192)) | (1L << (Meja - 192)) | (1L << (Momu - 192)) | (1L << (Neje - 192)) | (1L << (Pawo - 192)) | (1L << (Tutu - 192)) | (1L << (Ukiki - 192)) | (1L << (Wonpa - 192)) | (1L << (Peman - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (Je - 256)) | (1L << (Jatan - 256)) | (1L << (Kisowa - 256)) | (1L << (Lenka - 256)) | (1L << (Pasu - 256)) | (1L << (Lansa - 256)) | (1L << (Opotu - 256)) | (1L << (Uta - 256)) | (1L << (Maku - 256)) | (1L << (Pelete - 256)) | (1L << (Pitijo - 256)) | (1L << (Sapi - 256)) | (1L << (Tula - 256)) | (1L << (Pata - 256)) | (1L << (Pumi - 256)) | (1L << (Matija - 256)) | (1L << (Waju - 256)) | (1L << (Salila - 256)) | (1L << (Sila - 256)) | (1L << (Ko - 256)) | (1L << (Suwina - 256)) | (1L << (Samo - 256)) | (1L << (Tenja - 256)) | (1L << (Ipuwe - 256)) | (1L << (Muku - 256)) | (1L << (Kalawa - 256)) | (1L << (Konje - 256)) | (1L << (Sa - 256)) | (1L << (Wala - 256)) | (1L << (Asete - 256)) | (1L << (Akala - 256)) | (1L << (Amo - 256)) | (1L << (Kanta - 256)) | (1L << (Sekano - 256)) | (1L << (Kenelo - 256)) | (1L << (Onko - 256)) | (1L << (Umo - 256)) | (1L << (Pikante - 256)) | (1L << (Posa - 256)) | (1L << (Anta - 256)) | (1L << (Takuwa - 256)) | (1L << (Tawapu - 256)) | (1L << (Lanki - 256)) | (1L << (Titi - 256)) | (1L << (Tapala - 256)) | (1L << (Talili - 256)) | (1L << (Lipan - 256)) | (1L << (Lunti - 256)) | (1L << (Takilo - 256)) | (1L << (Kalan - 256)) | (1L << (Ulokan - 256)) | (1L << (Kontatu - 256)) | (1L << (Mulu - 256)) | (1L << (Watan - 256)) | (1L << (Wili - 256)))) != 0) || ((((_la - 321)) & ~0x3f) == 0 && ((1L << (_la - 321)) & ((1L << (Iputu - 321)) | (1L << (Tina - 321)) | (1L << (Ne - 321)) | (1L << (Titan - 321)) | (1L << (Pon - 321)) | (1L << (Len - 321)) | (1L << (Santi - 321)) | (1L << (Sankan - 321)) | (1L << (One - 321)) | (1L << (Tanu - 321)) | (1L << (Sepo - 321)) | (1L << (Teneme - 321)) | (1L << (Solu - 321)) | (1L << (Tope - 321)) | (1L << (Tamaka - 321)) | (1L << (Tuntan - 321)) | (1L << (Non - 321)) | (1L << (Ewin - 321)) | (1L << (Enteken - 321)) | (1L << (Menwa - 321)) | (1L << (Muntu - 321)) | (1L << (Insu - 321)) | (1L << (Onton - 321)) | (1L << (Kikolo - 321)) | (1L << (Lo - 321)) | (1L << (Tiku - 321)) | (1L << (Ikama - 321)) | (1L << (Inpali - 321)))) != 0)) {
						{
						{
						setState(73);
						modifierPhrase();
						}
						}
						setState(78);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(81);
				verbPhrase();
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(82);
						prepositionalClause();
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case Te:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(Te);
				setState(89);
				contentWord();
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(90);
						modifierPhrase();
						}
						} 
					}
					setState(95);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						prepositionalClause();
						}
						} 
					}
					setState(101);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class VerbPhraseContext extends ParserRuleContext {
		public TerminalNode Le() { return getToken(KokanuParser.Le, 0); }
		public List<ContentWordContext> contentWord() {
			return getRuleContexts(ContentWordContext.class);
		}
		public ContentWordContext contentWord(int i) {
			return getRuleContext(ContentWordContext.class,i);
		}
		public List<RelativeClauseContext> relativeClause() {
			return getRuleContexts(RelativeClauseContext.class);
		}
		public RelativeClauseContext relativeClause(int i) {
			return getRuleContext(RelativeClauseContext.class,i);
		}
		public List<TerminalNode> Je() { return getTokens(KokanuParser.Je); }
		public TerminalNode Je(int i) {
			return getToken(KokanuParser.Je, i);
		}
		public List<TerminalNode> Wo() { return getTokens(KokanuParser.Wo); }
		public TerminalNode Wo(int i) {
			return getToken(KokanuParser.Wo, i);
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
		enterRule(_localctx, 8, RULE_verbPhrase);
		int _la;
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Le:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(Le);
				setState(105);
				contentWord();
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(115);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Wo:
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
						case Je:
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
						case Sa:
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
							setState(107);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Wo || _la==Je) {
								{
								setState(106);
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

							setState(110); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(109);
									contentWord();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(112); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							break;
						case Ta:
						case Te:
							{
							setState(114);
							relativeClause();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case O:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(O);
				setState(121);
				contentWord();
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(131);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Wo:
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
						case Je:
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
						case Sa:
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
							setState(123);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==Wo || _la==Je) {
								{
								setState(122);
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

							setState(126); 
							_errHandler.sync(this);
							_alt = 1;
							do {
								switch (_alt) {
								case 1:
									{
									{
									setState(125);
									contentWord();
									}
									}
									break;
								default:
									throw new NoViableAltException(this);
								}
								setState(128); 
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
							} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
							}
							break;
						case Ta:
						case Te:
							{
							setState(130);
							relativeClause();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(135);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class PrepositionalClauseContext extends ParserRuleContext {
		public TerminalNode In() { return getToken(KokanuParser.In, 0); }
		public ContentWordContext contentWord() {
			return getRuleContext(ContentWordContext.class,0);
		}
		public RelativeClauseContext relativeClause() {
			return getRuleContext(RelativeClauseContext.class,0);
		}
		public List<ModifierPhraseContext> modifierPhrase() {
			return getRuleContexts(ModifierPhraseContext.class);
		}
		public ModifierPhraseContext modifierPhrase(int i) {
			return getRuleContext(ModifierPhraseContext.class,i);
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
		public PrepositionalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepositionalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).enterPrepositionalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KokanuParserListener ) ((KokanuParserListener)listener).exitPrepositionalClause(this);
		}
	}

	public final PrepositionalClauseContext prepositionalClause() throws RecognitionException {
		PrepositionalClauseContext _localctx = new PrepositionalClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_prepositionalClause);
		try {
			int _alt;
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case In:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(In);
				setState(147);
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
				case Sa:
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
					setState(139);
					contentWord();
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(140);
							modifierPhrase();
							}
							} 
						}
						setState(145);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					}
					break;
				case Ta:
				case Te:
					{
					setState(146);
					relativeClause();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case Men:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Men);
				setState(150);
				contentWord();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(151);
						modifierPhrase();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case Win:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				match(Win);
				setState(158);
				contentWord();
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(159);
						modifierPhrase();
						}
						} 
					}
					setState(164);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case Po:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(Po);
				setState(166);
				contentWord();
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(167);
						modifierPhrase();
						}
						} 
					}
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case An:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(An);
				setState(174);
				contentWord();
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(175);
						modifierPhrase();
						}
						} 
					}
					setState(180);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			case Wija:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(Wija);
				setState(182);
				contentWord();
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						modifierPhrase();
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
				break;
			case Ke:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(Ke);
				setState(190);
				contentWord();
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						modifierPhrase();
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
				break;
			case Kan:
				enterOuterAlt(_localctx, 8);
				{
				setState(197);
				match(Kan);
				setState(198);
				contentWord();
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(199);
						modifierPhrase();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case So:
				enterOuterAlt(_localctx, 9);
				{
				setState(205);
				match(So);
				setState(206);
				contentWord();
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(207);
						modifierPhrase();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case Sun:
				enterOuterAlt(_localctx, 10);
				{
				setState(213);
				match(Sun);
				setState(214);
				contentWord();
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						modifierPhrase();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case Nenka:
				enterOuterAlt(_localctx, 11);
				{
				setState(221);
				match(Nenka);
				setState(222);
				contentWord();
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						modifierPhrase();
						}
						} 
					}
					setState(228);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class ContentWordContext extends ParserRuleContext {
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_contentWord);
		try {
			setState(235);
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
				setState(231);
				pronoun();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
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
		enterRule(_localctx, 14, RULE_baseVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Pese - 14)) | (1L << (Kilima - 14)) | (1L << (Iman - 14)) | (1L << (Tasuwi - 14)) | (1L << (Ukun - 14)) | (1L << (Kisa - 14)) | (1L << (Kela - 14)) | (1L << (Lika - 14)) | (1L << (Tisilin - 14)) | (1L << (Kota - 14)) | (1L << (Pi - 14)) | (1L << (Anan - 14)) | (1L << (Tenkin - 14)) | (1L << (Papon - 14)) | (1L << (Junja - 14)) | (1L << (Nan - 14)) | (1L << (Ju - 14)) | (1L << (Kanisa - 14)) | (1L << (Pela - 14)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (Tun - 81)) | (1L << (Oke - 81)) | (1L << (Pesuwan - 81)) | (1L << (Ato - 81)) | (1L << (Wisan - 81)) | (1L << (Kun - 81)) | (1L << (Teka - 81)) | (1L << (Tijante - 81)) | (1L << (Niwa - 81)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (Sitija - 157)) | (1L << (Makan - 157)) | (1L << (Sapole - 157)) | (1L << (Suki - 157)) | (1L << (Apijo - 157)) | (1L << (Alu - 157)) | (1L << (Kosan - 157)) | (1L << (Inkatan - 157)) | (1L << (Pen - 157)) | (1L << (Iwe - 157)) | (1L << (Putun - 157)) | (1L << (Tajen - 157)))) != 0) || ((((_la - 225)) & ~0x3f) == 0 && ((1L << (_la - 225)) & ((1L << (Pa - 225)) | (1L << (Tene - 225)) | (1L << (Jon - 225)) | (1L << (Peman - 225)) | (1L << (Jatan - 225)) | (1L << (Lansa - 225)) | (1L << (Sapi - 225)) | (1L << (Pata - 225)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (Akala - 290)) | (1L << (Amo - 290)) | (1L << (Kanta - 290)) | (1L << (Posa - 290)) | (1L << (Anta - 290)) | (1L << (Takuwa - 290)) | (1L << (Tawapu - 290)) | (1L << (Kalan - 290)) | (1L << (Kontatu - 290)) | (1L << (Pon - 290)) | (1L << (Teneme - 290)) | (1L << (Solu - 290)) | (1L << (Onton - 290)))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
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
		enterRule(_localctx, 18, RULE_baseNoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Kapaja) | (1L << Sito) | (1L << Sala) | (1L << Talika) | (1L << Mata) | (1L << Mita) | (1L << Jasa) | (1L << Jamin) | (1L << Apaki) | (1L << Luwa) | (1L << Otota) | (1L << Oti) | (1L << Pani) | (1L << Sikin) | (1L << Sinsi))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Anpipi - 67)) | (1L << (Ten - 67)) | (1L << (Pulusi - 67)) | (1L << (Muwesi - 67)) | (1L << (Moto - 67)) | (1L << (Kemika - 67)) | (1L << (Mani - 67)) | (1L << (Sin - 67)) | (1L << (Tolu - 67)) | (1L << (Lipu - 67)) | (1L << (Osa - 67)) | (1L << (Ken - 67)) | (1L << (Lan - 67)) | (1L << (Soto - 67)) | (1L << (Nin - 67)) | (1L << (Toki - 67)) | (1L << (Kumi - 67)) | (1L << (Polan - 67)) | (1L << (Mijalo - 67)) | (1L << (Tawe - 67)) | (1L << (Kiju - 67)) | (1L << (Jone - 67)) | (1L << (Akoli - 67)) | (1L << (Lana - 67)) | (1L << (Wa - 67)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (Tanwa - 134)) | (1L << (Tipa - 134)) | (1L << (Pite - 134)) | (1L << (Pintu - 134)) | (1L << (Laki - 134)) | (1L << (Jan - 134)) | (1L << (Keke - 134)) | (1L << (Latito - 134)) | (1L << (Ankolo - 134)) | (1L << (Poloko - 134)) | (1L << (Komo - 134)) | (1L << (Powele - 134)) | (1L << (Sopa - 134)) | (1L << (Niku - 134)) | (1L << (Musi - 134)) | (1L << (Kaki - 134)) | (1L << (Akasa - 134)) | (1L << (Kumon - 134)) | (1L << (Namu - 134)) | (1L << (Tuwi - 134)) | (1L << (Alijun - 134)))) != 0) || ((((_la - 199)) & ~0x3f) == 0 && ((1L << (_la - 199)) & ((1L << (Malo - 199)) | (1L << (Leseka - 199)) | (1L << (Pintan - 199)) | (1L << (Kuwan - 199)) | (1L << (Sintuwan - 199)) | (1L << (Pansin - 199)) | (1L << (Kuwosi - 199)) | (1L << (Limijen - 199)) | (1L << (Matuwa - 199)) | (1L << (Kali - 199)) | (1L << (Namuna - 199)) | (1L << (Onja - 199)) | (1L << (Ukama - 199)) | (1L << (Koton - 199)) | (1L << (Mitin - 199)) | (1L << (Konpute - 199)) | (1L << (Kuku - 199)) | (1L << (Meja - 199)) | (1L << (Momu - 199)) | (1L << (Neje - 199)) | (1L << (Pawo - 199)) | (1L << (Ukiki - 199)) | (1L << (Lenka - 199)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (Pelete - 266)) | (1L << (Pitijo - 266)) | (1L << (Pumi - 266)) | (1L << (Matija - 266)) | (1L << (Waju - 266)) | (1L << (Salila - 266)) | (1L << (Sila - 266)) | (1L << (Ko - 266)) | (1L << (Suwina - 266)) | (1L << (Ipuwe - 266)) | (1L << (Muku - 266)) | (1L << (Kalawa - 266)) | (1L << (Wala - 266)) | (1L << (Asete - 266)) | (1L << (Kenelo - 266)) | (1L << (Onko - 266)) | (1L << (Umo - 266)) | (1L << (Lanki - 266)) | (1L << (Titi - 266)) | (1L << (Tapala - 266)) | (1L << (Talili - 266)) | (1L << (Takilo - 266)) | (1L << (Ulokan - 266)) | (1L << (Watan - 266)) | (1L << (Titan - 266)))) != 0) || ((((_la - 336)) & ~0x3f) == 0 && ((1L << (_la - 336)) & ((1L << (Tamaka - 336)) | (1L << (Non - 336)) | (1L << (Ewin - 336)) | (1L << (Enteken - 336)) | (1L << (Menwa - 336)) | (1L << (Insu - 336)) | (1L << (Ikama - 336)) | (1L << (Inpali - 336)))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_baseModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Lijule) | (1L << Akiki) | (1L << Aja) | (1L << Kapan) | (1L << Mutakin) | (1L << Konpa) | (1L << Janlu) | (1L << Jamu) | (1L << Pututi) | (1L << Minuli) | (1L << Unitu) | (1L << Loso) | (1L << Kima) | (1L << Patun) | (1L << Panli) | (1L << Tunti) | (1L << Wanku))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Unsi - 64)) | (1L << (Puka - 64)) | (1L << (Pankosi - 64)) | (1L << (Otan - 64)) | (1L << (Kujo - 64)) | (1L << (Ela - 64)) | (1L << (Suwi - 64)) | (1L << (Tati - 64)) | (1L << (Tomiwa - 64)) | (1L << (Tepu - 64)) | (1L << (Anwije - 64)) | (1L << (Lisi - 64)) | (1L << (Eme - 64)) | (1L << (Kapu - 64)) | (1L << (Neso - 64)) | (1L << (Kaso - 64)) | (1L << (Konen - 64)) | (1L << (Kikuwa - 64)) | (1L << (Mamaki - 64)) | (1L << (Wiki - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (Naki - 128)) | (1L << (Sone - 128)) | (1L << (Katin - 128)) | (1L << (Kula - 128)) | (1L << (Kusa - 128)) | (1L << (Tile - 128)) | (1L << (Tusa - 128)) | (1L << (Nankin - 128)) | (1L << (Nalan - 128)) | (1L << (Pasan - 128)) | (1L << (Pula - 128)) | (1L << (Mepu - 128)) | (1L << (Luka - 128)) | (1L << (Wita - 128)) | (1L << (Saminta - 128)) | (1L << (Sanpanti - 128)) | (1L << (Saman - 128)) | (1L << (Satalan - 128)) | (1L << (Sula - 128)) | (1L << (Matiko - 128)) | (1L << (Nelo - 128)) | (1L << (Kate - 128)) | (1L << (Osole - 128)) | (1L << (Umami - 128)) | (1L << (Juka - 128)) | (1L << (Tenti - 128)) | (1L << (Kawa - 128)) | (1L << (Penpe - 128)) | (1L << (Tuko - 128)) | (1L << (Olon - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (Kuto - 192)) | (1L << (Asa - 192)) | (1L << (Kijata - 192)) | (1L << (Sena - 192)) | (1L << (Sipa - 192)) | (1L << (Si - 192)) | (1L << (Joli - 192)) | (1L << (Tonsa - 192)) | (1L << (Kuwanko - 192)) | (1L << (Timi - 192)) | (1L << (Tunpu - 192)) | (1L << (Taka - 192)) | (1L << (Tune - 192)) | (1L << (Nile - 192)) | (1L << (Panta - 192)) | (1L << (Tonko - 192)) | (1L << (Sunkan - 192)) | (1L << (Lito - 192)) | (1L << (Lamo - 192)) | (1L << (Aluko - 192)) | (1L << (Nepa - 192)) | (1L << (Tutu - 192)) | (1L << (Wonpa - 192)) | (1L << (Napa - 192)) | (1L << (Nase - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (Kisowa - 258)) | (1L << (Pasu - 258)) | (1L << (Opotu - 258)) | (1L << (Uta - 258)) | (1L << (Maku - 258)) | (1L << (Tula - 258)) | (1L << (Samo - 258)) | (1L << (Tenja - 258)) | (1L << (Konje - 258)) | (1L << (Sekano - 258)) | (1L << (Pikante - 258)) | (1L << (Lipan - 258)) | (1L << (Lunti - 258)) | (1L << (Mulu - 258)) | (1L << (Wili - 258)) | (1L << (Iputu - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (Tina - 322)) | (1L << (Len - 322)) | (1L << (Santi - 322)) | (1L << (Sankan - 322)) | (1L << (One - 322)) | (1L << (Tanu - 322)) | (1L << (Sepo - 322)) | (1L << (Tope - 322)) | (1L << (Tuntan - 322)) | (1L << (Muntu - 322)) | (1L << (Kikolo - 322)) | (1L << (Lo - 322)) | (1L << (Tiku - 322)))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_connector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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

	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode Jati() { return getToken(KokanuParser.Jati, 0); }
		public TerminalNode Mese() { return getToken(KokanuParser.Mese, 0); }
		public TerminalNode Nula() { return getToken(KokanuParser.Nula, 0); }
		public TerminalNode Wan() { return getToken(KokanuParser.Wan, 0); }
		public TerminalNode Lijo() { return getToken(KokanuParser.Lijo, 0); }
		public TerminalNode Lima() { return getToken(KokanuParser.Lima, 0); }
		public TerminalNode San() { return getToken(KokanuParser.San, 0); }
		public TerminalNode Menu() { return getToken(KokanuParser.Menu, 0); }
		public TerminalNode Setan() { return getToken(KokanuParser.Setan, 0); }
		public TerminalNode Saka() { return getToken(KokanuParser.Saka, 0); }
		public TerminalNode Sijen() { return getToken(KokanuParser.Sijen, 0); }
		public TerminalNode Toso() { return getToken(KokanuParser.Toso, 0); }
		public TerminalNode Tiju() { return getToken(KokanuParser.Tiju, 0); }
		public TerminalNode Etu() { return getToken(KokanuParser.Etu, 0); }
		public TerminalNode Nanku() { return getToken(KokanuParser.Nanku, 0); }
		public TerminalNode Ani() { return getToken(KokanuParser.Ani, 0); }
		public TerminalNode Pan() { return getToken(KokanuParser.Pan, 0); }
		public TerminalNode Niju() { return getToken(KokanuParser.Niju, 0); }
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
		enterRule(_localctx, 24, RULE_quantity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Jati - 63)) | (1L << (Mese - 63)) | (1L << (Nula - 63)) | (1L << (Wan - 63)) | (1L << (Lijo - 63)))) != 0) || _la==Lima || _la==San || ((((_la - 262)) & ~0x3f) == 0 && ((1L << (_la - 262)) & ((1L << (Menu - 262)) | (1L << (Setan - 262)) | (1L << (Saka - 262)) | (1L << (Sijen - 262)) | (1L << (Toso - 262)) | (1L << (Tiju - 262)) | (1L << (Etu - 262)) | (1L << (Nanku - 262)) | (1L << (Ani - 262)))) != 0) || _la==Pan || _la==Niju) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0163\u00fc\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\3\7\3\62\n\3\f"+
		"\3\16\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\5\3=\n\3\3\4\5\4@\n\4\3\4"+
		"\6\4C\n\4\r\4\16\4D\3\4\5\4H\n\4\3\5\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\5"+
		"\5R\n\5\3\5\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5"+
		"a\13\5\3\5\7\5d\n\5\f\5\16\5g\13\5\5\5i\n\5\3\6\3\6\3\6\5\6n\n\6\3\6\6"+
		"\6q\n\6\r\6\16\6r\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\5\6~\n\6\3\6"+
		"\6\6\u0081\n\6\r\6\16\6\u0082\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\5"+
		"\6\u008b\n\6\3\7\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\7\5\7\u0096"+
		"\n\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\7\3\7\3\7\7\7\u00a3"+
		"\n\7\f\7\16\7\u00a6\13\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7"+
		"\3\7\3\7\3\7\7\7\u00b3\n\7\f\7\16\7\u00b6\13\7\3\7\3\7\3\7\7\7\u00bb\n"+
		"\7\f\7\16\7\u00be\13\7\3\7\3\7\3\7\7\7\u00c3\n\7\f\7\16\7\u00c6\13\7\3"+
		"\7\3\7\3\7\7\7\u00cb\n\7\f\7\16\7\u00ce\13\7\3\7\3\7\3\7\7\7\u00d3\n\7"+
		"\f\7\16\7\u00d6\13\7\3\7\3\7\3\7\7\7\u00db\n\7\f\7\16\7\u00de\13\7\3\7"+
		"\3\7\3\7\7\7\u00e3\n\7\f\7\16\7\u00e6\13\7\5\7\u00e8\n\7\3\b\3\b\3\b\3"+
		"\b\5\b\u00ee\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\t\4\2\16\16\u0102\u0102"+
		"\63\2\20\20\22\22\24\25\27\27\34\34&\'**\60\60\65\67?@CDIIOOSSYYbbnns"+
		"s\u0086\u0086\u008a\u008a\u008d\u008d\u0090\u0090\u009f\u009f\u00a2\u00a2"+
		"\u00ad\u00ad\u00b0\u00b0\u00b4\u00b4\u00c1\u00c1\u00c3\u00c3\u00cd\u00cd"+
		"\u00cf\u00cf\u00d4\u00d4\u00d8\u00d8\u00de\u00de\u00e3\u00e3\u00e7\u00e7"+
		"\u00eb\u00eb\u00ff\u00ff\u0103\u0103\u0107\u0107\u010e\u010e\u0111\u0111"+
		"\u0124\u0126\u012e\u0131\u013a\u013a\u013d\u013d\u0147\u0147\u014f\u0150"+
		"\u015d\u015d\n\2))::\u0080\u0080\u00a9\u00a9\u00c5\u00c5\u00e0\u00e0\u0120"+
		"\u0120\u0145\u0145I\2\21\21\23\23\31\32\36\36 $((//\61\6199==EEGGJLUU"+
		"WW\\\\^`ccghjjlloorrttwwz|~\177\u0088\u0089\u0091\u0091\u0093\u0093\u0097"+
		"\u0097\u00a1\u00a1\u00a3\u00a7\u00ab\u00ab\u00af\u00af\u00b5\u00b8\u00bc"+
		"\u00bd\u00bf\u00bf\u00c4\u00c4\u00c9\u00c9\u00cb\u00cc\u00d1\u00d1\u00d3"+
		"\u00d3\u00d5\u00d5\u00d9\u00d9\u00dd\u00dd\u00e2\u00e2\u00e5\u00e5\u00e8"+
		"\u00e8\u00ee\u00f1\u00f5\u00f5\u00f7\u00fb\u00fd\u00fd\u0105\u0105\u010c"+
		"\u010d\u0112\u0117\u0119\u0119\u011c\u011e\u0122\u0123\u012a\u012c\u0132"+
		"\u0133\u0135\u0136\u0139\u0139\u013b\u013b\u0140\u0140\u0146\u0146\u0152"+
		"\u0152\u0155\u0155\u0157\u0159\u015c\u015c\u0161\u0162J\2\17\17\26\26"+
		"\30\30\33\33\37\37%%+.\62\6488;<>>BBHHMMPQTT[[]]aadfiippuvxy}}\u0081\u0085"+
		"\u0087\u0087\u008b\u008c\u008e\u008f\u0092\u0092\u0094\u0096\u0099\u009e"+
		"\u00a8\u00a8\u00aa\u00aa\u00ae\u00ae\u00b1\u00b3\u00b9\u00bb\u00be\u00be"+
		"\u00c0\u00c0\u00c2\u00c2\u00c7\u00c8\u00ca\u00ca\u00d2\u00d2\u00d6\u00d7"+
		"\u00da\u00dc\u00e1\u00e1\u00e4\u00e4\u00e6\u00e6\u00e9\u00ea\u00ec\u00ed"+
		"\u00f2\u00f4\u00f6\u00f6\u00fc\u00fc\u00fe\u00fe\u0100\u0101\u0104\u0104"+
		"\u0106\u0106\u0109\u010b\u0110\u0110\u011a\u011b\u011f\u011f\u0127\u0127"+
		"\u012d\u012d\u0137\u0138\u013f\u013f\u0141\u0141\u0143\u0144\u0149\u014e"+
		"\u0151\u0151\u0153\u0153\u015b\u015b\u015e\u0160\6\2RRqq\u0098\u0098\u010f"+
		"\u010f\23\2AAFFNNZZkk\u00a0\u00a0\u00d0\u00d0\u0108\u0108\u0118\u0118"+
		"\u0121\u0121\u0128\u0129\u0134\u0134\u013c\u013c\u013e\u013e\u0142\u0142"+
		"\u0148\u0148\u0154\u0154\2\u0120\2\35\3\2\2\2\4<\3\2\2\2\6G\3\2\2\2\b"+
		"h\3\2\2\2\n\u008a\3\2\2\2\f\u00e7\3\2\2\2\16\u00ed\3\2\2\2\20\u00ef\3"+
		"\2\2\2\22\u00f1\3\2\2\2\24\u00f3\3\2\2\2\26\u00f5\3\2\2\2\30\u00f7\3\2"+
		"\2\2\32\u00f9\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\3\2\2\2\37#\5\n\6\2 \"\5\f\7\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2"+
		"\2$\3\3\2\2\2%#\3\2\2\2&+\5\16\b\2\'*\5\b\5\2(*\5\6\4\2)\'\3\2\2\2)(\3"+
		"\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,=\3\2\2\2-+\3\2\2\2./\7\13\2\2/\63"+
		"\5\16\b\2\60\62\5\6\4\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5\f\7\2\67\66\3\2\2\28;\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<&\3\2\2\2<.\3\2\2\2=\5\3\2"+
		"\2\2>@\t\2\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\5\16\b\2BA\3\2\2\2CD\3"+
		"\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FH\5\b\5\2G?\3\2\2\2GF\3\2\2\2H\7"+
		"\3\2\2\2IQ\7\n\2\2JN\5\16\b\2KM\5\6\4\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QJ\3\2\2\2QR\3\2\2\2RS\3\2\2\2SW\5\n\6\2"+
		"TV\5\f\7\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xi\3\2\2\2YW\3\2\2\2"+
		"Z[\7\13\2\2[_\5\16\b\2\\^\5\6\4\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2"+
		"\2\2`e\3\2\2\2a_\3\2\2\2bd\5\f\7\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2hI\3\2\2\2hZ\3\2\2\2i\t\3\2\2\2jk\7\7\2\2kw\5"+
		"\16\b\2ln\t\2\2\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\16\b\2po\3\2\2\2q"+
		"r\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tv\5\b\5\2um\3\2\2\2ut\3\2\2\2"+
		"vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\u008b\3\2\2\2yw\3\2\2\2z{\7\t\2\2{\u0087"+
		"\5\16\b\2|~\t\2\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081\5\16"+
		"\b\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0086\5\b\5\2\u0085}\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008aj\3\2\2\2\u008az\3\2"+
		"\2\2\u008b\13\3\2\2\2\u008c\u0095\7\6\2\2\u008d\u0091\5\16\b\2\u008e\u0090"+
		"\5\6\4\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0096\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\5\b"+
		"\5\2\u0095\u008d\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u00e8\3\2\2\2\u0097"+
		"\u0098\7\b\2\2\u0098\u009c\5\16\b\2\u0099\u009b\5\6\4\2\u009a\u0099\3"+
		"\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00e8\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a4\5\16"+
		"\b\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00e8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a8\7V\2\2\u00a8\u00ac\5\16\b\2\u00a9\u00ab\5\6\4\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00e8\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7m\2\2\u00b0"+
		"\u00b4\5\16\b\2\u00b1\u00b3\5\6\4\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00e8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00b8\7\u00c6\2\2\u00b8\u00bc\5\16\b\2\u00b9\u00bb"+
		"\5\6\4\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00e8\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7\u00ce"+
		"\2\2\u00c0\u00c4\5\16\b\2\u00c1\u00c3\5\6\4\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00e8\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\u00df\2\2\u00c8\u00cc\5\16\b\2"+
		"\u00c9\u00cb\5\6\4\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00e8\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d0\7\u0156\2\2\u00d0\u00d4\5\16\b\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00e8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\u015a\2\2\u00d8\u00dc"+
		"\5\16\b\2\u00d9\u00db\5\6\4\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e8\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\7\u0163\2\2\u00e0\u00e4\5\16\b\2\u00e1\u00e3\5\6"+
		"\4\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u008c\3\2"+
		"\2\2\u00e7\u0097\3\2\2\2\u00e7\u009f\3\2\2\2\u00e7\u00a7\3\2\2\2\u00e7"+
		"\u00af\3\2\2\2\u00e7\u00b7\3\2\2\2\u00e7\u00bf\3\2\2\2\u00e7\u00c7\3\2"+
		"\2\2\u00e7\u00cf\3\2\2\2\u00e7\u00d7\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8"+
		"\r\3\2\2\2\u00e9\u00ee\5\22\n\2\u00ea\u00ee\5\24\13\2\u00eb\u00ee\5\20"+
		"\t\2\u00ec\u00ee\5\26\f\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\17\3\2\2\2\u00ef\u00f0\t\3\2"+
		"\2\u00f0\21\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2\23\3\2\2\2\u00f3\u00f4\t"+
		"\5\2\2\u00f4\25\3\2\2\2\u00f5\u00f6\t\6\2\2\u00f6\27\3\2\2\2\u00f7\u00f8"+
		"\t\7\2\2\u00f8\31\3\2\2\2\u00f9\u00fa\t\b\2\2\u00fa\33\3\2\2\2)\35#)+"+
		"\639<?DGNQW_ehmruw}\u0082\u0085\u0087\u008a\u0091\u0095\u009c\u00a4\u00ac"+
		"\u00b4\u00bc\u00c4\u00cc\u00d4\u00dc\u00e4\u00e7\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}