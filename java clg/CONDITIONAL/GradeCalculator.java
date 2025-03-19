import java.util.Scanner;


public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your marks (0-100): ");
        int marks = scn.nextInt();
        String grade;

        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80 && marks <= 89) {
            grade = "B";
        } else if (marks >= 70 && marks <= 79) {
            grade = "C";
        } else if (marks >= 60 && marks <= 69) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

