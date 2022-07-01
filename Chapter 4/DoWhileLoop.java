import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        int number1, number2, sum;
        String response;
        char reply;
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Insert one number: ");
            number1 = keyboard.nextInt();
            System.out.println("Insert another number: ");
            number2 = keyboard.nextInt();
            sum = number1 + number2;
            System.out.println(sum);
            System.out.println("Do you wish to continue? ");
            keyboard.nextLine();
            response = keyboard.nextLine();
            reply = response.charAt(0);
        }while(reply == 'Y' || reply == 'y');
    
    }
}
