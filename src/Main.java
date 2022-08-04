import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        double length;
        double height;
        int coats; // store the coats the customer wants
        int numWalls; // store the number of walls

        Scanner input = new Scanner(System.in); //declare a scanner variable to be used below
        RoomSize roomSize = new RoomSize();

        System.out.println("What is the height of your room in metres"); // display a request to get the height
        height = input.nextDouble(); // take the input for height
        roomSize.setHeight(height);

        System.out.println("What is the length of your room in metres"); // display a request to get the length
        length = input.nextDouble(); // take the input for length
        roomSize.setLength(length);

        System.out.println("How many walls are in the room?");
        numWalls = input.nextInt();
        roomSize.setWalls(numWalls);

        System.out.println("How many coats of paint do you want? "); // display a request to get the coats
        coats = input.nextInt(); // take the input for coats

        // test feature to ensure the data is accurately collected from the above lines
        // and test the calculations
        System.out.println("The length of your room is " + roomSize.getLength() + " metres " +
                " the height of the room is " + roomSize.getHeight() + " metres " + " and an overall area of " +
                roomSize.areaCalc(height, length)
        + " there are " + roomSize.getWalls() + " walls in your room " + "you wanted " + coats + " coats of paint ");

        calcPaint paintCan = new calcPaint();
        System.out.println("The cost of the paint is " + paintCan.cost + " per can of paint "
        + " the brand of this paint is " + paintCan.brand);


    }
}