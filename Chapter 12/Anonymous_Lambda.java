import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.*;
import javafx.event.*;

public class Anonymous_Lambda extends Application
{
    Button topButton;
    TextField tf;
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        topButton = new Button("Press me!");
        tf = new TextField();
        BorderPane bp = new BorderPane();
        bp.setTop(topButton);
        bp.setCenter(tf);
        topButton.setOnAction(e -> {
            tf.setText("That was even easier!");
        });    
        Scene scene = new Scene(bp);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lambda Expressions and Anonymous Classes");
        primaryStage.show();
    }
    
}
