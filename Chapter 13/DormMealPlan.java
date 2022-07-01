import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

/**
 This class asks the user to select a dorm and meal plan of their choice,
 and then displays the costs of the dorm and meal plan that they chose,
 along with the total cost overall.
 */
public class DormMealPlan extends Application
{
    public static void main(String[] args)
    {
        launch(args); // launches the application
    }
    
    /**
     The 'start' method puts together and displays a GUI that shows the
     total amounts of money for the chosen dorm and meal plan, as well as
     the overall cost, based on what the user selects.
     
     @param primaryStage The Stage object that was created when
     the application launched.
     */
    @Override
    public void start(Stage primaryStage){
        Label instruction = new Label("Select a dorm, and then select a meal plan: ");
        ComboBox<String> dorms = new ComboBox<>(); // Creates ComboBox control 'dorms'
        dorms.getItems().addAll("Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"); // Adds the dorm names to the 'dorms' ComboBox control
        ComboBox<String> meals = new ComboBox<>(); // Creates ComboBox control 'meals'
        meals.getItems().addAll("7 meals per week", "14 meals per week", "Unlimited meals"); // Adds the meal plan options to the 'meals' ComboBox control
        Label totalCost = new Label("Total Cost: ");
        Label dormCost = new Label("Dorm Cost: ");
        Label mealCost = new Label("Meal Cost: ");
        Button submitButton = new Button("Submit");
        GridPane gp = new GridPane();
        gp.add(instruction, 1, 0);
        gp.add(dorms, 2, 0);
        gp.add(meals, 4, 0);
        gp.add(totalCost, 1, 1);
        gp.add(dormCost, 2, 1);
        gp.add(mealCost, 4, 1);
        gp.add(submitButton, 2, 2);
        /**
         Event handler
         */
        submitButton.setOnAction(event -> {
        double dormPrice = 0.0, mealPrice = 0.0;
        String dormChoice = dorms.getValue(); // Retrieves the selected item in the 'dorms' ComboBox control
        if (dormChoice.equals("Allen Hall")){
            dormPrice = 1800.0; // Dorm cost is set to $1,800 when the user picks "Allen Hall"
        }
        else if (dormChoice.equals("Pike Hall")){
            dormPrice = 2200.0; // Dorm cost is set to $2,200 when the user picks "Pike Hall"
        }
        else if (dormChoice.equals("Farthing Hall")){
            dormPrice = 2800.0; // Dorm cost is set to $2,800 when the user picks "Farthing Hall"
        }
        else if (dormChoice.equals("University Suites")){
            dormPrice = 3000.0; // Dorm cost is set to $3,000 when the user picks "University Suites"
        }
        
        String mealChoice = meals.getValue(); // Retrieves the selected item in the 'meals' ComboBox control
        if (mealChoice.equals("7 meals per week")){
            mealPrice = 600.0; // Meal plan cost is set to $600 when the user chooses "7 meals per week"
        }
        else if (mealChoice.equals("14 meals per week")){
            mealPrice = 1100.0; // Meal plan cost is set to $1,100 when the user chooses "14 meals per week"
        }
        else if (mealChoice.equals("Unlimited meals")){
            mealPrice = 1800.0; // Meal plan cost is set to $1,800 when the user chooses "Unlimited meals"
        }
        double totalPrice = dormPrice + mealPrice; // Adds together the dorm cost and meal plan cost
        totalCost.setText(String.format("Total Cost: $%,.2f", totalPrice)); // Displays the total cost
        dormCost.setText(String.format("Dorm Cost: $%,.2f", dormPrice)); // Displays the dorm cost
        mealCost.setText(String.format("Meal Plan Cost: $%,.2f", mealPrice)); // Displays the meal plan cost
        });
        HBox hbox = new HBox(gp); // Puts GridPane container 'gp' into an HBox
        hbox.setPadding(new Insets(100)); // Puts 100 pixels of padding around the HBox
        Scene scene = new Scene(hbox); // Creates a Scene object 'scene' with the HBox as its root node
        primaryStage.setScene(scene); // Adds the Scene to the Stage object 'primaryStage'
        primaryStage.setTitle("Dorm and Meal Plan Calculator"); // Sets window title to 'Dorm and Meal Plan Calculator'
        primaryStage.show(); // Displays the window
    }
}
