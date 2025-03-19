import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Move all zeros to the end
        int index = 0; // Index to place non-zero elements

        for (int i = 0; i < n; i++) {
            if (numbers[i] != 0) {
                numbers[index] = numbers[i];
                index++;
            }
        }

        while (index < n) {
            numbers[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros to the end:");
        for (int number : numbers) {
            System.out.print(number + " ");
    
    }
    scanner.close();
    }

    
}
