package lab1;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Account acc = new Account("Ruffa", "Resentes", 'C', 1234567890, 0, 1219);

        //#4                
        float initialDeposit = 5000.0f;
        acc.setBalance(initialDeposit);
        
        //#5
        System.out.println("========Account Details========");
        System.out.println("Account Number: " + acc.getAccountNo());
        System.out.println("Account Name: " + acc.getFirstname() + " " + acc.getMi() + ". " + acc.getLastname());
        System.out.println("Balance: " + acc.getBalance());

        //#6
        System.out.println("\nDeposit another 500 pesos");
        acc.setBalance(acc.getBalance() + 500);
        System.out.println("New Balance: " + acc.getBalance());

        //#7
        System.out.println("\nChange PIN ");
        System.out.print("Enter old PIN: ");
        int userInput = scan.nextInt();
        if (userInput == acc.getPin()) {
            System.out.println("Authentication successful.");
            System.out.print("Enter new PIN: ");
            int newPIN = scan.nextInt();
            acc.setPin(newPIN); //can add validation of PIN here
            System.out.println("Change PIN successful.");
        } else {
            System.out.println("Changin PIN unsuccessful.");
        }

        //#8
        System.out.println("\nWithdraw 6000");
        float withdrawAmount = 6000;
        if (acc.getBalance() - withdrawAmount < 0) {
            System.out.println("Withdrawal unsuccessful.");
            System.out.println("Insufficient funds.");
        } else {
            acc.setBalance(acc.getBalance() - withdrawAmount);
            System.out.println("Withdrawal successful");
            System.out.println("New Balance: " + acc.getBalance());
        }

        //#9
        System.out.println("\nWithdraw 2000 instead.");
        withdrawAmount = 2000;
        if (acc.getBalance() - withdrawAmount < 0) {
            System.out.println("Withdrawal unsuccessful. Insufficient funds.");
        } else {
            acc.setBalance(acc.getBalance() - withdrawAmount);
            System.out.println("Withdrawal successful");
            System.out.println("New Balance: " + acc.getBalance());
        }

        //#10
        System.out.println("\n========Final Account Details========");        
        System.out.println("Account Number: " + acc.getAccountNo());
        System.out.println("Account PIN: "+acc.getPin());
        System.out.println("Account Name: " + acc.getFirstname() + " " + acc.getMi() + ". " + acc.getLastname());
        System.out.println("Balance: " + acc.getBalance());        
    }
}