//Display from n - 1 and 1-n using recursive functions.
import java.util.*;
class NRecursive
{
    void nto1(int n)
    {
        if(n==1)
        {
            System.out.println(1);
        }
        else{
            System.out.println(n);
            nto1(n-1);
        }
    }
   void ton(int n)
    {
        if(n==0)
        {
            return;
        }    
       ton(n-1);
       System.out.println(n);
       
    }
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        NRecursive x=new NRecursive();
         System.out.println("n to 1");
        x.nto1(n);
        
        System.out.println("1 to n");
        x.ton(n);
    }
}