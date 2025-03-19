import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int num_d;
        num_d = num;
        while (num_d>1) {
            num_d-=2;
        }
        if (num_d == 0) {
            System.out.println(num +" is even");
        }
        else{
            System.out.println(num +" is odd");
        }

    }
}
