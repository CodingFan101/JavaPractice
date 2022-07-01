import java.util.Scanner;

public class NestedIfStatements {
    public static void main(String[] args){
    double input, rate, amount, interest, total;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many years? ");
    input = keyboard.nextDouble();
    System.out.println("How much money? ");
    amount = keyboard.nextDouble();
    if(input >= 5){
        rate = 0.095;
        interest = amount * rate;
        total = amount + interest;
        System.out.println("Amount of money left on deposit: $" + total);
        System.out.println("Interest rate: " + rate);
        System.out.println("Total interest: $" + interest);
    }
    else{
        if (input >= 4 && input < 5){
            rate = 0.09;
            interest = amount * rate;
            total = amount + interest;
            System.out.println("Amount of money left on deposit: $" + total);
            System.out.println("Interest rate: " + rate);
            System.out.println("Total interest: $" + interest);
        }
        else{
            if (input >= 3 && input < 4){
            rate = 0.085;
            interest = amount * rate;
            total = amount + interest;
            System.out.println("Amount of money left on deposit: $" + total);
            System.out.println("Interest rate: " + rate);
            System.out.println("Total interest: $" + interest);
            }
            else{
                if (input >= 2 && input < 3){
                rate = 0.075;
                interest = amount * rate;
                total = amount + interest;
                System.out.println("Amount of money left on deposit: $" + total);
                System.out.println("Interest rate: " + rate);
                System.out.println("Total interest: $" + interest);
                }
                else{
                    if (input >= 1 && input < 2){
                    rate = 0.065;
                    interest = amount * rate;
                    total = amount + interest;
                    System.out.println("Amount of money left on deposit: $" + total);
                    System.out.println("Interest rate: " + rate);
                    System.out.println("Total interest: $" + interest);
                    }
                    else{
                    if (input < 1){
                    rate = 0.058;
                    interest = amount * rate;
                    total = amount + interest;
                    System.out.println("Amount of money left on deposit: $" + total);
                    System.out.println("Interest rate: " + rate);
                    System.out.println("Total interest: $" + interest);
                    }
                    }
                }
            }
        }
    }    
    }
}
