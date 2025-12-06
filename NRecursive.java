// Display from n - 1 and 1 - n using recursive functions.
//@JIYO P V   Roll No:33
//06 December 2025
import java.util.*;

class NRecursive
{
    // Recursively prints numbers from n down to 1
    void nto1(int n)
    {
        if(n == 1)
        {
            System.out.println(1);   // Base case: print 1 and stop recursion
        }
        else
        {
            System.out.println(n);   // Print current number
            nto1(n - 1);             // Recursive call with n-1
        }
    }

    // Recursively prints numbers from 1 up to n
    void ton(int n)
    {
        if(n == 0)
        {
            return;                  // Base case: stop when n reaches 0
        }

        ton(n - 1);                  // First go to the smallest number
        System.out.println(n);       // Then print while returning (ascending order)
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = sc.nextInt();

        NRecursive x = new NRecursive();

        System.out.println("n to 1");
        x.nto1(n);                   // Call function to print n → 1

        System.out.println("1 to n");
        x.ton(n);                    // Call function to print 1 → n
    }
}
