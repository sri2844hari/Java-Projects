package AtmApplication;

import java.util.Scanner;
public class Atm_User{
public static void main(String[] args) {
    AtmoperationImple2 atm = new AtmoperationImple2();
    int atmpin = 12345;
    int atmpass = 1234;
    Scanner sc = new Scanner(System.in);
    
    while (true) {
        System.out.println("\nEnter ATM Pin: ");
        int atmp = sc.nextInt();
        System.out.println("Enter ATM Pass: ");
        int atmpp = sc.nextInt();
        
        if (atmpin == atmp && atmpass == atmpp) {
            System.out.println("Login successful!");
            while (true) {
                System.out.println("1. View Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. Check Mini Statement\n5. Exit");
                System.out.print("Enter your choice: ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    System.out.print("Your balance is: ");
                    atm.checkbalance();
                } else if (ch == 2) {
                    System.out.println("Enter Withdrawal Amount: ");
                    double withdrawl = sc.nextDouble();
                    atm.withdrawlAmount(withdrawl);
                } else if (ch == 3) {
                    System.out.println("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    atm.depositAmount(deposit);
                } else if (ch == 4) {
                    atm.viewminiStatement();
                } else if (ch == 5) {
                    System.out.println("Please take your card. Visit again!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice! Please enter a valid option (1-5).");
                }
            }
        } else {
            System.out.println("Invalid ATM Pin or Password. Please try again.\n");
        }
    }
}
}