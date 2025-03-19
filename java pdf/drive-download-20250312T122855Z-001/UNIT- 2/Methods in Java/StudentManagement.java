import java.util.Scanner;

public class StudentManagement {

    // 1. Method without arguments and without return type
    void displayWelcomeMessage() {
        System.out.println("=== Welcome to Student Management System ===");
    }

    // 2. Method with arguments and without return type
    void displayStudentDetails(String name, int age, double marks) {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // 3. Method without arguments and with return type
    double getDefaultPassMarks() {
        return 40.0; // Returning the minimum passing marks
    }

    // 4. Method with arguments and with return type
    boolean isPassed(double marks) {
        double passMarks = getDefaultPassMarks();
        return marks >= passMarks;
    }

    public static void main(String[] args) {
        StudentManagement student = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        // Calling method without arguments and without return type
        student.displayWelcomeMessage();

        // Taking user input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        // Calling method with arguments and without return type
        student.displayStudentDetails(name, age, marks);

        // Calling method without arguments and with return type
        double passMarks = student.getDefaultPassMarks();
        System.out.println("\nMinimum Passing Marks: " + passMarks);

        // Calling method with arguments and with return type
        boolean result = student.isPassed(marks);
        if (result) {
            System.out.println(name + " has PASSED the exam.");
        } else {
            System.out.println(name + " has FAILED the exam.");
        }

        sc.close();
    }
}
