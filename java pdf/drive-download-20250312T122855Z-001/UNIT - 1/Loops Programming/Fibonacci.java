import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = 0, b = 1;
        System.out.print(a);
        for (int i = 1; i < n; i++) {
            System.out.print(" " + b);
            b = a + (a = b);
        }
    }
}
