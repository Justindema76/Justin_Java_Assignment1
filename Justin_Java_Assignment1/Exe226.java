/*
 * 2.26 (Multiples) Write an application that reads two integers, 
 * determines whether the first is a multiple of the second and prints the result. 
 * [Hint: Use the remainder operator.]
 */
import java.util.Scanner;

public class Exe226 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter intetger 1: ");
        int number1 = input.nextInt();

        System.out.print("Please enter intetger 2: ");
        int number2 = input.nextInt();

        if (number1 % number2 == 0){
            System.out.println(number1 + " is a multiple of "  + number2);
        }else{
            System.out.println(number1 + " is not a multiple of "  + number2);
        }
        input.close();

    }
}
