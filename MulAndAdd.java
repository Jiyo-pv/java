// Program Title: Matrix Add & Multiply (Fresh Read for Each Operation) | @JIYO P V | Date: 03/12/2025

import java.util.Scanner;

public class MulAndAdd {

    // Read matrix
    public static void readMatrix(int[][] a, int r, int c, Scanner sc) {
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    // Display matrix
    public static void displayMatrix(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Add matrices
    public static void addMatrices(Scanner sc) {
        System.out.print("Enter rows and columns of matrices: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter Matrix A:");
        readMatrix(A, r, c, sc);

        System.out.println("Enter Matrix B:");
        readMatrix(B, r, c, sc);

        int[][] S = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        displayMatrix(S, r, c);
    }

    // Multiply matrices
    public static void multiplyMatrices(Scanner sc) {
        System.out.print("Enter rows and columns of Matrix A: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of Matrix B: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication NOT possible (Columns of A != Rows of B)");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        System.out.println("Enter Matrix A:");
        readMatrix(A, r1, c1, sc);

        System.out.println("Enter Matrix B:");
        readMatrix(B, r2, c2, sc);

        int[][] M = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                M[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    M[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product of matrices:");
        displayMatrix(M, r1, c2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addMatrices(sc);     // Reads matrices fresh
                    break;

                case 2:
                    multiplyMatrices(sc); // Reads matrices fresh
                    break;

                case 3:
                  
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
