
import java.util.Scanner;
public class RoomSize
{
        double length;
        double height;
        int walls;
        double area;

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

        public static void main (String[] args)
        {

        }
}
