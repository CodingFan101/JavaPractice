/**
 This class stores information about an employee regarding his name, number, and hire date.
 */
public class Employee
{
    protected String employeeName; // To hold the employee's name
    protected int employeeNumber; // To hold the parts of the employee number involving digits
    protected char employeeLetter; // To hold the part of the employee number involving a letter
    protected String hireDate; // To hold the date that the employee was hired
    /**
     Constructor for Employee class
     @param name The employee's name
     @param number The part of the employee number with digits
     @param letter The part of the employee number with a letter
     @param date The day that the employee was hired
     */
    public Employee(String name, int number, char letter, String date)
    {
        employeeName = name;
        employeeNumber = number;
        employeeLetter = letter;
        hireDate = date;
    }
    /**
     The toString method returns a String containing the data stored in the Employee class's fields.
     @return A String containing the data stored in the employeeName, employeeNumber, employeeLetter, and hireDate fields.
     */
    public String toString(){
    return "Name: " + employeeName + "\nEmployee Number: " + employeeNumber + "-" + employeeLetter + "\nHire Date: " + hireDate;
    }
    /**
     The setName method stores a String in the employeeName field.
     @param name The String to be stored in the employeeName field.
     */
    public void setName(String name){
        employeeName = name;
    } 
    /**
     The getName method returns the value in the employeeName field.
     @return The value stored in the employeeName field.
     */
    public String getName(){
        return employeeName;
    }
    /**
     The setNumber method stores a value in the employeeNumber field.
     @param number The integer to be stored in the employeeNumber field.
     */
    public void setNumber(int number){
        employeeNumber = number;
    }
    /**
     The getNumber method returns the value in the employeeNumber field.
     @return The value stored in the employeeNumber field.
     */
    public int getNumber(){
        return employeeNumber;
    }
    /**
     The setLetter method stores a value in the employeeLetter field.
     @param letter The character to be stored in the employeeLetter field.
     */
    public void setLetter(char letter){
        employeeLetter = letter;
    }
    /**
     The getLetter method returns the character found in the employeeLetter field.
     @return The character stored in the employeeLetter field.
     */
    public char getLetter(){
        return employeeLetter;
    }
    /**
     The setDate method stores a String in the hireDate field.
     @param date The day when the employee was hired.
     */
    public void setDate(String date){
        hireDate = date;
    }
    /**
     The getDate method returns the String in the hireDate field.
     @return The String stored in the hireDate field.
     */
    public String getDate(){
        return hireDate;
    }
}
