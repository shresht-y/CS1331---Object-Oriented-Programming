import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;

/**
 * Introductory javafx window.
 *
 * @version 1.0
 * @author Shresht Yadav
 */
public class BankAccount extends Application {
    /**
     * Creates a simple javafx window with a background and two shapes.
     * @param primaryStage Stage that is displayed when the program is run.
     */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bank Account");
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);

        StackPane stackPane = new StackPane();
        Image image = new Image("bobby.jpg");
        ImageView mv = new ImageView(image);
        stackPane.getChildren().add(mv);
        Rectangle r = new Rectangle();
        r.setWidth(100);
        r.setHeight(100);
        r.setFill(Color.DARKRED);
        stackPane.getChildren().add(r);
        stackPane.setAlignment(r, Pos.CENTER);

        Text t = new Text("12");

        t.setStyle("-fx-padding: 12;");
        Circle c = new Circle();
        c.setRadius(80);
        c.setFill(Color.BLUE);

        Group g = new Group();
        g.getChildren().addAll(c, t);
        stackPane.getChildren().add(g);
        stackPane.setAlignment(g, Pos.TOP_RIGHT);

        Scene scene = new Scene(stackPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}