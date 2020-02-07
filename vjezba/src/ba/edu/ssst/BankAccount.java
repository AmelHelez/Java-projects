package ba.edu.ssst;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public BankAccount(double balance) {
        if(balance <= 0) throw new IllegalArgumentException("Balance has to be >= 0");
        this.balance = balance;
    }
    public void Deposit(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Amount should be >= 0");
        balance += amount;
    }

    public void Withdraw(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Amount should be >= 0");
        balance -= amount;
    }

    public void addInterest(double interest) {
        if(interest <= 0) throw new IllegalArgumentException("Rate should be >= 0");
        balance += balance * interest;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return this.balance + "";
    }
}
