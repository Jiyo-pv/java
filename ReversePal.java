// A function takes an integer argument and returns the reverse of the same. 
// Another function takes an integer argument and returns true or false 
// if the number is a palindrome, using the above function.
// @JIYO P V    03-12-2025

import java.util.*;

class ReversePal
{
    // Function to return reverse of a number
    int rev(int n)
    {
        int r = 0;
        int rem;

        while (n > 0)
        {
            rem = n % 10;       // Extract last digit
            r = (r * 10) + rem; // Build reversed number
            n = n / 10;         // Remove last digit
        }

        return r;
    }

    // Function to check if number is palindrome
    void isPal(int n)
    {
        int reversed = rev(n);     // Call reverse function

        if (reversed == n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ReversePal obj = new ReversePal();
        obj.isPal(n);   // Call function
    }
}
