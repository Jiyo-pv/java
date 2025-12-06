// Create a program for adding, subtracting, multiplying and dividing two numbers
// @JIYO P V     Roll No:33
// 06 December 2025

import java.util.*;

class Num
{
    int n;   // data member to store the number

    // Function to add two Num objects
    public Num add(Num x)
    {
        Num r = new Num();      // result object
        r.n = n + x.n;          // add values
        return r;
    }

    // Function to multiply two Num objects
    public Num multiply(Num x)
    {
        Num r = new Num();
        r.n = n * x.n;
        return r;
    }

    // Function to subtract second Num from first
    public Num diff(Num x)
    {
        Num r = new Num();
        r.n = n - x.n;
        return r;
    }

    // Function to divide two Num objects
    public Num divide(Num x)
    {
        Num r = new Num();

        try
        {
            r.n = n / x.n;      // division
            return r;
        }
        catch(Exception e)
        {
            System.out.print(e);    // handle divide by zero
        }

        return r;
    }
}

class ClassOps
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Num a, b, c;    // objects for operations

        a = new Num();
        b = new Num();
        c = new Num();

        int ch;

        do
        {
            // Input numbers
            System.out.print("enter 2 nos:");
            a.n = sc.nextInt();
            b.n = sc.nextInt();

            // Menu
            System.out.print(
                "enter operation\n1.add.\n2.multiply\n3.diff\n4.divide\n5.exit\n->"
            );
            ch = sc.nextInt();

            // Switch-case for operations
            switch(ch)
            {
                case 1:
                    c = a.add(b);
                    System.out.println("sum: " + c.n);
                    break;

                case 2:
                    c = a.multiply(b);
                    System.out.println("product: " + c.n);
                    break;

                case 3:
                    c = a.diff(b);
                    System.out.println("difference: " + c.n);
                    break;

                case 4:
                    c = a.divide(b);
                    System.out.println("quotient: " + c.n);
                    break;

                case 5:
                    break;

                default:
                    System.out.print("invalid choice\n");
            }

        } while(ch != 5);   // repeat until user chooses exit
    }
}
