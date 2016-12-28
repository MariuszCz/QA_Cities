// Generated from C:/Users/Mariusz/Documents/PJN/QA_Cities/src/antlr4\Program.g4 by ANTLR 4.5.3
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramParser}.
 */
public interface ProgramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramParser#innyTekst}.
	 * @param ctx the parse tree
	 */
	void enterInnyTekst(ProgramParser.InnyTekstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#innyTekst}.
	 * @param ctx the parse tree
	 */
	void exitInnyTekst(ProgramParser.InnyTekstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#pytajnik}.
	 * @param ctx the parse tree
	 */
	void enterPytajnik(ProgramParser.PytajnikContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#pytajnik}.
	 * @param ctx the parse tree
	 */
	void exitPytajnik(ProgramParser.PytajnikContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#czasownik}.
	 * @param ctx the parse tree
	 */
	void enterCzasownik(ProgramParser.CzasownikContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#czasownik}.
	 * @param ctx the parse tree
	 */
	void exitCzasownik(ProgramParser.CzasownikContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterTyp(ProgramParser.TypContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitTyp(ProgramParser.TypContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#nazwa}.
	 * @param ctx the parse tree
	 */
	void enterNazwa(ProgramParser.NazwaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#nazwa}.
	 * @param ctx the parse tree
	 */
	void exitNazwa(ProgramParser.NazwaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(ProgramParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(ProgramParser.QuestionContext ctx);
}