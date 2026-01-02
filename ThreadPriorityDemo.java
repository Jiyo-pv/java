/*
    This code demonstrates thread priorities in Java by creating threads
    with different priority levels and observing their execution.
    @JIYO P V      roll no: 33    
    02 january 2026
*/
class PriorityThread extends Thread {

    PriorityThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() +
                    " is running with priority " +
                    getPriority());
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {

        PriorityThread t1 =
                new PriorityThread("Low Priority Thread",
                        Thread.MIN_PRIORITY);   // 1

        PriorityThread t2 =
                new PriorityThread("Normal Priority Thread",
                        Thread.NORM_PRIORITY); // 5

        PriorityThread t3 =
                new PriorityThread("High Priority Thread",
                        Thread.MAX_PRIORITY);  // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
