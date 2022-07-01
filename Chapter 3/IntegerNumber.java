import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args){
    int number;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    number = keyboard.nextInt();
    if (number % 2 == 0) {
        System.out.println("Your number of choice, " + number + ", is even.");
    }
    else {
        System.out.println("Your number of choice, " + number + ", is odd.");
    }
    }
}
