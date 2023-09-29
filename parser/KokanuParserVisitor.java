// Generated from /home/jake/Code/antlr-kokanu/grammar/KokanuParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KokanuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KokanuParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KokanuParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(KokanuParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#leadingSubject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadingSubject(KokanuParser.LeadingSubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(KokanuParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#adjectiveClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjectiveClause(KokanuParser.AdjectiveClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(KokanuParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#prepositions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepositions(KokanuParser.PrepositionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KokanuParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(KokanuParser.NounContext ctx);
}