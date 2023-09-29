// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KokanuParser}.
 */
public interface KokanuParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KokanuParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(KokanuParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(KokanuParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#leadingSubject}.
	 * @param ctx the parse tree
	 */
	void enterLeadingSubject(KokanuParser.LeadingSubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#leadingSubject}.
	 * @param ctx the parse tree
	 */
	void exitLeadingSubject(KokanuParser.LeadingSubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(KokanuParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(KokanuParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#adjectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterAdjectiveClause(KokanuParser.AdjectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#adjectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitAdjectiveClause(KokanuParser.AdjectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(KokanuParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(KokanuParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#prepositions}.
	 * @param ctx the parse tree
	 */
	void enterPrepositions(KokanuParser.PrepositionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#prepositions}.
	 * @param ctx the parse tree
	 */
	void exitPrepositions(KokanuParser.PrepositionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(KokanuParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(KokanuParser.NounContext ctx);
}