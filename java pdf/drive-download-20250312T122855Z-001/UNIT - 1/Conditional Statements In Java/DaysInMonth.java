import java.util.Scanner;
class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt(), year = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 2 -> System.out.println((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28);
            default -> System.out.println("Invalid Month");
        }
    }
}
