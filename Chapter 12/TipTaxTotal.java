import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.*;
import javafx.event.*;

/**
 This class asks the user to type in the amount of a bill for their meal.
 
 When a button is pressed, the tip, tax, and total are all calculated based on what number the user entered.
 */
public class TipTaxTotal extends Application
{
    public static void main(String[] args)
    {
        launch(args); // launches the application
    }
    
    /**
     The 'start' method puts together and displays a GUI that shows the
     tip, tax, and total amounts based on what number the user types in
     and submits.
     
     @param primaryStage The Stage object that was created when
     the application launched.
     */
    @Override
    public void start(Stage primaryStage){
        Label instruction = new Label("Enter the amount of the bill: "); // Creates Label control 'instruction'
        Button calculateButton = new Button("Calculate"); // Creates Button control 'calculateButton'
        TextField tf = new TextField(); // Creates TextField control 'tf'
        Label tip = new Label(); // Creates Label control 'tip'
        Label tax = new Label(); // Creates Label control 'tax'
        Label total = new Label(); // Creates Label control 'total'
        GridPane gp = new GridPane(); // Creates GridPane layout container 'gp'
        gp.add(instruction, 2, 0); // Places 'instruction' in row 0, column 2
        gp.add(tf, 2, 1); // Places 'tf' in row 1, column 2
        gp.add(calculateButton, 2, 2); // Places 'calculateButton' in row 2, column 2
        gp.add(tip, 2, 3); // Places 'tip' in row 3, column 2
        gp.add(tax, 2, 4); // Places 'tax' in row 4, column 2
        gp.add(total, 2, 5); // Places 'total' in row 5, column 2
        /**
         Event handler
         */
        calculateButton.setOnAction(e -> {
            double bill = Double.parseDouble(tf.getText()); // Gets the bill amount typed in by the user
            double tipAmount = bill * 0.18; // Multiplies 'bill' by 0.18 to get the total tip
            double taxAmount = bill * 0.07; // Multiplies 'bill' by 0.07 to get the total tax
            double totalAmount = bill + tipAmount + taxAmount; // Adds the bill, tip, and tax together
            
            tip.setText(String.format("Tip: $%,.2f", tipAmount)); // Displays the total tip
            tax.setText(String.format("Tax: $%,.2f", taxAmount)); // Displays the total tax
            total.setText(String.format("Total: $%,.2f", totalAmount)); // Displays the sum of the bill, tip, and tax amounts
        });
        HBox hbox = new HBox(gp); // Puts GridPane container 'gp' into an HBox
        hbox.setPadding(new Insets(100)); // Puts 100 pixels of padding around the HBox
        Scene scene = new Scene(hbox); // Creates a Scene object 'scene' with the HBox as its root node
        primaryStage.setScene(scene); // Adds the Scene to the Stage object 'primaryStage'
        primaryStage.setTitle("Tip, Tax, and Total Calculator"); // Sets window title to 'Tip, Tax, and Total Calculator'
        primaryStage.show(); // Displays the window
    }
    
}
