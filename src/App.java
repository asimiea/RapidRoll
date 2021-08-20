/**@author Asimiea Sobomate-Victor
 * 
*/

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    static Boolean gameOver = false;
    static int score = 0;
    
    public void start(Stage primaryStage){
        primaryStage.setTitle("Rapid roll");
        
        new Gameplay();

        primaryStage.setScene(Gameplay.getScene());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
