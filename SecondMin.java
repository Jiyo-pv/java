import java.util.Scanner;           ///second minimum in array
class Search
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,a[],i,x;

        System.out.print("enter N:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter array");
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
        System.out.println("enter search element:");
        x=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                System.out.println("found at index "+i);
                return;
            }
        }
        System.out.print("element not found");
    }
}