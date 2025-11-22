import java.util.Scanner;           ///second minimum in array
class SecondMin
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n=0,a[],smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;
        System.out.print("enter N:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter array");
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          if(a[i]<smallest)
          {
            secondSmallest=smallest;
            smallest=a[i];
          }
          if(a[i]>smallest && a[i]<secondSmallest)
          {
            secondSmallest=a[i];
          }
        }
        System.out.println("Second smallest element:"+secondSmallest);
        
    }
}