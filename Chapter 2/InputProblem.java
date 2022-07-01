import java.util.Scanner;
/**
 * Write a description of InputProblem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InputProblem {
    public static void main (String[] args){
    String name;
    int age;
    double income;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is your age? ");
    age = keyboard.nextInt();
    System.out.print("What is your annual income? ");
    income = keyboard.nextDouble();
    keyboard.nextLine();
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    
    System.out.println("Hello, " + name + ". Your age is " + age + " and your income is $" + income);
    }
}
