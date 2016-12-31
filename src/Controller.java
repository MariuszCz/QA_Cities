import antlr4.ProgramLexer;
import antlr4.ProgramParser;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Controller {
    TextField textField;
    WebView webView;
    @FXML
    public TextField inputText;

    @FXML
    public TextField outputText;

    @FXML
    public ImageView imageView;

    @FXML
    void runProgram(ActionEvent event) {
        printTree(inputText.getText());
    }


    public void printTree(String sentence) {
        // Get our lexer
        ProgramLexer lexer = new ProgramLexer(new ANTLRInputStream(sentence));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser

        ProgramParser parser = new ProgramParser(tokens);
        ParseTree command = parser.question();
        CommandVisitor visitor = new CommandVisitor();

        AST ast = new AST(command);
        System.out.print(ast);
        for(int i=0; i<command.getChildCount();i++) {
            if (command.getChild(i) != null) {
                visitor.visit(command.getChild(i));
            }
        }
    }

        public void getCityInformations(String name, String field) {
            ParameterizedSparqlString qs = new ParameterizedSparqlString("" +
                    " PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                    " PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
                    " PREFIX dbp: <http://dbpedia.org/property/>\n" +
                    " PREFIX geo: <http://www.georss.org/georss/>\n" +
                    " select *  where {\n" +
                    " ?city rdfs:label ?label .\n" +
                    " ?city dbo:abstract ?abstract .\n" +
                    " ?city dbo:country ?country .\n" +
                    " OPTIONAL{\n" +
                    " ?city dbp:populationTotal ?populationTotal .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:knownFor ?knownfor .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:areaTotal ?areaTotalKm .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city geo:point ?point .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:postalCode ?postalCode .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:timeZone ?timeZone .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:part ?part .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:birthPlace ?birthPlace .\n" +
                    "}\n" +
                    " OPTIONAL{\n" +
                    " ?city dbo:thumbnail ?thumbnail .\n" +
                    "}\n" +
                    " FILTER ( lang(?abstract) = 'pl')\n" +
                    "}\n"
            );

            Literal city = ResourceFactory.createLangLiteral(name, "pl");
            qs.setParam("label", city);

          //  System.out.println(qs);

            QueryExecution exec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", qs.asQuery());

            ResultSet results = exec.execSelect();

            List<String> list = new ArrayList<>();
            while (results.hasNext()) {
                QuerySolution sol = (QuerySolution) results.next();
                String out = sol.get(field).toString();
                list.add(out);
            }
                if (field.equals("timeZone") | field.equals("country") | field.equals("part") | field.equals("birthPlace")) {

                    getSpecificInformation(list);
                } else if (field.equals("thumbnail")) {
                    webPage(list.get(0));
                } else if(field.equals("point")) {
                    webPage("http://maps.google.com?q="+list.get(0));
                }
                else {
                    // outputText.setText(sol.get("?abstract").toString());


                 //   System.out.println(out);
                 //   list.add(out);
                    clickShow(list);
                }

        }

    public void getSpecificInformation(List<String> name1) {
        List<String> list = new ArrayList<>();
        for (String name:name1) {
        ParameterizedSparqlString qs = new ParameterizedSparqlString("" +
                " PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                " PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
                " PREFIX dbp: <http://dbpedia.org/property/>\n" +
                " PREFIX geo: <http://www.georss.org/georss/>\n" +
                " select *  where { <" + name + "> \n" +
                " rdfs:label ?label .\n" +
                " FILTER ( lang(?label) = 'pl')\n" +
                "}\n"
        );

      //  System.out.println(qs);

        QueryExecution exec = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", qs.asQuery());

        ResultSet results = exec.execSelect();


     //   while (results.hasNext()) {
            QuerySolution sol = (QuerySolution) results.next();
            // outputText.setText(sol.get("?abstract").toString());
            String out = sol.get("label").toString();
            list.add(out);
       }
        clickShow(list);
    }
    public void getPersonInformations(String name, String field) {
        ParameterizedSparqlString qs = new ParameterizedSparqlString( "" +
                " PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                " PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
                " PREFIX dbp: <http://dbpedia.org/property/>\n" +
                " PREFIX geo: <http://www.georss.org/georss/>\n" +
                " PREFIX foaf: <http://xmlns.com/foaf/0.1/>\n" +
                " select *  where {\n" +
                " ?person rdfs:label ?label .\n" +
                " ?person dbo:abstract ?abstract .\n" +
                " OPTIONAL{\n" +
                " ?person dbo:birthDate ?birthDate .\n" +
                "}\n" +
                " OPTIONAL{\n" +
                " ?person dbo:deathDate ?deathDate .\n" +
                "}\n" +
                " OPTIONAL{\n" +
                " ?person dbo:birthPlace ?birthPlace .\n" +
                "}\n" +
                " OPTIONAL{\n" +
                " ?person dbo:deathPlace ?deathPlace .\n" +
                "}\n" +
                " OPTIONAL{\n" +
                " ?person dbo:spouse ?spouse .\n" +
                "}\n" +
                " OPTIONAL{\n" +
                " ?person foaf:depiction ?depiction .\n" +
                "}\n" +
                " FILTER ( lang(?abstract) = 'pl')\n"+
                "}\n"
        );

        Literal city = ResourceFactory.createLangLiteral( name, "pl" );
        qs.setParam( "label", city );

        System.out.println( qs );

        QueryExecution exec = QueryExecutionFactory.sparqlService( "http://dbpedia.org/sparql", qs.asQuery() );

        ResultSet results = exec.execSelect();
        if(!results.hasNext()) {
            System.out.println("Brak informacji");
        }
        List<String> list = new ArrayList<>();
       // while ( results.hasNext() ) {
            QuerySolution sol = (QuerySolution) results.next();
            String out = sol.get(field).toString();
            list.add(out);
            if(field.equals("birthPlace") | field.equals("deathPlace") | field.equals("spouse")) {
                getSpecificInformation(list);
             //   clickShow(list);
                System.out.println(out);
            } else if (field.equals("depiction")) {
              //  System.out.println(out);
                webPage(out);
            }
            else {
                // outputText.setText(sol.get("?abstract").toString());


                System.out.println(out);
                clickShow(list);
            }
      //  }
    }


    private void clickShow(List<String> info) {
        try {
            Group root = new Group();
            Scene scene = new Scene(root);
            HBox box = new HBox();
            for(String inf:info) {
                TextField textField = new TextField(inf);
                box.getChildren().add(textField);
            }
            root.getChildren().add(box);

            Stage stage = new Stage();
            stage.setScene(scene);
            stage.sizeToScene();
            stage.initModality(Modality.WINDOW_MODAL);

            stage.show();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void webPage(String url) {

        webView = new WebView();
        textField = new TextField(url);
        textField.setOnAction(e -> load());
        load();


        BorderPane root = new BorderPane(webView, new HBox(10), null, null, null);

        textField.setPadding(new Insets(5));
        root.setPadding(new Insets(5));
        Scene scene = new Scene(root, 800, 600);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    private void load() {
        String url = makeUrl(textField.getText()) ;
        webView.getEngine().load(url);
        textField.setText(url);
    }


    private String makeUrl(String text) {
        if (Pattern.matches("[a-zA-Z]+:.+", text)) {
            return text ;
        } else return "http://"+text ;
    }
}