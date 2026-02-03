package seatwork1;

public class ATM {

    public static void main(String[] args) {
        /*
        I: balance of first Acc
           balance of second Acc
        P: totalBalance = bal1 + bal2
        O: total balance of 2 accounts
        */
        
        //instantiate first Acc
        Account ruffa = new Account("Ruffa", 12345678, 1000);
        //instantiate second Acc
        Account rhea = new Account("Rhea", 87654321, 5000);
        //process bal1 + bal2
        float totalBal = ruffa.getBalance() + rhea.getBalance();
        //sout totalBal
        System.out.println("Total balance: " + totalBal);
    }

}
