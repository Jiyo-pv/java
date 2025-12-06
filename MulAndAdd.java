// Program Title: Matrix Add & Multiply (Fresh Read for Each Operation) 
// @JIYO P V     Roll No:33
// Date: 03/12/2025

import java.util.Scanner;

public class MulAndAdd {

    // --------------------------------------------------
    // Function: Read a matrix from user
    // --------------------------------------------------
    public static void readMatrix(int[][] a, int r, int c, Scanner sc) {
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();  // Read each element
            }
        }
    }

    // --------------------------------------------------
    // Function: Display matrix in row/column format
    // --------------------------------------------------
    public static void displayMatrix(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");  // Print each element
            }
            System.out.println();  // New row
        }
    }

    // --------------------------------------------------
    // Function: Add two matrices A + B = S
    // Matrices must be of same dimension r × c
    // --------------------------------------------------
    public static void addMatrices(Scanner sc) {

        // Read size of matrices
        System.out.print("Enter rows and columns of matrices: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Allocate matrices
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        // Read Matrix A
        System.out.println("Enter Matrix A:");
        readMatrix(A, r, c, sc);

        // Read Matrix B
        System.out.println("Enter Matrix B:");
        readMatrix(B, r, c, sc);

        // Matrix to store sum
        int[][] S = new int[r][c];

        // Perform addition
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display result
        System.out.println("Sum of matrices:");
        displayMatrix(S, r, c);
    }

    // --------------------------------------------------
    // Function: Multiply two matrices
    // A is r1 × c1, B is r2 × c2
    // Multiplication possible only if c1 == r2
    // --------------------------------------------------
    public static void multiplyMatrices(Scanner sc) {

        // Read dimensions of matrix A
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        // Read dimensions of matrix B
        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        // Check multiplication rule
        if (c1 != r2) {
            System.out.println("Multiplication NOT possible (Columns of A != Rows of B)");
            return;  // Stop function
        }

        // Allocate matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        // Read Matrix A
        System.out.println("Enter Matrix A:");
        readMatrix(A, r1, c1, sc);

        // Read Matrix B
        System.out.println("Enter Matrix B:");
        readMatrix(B, r2, c2, sc);

        // Result matrix M (r1 × c2)
        int[][] M = new int[r1][c2];

        // Matrix multiplication algorithm
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                M[i][j] = 0;  // Initialize

                // Dot product of row of A and column of B
                for (int k = 0; k < c1; k++) {
                    M[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display product
        System.out.println("Product of matrices:");
        displayMatrix(M, r1, c2);
    }

    // --------------------------------------------------
    // Main Menu-Driven Function
    // --------------------------------------------------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        // Menu loop continues until user selects Exit (3)
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addMatrices(sc);       // Reads matrices fresh each time
                    break;

                case 2:
                    multiplyMatrices(sc);  // Reads matrices fresh each time
                    break;

                case 3:
                    break;                 // Exit program

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
