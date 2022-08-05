
public class RoomSize
{
        double length; // store the length
        double height; // store the height
        int walls; // store the number of walls
        double area; // store the area of the walls
        double cost; // store the total cost
        int coats; // store the number of coats
        double pricePerSqM = 6; //store the price per square meter

        public double getLength()
        {
            return length;
        }
        public double getHeight()
        {
            return height;
        }
        public int getWalls()
        {
            return walls;
        }


        public void setLength(double newLength)
        {
            length = newLength;
        }
        public void setHeight(double newHeight)
         {
            height = newHeight;
         }
        public void setWalls(int newWalls)
        {
            walls = newWalls;
        }
        public void setCoats(int numCoats)
        {
            coats = numCoats;
        }
        public void setCost(double newCost)
        {
            cost = newCost;
        }


        public double areaCalc(double height, double length)
        {
            return area = height * length;
        }
        public double costCalc()
        {
            return cost = (area * walls) / (pricePerSqM * coats);
        }
        public static void main (String[] args)
        {

        }
}
