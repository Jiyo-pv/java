/*
    Create a class for a student having (sno, sname, sprogram).
    Provide functions for read, display, comparing two student objects for equality.

    @JIYO P V    Roll No:33  
    06 December 2025
*/
import java.util.*;

class StudentInfo
{
    int sno;                 // student number
    String sname, sprogram;  // student name and program

    // Function to read student details
    public void read()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter student no:");
        sno = sc.nextInt();

        System.out.print("enter student name:");
        sname = sc.next();      // reads name without spaces

        System.out.print("enter program:");
        sprogram = sc.next();   // reads program
    }

    // Function to display student details
    public void disp()
    {
        System.out.println("\nsno:" + sno);
        System.out.println("name:" + sname);
        System.out.println("program:" + sprogram);
    }

    // Function to compare two StudentInfo objects
    public void compare(StudentInfo s)
    {
        // Check each data member for equality
        if (s.sno != sno || 
            !s.sname.equals(sname) || 
            !s.sprogram.equals(sprogram))
        {
            System.out.print("both are different data ");
            return;
        }

        System.out.print("both are identical data ");
    }
}

class Student
{
    public static void main(String args[])
    {
        StudentInfo s1, s2;

        s1 = new StudentInfo();   // first student object
        s2 = new StudentInfo();   // second student object

        s1.read();    // read first student
        s2.read();    // read second student

        s1.disp();    // display first
        s2.disp();    // display second

        s1.compare(s2);  // compare objects
    }
}
