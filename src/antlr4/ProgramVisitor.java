// Generated from C:/Users/Mariusz/Documents/PJN/QA_Cities/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramParser#innyTekst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnyTekst(ProgramParser.InnyTekstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#pytajnik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPytajnik(ProgramParser.PytajnikContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#czasownik}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCzasownik(ProgramParser.CzasownikContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyp(ProgramParser.TypContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#nazwa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNazwa(ProgramParser.NazwaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(ProgramParser.QuestionContext ctx);
}