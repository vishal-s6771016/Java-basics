import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        // Declaring the jagged array
        int[][] jaggedArray = new int[rows][];

        // Taking input for each row's column size and elements
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of columns for row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
