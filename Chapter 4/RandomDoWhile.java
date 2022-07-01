import java.util.Scanner;
import java.util.Random;

public class RandomDoWhile {
public static void main(String[] args){
        int number1;
        String response;
        char letter;
        Random randomNumbers = new Random();
        Scanner keyboard = new Scanner(System.in);
        do{
        number1 = randomNumbers.nextInt(12);
        System.out.println(number1);
        System.out.println("Would you like to see another random number?");
        response = keyboard.nextLine();
        letter = response.charAt(0);
        } while(letter == 'y' || letter == 'Y');
    }
}
