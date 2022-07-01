import javax.swing.JOptionPane;

public class StudentStatus {
    public static void main(String[] args){
    int status;
    status = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert a number from 1 through 5 to determine your status."));
    switch (status){
        case 1:
            JOptionPane.showMessageDialog(null, "You are a freshman.");
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "You are a sophomore.");
            break;
        case 3:
            JOptionPane.showMessageDialog(null, "You are a junior.");
            break;
        case 4:
            JOptionPane.showMessageDialog(null, "You are a senior.");
            break;
        case 5:
            JOptionPane.showMessageDialog(null, "You are a graduate.");
            break;
    }
    }
}
