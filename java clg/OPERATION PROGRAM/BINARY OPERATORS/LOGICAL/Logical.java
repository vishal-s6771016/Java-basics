// Importing user input Library
import java.util.Scanner;

// Creating class file
public class Logical {

    // Creating main function for Performing Operations
    public static void main(String[] args) {

        // Creating object for scanner as it is used for getting user input
        Scanner scr = new Scanner(System.in);

        // Getting user input for a to  performing of lOGICAL Operations
        System.out.println("Enter the value of the a");
        int a = scr.nextInt();

        // Getting user input for b to  performing of lOGICAL Operations
        System.out.println("Enter the value of the b");
        int b = scr.nextInt();

        // Performing Logical AND Operation
        System.out.println("LOGICAL AND: " +(a<b && a>b));
        
        // Performing Logical OR Operation
        System.out.println("LOGICAL OR: " +(a<b || b>a));
        
    }
    
}
