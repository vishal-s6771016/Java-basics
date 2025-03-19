// Importing user input Library
import java.util.Scanner;


// Creating class file
public class Unary {

// Creating main function for Performing Operations
public static void main(String[] args) {

    // Creating object for scanner as it is used for getting user input
    Scanner scr = new Scanner(System.in);

     // Getting user input for a to  performing of UNARY Operations
    System.out.println("Enter the value of the a");
    int a = scr.nextInt();

    // Getting user input for b to  performing of UNARY Operations Mainly used for boolean expression
    System.out.println("ENTER THE TRUE OR FALSE FOR b");
    boolean b = scr.nextBoolean();

    // Performing UNARY PLUS Operation
    System.out.println("UNARY PLUS: " + ( +a ));

    // Performing UNARY MINUS Operation
    System.out.println("UNARY MINUS: " + ( -a ));

    // Performing UNARY INCREMENT Operation
    System.out.println("INCREMENT OPERATOR: " + ( ++ a));

    // Performing UNARY DECREMENT Operation
    System.out.println("DECREMENT OPERATOR: " +( -- a));

    // Performing UNARY NOT Operation for Boolean
    System.out.println("NOT OPERATOR FOR BOOLEAN: " +( !b ));
}
    
}
