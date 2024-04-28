import java.util.Scanner;
/*
 Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.     
 */

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Create two Employee objects and display each object’s yearly salary. 

        Employee employee1 = new Employee("Homer","Simpson", 6000);
        Employee employee2 = new Employee("Peter","Griffin", 5000);

      
   System.out.println("Employee # 1: " + employee1.getFirstName() + " " + employee1.getLastName() + " " + "Yearly Salary: $" + employee1.yearlySalary());
   System.out.println("Employee # 2: " + employee2.getFirstName() + " " + employee2.getLastName() + " " + "Yearly Salary: $" + employee2.yearlySalary());
   
   System.out.println(employee1.giveRaise());
   System.out.println(employee2.giveRaise());
   input.close();
   
    }
}
