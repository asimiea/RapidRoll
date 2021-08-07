/**@author Asimiea Sobomate-Victor
 * 
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class App extends Application {
    static Boolean gameOver = false;
    static int score = 0;
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Rapid roll");
        
        //Pane root = new Pane();

        new Gameplay();

        //Scene scene = new Scene(root);
        //scene.setFill(Color.PURPLE);

        primaryStage.setScene(Gameplay.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
