/*
 * 4.20 (Salary Calculator) Develop a Java application that determines 
 * the gross pay for each of three employees. The company pays straight 
 * time for the first 40 hours worked by each employee and time and a half 
 * for all hours worked in excess of 40. You’re given a list of the employees, 
 * their number of hours worked last week and their hourly rates. Your program 
 * should input this information for each employee, then determine and display 
 * the employee’s gross pay. Use class Scanner to input the data.
 */

 import java.util.Scanner;

 public class Chap420 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         // Input details for Employee 1
         System.out.println("Enter details for Employee 1:");
         System.out.print("Hours worked last week: ");
         double hoursWorked1 = scanner.nextDouble();
         System.out.print("Hourly rate: ");
         double hourlyRate1 = scanner.nextDouble();
 
         // Calculate and display gross pay for Employee 1
         double grossPay1 = calculateGrossPay(hoursWorked1, hourlyRate1);
         System.out.println("Employee 1's gross pay: $" + grossPay1);
 
         // Input details for Employee 2
         System.out.println("\nEnter details for Employee 2:");
         System.out.print("Hours worked last week: ");
         double hoursWorked2 = scanner.nextDouble();
         System.out.print("Hourly rate: ");
         double hourlyRate2 = scanner.nextDouble();
 
         // Calculate and display gross pay for Employee 2
         double grossPay2 = calculateGrossPay(hoursWorked2, hourlyRate2);
         System.out.println("Employee 2's gross pay: $" + grossPay2);
 
         // Input details for Employee 3
         System.out.println("\nEnter details for Employee 3:");
         System.out.print("Hours worked last week: ");
         double hoursWorked3 = scanner.nextDouble();
         System.out.print("Hourly rate: ");
         double hourlyRate3 = scanner.nextDouble();
 
         // Calculate and display gross pay for Employee 3
         double grossPay3 = calculateGrossPay(hoursWorked3, hourlyRate3);
         System.out.println("Employee 3's gross pay: $" + grossPay3);
 
         scanner.close();
     }
 
     // Method to calculate gross pay
     public static double calculateGrossPay(double hoursWorked, double hourlyRate) {
         double grossPay;
         if (hoursWorked <= 40) {
             // Straight time for the first 40 hours
             grossPay = hoursWorked * hourlyRate;
         } else {
             // Straight time for the first 40 hours
             grossPay = 40 * hourlyRate;
             // Time and a half for hours worked in excess of 40
             grossPay += (hoursWorked - 40) * (hourlyRate * 1.5);
         }
         return grossPay;
     }
 }
 