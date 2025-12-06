// Program Title: Passing Array in Two Ways 
// @JIYO P V | Roll NO:33
// Date: 03/12/2025

import java.util.Scanner;

public class PassArrayDemo {

    // Passing array along with size n
    // Here the function uses the value of n to control how many elements to print
    public static void displayUsingN(int[] a, int n) {
        System.out.print("Using a[] and n: ");
        for (int i = 0; i < n; i++) {   // Loop runs only till n
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Passing only array and using a.length
    // This function depends on the array's internal length property
    public static void displayUsingLength(int[] a) {
        System.out.print("Using only a[] and a.length: ");
        for (int i = 0; i < a.length; i++) {   // Loop runs till array length
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array of size n
        int[] a = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Calling both functions to demonstrate two ways of passing arrays
        displayUsingN(a, n);
        displayUsingLength(a);

        sc.close();
    }
}
