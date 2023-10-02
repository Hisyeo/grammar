// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KokanuParser}.
 */
public interface KokanuParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KokanuParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(KokanuParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(KokanuParser.SentencesContext ctx);
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
	 * Enter a parse tree produced by {@link KokanuParser#sentenceClause}.
	 * @param ctx the parse tree
	 */
	void enterSentenceClause(KokanuParser.SentenceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#sentenceClause}.
	 * @param ctx the parse tree
	 */
	void exitSentenceClause(KokanuParser.SentenceClauseContext ctx);
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
	 * Enter a parse tree produced by {@link KokanuParser#nounClause}.
	 * @param ctx the parse tree
	 */
	void enterNounClause(KokanuParser.NounClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#nounClause}.
	 * @param ctx the parse tree
	 */
	void exitNounClause(KokanuParser.NounClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#modifierClause}.
	 * @param ctx the parse tree
	 */
	void enterModifierClause(KokanuParser.ModifierClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#modifierClause}.
	 * @param ctx the parse tree
	 */
	void exitModifierClause(KokanuParser.ModifierClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#newAgentAdjClause}.
	 * @param ctx the parse tree
	 */
	void enterNewAgentAdjClause(KokanuParser.NewAgentAdjClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#newAgentAdjClause}.
	 * @param ctx the parse tree
	 */
	void exitNewAgentAdjClause(KokanuParser.NewAgentAdjClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#sameAgentAdjClause}.
	 * @param ctx the parse tree
	 */
	void enterSameAgentAdjClause(KokanuParser.SameAgentAdjClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#sameAgentAdjClause}.
	 * @param ctx the parse tree
	 */
	void exitSameAgentAdjClause(KokanuParser.SameAgentAdjClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(KokanuParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(KokanuParser.TerminatorContext ctx);
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
	 * Enter a parse tree produced by {@link KokanuParser#quantityPhrase}.
	 * @param ctx the parse tree
	 */
	void enterQuantityPhrase(KokanuParser.QuantityPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#quantityPhrase}.
	 * @param ctx the parse tree
	 */
	void exitQuantityPhrase(KokanuParser.QuantityPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#prepPhrase}.
	 * @param ctx the parse tree
	 */
	void enterPrepPhrase(KokanuParser.PrepPhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#prepPhrase}.
	 * @param ctx the parse tree
	 */
	void exitPrepPhrase(KokanuParser.PrepPhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#prepClause}.
	 * @param ctx the parse tree
	 */
	void enterPrepClause(KokanuParser.PrepClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#prepClause}.
	 * @param ctx the parse tree
	 */
	void exitPrepClause(KokanuParser.PrepClauseContext ctx);
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
	 * Enter a parse tree produced by {@link KokanuParser#expandedWord}.
	 * @param ctx the parse tree
	 */
	void enterExpandedWord(KokanuParser.ExpandedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#expandedWord}.
	 * @param ctx the parse tree
	 */
	void exitExpandedWord(KokanuParser.ExpandedWordContext ctx);
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
	 * Enter a parse tree produced by {@link KokanuParser#relativeQuantity}.
	 * @param ctx the parse tree
	 */
	void enterRelativeQuantity(KokanuParser.RelativeQuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#relativeQuantity}.
	 * @param ctx the parse tree
	 */
	void exitRelativeQuantity(KokanuParser.RelativeQuantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link KokanuParser#nominalQuantity}.
	 * @param ctx the parse tree
	 */
	void enterNominalQuantity(KokanuParser.NominalQuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link KokanuParser#nominalQuantity}.
	 * @param ctx the parse tree
	 */
	void exitNominalQuantity(KokanuParser.NominalQuantityContext ctx);
}