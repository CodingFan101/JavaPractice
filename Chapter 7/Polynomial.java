import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args){
    int a, b, c, x, total;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert a value for a: ");
    a = keyboard.nextInt();
    System.out.println("Insert a value for b: ");
    b = keyboard.nextInt();
    System.out.println("Insert a value for c: ");
    c = keyboard.nextInt();
    System.out.println("Insert a value for x: ");
    x = keyboard.nextInt();
    total = (a * (x*x)) + (b * x) + c;
    System.out.println("Your total value is: " + total);
    }
}
