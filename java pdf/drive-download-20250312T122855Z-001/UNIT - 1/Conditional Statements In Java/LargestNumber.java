import java.util.Scanner;
class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println((a >= b && a >= c) ? a : (b >= c ? b : c));
    }
}
