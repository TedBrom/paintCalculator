import java.util.Scanner;
public class Main
{
    public static double wallSize(double length, double width, double height, double coats) //calculate the wall size based on user input
    {
        double wallArea; // declare a variable to store the area of a wall
        double perimeter = (length * 2) + (width * 2); // calculate the perimeter of a wall based on the inputs
        wallArea = (perimeter * height) * coats; // the total area = the perimeter times the height of the room + the number of coats the customer wants
        return wallArea; // send the value back from the function so other processes can use it.
    }
    public static double litresNeeded(double wallArea) //figure out based on wall size how many litres are needed
    {
        double sqMetPrLitr = 12; //found on internet for metres per litre
        double litresNeeded = wallArea / sqMetPrLitr; // divide the area by the amount a can of paint can cover
        return litresNeeded; // return it so another function can use it
    }
    public static void dispLitres(double litresNeeded) //simple procedure to display the litres needed
    {
        System.out.println("You need " + litresNeeded + " litres of paint."); // print the overall value of the litres needed
    }
    public static double calcPrice(double litresNeeded) //get the litres needed from the litres needed function and then apply it below
    {
        double totalPrice; // declare a variable to store the total price
        double pricePerlitre = 2; // a number based on the price of a can of paint ( suppose this is very subjective )
        totalPrice = pricePerlitre * litresNeeded; // calculate the total price based on the PPL and litres needed
        return totalPrice; // pass the calculated back to the top so other functions can use it
    }

    public static void displayPrice(double totalPrice) //based on the results from above display the price bringing the total price across to display.
    {

        System.out.println("The total price is £ " + totalPrice + "."); // print out the answer based on the returned values

    }
    public static void main(String[] args)
    {

        double length; // store the length of our room
        double width; // store the width of our room
        double height; // store the height of our room
        double coats; // store the coats the customer wants

        Scanner input = new Scanner(System.in); //declare a scanner variable to be used below

        System.out.println("What is the length of your room "); // display a request to get the length
        length = input.nextDouble(); // take the input for length

        System.out.println("What is the width of your room "); // display a request to get the width
        width = input.nextDouble(); // take the input for width

        System.out.println("What is the height of your room "); // display a request to get the height
        height = input.nextDouble(); // take the input for height

        System.out.println("How many coats of paint do you want? "); // display a request to get the coats
        coats = input.nextDouble(); // take the input for coats

        wallSize(length, width, height, coats); // call the wall size calculation

        litresNeeded(wallSize(length, width, height, coats)); // call the litres needed procedure

        dispLitres(litresNeeded(wallSize(length, width, height, coats))); // call the display litres procedure

        calcPrice(litresNeeded(wallSize(length, width, height, coats))); // call the calculate price procedure

        displayPrice(calcPrice(litresNeeded(wallSize(length, width, height, coats)))); // display the final price based on the above results
        //I fixed the GitHub attempting now via cmd line

    }
}