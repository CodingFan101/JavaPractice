/**
 This class demonstrates the ProductionWorker class, which extends the Employee class.
 */
public class EmployeeDemo
{
    public static void main(String[] args){    
    ProductionWorker p1 = new ProductionWorker("Chris Hainzl", 627, 'C', "06-27-2002", 1, 25.90); // Creates ProductionWorker object p1
    ProductionWorker p2 = new ProductionWorker("SpongeBob SquarePants", 501, 'B', "05-01-1999", 2, 13.20); // Creates ProductionWorker object p2
    System.out.println("Here's our first production worker:");
    System.out.println(p1); // Displays the contents of ProductionWorker object p1
    System.out.println();
    System.out.println("Here's our second production worker:");
    System.out.println(p2); // Displays the contents of ProductionWorker object p2
    }
}
