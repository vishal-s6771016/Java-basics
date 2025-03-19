// Importing user input Library
import java.util.Scanner;

// Creating class file
public class Assignment {

    public static void main(String[] args){

        // Creating object for scanner as it is used for getting user input
        Scanner scr = new Scanner(System.in);

        // Getting user input for a to  performing of Assignment Operations
        System.out.println("Enter the value of the a");
        int a = scr.nextInt();

        // Getting user input for b to  performing of Assignment Operations
        System.out.println("Enter the value of the b");
        int b = scr.nextInt();
        
        // Performing Equal Operation
        System.out.println("Equal: " + (a = b));

        // Performing PLUS EQUAL OPERATION Which is equal to a = a + b
        System.out.println("PLUS EQUAL: " + (a += b));

        // Performing MINUS EQUAL OPERATION Which is equal to a = a - b
        System.out.println("MINUS EQUAL: " +(a -= b));

        // Performing MULTIPLY EQUAL OPERATION Which is equal to a = a * b
        System.out.println("MULTIPLY EQUAL: " + (a *= b));

        // Performing DIVID EQUAl OPERATION Which is equal to a = a / b
        System.out.println("DIVID EQUAL: " + (a /= b));

        // Performing MODULO EQUAL OPERATION Which is equal to a = a % b
        System.out.println("MODULO EQUAL: " + (a %= b));

        // Performing AND EQUAL OPERATION Which is equal to a = a & b
        System.out.println("AND EQUAL: " + (a &= b));

        // Performing OR EQUAL OPERATION Which is equal to a = a | b
        System.out.println("OR EQUAL: " + (a |= b));

        // Performing CAP EQUAL OPERATION Which is equal to a = a ^ b
        System.out.println("CAP EQUAL: " + (a ^= b));

        // Performing RIGHT SHIFT EQUAL OPERATION Which is equal to a = a >> b
        System.out.println("RIGHT SHIFT EQUAL: " + (a >>= b));

        // Performing LEFT SHIFT EQUAL OPERATION Which is equal to a = a << b
        System.out.println("LEFT SHIFT EQUAL: " + (a <<= b));
        

    }
    
}
