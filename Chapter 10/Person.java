/**
 This class holds data about a person's name, address, and telephone number.
 */
public class Person
{
    protected String name; // To hold the name of the person
    protected String address; // To hold the person's address
    protected String phoneNumber; // To hold the person's phone number
    /**
     Constructor
     @param name The person's name
     @param address The person's address
     @param number The person's phone number
     */
    public Person(String name, String address, String number){
        this.name = name;
        this.address = address;
        phoneNumber = number;
    }
    
    /**
     The toString method returns a String containing the data stored in the fields of the Person class.
     
     @return A String displaying the data found in the name, address, and phoneNumber fields
     */
    public String toString(){
    return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNumber;
    }
    
    /**
     The setName method stores a String in the name field.
     
     @param nam The String to be stored in the name field.
     */
    public void setName(String nam){
     name = nam;   
    }
    
    /**
     The setAddress method stores a String in the address field.
     
     @param location The String to be stored in the address field.
     */
    public void setAddress(String location){
     address = location;   
    }
    
    
    /**
     The setNumber method stores a String in the phoneNumber field.
     
     @param number The String to be stored in the phoneNumber field.
     */
    public void setNumber(String number){
     phoneNumber = number;  
    }
    
    /**
     The getName method returns the String stored in the name field.
     
     @return The String in the name field.
     */
    public String getName(){
        return name;    
    }
    
    /**
     The getAddress method returns the String stored in the address field.
     
     @return The String in the address field.
     */
    public String getAddress(){
        return address;    
    }
    
    /**
     The getNumber method returns the String stored in the phoneNumber field.
     
     @return The String in the phoneNumber field.
     */
    public String getNumber(){
        return phoneNumber;    
    }
}
