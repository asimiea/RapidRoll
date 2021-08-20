/**
 * @author Asimiea Sobomate-Victor
*/

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.input.KeyCode;

public class Gameplay {
    private Pane root;
    private static Scene scene;

    //elements
    private Shape rect;
    private ImageView ball;


    public Gameplay(){
        root = new Pane();
        scene = new Scene(root, configuration.width, configuration.height);
        new Background(root);

        setupKeybinds();
        createGameElements();
    }

    private void setupKeybinds() {
        scene.setOnKeyPressed(e -> {
            if(e.getCode() == KeyCode.LEFT &&ball.getX() > -30){
               ball.setX(ball.getX()-10);
            }
            if(e.getCode() == KeyCode.RIGHT &&ball.getX() < 460){
               ball.setX(ball.getX()+10);
            }
        });
    }

    public void createGameElements(){
        //platform
        rect = new Rectangle(1, 5);
        //root.getChildren().add(rect);

        //ball
        ball = new ImageView(configuration.ball);
        ball.setFitWidth(25);
        ball.setPreserveRatio(true);
        ball.setSmooth(true);
        ball.setCache(true);
        root.getChildren().add(ball);
    }

    public static Scene getScene(){
        return scene;
    }
}
