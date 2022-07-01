import java.util.Scanner;

public class HourlySalary {
    public static void main(String[] args){
    int hours;
    int salary;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How many hours did you work? ");
    hours = keyboard.nextInt();
    if (hours <= 40){
        salary = hours * 8;
        System.out.println("Your salary is: $" + salary);
    }
    else if (hours > 40){
        salary = 320 + (12 * (hours - 40));
        System.out.println("Your salary is: $" + salary);
    }
    }
}
