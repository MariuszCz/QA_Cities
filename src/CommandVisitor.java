import antlr4.ProgramBaseVisitor;
import antlr4.ProgramParser;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandVisitor extends ProgramBaseVisitor<String> {
    private String name;
    private String action;
    private String type;
    private String noun;

    private List<String> ABSTRACT = Arrays.asList("lezy","jest","polozone","znajduje");
    private List<String> AREA = Arrays.asList("powierzchnia","wielkosc");

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
                visitRzeczownik(ctx.rzeczownik());
                return ctx.TYPE_WORD().getText();
            }catch (Exception ex) {
                System.out.print("city: " + ex.getMessage());
            }
            return "";
        }

    @Override
    public String visitRzeczownik(ProgramParser.RzeczownikContext ctx) {
        try {
            noun = ctx.NOUN().getText();
            visitCzasownik(ctx.czasownik());
            return ctx.NOUN().getText();
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
        if(patternCity(type)) {
            goToCity();
        } else if(patternPerson(type)) {
            goToPerson();
        }
    }

    private void goToCity() {
        Controller controller = new Controller();
        if(patternAbout(action) || patternAbout2(noun)) {
            controller.getCityInformations(name, "abstract");
        }
        if(patternPopulation(noun)) {
            controller.getCityInformations(name, "populationTotal");
        }
        if(patternArea(noun)) {
            controller.getCityInformations(name, "areaTotalKm");
        }
        if(patternPoint(noun)) {
            controller.getCityInformations(name, "point");
        }
    }
    private void goToPerson() {
        Controller controller = new Controller();
        controller.getCityInformations(name, "abstract");
    }

    private boolean patternCity(String pattern) {
        Pattern pattern1 = Pattern.compile("(miast|miesc).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternPerson(String pattern) {
        Pattern pattern1 = Pattern.compile("(osob).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternAbout(String pattern) {
        Pattern pattern1 = Pattern.compile("(lez|znajduj).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternAbout2(String pattern) {
        Pattern pattern1 = Pattern.compile("(poloz).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternPopulation(String pattern) {
        Pattern pattern1 = Pattern.compile("(lud).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternArea(String pattern) {
        Pattern pattern1 = Pattern.compile("(powierz).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternPoint(String pattern) {
        Pattern pattern1 = Pattern.compile("(wsp).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

}
