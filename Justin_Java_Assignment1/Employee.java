/*
 * 3.13 (Employee Class) Create a class called Employee 
 * that includes three instance variables—a first name (type String), 
 *       a last name (type String) and a monthly salary (double). 
 * Provide a constructor that initializes the three instance variables. 
 * Provide a set and a get method for each instance variable. 
 * If the monthly salary is not positive, do not set its value. 
 * Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
        * Create two Employee objects and display each object’s yearly salary. 
 * Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */


// 3 instance variables
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
// constructor to initialized the instances    
    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0) {   //* Determine monthly salary is not positive, do not set its value. 
        this.monthlySalary = monthlySalary;
        }
        
    }
// Getters----->
public String getFirstName(){
    return firstName;
}
public String getLastName(){
    return lastName;
}
public double getMonthlySalary(){
    return monthlySalary;
}

// Setters ------>
public void setFirstName(String firstName){
    this.firstName = firstName;
}

public void setLastName(String lastName){
    this.lastName = lastName;
}

public void setMonthlySalary(double monthlySalary){
    if (monthlySalary > 0) {
        this.monthlySalary = monthlySalary;
    }
}
    //method to calculate the yearly salary 
public double yearlySalary(){
    return monthlySalary * 12;
}
 //method to give raise
 public double giveRaise() {
    double raiseAmount = monthlySalary * 0.1; // Calculate the raise amount (10% of monthly salary)
    monthlySalary += raiseAmount; // Increase the monthly salary by the raise amount
    return raiseAmount;
}
}

