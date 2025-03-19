// Importing user input Library

import java.util.Scanner;

// Creating class file
public class Relation {

    // Creating main function for Performing Operations
    public static void main(String[] args) {

      // Creating object for scanner as it is used for getting user input
         Scanner scr = new Scanner(System.in);

         // Getting user input for a to  performing of RELATION Operations
         System.out.println("Enter the value of the a");
         int a = scr.nextInt();
         
          // Getting user input for b to  performing of RELATION Operations
         System.out.println("Enter the value of the b");
         int b = scr.nextInt();
         
         // Performing IS EQUAL TO OR Operation
         System.out.println("DOUBLE EQUAL: " + (a == b));

         // Performing NOT EQUAL Operation
         System.out.println("NOT EQUAL: " + (a != b));

         // Performing LESS THAN OR Operation
         System.out.println("LESS THAN: " + (a < b));

         // Performing GERATER THAN Operation
         System.out.println("GREATER THAN: "  + (a > b));

         // Performing LESS THAN OR EQUAL Operation
         System.out.println("LESS THAN EQUAL: " + (a <= b));

         // Performing GERATER THAN OR EQUAL Operation
         System.out.println("GREATER THAN EQUAL: " + (a >= b));
 }
    
    
}
