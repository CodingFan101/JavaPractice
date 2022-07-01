import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.*;
import javafx.event.*;
import java.io.*;

public class BorderPaneDemo extends Application
{
    Button topButton;
    Button bottomButton;
    Button rightButton;
    Button leftButton;
    TextField tf;
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        topButton = new Button("Press me!");
        topButton.setOnAction(new ButtonHandler());
        bottomButton.setOnAction(new ButtonHandler());
        leftButton.setOnAction(new ButtonHandler());
        rightButton.setOnAction(new ButtonHandler());
        bottomButton = new Button("Press me!");
        rightButton = new Button("Press me!");
        leftButton = new Button("Press me!");
        tf = new TextField();
        BorderPane bp = new BorderPane(tf, topButton, rightButton, bottomButton, leftButton);
        bp.setCenter(tf);
        BorderPane.setAlignment(topButton, Pos.CENTER);
        BorderPane.setAlignment(rightButton, Pos.CENTER);
        BorderPane.setAlignment(bottomButton, Pos.CENTER);
        BorderPane.setAlignment(leftButton, Pos.CENTER);
        Scene scene = new Scene(bp);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Border Pane Demo");
        primaryStage.show();
    }
    
    
    class ButtonHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
        String output = " ";
        
        if (e.getSource() == topButton){
            output = "top";
        }
        else if (e.getSource() == bottomButton){
            output = "bottom";   
        }
        else if (e.getSource() == rightButton){
            output = "right";   
        }
        else {
            output = "left";   
        }
        
        tf.setText("You clicked the " + output + " button!");
        }
    }
}
