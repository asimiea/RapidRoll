/**@author Asimiea Sobomate-Victor
 * 
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    static Boolean gameOver = false;
    static int score = 0;
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Rapid roll");
        
        VBox vbox = new VBox();

        new Gameplay();

        Scene scene = new Scene(vbox);
        scene.setFill(Color.PURPLE);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
