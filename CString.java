import java.util.*;
/*
    Create a class for CString having a string data member and provide functions for read,
display, compare(return Boolean value),add and concatenate.
*/
class CString
{
    String str;
    public void read()
    {
        System.out.print("enter string:");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
    }
    public void display()
    {
        System.out.println("string:"+str);
    }
    public void  add(CString s)
    {
        System.out.println("performed addition to "+str);
        str=str+s.str;
        
        display();
    }
    public void concat(CString s)
    {
       System.out.print("concatenated strings as :");
       System.out.println(str+s.str);
    }
    public static void main(String args[])
    {
        CString a=new CString();
        CString b=new CString();
        a.read();
        b.read();
        a.display();
        b.display();
        a.add(b);
        a.concat(b);
    }
}