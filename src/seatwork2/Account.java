package seatwork2;

public class Account {

    private String firstName, lastName;
    private char middleInitial;
    private long accountNo;
    private float balance;
    private short pin;

    public Account(String firstName, long accountNo, float balance) {
        this.firstName = firstName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account acn = new Account("Ruffa", 123456789L, 1000f); //instantiation
        System.out.println("test run");
        acn.setLastName("Resentes");
        System.out.println(acn.getFirstName() + " " + acn.getLastName());
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public short getPin() {
        return pin;
    }

}
