/*
     A simple Java program demonstrating the creation and execution of a thread
     by extending the Thread class.
    @JIYO P V     Roll No:33
    01 january 2026
*/
class NumberPrinterThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing number: " + i);
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        NumberPrinterThread printerThread = new NumberPrinterThread();
        printerThread.start();   // start new thread

        System.out.println("Main thread running");
    }
}
