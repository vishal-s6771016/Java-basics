import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (total numbers should be from 1 to N): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int totalSum = n * (n + 1) / 2;
        System.out.println("Missing Number: " + (totalSum - sum));
        sc.close();
    }
}
