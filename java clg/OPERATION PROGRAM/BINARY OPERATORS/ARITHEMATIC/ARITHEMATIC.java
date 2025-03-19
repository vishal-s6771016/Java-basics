// Importing user input Library
import java.util.Scanner;

// Creating class file
public class ARITHEMATIC {

    // Creating main function for Performing Operations
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner scnr = new Scanner(System.in);

        // User input for a to performing Arithematic Operations
        System.out.print("Enter the first number: ");
        double a = scnr.nextDouble();

        // User input for a to performing Arithematic Operations
        System.out.print("Enter the second number: ");
        double b = scnr.nextDouble();


      
        // Performing Addition Operation
        System.out.println("Sum: " + (a + b));

        // Performing Subraction Operation
        System.out.println("Difference: " + (a - b));
        
        // Performing Multiplication Operation 
        System.out.println("Product: " + (a * b));

        // Performing Division Operation 
        System.out.println("Quotient: " + (a / b));

        // Performing Modulo Operation
        System.out.println("MODULO :" + (a % b));

    }
}