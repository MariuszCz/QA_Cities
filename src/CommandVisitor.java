import antlr4.ProgramBaseVisitor;
import antlr4.ProgramParser;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Mariusz on 04.12.2016.
 */
public class CommandVisitor extends ProgramBaseVisitor<String> {
    private String name="";
    private String action="";
    private String type="";
    private String noun="";
    private String surname="";
    private String questionType="";

    @Override
    public String visitNazwa(ProgramParser.NazwaContext ctx) {
        try {
            if(ctx.TEXT().size()>1) {
                name = ctx.TEXT().get(0).getText();
                surname = ctx.TEXT().get(1).getText();
            }
            else {
                name = ctx.TEXT().get(0).getText();
            }
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
                if(ctx.TYPE_WORD().size()>0) {
                    type = ctx.TYPE_WORD().get(0).getText();
                }
                visitRzeczownik(ctx.rzeczownik());
                return "";
            }catch (Exception ex) {
                System.out.print("city: " + ex.getMessage());
            }
            return "";
        }

    @Override
    public String visitRzeczownik(ProgramParser.RzeczownikContext ctx) {
        try {
            if(ctx.NOUN().size()>0) {
                noun = ctx.NOUN().get(0).getText();
            }
            visitCzasownik(ctx.czasownik());
            return "";
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
                questionType = ctx.QUESTION_WORD().getText();
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
        if(!surname.equals("")) {
            name = name + " " + surname;
        }
        if(patternCity(type)) {
            goToCity();
        } else if(patternPerson(type)) {
            goToPerson();
        } else {
            goToCity();
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
        if(patternCode(noun)) {
            controller.getCityInformations(name, "postalCode");
        }
        if(patternTimeZone(noun)) {
            controller.getCityInformations(name, "timeZone");
        }
        if(patternCountry(noun)) {
            controller.getCityInformations(name, "country");
        }
        if(patternPart(noun)) {
            controller.getCityInformations(name, "part");
        }
        if(patternImage(action)) {
            controller.getCityInformations(name, "thumbnail");
        }
    }
    private void goToPerson() {
        Controller controller = new Controller();
        if(questionType.compareToIgnoreCase("Kim")==0) {
            controller.getPersonInformations(name, "abstract");
        }
        if(patternBirthDate(action) && questionType.compareToIgnoreCase("Kiedy")==0) {
            controller.getPersonInformations(name, "birthDate");
        }
        if(patternDeathDate(action) && questionType.compareToIgnoreCase("Kiedy")==0) {
            controller.getPersonInformations(name, "deathDate");
        }
        if(patternBirthDate(action) && questionType.compareToIgnoreCase("Gdzie")==0) {
            controller.getPersonInformations(name, "birthPlace");
        }
        if(patternDeathDate(action) && questionType.compareToIgnoreCase("Gdzie")==0) {
            controller.getPersonInformations(name, "deathPlace");
        }
        if(patternSpouse(noun)) {
            controller.getPersonInformations(name, "spouse");
        }
        if(patternImage(action)) {
            controller.getPersonInformations(name, "depiction");
        }

    }

    private boolean patternCity(String pattern) {
        Pattern pattern1 = Pattern.compile("(miast|miesc|miejsc).*[a-z].*");
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
        Pattern pattern1 = Pattern.compile("(lud|mieszk).*[a-z].*");
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

    private boolean patternCode(String pattern) {
        Pattern pattern1 = Pattern.compile("(ko|poczt).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternTimeZone(String pattern) {
        Pattern pattern1 = Pattern.compile("(stref|cza).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternCountry(String pattern) {
        Pattern pattern1 = Pattern.compile("(kra|panst).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternPart(String pattern) {
        Pattern pattern1 = Pattern.compile("(dzielni|rejo).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternBirthDate(String pattern) {
        Pattern pattern1 = Pattern.compile("(urodz).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternDeathDate(String pattern) {
        Pattern pattern1 = Pattern.compile("(zmar|umar).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternSpouse(String pattern) {
        Pattern pattern1 = Pattern.compile("(malz|zon|mez).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }

    private boolean patternImage(String pattern) {
        Pattern pattern1 = Pattern.compile("(wygla).*[a-z].*");
        return pattern1.matcher(pattern).find();
    }
}
