import javax.swing.JOptionPane;

public class InterestRate {
    public static void main(String[] args){
    int numYears = Integer.parseInt(JOptionPane.showInputDialog(null, "How many years have you left your money in the bank for?"));
    if (numYears > 5){
        System.out.println("The interest rate is 7.5%.");
    }
    else if (numYears <= 0){
        System.out.println("That is not a valid input.");
    }
    else if (numYears > 0 && numYears <= 5){
        System.out.println("The interest rate is 5.4%.");
    }
    }
}
