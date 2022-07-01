/**
 This program asks the user to enter a password that has to meet some criteria.
 */
import java.util.Scanner;
public class Password
{
    public static void main(String[] args){
      String name, password; // To hold the name and password that are entered  
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is your name?");
      name = keyboard.nextLine(); // Insert name
      System.out.println("Hello, " + name + ".");
      System.out.println("Please create a password that meets all of the following criteria:");
      System.out.println("1. Is at least six characters long");
      System.out.println("2. Has at least one uppercase letter and one lowercase letter");
      System.out.println("3. Has at least one number");
      password = keyboard.nextLine(); // Type in password
      if (password.length() < 6){
        System.out.println("Password not accepted. Password must be at least six characters long.");
        // The above message displays if entered password is not at least six characters long
     }
     else{
        Validation(password); // Calls on Validation method if entered password has at least six characters
     }
    }
    /**
     The Validation method checks to see if the entered password (with at least six characters) meets the specified criteria regarding letters and numbers.
     @param str The entered password containing at least six characters.
     */
    public static void Validation(String str){
    int upperCase = 0, lowerCase = 0, numbers = 0; // Variables to hold the amount of uppercase letters, lowercase letters, and numbers, respectively
    for (int i = 0; i < str.length(); i++){ // This loop scans the password for uppercase letters, lowercase letters, and numbers
        if(Character.isUpperCase(str.charAt(i))){
            upperCase += 1; 
            // value in upperCase variable increases by 1 each time an uppercase letter is detected
        }
        if(Character.isLowerCase(str.charAt(i))){
            lowerCase += 1;
            // value in lowerCase variable increases by 1 each time a lowercase letter is detected
        }
        if(Character.isDigit(str.charAt(i))){
            numbers += 1;
            // value in "numbers" variable increases by 1 each time a number is detected
        }
    }
    if ((upperCase > 0 && lowerCase > 0) && numbers > 0){
        System.out.println("Congratulations! Your password has been created!");
        // The above message displays if the password has at least one uppercase letter, one lowercase letter, and one number
    }
    else {
        System.out.println("Password not accepted. Password does not meet all of the criteria.");
        // The above message displays if the password does not have at least one uppercase letter, one lowercase letter, and one number
        }
    }
}
