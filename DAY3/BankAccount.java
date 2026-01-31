package DAY3;
import java.util.*;

class BankAccount {
    String accountHolder;
    double balance;

    // CONSTRUCTOR
    BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Deepak", 1000);

        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}
