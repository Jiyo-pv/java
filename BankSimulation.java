/*
     This code simulates a bank account with deposit and withdrawal operations
     without synchronization, demonstrating potential race conditions.
     @JIYO P V      roll no: 33    
     02 january 2026
*/
class BankAccount {
    int balance = 1000; // initial balance

    void deposit(int amount) {
        int temp = balance;
        temp = temp + amount;
        balance = temp;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(int amount) {
        int temp = balance;
        temp = temp - amount;
        balance = temp;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

class DepositThread extends Thread {
    BankAccount account;

    DepositThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(500);
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(300);
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        DepositThread t1 = new DepositThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();
    }
}
