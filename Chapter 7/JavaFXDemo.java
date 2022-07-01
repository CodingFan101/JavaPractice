
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
public class JavaFXDemo extends Application {

public static void main(String[] args)
{
launch(args);
}
public void start(Stage primaryStage){
Label myLabel = new Label("Look! There's a button");
Button myButton = new Button("Click me");
VBox vbox = new VBox(10, myLabel, myButton);
Scene scene = new Scene(vbox, 300, 100);
vbox.setAlignment(Pos.CENTER);
primaryStage.setScene(scene);
primaryStage.setTitle("Button Demo");
primaryStage.show();
}

}
