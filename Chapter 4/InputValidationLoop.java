import java.util.Scanner;

public class InputValidationLoop {
    public static void main(String[] args){
    int number = 0;
    Scanner keyboard = new Scanner(System.in);

    while (number < 1 || number > 4){
    System.out.println("Enter a number between 1 and 4: ");
    number = keyboard.nextInt();
    }
    }
}
