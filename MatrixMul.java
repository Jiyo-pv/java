import java.util.Scanner;           //matrix multiply
class MatrixMul
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,p,q,k,i,j;
        System.out.println("enter m,n of matrix 1");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("enter matrix 1");
        for(i=0;i<n;i++)
        {
          for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter m,n of matrix 2");
        p=sc.nextInt();
        q=sc.nextInt();
        if(n!=p)
        {
            System.out.print("error:invalid operation");
            return;
        }
        int b[][]=new int[p][q];
        System.out.println("enter matrix 1");
        for(i=0;i<p;i++)
        {
          for(j=0;j<q;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        int c[][]=new int[m][q];
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                for(k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
         System.out.println("Product");
        for(i=0;i<m;i++)
        {
          for(j=0;j<q;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}