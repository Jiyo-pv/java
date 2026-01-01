/*
     A simple Java program simulating a printer queue using threads
     by implementing the Runnable interface without synchronization.
    @JIYO P V     Roll No:33
    01 january 2026
*/
class PrintJob implements Runnable {
    private String documentName;

    PrintJob(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void run() {
        System.out.println("Starting print job: " + documentName);

        for (int page = 1; page <= 5; page++) {
            System.out.println(documentName + " printing page " + page);
        }

        System.out.println("Completed print job: " + documentName);
    }
}

public class PrinterQueueSimulation {
    public static void main(String[] args) {

        Thread job1 = new Thread(new PrintJob("Document-A"));
        Thread job2 = new Thread(new PrintJob("Document-B"));
        Thread job3 = new Thread(new PrintJob("Document-C"));

        job1.start();
        job2.start();
        job3.start();
    }
}
