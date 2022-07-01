import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.*;
import javafx.event.*;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.util.Duration;
/**
 This class lets the user solve an addition problem 
 involving two randomly generated numbers.
 */
public class Math extends Application
{
    public static void main(String[] args)
    {
        launch(args); // launches the application
    }
    
    /**
     The 'start' method puts together and displays a GUI that showcases
     an addition problem involving two random numbers for the user to
     solve with the help of a TextField control
     and a Button control.
     
     @param primaryStage The Stage object that was created 
     when the application launched.
     */
    @Override
    public void start(Stage primaryStage){
        Random randNumber = new Random();
        int number1 = randNumber.nextInt(100) + 1; // Generates a number in the range 1-100
        int number2 = randNumber.nextInt(100) + 1; // Generates another number in the range 1-100
        /**
         The next five lines create controls that the GUI will consist of.
         */
        Label question = new Label("What is " + number1 + " + " + number2 + "?");
        Label instruction = new Label("Please insert your answer in number format and without special characters.");
        Button calculateButton = new Button("Submit");
        TextField tf = new TextField();
        Label result = new Label();
        /**
         The next six lines create a GridPane layout container named 'gp'
         and add the controls to the the container.
         */
        GridPane gp = new GridPane();
        gp.add(question, 2, 0); // Places 'question' in row 0, column 2
        gp.add(instruction, 2, 1); // Places 'instruction' in row 1, column 2
        gp.add(tf, 2, 2); // Places 'tf' in row 2, column 2
        gp.add(calculateButton, 2, 3); // Places 'calculateButton' in row 3, column 2
        gp.add(result, 2, 4); // Places 'result' in row 4, column 2
        /**
         Event handler for Button control 'calculateButton'
         */
        calculateButton.setOnAction(e -> {
        try{
            int submission = Integer.parseInt(tf.getText()); // Gets the text typed in by the user and tries converting it to an integer
            int answer = number1 + number2;
            if (submission != answer){
                /**
                 When the user types in the wrong answer
                 */
                result.setText("Sorry, that is incorrect. The correct answer is: " + answer);
                result.setStyle("-fx-text-fill: red");
                FadeTransition ft1 = new FadeTransition(new Duration(2000), result); // Animation for Label control 'result'
                ft1.setFromValue(0);
                ft1.setToValue(1);
                ft1.play();
            }
            else{
               /**
                When the user types in the right answer
                */
                result.setText("That is correct!");
                result.setStyle("-fx-text-fill: green");
                FadeTransition ft2 = new FadeTransition(new Duration(500), result);
                ft2.setFromValue(0);
                ft2.setToValue(1);
                ft2.play();
            }
        }
        catch (NumberFormatException a){
            /**
             When the user includes letters or special characters in their submission
             */
                result.setText("Answer must be submitted in number format and without any special characters.");
                result.setStyle("-fx-text-fill: black");
                FadeTransition ft3 = new FadeTransition(new Duration(500), result);
                ft3.setFromValue(0);
                ft3.setToValue(1);
                ft3.play();
            }
        });
        HBox hbox = new HBox(gp); // Puts GridPane container 'gp' into an HBox
        hbox.setPadding(new Insets(100)); // Puts 100 pixels of padding around the HBox
        Scene scene = new Scene(hbox); // Creates a Scene object 'scene' with the HBox as its root node
        scene.getStylesheets().add("Modifications.css"); // Adds stylesheet 'Modifications.css' to the application
        /**
         The next three lines assign each of the Label controls
         to an ID that is specified in the 'Modifications.css'
         stylesheet.
         */
        question.setId("label-type1");
        instruction.setId("label-type1");
        result.setId("label-type2");
        primaryStage.setScene(scene); // Adds the Scene to the Stage object 'primaryStage'
        primaryStage.setTitle("Addition Problem Solver"); // Sets window title to 'Addition Problem Solver'
        primaryStage.show(); // Displays the window
    }
}
