package lab1;
import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num[] = new int[5];
        Account accounts[] = new Account[2];
        
        Account acc1 = new Account("Ruffa", "Resentes", 'C', 1234567890, 0, 1219);
        
//        for(int i = 0; i <= 5; i++){
//            System.out.println("SM hurray.");
//        }
//        
//        for(int i=0; i<accounts.length; i++){
//            System.out.println("\nEnter name: ");
//            String name = scan.nextLine();
//            System.out.println("Enter account number: ");
//            int accNum = scan.nextInt(); scan.nextLine();
//            System.out.println("Enter pin: ");
//            int pin = scan.nextInt(); scan.nextLine();
//            Account a = new Account(name, " ",' ',accNum, 0, pin);
//            accounts[i] = a; 
//        }
//        
//        System.out.println(accounts[0].getFirstname());
//        System.out.println(accounts[1].getFirstname());
        
        

        //#4                
        float initialDeposit = 5000.0f;
        acc1.setBalance(initialDeposit);
        
        //#5
        System.out.println("========Account Details========");
        System.out.println("Account Number: " + acc1.getAccountNo());
        System.out.println("Account Name: " + acc1.getFirstname() + " " + acc1.getMi() + ". " + acc1.getLastname());
        System.out.println("Balance: " + acc1.getBalance());

        //#6
        System.out.println("\nDeposit another 500 pesos");
        acc1.setBalance(acc1.getBalance() + 500);
        System.out.println("New Balance: " + acc1.getBalance());

        //#7
        System.out.println("\nChange PIN ");
        System.out.print("Enter old PIN: ");
        int userInput = scan.nextInt();
        if (userInput == acc1.getPin()) {
            System.out.println("Authentication successful.");
            System.out.print("Enter new PIN: ");
            int newPIN = scan.nextInt();
            acc1.setPin(newPIN); //can add validation of PIN here
            System.out.println("Change PIN successful.");
        } else {
            System.out.println("Changin PIN unsuccessful.");
        }

        //#8
        System.out.println("\nWithdraw 6000");
        acc1.withdraw(6000);

        //#9
        System.out.println("\nWithdraw 2000 instead.");
        acc1.withdraw(2000);
        

        //#10
        System.out.println("\n========Final Account Details========");        
        System.out.println("Account Number: " +acc1.getAccountNo());
        System.out.println("Account PIN: +acc.getPin())");
        System.out.println("Account Name: " + acc1.getFirstname() + " " + acc1.getMi() + ". " + acc1.getLastname());
        System.out.println("Balance: " + acc1.getBalance());        
    }
    
    
}