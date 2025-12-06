import java.util.*;

/*
    Create a class for CString having a string data member and provide functions for
    read, display, compare (return Boolean value), add and concatenate.

    @JIYO P V   Roll No:33
    06 December 2025
*/

class CString
{
    String str;   // data member to store the string

    // Function to read a string from user
    public void read()
    {
        System.out.print("enter string:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();       // read whole line
    }

    // Function to display the stored string
    public void display()
    {
        System.out.println("string:" + str);
    }

    // Function to add (append) another CString to current object
    // It modifies the current string
    public void add(CString s)
    {
        System.out.println("performed addition to " + str);
        str = str + s.str;   // append second string
        display();           // show updated string
    }

    // Function to concatenate two CString objects and display result
    public void concat(CString s)
    {
        System.out.print("concatenated strings as :");
        System.out.println(str + s.str);
    }

    public static void main(String args[])
    {
        CString a = new CString();   // first string object
        CString b = new CString();   // second string object

        a.read();   // read first string
        b.read();   // read second string

        a.display();   // display first
        b.display();   // display second

        a.add(b);      // perform addition (modify 'a')

        a.concat(b);   // display concatenation
    }
}
