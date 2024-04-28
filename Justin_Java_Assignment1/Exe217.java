/*
 * 2.17 (Arithmetic, Smallest and Largest) 
 * Write an application that inputs three integers from the user and displays 
 * the sum, average, product, smallest and largest of the numbers. 
 * Use the techniques shown in Fig. 2.15. [Note: The calculation of 
 * the average in this exercise should result in an integer representation of the average. 
 * So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 */

 import java.util.Scanner;

 public class Exe217 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
// 1. prompt user to input 3 int
    System.out.print("Please enter the 1st integer: ");
    int number1 = input.nextInt();

    System.out.print("Please enter the 2nd integer: ");
    int number2 = input.nextInt();

    System.out.print("Please enter the 3rd integer: ");
    int number3 = input.nextInt();
    
// To calculate the sum average, product , smallest, and largest

    int sum = number1 + number2 + number3;
    int average = sum / 3;
    int product = number1 * number2 * number3;

    int smallest = number1;
    if (number2 < smallest) {
        smallest = number2;
    }
    if (number3 < smallest){
        smallest = number3;
    }

    int largest = number1;
    if (number2 > largest) {
        largest = number2;
    }
    if (number3 > largest) {
        largest = number3;
    }

    // Display the results
    System.out.printf("Sum: %d%n", sum);
    System.out.printf("Average: %d%n", average);
    System.out.printf("Product: %d%n", product);
    System.out.printf("Smallest: %d%n", smallest);
    System.out.printf("Largest: %d%n", largest);

    input.close(); // Close the Scanner
}

}




 