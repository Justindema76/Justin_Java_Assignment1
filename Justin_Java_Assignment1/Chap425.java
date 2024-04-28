/*
 *  > - public static void main(String[] args) {   - 
  > - int count = 1; - count starts at 1
  > - while (count <= 10) {
  > - System.out.println(count % 2 == 1 ? "****" : "++++++++");
  > -  ++count;This is a while loop that will run to times
 */

/*
****
++++++++
****
++++++++
****
++++++++
****
++++++++
****
++++++++
 */


public class Chap425 {
    
 // Exercise 4.25: Mystery2.java 
    public static void main(String[] args) {
       int count = 1;  // loop count starts at 1
     while (count <= 10) { // loop count is equal or less then 10 
          System.out.println(count % 2 == 1 ? "****" : "++++++++"); 
          
          // ? the ternary operator is used to determine which print to use.
          // The % 2 == 1 is used to determine if odd or even 
          /*
           * loop 10 times with when the number is odd print ****
           * if it is even print ++++++++
           */
           ++count;
      } 
     } 
 }
