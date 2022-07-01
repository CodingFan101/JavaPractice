import java.util.Scanner;

public class PurchaseAmount {
    public static void main(String[] args){
    double purchaseAmt = 0, stateTax, ctyTax, salesAmt;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How much was your purchase? ");
    purchaseAmt = keyboard.nextDouble();
    stateTax = purchaseAmt * 0.04;
    ctyTax = purchaseAmt * 0.02;
    salesAmt = purchaseAmt + stateTax + ctyTax;
    System.out.printf("Amount of purchase: $%,.2f", purchaseAmt);
    System.out.println();
    System.out.printf("State sales tax: $%,.2f", stateTax);
    System.out.println();
    System.out.printf("County sales tax: $%,.2f", ctyTax);
    System.out.println();
    System.out.printf("Total amount: $%,.2f", salesAmt);
    }
}
