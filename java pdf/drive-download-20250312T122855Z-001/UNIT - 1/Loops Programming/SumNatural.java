import java.util.Scanner;
class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}
