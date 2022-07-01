import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
    int number, product = 0;
    Scanner keyboard = new Scanner(System.in);
        while (product < 100){
        System.out.println("Insert a number: ");
        number = keyboard.nextInt();
        product = number * 10;
        System.out.println(product);
        }
    }
}
