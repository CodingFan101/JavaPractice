import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args){
    int a, b, c;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    a = keyboard.nextInt();
    System.out.println("Enter your second number: ");
    b = keyboard.nextInt();
    System.out.println("Enter your third number: ");
    c = keyboard.nextInt();
    if (a < b && b < c){
        System.out.println("In ascending order: " + a + ", " + b + ", " + c);
    }
    else if (a < c && c < b){
        System.out.println("In ascending order: " + a + ", " + c + ", " + b);
    }
    else if (b < a && a < c){
        System.out.println("In ascending order: " + b + ", " + a + ", " + c);
    }
    else if (b < c && c < a){
        System.out.println("In ascending order: " + b + ", " + c + ", " + a);
    }
    else if (c < a && a < b){
        System.out.println("In ascending order: " + c + ", " + a + ", " + b);
    }
    else if (c < b && b < a){
        System.out.println("In ascending order: " + c + ", " + b + ", " + a);
    }
}
}
