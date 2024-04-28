/*
 * 5.11 (Find the Smallest Value) Write an application that 
 * finds the smallest of several integers. Assume that the first value 
 * read specifies the number of values to input from the user.
 */
import java.util.Scanner;

public class Chap511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


// Method to prompt user to enter a number
//***Assume that the first value read specifies the number of values to input from the user.
        System.out.println("Please Enter the number of values: ");
        int numberValues = input.nextInt();

//Prompt use to enter the first value
        System.out.println("Enter the values : ");
        int smallest = input.nextInt();

// Loop to detemine amount of values and find smallest
        for (int i = 2; i <= numberValues; i++){
            int value = input.nextInt();
            if (value < smallest){

            }
        }
// print line to display smallest value
System.out.println("The smallest value is: " + smallest);

input.close();
    }
}
