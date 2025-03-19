// Importing user input Library
import java.util.Scanner;

// Creating class file
public class Bitwise {

    // Creating main function for Performing Operations
    public static void main(String[] args) {
        
        // Creating object for scanner as it is used for getting user input
        Scanner scr = new Scanner(System.in);

         // Getting user input for a to  performing of Bitwise Operations
        System.out.println("Enter the value of the a");
        int a = scr.nextInt();

        // Getting user input for b to  performing of Bitwise Operations
        System.out.println("Enter the value of the b");
        int b = scr.nextInt();

        // Performing AND Operation
        System.out.println("AND: " + ( a& b));

        // Performing OR Operation
        System.out.println("OR: "  + ( a|b ));

        // Performing CAP Operation
        System.out.println("CAP: " + ( a^b ));

        // Performing NEGATION Operation -(a+1)
        System.out.println("NEGATION: " + ( ~a ));

        // Performing RIGHT SHIFT Operation
        System.out.println("RIGHT SHIFT: " + ( a>> b));

        // Performing LEFT SHIFT Operation
        System.out.println("LEFT SHIFT: " + ( a<<b ));

        // Performing TRIPLE RIGHT SHIFT Operation
        System.out.println("TRIPLE RIGHT SHIFT: " + ( a>>>b ));

        
    }
}
