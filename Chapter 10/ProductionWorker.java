/**
 This class holds data regarding an employee's shift and pay rate, and extends the Employee class.
 */
public class ProductionWorker extends Employee
{
    protected int shift; // To hold a number representing which shift the employee works
    protected double payRate; // To hold the employee's pay rate
    /**
     Constructor
     @param name The employee's name
     @param codeNumber The part of the employee number with digits
     @param codeLetter The part of the employee number with a letter
     @param date The day that the employee was hired
     @param shiftNumber The number representing which shift the employee works
     @param rate The employee's pay rate
     */
    public ProductionWorker(String name, int codeNumber, char codeLetter, String date, int shiftNumber, double rate)
    {
        super(name, codeNumber, codeLetter, date);
        /**
         The above line calls on the superclass's constructor, linking it with the name,
         codeNumber, codeLetter, and date parameters.
         */
        shift = shiftNumber;
        payRate = rate;
    }
    /**
     The toString method returns a String containing the data linked to the superclass and the data stored
     in the shift and payRate fields.
     @return A String containing the data related to the superclass (Employee) and
     the data stored in the shift and payRate fields.
     */
    public String toString(){
        return super.toString() + "\nShift: " + ShiftType(shift) + "\nHourly Pay Rate: " + payRate;
        // super.toString() calls on the superclass's toString method
    }
    /**
     The setShift method stores an integer in the shift field.
     @param number The number to be stored in the shift field.
     */
    public void setShift(int number){
    shift = number;
    }
    /**
     The getShift method returns the value stored in the shift field.
     @return The integer in the shift field.
     */
    public int getShift(){
      return shift;
    }
    /**
     The ShiftType method determines whether the employee works at night or
     during the day.
     @param shiftCode The number representing which shift the employee works.
     @return A String stating the shift that the employee works.
     */
    public String ShiftType(int shiftCode){
        String time = " ";
        if (shiftCode == 1){
         time = "Day";  
        }
        else if (shiftCode == 2){
         time = "Night";
        }
        return time;
    }
    /**
     The setRate method stores a value in the payRate field.
     @param rate The number to be stored in the payRate field.
     */
    public void setRate(double rate){
        payRate = rate;
    }
    /**
     The getRate method returns the value stored in the payRate field.
     @return The number in the payRate field.
     */
    public double getRate(){
        return payRate;
    }
}
