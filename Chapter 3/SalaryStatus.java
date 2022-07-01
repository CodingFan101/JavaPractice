import java.util.Scanner;

public class SalaryStatus {
    public static void main(String[] args){
    int status;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What's your current status? ");
    status = keyboard.nextInt();
    if (status == 1){
        System.out.println("You're being paid a senior's salary, which is $800 per week.");
    }
    else if (status < 0){
        System.out.println("That is not a valid input.");
    }
    else{
        System.out.println("You're being paid a junior's salary, which is $550 per week.");
    }
    }
}
