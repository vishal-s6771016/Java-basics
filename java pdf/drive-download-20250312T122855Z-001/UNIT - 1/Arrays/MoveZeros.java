import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();

        int index = 0;
        for (int i = 0; i < n; i++) 
            if (arr[i] != 0) 
                arr[index++] = arr[i];

        while (index < n) 
            arr[index++] = 0;

        System.out.println("Modified Array: " + Arrays.toString(arr));
        sc.close();
    }
}
