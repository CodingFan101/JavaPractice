import javax.swing.JOptionPane;

public class ElseIfStatements {
    public static void main(String[] args){
    double input, rate, amount, interest, total;
    input = Double.parseDouble(JOptionPane.showInputDialog(null, "How many years?"));
    amount = Double.parseDouble(JOptionPane.showInputDialog(null, "How much money?"));
    if (input >= 5){
        rate = 0.095;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    else if (input >= 4 && input < 5){
        rate = 0.09;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    else if (input >= 3 && input < 4){
        rate = 0.085;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    else if (input >= 2 && input < 3){
        rate = 0.075;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    else if (input >= 1 && input < 2){
        rate = 0.065;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    else if (input < 1){
        rate = 0.058;
        interest = amount * rate;
        total = amount + interest;
        JOptionPane.showMessageDialog(null,"Amount of money left on deposit: $" + total);
        JOptionPane.showMessageDialog(null, "Interest rate: " + rate);
        JOptionPane.showMessageDialog(null, "Total interest: $" + interest);
    }
    }
}
