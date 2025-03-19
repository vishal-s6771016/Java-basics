import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        int max = arr[0];
        for (int i = 1; i < n; i++) 
            if (arr[i] > max) 
                max = arr[i];

        System.out.println("Maximum Number: " + max);
        sc.close();
    }
}
