/**
    This class works with the room's size and the cost of carpet per square foot.
 */

public class RoomCarpet
{
    private RoomDimension size; // Size of the room
    private double carpetCost;  // Cost of carpet per square foot
    /**
     Constructor
     @param dim A RoomDimension object.
     @param cost The cost of carpet per square foot.
     */
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size = dim;
        carpetCost = cost;
    }

    /**
     The getTotalCost method calculates the total carpeting cost.
     @return The total cost of carpeting.
     */
    public double getTotalCost()
    {
        return size.getArea() * carpetCost;
    }
    /**
     toString method
     @return A string containing the dimensions of the room stored in the RoomDimension "size" object and the cost of carpet per square foot.
     */    
    public String toString(){
    String str = "Dimensions: \n" + size + "\nRate: " + carpetCost;
    return str;
    }
}
