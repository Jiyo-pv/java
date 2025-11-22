import java.util.Scanner;           //Sum of series 1
class Series1
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,i,sum=0,temp;
        System.out.println("enter N:");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
           temp=sum;
           sum+=temp+i;
        }
        System.out.print("sum:"+sum);

    }
}