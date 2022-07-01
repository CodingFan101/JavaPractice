/**
     This class stores data concerning the length and width of the room.
 */

public class RoomDimension
{
    private double length; // The length of the room
    private double width;  // The width of the room
    /**
     Constructor
     @param len The length of the room.
     @param w The width of the room.
     */
    public RoomDimension(double len, double w)
    {
        length = len;
        width = w;
    }
    /**
     The getArea method calculates the area of the room.
     @return The total area of the room.
     */
    public double getArea()
    {
        return length * width;
    }
    /**
     The toString method
     @return A string containing the length, width, and area of the room.
     */
    public String toString(){
        String str = "Length: " + length + " ft\nWidth: " + width + " ft\nArea: " + getArea() + " sq. ft\n";
        return str;
    }
}
