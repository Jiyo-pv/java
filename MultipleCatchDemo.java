/* Demonstration of multiple catch blocks in Java 
    to handle different types of exceptions. 
@JIYO P V     Roll No:33
31 December 2025
*/  

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   // may cause ArithmeticException
            System.out.println("Result = " + result);

            int[] arr = new int[3];
            arr[5] = 10;          // may cause ArrayIndexOutOfBoundsException
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of range.");
        }

        catch (Exception e) {
            System.out.println("General exception occurred.");
        }

        finally {
            System.out.println("Program execution completed.");
        }

        sc.close();
    }
}
