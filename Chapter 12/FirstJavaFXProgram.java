import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 This class creates and displays a simple GUI that does not have any functionality.
 */
public class FirstJavaFXProgram extends Application
{
    public static void main(String[] args)
    {
        launch(args); // Launches the application
    }
    
    /**
     The 'start' method puts together and displays a GUI containing a Button control,
     Label controls, as well as TextField controls, all of which have positions
     that are determined with the help of a GridPane layout container.
     
     @param primaryStage The Stage object that was created when
     the application launched.
     */
    @Override
    public void start(Stage primaryStage){
        GridPane grid = new GridPane(); // Creates GridPane layout container 'grid'
        Label myLabel = new Label("Enter your name and password."); // Creates Label control 'myLabel'
        /**
         The next two lines place Label control 'myLabel' in row 0, column 2.
         */
        grid.setRowIndex(myLabel, 0);
        grid.setColumnIndex(myLabel, 2);
        Label name = new Label("Name"); // Creates Label control 'name'
        /**
         The next two lines place Label control 'name' in row 1, column 0.
         */
        grid.setRowIndex(name, 1);
        grid.setColumnIndex(name, 0);
        TextField nameEntry = new TextField(); // Creates TextField control 'nameEntry'
        /**
         The next two lines place TextField control 'nameEntry' in row 1, column 2.
         */
        grid.setRowIndex(nameEntry, 1);
        grid.setColumnIndex(nameEntry, 2);
        Label password = new Label("Password"); // Creates Label control 'password'
        /**
         The next two lines place Label control 'password' in row 2, column 0.
         */
        grid.setRowIndex(password, 2);
        grid.setColumnIndex(password, 0);
        TextField passwordEntry = new TextField(); // Creates TextField control 'passwordEntry'
        /**
         The next two lines place TextField control 'passwordEntry' in row 2, column 2.
         */
        grid.setRowIndex(passwordEntry, 2);
        grid.setColumnIndex(passwordEntry, 2);
        Button myButton = new Button("Submit"); // Creates Button control 'myButton'
        /**
         The next two lines place Button control 'myButton' in row 4, column 2.
         */
        grid.setRowIndex(myButton, 4);
        grid.setColumnIndex(myButton, 2);
        grid.getChildren().addAll(myLabel, name, nameEntry, password, passwordEntry, myButton);
        /**
         The above line adds all of the previously created
         controls to the GridPane layout container 'grid'.
         */
        Scene display = new Scene(grid, 300, 300); // Creates Scene object 'display' and adds 'grid' as the root node
        primaryStage.setScene(display); // Adds Scene object 'display' Scene to Stage object 'primaryStage'
        primaryStage.setTitle("First JavaFX Assignment"); // Sets the window title to "First JavaFX Assignment"
        primaryStage.show(); // Shows the window
    }
}
