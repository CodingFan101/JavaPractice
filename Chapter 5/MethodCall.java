import java.util.Scanner;

public class MethodCall {
    public static void main(String[] args){
    String name;
    int number;
    char received;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert the name of a state: ");
    name = keyboard.nextLine();
    System.out.println("Insert a number, starting from 0, to know which character is at that spot. ");
    number = keyboard.nextInt();
    received = ReturnCharacter(name, number);
    System.out.println(received);
    }
    public static char ReturnCharacter(String place, int x){
    char character = place.charAt(x);
    return character;
    }
}
