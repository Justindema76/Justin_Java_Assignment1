/* 
4.26 What does the following program print?


Thsi will be printed out do the the loop 
 >>>>>>>>>> number is odd this will be printed  10 times
 <<<<<<<<<< number is even this will be printed 10 times
 >>>>>>>>>>
 <<<<<<<<<<
 >>>>>>>>>>
 <<<<<<<<<<
 >>>>>>>>>>
 <<<<<<<<<<
 >>>>>>>>>>
 <<<<<<<<<<

 */



public class Chap426 {
    public static void main(String[] args) {
       int row = 10; // this is the amount of rows with stop at 10
 
       while (row >= 1) {
          int column = 1;
 
          while (column <= 10) { // amout of coloums will stop at 10
             System.out.print(row % 2 == 1 ? "<" : ">"); // < is odd > is even
             ++column; // loop the column
          }
 
          --row;
          System.out.println();
       }
    }
 }
 

