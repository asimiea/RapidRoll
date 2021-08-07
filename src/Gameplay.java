/**
 * @author Asimiea Sobomate-Victor
*/

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Gameplay {
    private Pane root;
    private static Scene scene;

    //elements
    private Shape rect;
    private ImageView ball;


    public Gameplay(){
        root = new Pane();
        scene = new Scene(root, configuration.width, configuration.height);
        scene.setFill(Color.PURPLE);

        rect = new Rectangle(10, 50);
        //createGameElements();
    }

    public void createGameElements(){
        //platform
        rect = new Rectangle(10, 50);

        //ball
        ball = new ImageView(configuration.ball);
    }

    public static Scene getScene(){
        return scene;
    }
}
