import java.util.Scanner;           //Prime or not
class Prime
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,i;
        System.out.println("enter N:");
        n=sc.nextInt();
        for(i=2;i<=(n/2);i++)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
                return;
            }
        }
        System.out.print("it is prime");

    }
}