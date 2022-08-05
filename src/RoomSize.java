
import java.util.Scanner;
public class RoomSize
{
        double length;
        double height;
        int walls;
        double area;
        double cost;

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

        public double areaCalc(double height, double length)
        {
            return area = height * length;
        }
        public void setCost(double newCost)
        {
            cost = newCost;
        }
        public double costCalc()
        {
            return cost = area * walls;
        }
        public static void main (String[] args)
        {

        }
}
