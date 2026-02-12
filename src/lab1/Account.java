package lab1;

public class Account {
    private String firstname, lastname;
    private char mi;
    private long accountNo;
    private float balance;
    private int pin;

    public Account(String firstname, String lastname, char mi, long accountNo, float balance, int pin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mi = mi;
        this.accountNo = accountNo;
        this.balance = balance;
        this.pin = pin;
    }
    
    
    public static void main(String[] args) {
        System.out.println("test");
    }
    
    public void withdraw(float withdrawAmount){
        if (this.getBalance() - withdrawAmount < 0) {
            System.out.println("Withdrawal unsuccessful. Insufficient funds.");
        } else {
            this.setBalance(this.getBalance() - withdrawAmount);
            System.out.println("Withdrawal successful");
            System.out.println("New Balance: " + this.getBalance());
        }
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMi(char mi) {
        this.mi = mi;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getMi() {
        return mi;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public int getPin() {
        return pin;
    }       
}
