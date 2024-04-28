/*
 * 2.24 (Largest and Smallest Integers) 
 * Write an application that reads five integers and determines 
 * and prints the largest and smallest integers in the group. 
 * Use only the programming techniques you learned in this chapter.
 */

 import java.util.Scanner;

public class Exe224 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
int number1 = 5;
int number2 = 10;
int number3 = 15;
int number4 = 20;
int number5 = 25;


// loop to determine smallest number
    int smallest = number1;
    if (number2 < smallest) {
        smallest = number2;
    }
    if (number3 < smallest){
        smallest = number3;
    }
    if (number4 < smallest) {
        smallest = number4;
    }
    if (number5 < smallest){
        smallest = number5;
    }

// loop to detemine largest number

    int largest = number1;
    if (number2 > largest) {
        largest = number2;
    }
    if (number3 > largest) {
        largest = number3;  
    }
    if (number4 > largest) {
        largest = number4;
    }
    if (number5 > largest) {
        largest = number5;
    }


    //print out
    
    System.out.printf("Smallest: %d%n", smallest);
    System.out.printf("Largest: %d%n", largest);

    input.close();
}


}