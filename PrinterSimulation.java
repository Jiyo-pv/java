/*
     A simple Java program simulating a synchronized printer queue using threads
     by implementing the Runnable interface.
    @JIYO P V     Roll No:33
    01 january 2026
*/
class SharedPrinter {

    synchronized void printJob(String fileName) {
        System.out.println("Starting printing: " + fileName);

        for (int page = 1; page <= 5; page++) {
            System.out.println(fileName + " printing page " + page);
        }

        System.out.println("Finished printing: " + fileName);
       
    }
}

class UserTask implements Runnable {
    SharedPrinter printer;
    String fileName;

    UserTask(SharedPrinter printer, String fileName) {
        this.printer = printer;
        this.fileName = fileName;
    }

    public void run() {
        printer.printJob(fileName);
    }
}

public class PrinterSimulation {
    public static void main(String[] args) {

        SharedPrinter printer = new SharedPrinter();

        Thread user1 = new Thread(new UserTask(printer, "File-1"));
        Thread user2 = new Thread(new UserTask(printer, "File-2"));
        Thread user3 = new Thread(new UserTask(printer, "File-3"));

        user1.start();
        user2.start();
        user3.start();
    }
}
