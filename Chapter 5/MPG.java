import java.util.Scanner;

public class MPG {
    public static void main(String[] args){
    double miles = 0, gallons = 0, MPG;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many miles did you drive? ");
    miles = keyboard.nextDouble();
    System.out.println("How many gallons of gas did you use? ");
    gallons = keyboard.nextDouble();
    MPG = calculateMPG(miles, gallons);
    System.out.printf("Miles per gallon: %.2f", MPG);
    }
    /**
     The calculateMPG method calculates the amount of miles-per-gallon.
     @param mil The number of miles driven.
     @param gal The amount of gallons of gas that were used.
     @return The amount of miles-per-gallon.
     */
    public static double calculateMPG(double mil, double gal){
    return mil / gal;
    }
}
