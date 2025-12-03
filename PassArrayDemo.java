// Program Title: Passing Array in Two Ways | @JIYO P V | Date: 03/12/2025

import java.util.Scanner;

public class PassArrayDemo {

    //  Passing array along with size n
    public static void displayUsingN(int[] a, int n) {
        System.out.print("Using a[] and n: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //  Passing only array and using a.length
    public static void displayUsingLength(int[] a) {
        System.out.print("Using only a[] and a.length: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // calling functions
        displayUsingN(a, n);
        displayUsingLength(a);

    }
}
