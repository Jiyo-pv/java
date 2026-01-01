/*
     A simple Java program demonstrating the creation and execution of threads
     by implementing the Runnable interface to calculate the square and cube of a number.
    @JIYO P V     Roll No:33
    01 january 2026
*/
import java.util.Scanner;

class SquareTask implements Runnable {
    int number;

    SquareTask(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeTask implements Runnable {
    int number;

    CubeTask(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

public class SquareCubeThreadExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Thread squareThread = new Thread(new SquareTask(n));
        Thread cubeThread = new Thread(new CubeTask(n));

        squareThread.start();
        cubeThread.start();
    }
}
