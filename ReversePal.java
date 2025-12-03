//A function takes an integer argument and returns the reverse of the same. Another
//function takes an integer argument and returns true or false if the number is a
//palindrome, using the above function.
//@JIYO P V    03-12-2025
import java.util.*;
class ReversePal
{
    int rev(int n)
    {
        int r=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            r=(r*10)+rem;
            n=n/10;
        }
        return r;
    }
    void isPal(int n)
    {
        int r=rev(n);
        if(r==n)
        {
            System.out.print("palindrome");

        }
        else
        {
            System.out.print(" not  a palindrome");
            
        }
    }
    public static void main(String args[])
    {
        ReversePal a=new ReversePal();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a.isPal(n);
    }
}