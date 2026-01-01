/*
     A simple Java program demonstrating the creation and execution of a thread
     by implementing the Runnable interface.
    @JIYO P V     Roll No:33
    01 january 2026
*/
class NumberPrinter implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {

        NumberPrinter task = new NumberPrinter();

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        System.out.println("Main thread running");
    }
}
