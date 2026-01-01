/*
    Readers-Writers problem in Java.
    This code demonstrates synchronization between multiple reader and writer threads
    accessing shared data.      
    @JIYO P V      roll no: 33    
    01 january 2026    
*/
class SharedData {
    int readers = 0;
    boolean writing = false;

    synchronized void startRead() {
        while (writing) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        readers++;
        System.out.println("Reader started reading. Readers: " + readers);
    }

    synchronized void endRead() {
        readers--;
        System.out.println("Reader finished reading. Readers: " + readers);
        notifyAll();
    }

    synchronized void startWrite() {
        while (writing || readers > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        writing = true;
        System.out.println("Writer started writing.");
    }

    synchronized void endWrite() {
        writing = false;
        System.out.println("Writer finished writing.");
        notifyAll();
    }
}

class Reader implements Runnable {
    SharedData data;

    Reader(SharedData data) {
        this.data = data;
    }

    public void run() {
        data.startRead();
        data.endRead();
    }
}

class Writer implements Runnable {
    SharedData data;

    Writer(SharedData data) {
        this.data = data;
    }

    public void run() {
        data.startWrite();
        data.endWrite();
    }
}

public class ReadersWritersMain {
    public static void main(String[] args) {

        SharedData data = new SharedData();

        Thread r1 = new Thread(new Reader(data));
        Thread r2 = new Thread(new Reader(data));
        Thread w1 = new Thread(new Writer(data));

        r1.start();
        r2.start();
        w1.start();
    }
}


