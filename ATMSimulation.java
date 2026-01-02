/*
    This code simulates an ATM system with multiple users performing
    deposit and withdrawal operations on a shared bank account using threads.
    @JIYO P V      roll no: 33    
    02 january 2026
*/
class BankAccount {
     int balance = 1000;

    synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName()
                + " depositing " + amount);
        balance = balance + amount;
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()
                + " withdrawing " + amount);

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println();
    }
}

class ATMUser extends Thread {

    BankAccount account;
    int amount;
    boolean deposit;

    ATMUser(BankAccount a, int amt, boolean dep, String name) {
        account = a;      
        amount = amt;
        deposit = dep;
        setName(name);
    }

    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

 class ATMSimulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        ATMUser user1 = new ATMUser(acc, 500, false, "User-1");
        ATMUser user2 = new ATMUser(acc, 300, true, "User-2");
        ATMUser user3 = new ATMUser(acc, 400, false, "User-3");

        user1.start();
        user2.start();
        user3.start();
    }
}
