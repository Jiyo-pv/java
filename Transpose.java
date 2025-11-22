import java.util.Scanner;           //matrix transpose
class Transpose
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("enter m,n of matrix ");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter matrix ");
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix ");
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Transpose ");
        for(j=0;j<n;j++)
        {
          for(i=0;i<m;i++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}