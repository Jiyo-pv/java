// Program Title: Array Operations Using Functions | @JIYO P V | Date: 03/12/2025

import java.util.Scanner;

public class MenuArray {

    // ----- Function: Linear Search -----
    public static void linearSearch(int[] arr, int n, int key) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not found.");
    }

    // ----- Function: Sort (Bubble Sort) -----
    public static void sortArray(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array sorted.");
    }

    // ----- Function: Binary Search -----
    public static void binarySearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                return;
            }
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        System.out.println("Element not found.");
    }

    // ----- Function: Display Array -----
    public static void displayArray(int[] arr, int n) {
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // ----- Main Function -----
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n;

        // Read array first (no menu option for insert)
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("1. Search");
            System.out.println("2. Sort");
            System.out.println("3. Sort and Search (Binary Search)");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    linearSearch(arr, n, key);
                    break;

                case 2:
                    sortArray(arr, n);
                    break;

                case 3:
                    sortArray(arr, n);
                    System.out.print("Enter element to search (Binary Search): ");
                    int bkey = sc.nextInt();
                    binarySearch(arr, n, bkey);
                    break;

                case 4:
                    displayArray(arr, n);
                    break;
                case 5:
                    break;
              

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
