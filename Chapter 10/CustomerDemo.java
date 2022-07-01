/**
 This class demonstrates the Customer class, which extends the Person class.
 */
public class CustomerDemo
{
    public static void main(String[] args){
    Customer c1 = new Customer("Stewie Griffin", "Quahog, Rhode Island", "974-131-1999", 1, false); // Creates Customer object c1
    Customer c2 = new Customer("Mario", "Mushroom Kingdom", "134-913-1985", 2, true); // Creates Customer object c2
    System.out.println(c1); // Displays the contents of Customer object c1
    System.out.println();
    System.out.println(c2); // Displays the contents of Customer object c2
    }
}
