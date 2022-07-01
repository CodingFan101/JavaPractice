import java.util.Scanner;

public class CarModel {
    public static void main(String[] args){
    int year, weight, type;
    double fee;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert the model year of your car: ");
    year = keyboard.nextInt();
    System.out.println("Insert the weight of your car: ");
    weight = keyboard.nextInt();
    if (year <= 1970){
            if(weight < 2700){
                type = 1;
                fee = 16.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
            else if (weight >= 2700 && weight <= 3800){
                type = 2;
                fee = 25.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
            else if (weight > 3800){
                type = 3;
                fee = 46.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
    }
    else if (year >= 1971 && year <= 1979){
            if(weight < 2700){
                type = 4;
                fee = 27.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
            else if (weight >= 2700 && weight <= 3800){
                type = 5;
                fee = 30.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
            else if (weight > 3800){
                type = 6;
                fee = 52.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
    }
    else if (year >= 1980){
            if(weight < 3500){
                type = 7;
                fee = 19.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
            else if (weight >= 3500){
                type = 8;
                fee = 52.50;
                System.out.println("Your car's class is: " + type);
                System.out.printf("Your car's fee is: $%.2f", fee);
            }
    }
    }
}
