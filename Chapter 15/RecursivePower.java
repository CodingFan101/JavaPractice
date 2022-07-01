import java.util.Scanner;
/**
 This class contains a method which uses recursion to raise a number to a power, with the help of
 user input.
 */
public class RecursivePower
{
    public static void main(String[] args){
        int number1, number2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter one number: ");
        number1 = keyboard.nextInt(); // User enters a number
        System.out.println("Enter another number: ");
        number2 = keyboard.nextInt(); // User enters another number for the previous one to be raised to the power of
        System.out.println(number1 + " raised to the power of " + number2 + " is " + PowerCalculator(number1, number2) + ".");
        // The above message displays the result of the calculations
    }
    /**
     The PowerCalculator method raises a number to a power, based on
     what is passed into the parameter variables.
     @param number The base number
     @param exponent The power that the base number will be raised to
     @return The final result of the calculations
     */
    public static int PowerCalculator(int number, int exponent){
        if (exponent != 0){
            return (number * PowerCalculator(number, exponent - 1));
            // The method calls on itself as long as the value of the "exponent" variable is not equal to 0
        }
        else{
            return 1;
            // The method returns 1 when the "exponent" variable is equal to 0
        }
    }
}
