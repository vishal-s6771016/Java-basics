import java.util.Scanner;

public class Largest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        double max = (num1 > num2) ? num1 : num2;
        System.out.println("The maximum of the two numbers is: " + max);
    }
}
