import java.util.Scanner;

public class ForLoopTwo {
    public static void main(String[] args){
    int sum = 0, number;
    Scanner keyboard = new Scanner(System.in);
    for (int i = 1; i <= 10; i++){
     System.out.println("Enter a number: ");
     number = keyboard.nextInt();
     sum += number;
    }
     System.out.println(sum);
    }
}
