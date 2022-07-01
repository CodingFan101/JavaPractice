import java.util.Scanner;

public class Average {
    public static void main(String[] args){
    double test1 = 0, test2 = 0, test3 = 0, aver;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert test grade #1: ");
    test1 = keyboard.nextDouble();
    System.out.println("Insert test grade #2: ");
    test2 = keyboard.nextDouble();
    System.out.println("Insert test grade #3: ");
    test3 = keyboard.nextDouble();
    aver = calculateAverage(test1, test2, test3);
    System.out.printf("Your average is: %.2f", aver);
    }
    /**
     The calculateAverage method calculates the average of the test scores.
     @param tes1 First test score to be added.
     @param tes2 Second test score to be added.
     @param tes3 Third test score to be added.
     @return The average of the test scores.
     */
    public static double calculateAverage(double tes1, double tes2, double tes3){
        return (tes1 + tes2 + tes3) / 3;
    }
}
