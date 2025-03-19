import java.util.Scanner;
public class Atm {
    static boolean card=true;
    int PIN=1234566;//the code enter outside the main code is call global variable which can be access by all the class other than main
    public static void main(String[] args) {
        while (card) {
        System.out.println("Available option");
        System.out.println("1-->Withdraw");
        System.out.println("2-->Deposit");
        System.out.println("3-->Balance");
        System.out.println("4-->Cancel");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one option above : ");
        Byte choice = sc.nextByte();

        int min_balance=500;
        int acc_balance=5000;

        switch (choice) {
            case 1:
                System.out.println("Enter amount to debit :");
                int d_amt = sc.nextInt();
                acc_balance-=d_amt;
                System.out.println("Rs."+d_amt +"is Debited successfully");
                System.out.println("Available Balace : "+acc_balance); 
                break;
            case 2:
                System.out.println("Enter amout to credit :");
                int c_amt=sc.nextInt();
                acc_balance+=c_amt;
                System.out.println("Rs."+c_amt +"is Credit succesfully");
                System.out.println("Available Balace : "+acc_balance);
                break;
            case 3:
                System.out.println("Available Balace : "+acc_balance);
                break;
            case 4:
            card = false;
                return;
        }
    }
    
}
    
}