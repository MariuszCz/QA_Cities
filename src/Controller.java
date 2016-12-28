import antlr4.ProgramLexer;
import antlr4.ProgramParser;
import com.hp.hpl.jena.query.*;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Controller {

    @FXML
    private TextField inputText;

    @FXML
    private TextArea outputText;

    @FXML
    void runProgram(ActionEvent event) {
        printTree(inputText.getText());
    }



    private void printTree(String sentence) {
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
        ParameterizedSparqlString qs = new ParameterizedSparqlString( "" +
                " PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
                " PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
                " PREFIX dbp: <http://dbpedia.org/resource/>\n" +
                " select *  where {\n" +
                " ?city rdfs:label ?label .\n" +
                " ?city dbo:abstract ?abstract .\n" +
                " ?city dbo:country ?country .\n" +
                " OPTIONAL{\n"+
                " ?city dbp:populationTotal ?populationTotal .\n"+
                "}\n"+
                " OPTIONAL{\n"+
                " ?city dbo:knownFor ?knownfor .\n"+
                "}\n"+
                " FILTER ( lang(?abstract) = 'pl')\n"+
                "}\n"
        );

        Literal city = ResourceFactory.createLangLiteral( name, "pl" );
        qs.setParam( "label", city );

       // System.out.println( qs );

        QueryExecution exec = QueryExecutionFactory.sparqlService( "http://dbpedia.org/sparql", qs.asQuery() );

        ResultSet results = exec.execSelect();

        while ( results.hasNext() ) {
            QuerySolution sol = (QuerySolution) results.next();
           // outputText.setText(sol.get("?abstract").toString());
            System.out.println(sol.get(field));
        }
    }
}