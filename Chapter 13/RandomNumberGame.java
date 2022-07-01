import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import java.util.Random;

/**
 This class asks the user to guess a number within a range
 that is determined with the help of a Slider.
 */
public class RandomNumberGame extends Application
{
    public static void main(String[] args)
    {
        launch(args); // launches the application
    }
    
    /**
     The 'start' method puts together and displays a GUI that contains a Slider
     for the user to utilize in order to determine the
     range of numbers that they work with.
     
     @param primaryStage The Stage object that was created when
     the application launched.
     */
    @Override
    public void start(Stage primaryStage){
        Random randomNumber = new Random();
        Label instruction1 = new Label("Adjust the difficulty with the Slider on the right: ");
        Label instruction2 = new Label();
        Label difficulty = new Label();
        TextField tf = new TextField();
        
        /**
         The next six lines create and put together
         a Slider control named 'slide'.
         */
        Slider slide = new Slider(1, 3, 2);
        slide.setShowTickMarks(true);
        slide.setMajorTickUnit(1);
        slide.setShowTickLabels(true);
        slide.setOrientation(Orientation.VERTICAL);
        slide.setPrefWidth(200);
        
        Button submitButton = new Button("Submit");
        
        GridPane gp = new GridPane();
        gp.add(instruction1, 1, 0);
        gp.add(instruction2, 1, 1);
        gp.add(slide, 7, 0);
        gp.add(difficulty, 7, 1);
        gp.add(tf, 1, 2);
        gp.add(submitButton, 2, 3);
        
        /**
         Event handler for Slider control 'slide'
         */
        slide.valueProperty().addListener(
        (observable, oldvalue, newvalue) ->
        {
        double difficultyLevel = slide.getValue(); // Gets the current value at which the knob is located
        if (difficultyLevel >= 1 && difficultyLevel < 2){
            /**
             Easy Mode - when the knob is at 1 or within the range 1-2, 2 not included
             */
            instruction2.setText("Please guess a number between 1 and 2.");
            difficulty.setText("Difficulty: Easy");
        }
        else if (difficultyLevel >= 2 && difficultyLevel < 3){
            /**
             Medium Mode - when the knob is at 2 or within the range 2-3, 3 not included
             */
            instruction2.setText("Please guess a number between 1 and 12.");
            difficulty.setText("Difficulty: Medium");
        }
        else if (difficultyLevel == 3){
            /**
             Hard Mode - when the knob is at 3
             */
            instruction2.setText("Please guess a number between 1 and 22.");
            difficulty.setText("Difficulty: Hard");
        }
        });
        
        /**
         Event handler for Button control 'submitButton'
         */
        submitButton.setOnAction(event -> {
            double mode = slide.getValue(); // Gets the current value at which the knob is located
            int number = 0, submission = Integer.parseInt(tf.getText());
            if (mode >= 1 && mode < 2){
            number = randomNumber.nextInt(2) + 1; // Number to guess is within range of 1-2
            }
            else if (mode >= 2 && mode < 3){
            number = randomNumber.nextInt(12) + 1; // Number to guess is within range of 1-12
            }
            else if (mode == 3){
            number = randomNumber.nextInt(22) + 1; // Number to guess is within range of 1-22
            }
            
            if (submission == number){
                instruction2.setText("That's right! Answer: " + number); // This text displays when the user guesses correctly
            }
            else{
                instruction2.setText("That's incorrect. Answer: " + number); // This text displays when the user guesses incorrectly
            }
        });
        HBox hbox = new HBox(gp); // Puts GridPane container 'gp' into an HBox
        hbox.setPadding(new Insets(100)); // Puts 100 pixels of padding around the HBox
        Scene scene = new Scene(hbox); // Creates a Scene object 'scene' with the HBox as its root node
        primaryStage.setScene(scene); // Adds the Scene to the Stage object 'primaryStage'
        primaryStage.setTitle("Random Number Game"); // Sets window title to 'Random Number Game'
        primaryStage.show(); // Displays the window
    }
}