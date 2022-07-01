/**
 This class holds data regarding a person's customer number and whether they wish to be on a mailing list, and also
 extends the Person class.
 */
public class Customer extends Person
{
    protected int identity; // To hold the customer's ID number
    protected boolean status; // To hold the boolean value stating if the customer wants to be on a mailing list

    /**
     Constructor
     @param name The customer's name
     @param address The customer's address
     @param number The customer's phone number
     @param customerID The customer's ID number
     @param condition To determine whether the customer wants to be on a mailing list
     */
    public Customer(String name, String address, String number, int customerID, boolean condition)
    {
        super(name, address, number); // calls on the superclass constructor
        identity = customerID;
        status = condition;
    }
    
    /**
     The toString method returns a String containing the data associated with the superclass, and the data 
     stored in the fields of the Customer class.
     
     @return A String displaying the data found in the fields of the superclass and the Customer class
     */
    public String toString(){
        return super.toString() + "\nCustomer Number: " + identity + "\nDoes this person want to be on a mailing list? " + MailingList(status);
        // super.toString() calls on the superclass's toString method
    }
    
    /**
     The MailingList method determines if the customer wants to be on a mailing list
     
     @param position The boolean value relating to the customer
     @return A String stating whether or not the customer wants to be on a mailing list
     */
    public String MailingList(boolean position){
        String str = " ";
        if (position == true){
            str = "Yes";
        }
        else{
            str = "No";
        }
    return str;
    }
    /**
     The setID method stores an integer in the identity field.
     
     @param number The value to be stored in the identity field.
     */
    public void setID(int number){
        identity = number;
    }
    
    /**
     The setStatus method stores a boolean value in the status field.
     
     @param bool The boolean value to be stored in the status field.
     */
    public void setStatus(boolean bool){
        status = bool;
    }
    
    /**
     The getID method returns the integer stored in the identity field.
    
     @return The value in the identity field.
     */
    public int getID(){
         return identity;   
    }
    
    /**
     The getStatus method returns the boolean value stored in the status field.
     
     @return The value in the status field.
     */
    public boolean getStatus(){
        return status;
    }
}
