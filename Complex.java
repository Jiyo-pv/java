// Create a class complex having real and imaginary as data members and provide
// function for read, display, add and multiply.
// @JIYO  P V   Roll No:33
// 06 December 2025

import java.util.*;

class Comp
{
    int a, b;   // a = real part,  b = imaginary part

    // Function to read complex number from user
    public void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter real part:");
        a = sc.nextInt();

        System.out.print("enter imaginary part:");
        b = sc.nextInt();

        disp();     // Display after reading
    }

    // Function to display complex number in "a + ib" format
    public void disp()
    {
        System.out.println(a + "+i" + b);
    }

    // Function to add two complex numbers
    public Comp add(Comp x)
    {
        Comp r = new Comp();   // result object
        r.a = a + x.a;         // add real parts
        r.b = b + x.b;         // add imaginary parts
        return r;
    }

    // Function to multiply two complex numbers
    // (a + ib)(c + id) = (ac - bd) + i(ad + bc)
    public Comp multiply(Comp x)
    {
        Comp r = new Comp();

        r.a = (a * x.a) - (b * x.b);   // real part
        r.b = (a * x.b) + (b * x.a);   // imaginary part

        return r;
    }
}

class Complex
{
    public static void main(String args[])
    {
        Comp x1 = new Comp();
        Comp x2 = new Comp();
        Comp x3;

        System.out.println("Complex no 1");
        x1.read();      // Read first complex number

        System.out.println("Complex no 2");
        x2.read();      // Read second complex number

        // Adding complex numbers
        x3 = x1.add(x2);
        System.out.println("sum:");
        x3.disp();

        // Multiplying complex numbers
        x3 = x1.multiply(x2);
        System.out.println("product:");
        x3.disp();
    }
}
