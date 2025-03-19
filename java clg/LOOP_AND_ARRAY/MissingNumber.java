import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array (N-1): ");
        int n1 = scanner.nextInt();
        int[] numbers = new int[n1];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n1; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the total sum of numbers from 1 to N
        int n = n1 + 1;
        int totalSum = n * (n + 1) / 2;

        // Calculate the sum of the array elements
        int arraySum = 0;
        for (int num : numbers) {
            arraySum += num;
        }

        // Find the missing number
        int missingNumber = totalSum - arraySum;

        System.out.println("The missing number is: " + missingNumber);
    }
}
