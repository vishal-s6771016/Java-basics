]import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a pattern to print:");
        System.out.println("1 -> Left-Angle Triangle");
        System.out.println("2 -> Right-Angle Triangle");
        System.out.println("3 -> Inverted Right-Angle Triangle");
        System.out.println("4 -> Inverted Left-Angle Triangle");
        System.out.println("5 -> Hollow Square");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter the size of pattern: ");
        int n = sc.nextInt();
        

        sc.close(); // Close scanner
        
        switch (choice) {
            case 1:
                leftAngleTriangle(n);
                break;
            case 2:
                rightAngleTriangle(n);
                break;
            case 3:
                invertedRightAngleTriangle(n);
                break;
            case 4:
                invertedLeftAngleTriangle(n);
                break;
            case 5:
                hollowSquare(n);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
    }

    // 1. Left-Angle Triangle
    static void leftAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Right-Angle Triangle
    static void rightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Printing spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Inverted Right-Angle Triangle
    static void invertedRightAngleTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 4. Inverted Left-Angle Triangle
    static void invertedLeftAngleTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Printing spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Hollow Square
    static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Printing space inside the square
                }
            }
            System.out.println();
        }
    }
}
