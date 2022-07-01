import java.util.Scanner;

public class MyNameVariables {
    public static void main (String[] args){
    String firstName, lastName;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("What is your first name? ");
    firstName = keyboard.nextLine();
    
    System.out.print("What is your last name? ");
    lastName = keyboard.nextLine();
    
    
    System.out.print("Hello " + firstName + " " + lastName);
    }
}
