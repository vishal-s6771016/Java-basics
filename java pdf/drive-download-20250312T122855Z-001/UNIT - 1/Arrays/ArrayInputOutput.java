import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking the user for the array size
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        // Creating an array of given size
        int[] arr = new int[size];

        // Taking array input from the user
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the array elements
        System.out.println("Array elements entered:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
