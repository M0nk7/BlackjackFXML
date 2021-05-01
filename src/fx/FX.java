package fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.KeyCode;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root = FXMLLoader.load(getClass().getResource("Blackjack.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 830, 550));
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
