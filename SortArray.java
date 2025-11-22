import java.util.Scanner;           ///search no in array
class SortArray
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,a[],i,j,temp;

        System.out.print("enter N:");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("enter array");
        for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      
        for(i=0;i<n;i++)
        { 
            
            for(j=0;j<n;j++)
            {
                if(a[i]<a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }

        }
       for(i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
}