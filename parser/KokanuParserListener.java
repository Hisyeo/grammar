// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link KokanuParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void enterNounPhrase(KokanuParser.NounPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#nounPhrase}.
	 * @param ctx the parse tree
	 */
	void exitNounPhrase(KokanuParser.NounPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#modifierPhrase}.
	 * @param ctx the parse tree
	 */
	void enterModifierPhrase(KokanuParser.ModifierPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#modifierPhrase}.
	 * @param ctx the parse tree
	 */
	void exitModifierPhrase(KokanuParser.ModifierPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#relativeClause}.
	 * @param ctx the parse tree
	 */
	void enterRelativeClause(KokanuParser.RelativeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#relativeClause}.
	 * @param ctx the parse tree
	 */
	void exitRelativeClause(KokanuParser.RelativeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void enterVerbPhrase(KokanuParser.VerbPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#verbPhrase}.
	 * @param ctx the parse tree
	 */
	void exitVerbPhrase(KokanuParser.VerbPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#prepositionalClause}.
	 * @param ctx the parse tree
	 */
	void enterPrepositionalClause(KokanuParser.PrepositionalClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#prepositionalClause}.
	 * @param ctx the parse tree
	 */
	void exitPrepositionalClause(KokanuParser.PrepositionalClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#contentWord}.
	 * @param ctx the parse tree
	 */
	void enterContentWord(KokanuParser.ContentWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#contentWord}.
	 * @param ctx the parse tree
	 */
	void exitContentWord(KokanuParser.ContentWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#baseVerb}.
	 * @param ctx the parse tree
	 */
	void enterBaseVerb(KokanuParser.BaseVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#baseVerb}.
	 * @param ctx the parse tree
	 */
	void exitBaseVerb(KokanuParser.BaseVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void enterPronoun(KokanuParser.PronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void exitPronoun(KokanuParser.PronounContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#baseNoun}.
	 * @param ctx the parse tree
	 */
	void enterBaseNoun(KokanuParser.BaseNounContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#baseNoun}.
	 * @param ctx the parse tree
	 */
	void exitBaseNoun(KokanuParser.BaseNounContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#baseModifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseModifier(KokanuParser.BaseModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#baseModifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseModifier(KokanuParser.BaseModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#connector}.
	 * @param ctx the parse tree
	 */
	void enterConnector(KokanuParser.ConnectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#connector}.
	 * @param ctx the parse tree
	 */
	void exitConnector(KokanuParser.ConnectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(KokanuParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(KokanuParser.QuantityContext ctx);
}