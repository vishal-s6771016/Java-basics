import java.util.Scanner;

public class FindPairsWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        System.out.println("Pairs found:");
        boolean pairFound = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("[" + numbers[i] + ", " + numbers[j] + "]");
                    pairFound = true;
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pairs found.");
        }
    }
}
