import java.util.Scanner;

public class input{

public static void main (String[] args){

Scanner sc = new Scanner(System.in);

char initial = sc.next().charAt(0);

byte age = sc.nextByte();

short family_income = sc.nextShort();

int dream_salary = sc.nextInt();

double PI_value = sc.nextDouble();

boolean JUS = sc.nextBoolean();

System.out.println("Age: " +age);
System.out.println("Initial: " +initial);
System.out.println("Income: " +family_income);
System.out.println("Salary: " +dream_salary);
System.out.println("PI VALUE: " +PI_value);
System.out.println("JAVA UNDERSTANDABLE: " +JUS);


}

}

 

