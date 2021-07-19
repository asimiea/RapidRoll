/**@author Asimiea Sobomate-Victor
 * 
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    static Boolean gameOver = false;
    static int score = 0;

    public enum Dir{
        left, right
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Rapid roll");
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
