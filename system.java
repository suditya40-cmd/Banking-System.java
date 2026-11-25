package Banking;

import java.util.Scanner;

public class system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your PIN : ");
        int userPin = sc.nextInt();

        int pin = 8539;
        int balance = 10000;

        if (pin == userPin) {
            System.out.println("Select Valid options");
            System.out.println("1. Withdraw amount");
            System.out.println("2. Deposit amount");
            System.out.println("3. Check Balance");

            int option = sc.nextInt();

            if (option == 1) {
                System.out.print("Enter amount to withdraw: ");
                int withAmount = sc.nextInt();
                System.out.println("Amount withdrawn successfully");
                System.out.println("Available balance : " + (balance - withAmount));
            } else if (option == 2) {
                System.out.print("Enter amount to deposit: ");
                int depoAmount = sc.nextInt();
                System.out.println("Amount deposited successfully");
                System.out.println("Available balance : " + (balance + depoAmount));
            } else if (option == 3) {
                System.out.println("Current balance is : " + balance);
            } else {
                System.out.println("Enter valid option");
                System.out.println("Thanks for visiting");
            }
        } else {
            System.out.print("Invalid PIN");
        }

        sc.close();
    }
}
