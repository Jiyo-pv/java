import java.util.Scanner;           //Sum of series 2
class Series2
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,i,sum=0,fact=1;
        System.out.println("enter N:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           fact*=i;
           sum+=(i/fact);
        }
        System.out.print("sum:"+sum);

    }
}