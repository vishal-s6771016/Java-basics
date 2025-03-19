// Importing user input Library
import java.util.Scanner;

// Creating class file
public class Ternary {

    // Creating main function for Performing Operations
public static void main(String[] args) 
{
    // Creating object for scanner as it is used for getting user input
    Scanner scr = new Scanner(System.in);

    // Getting user input for a to  performing of TERNARY Operations
    System.out.println("Enter the value of the a");
    int a = scr.nextInt(); 

    // Getting user input for b to  performing of TERNARY Operations
    System.out.println("Enter the value of the b");
    int b = scr.nextInt();
    
    // Performing TERNARY Operation
    System.out.println("TERNARY COMPRISION: "+((a > b) ? a : b ));
}
    
}
