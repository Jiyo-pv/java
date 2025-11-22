import java.util.Scanner;           //diff of 2 nos using while loop
class MN
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        System.out.println("enter m and values\n");
        m=sc.nextInt();
        n=sc.nextInt();
        while(m!=n)
        {
            if(m<n)
            {
                System.out.println(m);
                m++;
            }
            if(m>n)
            {
                System.out.println(m);
                m--;
            }
        }
        System.out.print(n);
        

    }
}