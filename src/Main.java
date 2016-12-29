import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = getClass().getResource("sample.fxml");
        AnchorPane pane = FXMLLoader.load( url );
        Scene scene = new Scene( pane );

        primaryStage.setScene( scene );
        primaryStage.setTitle( "QA" );
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
