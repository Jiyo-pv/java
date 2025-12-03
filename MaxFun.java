import java.util.*;

// Class to demonstrate finding maximum using a function 
//JIYO P V  03-12-2025
class MaxFun
{
    // Function to return maximum of two numbers
    static int max(int a, int b)
    {
        return (a > b ? a : b);   // Ternary operator to find largest
    }

    public static void main(String args[])
    {
        int a, b, c;

        System.out.print("Enter 3 numbers: ");

        Scanner sc = new Scanner(System.in);

        // Reading 3 integers from the user
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // First find max of (a, b), then compare with c
        int largest = max(max(a, b), c);

        // Display the result
        System.out.println("Largest is: " + largest);
    }
}
