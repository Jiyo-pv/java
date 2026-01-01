/*
     A simple Java program demonstrating the creation and execution of threads
     by implementing the Runnable interface.
    @JIYO P V     Roll No:33
    01 january 2026
*/

import java.util.Scanner;

class OddTask implements Runnable {
    int limit;

    OddTask(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

class EvenTask implements Runnable {
    int limit;

    EvenTask(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class OddEvenThreadExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        Thread oddThread = new Thread(new OddTask(n));
        Thread evenThread = new Thread(new EvenTask(n));

        oddThread.start();
        evenThread.start();
    }
}
