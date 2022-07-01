import java.util.Scanner;
import java.io.*;
/**
 This class counts the number of words in a file that is specified by user input.
 */
public class WordCounter
{
    public static void main (String[] args) throws IOException{
    String fileName; // To hold the file name that the user enters
    int wordAmount = 0; // To hold the amount of words in the file entered by the user
    Scanner keyboard = new Scanner(System.in); // Creates a Scanner object for keyboard input
    System.out.println("Type in the name of a file that you want to know the number of words in: ");
    fileName = keyboard.nextLine(); // Insert name of file
    File file1 = new File(fileName); // Creates File object representing the file specified by the user
    if(!(file1.exists())){
        System.out.println("File does not exist.");
        /*
         The above message displays if there is no file
         with the title that was specified by the user.
         */
        System.exit(0); // The program terminates
    }
    Scanner inputFile = new Scanner(file1); // Creates Scanner object that uses inserted file as source of input
    System.out.println("Processing " + fileName + "...");
    while (inputFile.hasNext()){
        String insertedLine = inputFile.nextLine(); // Represents the line in the file that is currently being read
        String[] components = insertedLine.split(" ");
        /*
         The "split" method breaks the line being represented by the "insertedLine" variable into tokens, using 
         a space delimiter. Those tokens are then assigned to the "components" variable, which represents a String array.
         */
        for (String s : components){
            wordAmount += 1;
            /*
             The "wordAmount" variable increases by 1 for each token passed into the
             array represented by the "components" variable.
             */
        }
    }
    System.out.println("The amount of words in the file " + fileName + " is: " + wordAmount);
    // The above message states the number of words in the file entered by the user
    inputFile.close(); // Closes the file
    }
}
