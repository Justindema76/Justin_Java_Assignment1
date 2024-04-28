 // 2.19 What does the following code print? left aligned half xmax tree
// System.out.printf("*%n**%n***%n****%n*****%n");
/*
 *  *
    **
    ***
    ****
    *****
 */



public class Exe219 {
    public static void main(String[] args) {
        // Print a pattern using printf
        System.out.printf("*%n**%n***%n****%n*****%n");
        // each * is on a line and the %n creates a new line for the next set

        // Explanation
        System.out.println("*: This prints a single asterisk (*) followed by a newline.");
        System.out.println("**: This prints two asterisks (**) followed by a newline.");
        System.out.println("***: This prints three asterisks (***) followed by a newline.");
        System.out.println("****: This prints four asterisks (****) followed by a newline.");
        System.out.println("*****: This prints five asterisks (*****) followed by a newline.");

        // // Additional Information
        // System.out.println("\nAdditional Information:");
        // System.out.println("-----------------------");
        // System.out.println("%n: This is a format specifier used in printf to represent a newline character.");
        // System.out.println("Each %n in the format string causes printf to output a newline.");
    }
}
