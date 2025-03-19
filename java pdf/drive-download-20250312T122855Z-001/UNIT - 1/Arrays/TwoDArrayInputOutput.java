import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Creating a 2D array with given dimensions
        int[][] arr = new int[rows][cols];

        // Taking 2D array input from the user
        System.out.println("Enter " + (rows * cols) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the 2D array elements
        System.out.println("2D Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to next line after printing each row
        }

        sc.close();
    }
}
