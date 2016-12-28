import antlr4.ProgramBaseVisitor;
import antlr4.ProgramParser;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandVisitor extends ProgramBaseVisitor<String> {
    private String name;
    private String action;
    private String type;
    private List<String> RUN = Arrays.asList("run", "open", "launch", "start", "go");
    private List<String> CLOSE = Arrays.asList("close", "exit", "shut", "stop");

    @Override
    public String visitNazwa(ProgramParser.NazwaContext ctx) {
        try {
            name = ctx.TEXT().getText();
            visitTyp(ctx.typ());
            return name;
        } catch (Exception ex) {
            System.out.print("name: " + ex.getMessage());
        }
        return "";
    }

    @Override
    public String visitTyp(ProgramParser.TypContext ctx) {
            try {
                type = ctx.TYPE_WORD().getText();
                visitCzasownik(ctx.czasownik());
                return ctx.TYPE_WORD().getText();
            }catch (Exception ex) {
                System.out.print("city: " + ex.getMessage());
            }
            return "";
        }
    @Override
    public String visitCzasownik(ProgramParser.CzasownikContext ctx) {
        try {
            action = ctx.LOCATION().getText();
            visitPytajnik(ctx.pytajnik());
            return ctx.LOCATION().getText();
        } catch (Exception ex) {
            System.out.print("type: " + ex.getMessage());
        }
        return "";
    }

    @Override
    public String visitPytajnik(ProgramParser.PytajnikContext ctx) {
        try {
                chooseType();
                return ctx.QUESTION_WORD().getText();
        } catch (Exception ex) {
            System.out.print("action: " + ex.getMessage());
        }
        return "";
    }

    @Override
    public String visitInnyTekst(ProgramParser.InnyTekstContext ctx) {
        return "";
    }

    @Override
    public String visitQuestion(ProgramParser.QuestionContext ctx) {
        try {
            visitNazwa(ctx.nazwa(0));
            return ctx.nazwa().get(0).getText();
        } catch (Exception ex) {
            System.out.print("question: " + ex.getMessage());
        }
        return "";
    }

    private void chooseType() {
        if(type.equals("miasto")) {
            goToCity();
            System.out.print(type);
        } else if(type.equals("osoba")) {
            goToPerson();
        }
    }

    private void goToCity() {
        Controller controller = new Controller();
        controller.getCityInformations(name, "abstract");
    }
    private void goToPerson() {
        Controller controller = new Controller();
        controller.getCityInformations(name, "abstract");
    }
}
