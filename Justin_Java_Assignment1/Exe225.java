/*
 * 2.25 (Odd or Even) Write an application that reads an integer and 
 * determines and prints whether it’s odd or even. [Hint: Use the 
 * remainder operator. An even number is a multiple of 2. 
 * Any multiple of 2 leaves a remainder of 0 when divided by 2.]
 */

import java.util.Scanner;

public class Exe225 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. prompt user to input an int
        System.out.print("Please enter an intetger: ");
        int number = input.nextInt();

        //Determine if it is odd or ever

        if (number % 2 == 0){
            System.out.println(number + " is an even number.");
        }else{
            System.out.println(number + " is an odd number ");
        }
       input.close();
    
    
    
    
    }

}
