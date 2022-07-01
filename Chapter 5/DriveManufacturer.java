import java.util.Scanner;

public class DriveManufacturer {
    public static void main(String[] args){
        int code;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What code number was your package stamped with? ");
        code = keyboard.nextInt();
        switch (code){
            case 1:
                System.out.println("Your drive was manufactured by the 3M Corporation.");
                break;
            case 2:
                System.out.println("Your drive was manufactured by the Maxell Corporation.");
                break;
            case 3:
                System.out.println("Your drive was manufactured by the Sony Corporation.");
                break;
            case 4:
                System.out.println("Your drive was manufactured by the Verbatim Corporation.");
                break;
        }
    }
}
