// Program Title: Array Operations Using Functions 
// @JIYO P V    Roll No:33  
// Date: 03/2025

import java.util.Scanner;

public class MenuArray {

    // ----- Function: Linear Search -----
    // Searches each element one by one until the key is found
    public static void linearSearch(int[] arr, int n, int key) {
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {   // Check if current element matches key
                System.out.println("Element found at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Element not found.");
    }

    // ----- Function: Sort (Bubble Sort) -----
    // Sorts the array in ascending order using bubble sort
    public static void sortArray(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Swap adjacent elements if they are in the wrong order
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
    // Assumes array is already sorted; searches by dividing range
    public static void binarySearch(int[] arr, int n, int key) {

        int low = 0, high = n - 1;

        while (low <= high) {

            int mid = (low + high) / 2;  // Middle index

            // If element found at mid
            if (arr[mid] == key) {
                System.out.println("Element found at position: " + (mid + 1));
                return;
            }
            // If key is greater, ignore left half
            else if (arr[mid] < key)
                low = mid + 1;
            // Else ignore right half
            else
                high = mid - 1;
        }

        System.out.println("Element not found.");
    }

    // ----- Function: Display Array -----
    // Prints all array elements
    public static void displayArray(int[] arr, int n) {
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // ----- Main Function -----
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];   // Array with maximum size 100
        int n;

        // Read array first (no menu option to insert later)
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();   // Read array elements
        }

        int choice;

        // Display menu repeatedly until user chooses Exit (5)
        do {
            System.out.println("1. Search");
            System.out.println("2. Sort");
            System.out.println("3. Sort and Search (Binary Search)");
            System.out.println("4. Display Array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:  // Linear Search
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    linearSearch(arr, n, key);
                    break;

                case 2:  // Sort Array
                    sortArray(arr, n);
                    break;

                case 3:  // Sort then apply Binary Search
                    sortArray(arr, n);
                    System.out.print("Enter element to search (Binary Search): ");
                    int bkey = sc.nextInt();
                    binarySearch(arr, n, bkey);
                    break;

                case 4:  // Display all elements
                    displayArray(arr, n);
                    break;

                case 5:  // Exit program
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);  // Continue menu

        sc.close();  // Close scanner
    }
}
