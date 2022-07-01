/**
 This class demonstrates the RoomDimension and RoomCarpet classes.
 */
import java.util.Scanner;

public class CarpetDemo
{
    public static void main (String[] args){
    double length, width, total, price;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the length of your floor: ");
    length = keyboard.nextDouble(); // Input length of floor
    System.out.println("Enter the width of your floor: ");
    width = keyboard.nextDouble(); // Input width of floor
    System.out.println("Enter the cost of carpet per square foot: ");
    price = keyboard.nextDouble(); // Input cost of carpet per square foot
    RoomDimension d = new RoomDimension(length, width); // Creates new RoomDimension object "d" containing entered length and width
    RoomCarpet c = new RoomCarpet(d, price); // Creates new RoomCarpet object "c" containing contents of RoomDimension object "d" and entered cost
    total = c.getTotalCost(); // Calculates total cost of carpet depending on length, width, and cost that were entered
    System.out.println();
    System.out.println(c); // Displays contents of RoomCarpet object "c", by calling on its toString method
    System.out.println();
    System.out.println();
    System.out.printf("Total Cost: $%.2f", total); // Displays total cost of carpet, rounded to two decimal places
    }
}
