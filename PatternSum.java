import java.util.Scanner;           //print the pattern
class PatternSum                    // 1 2 3|6
{                                   // 2 1 1|4                
                                    // 3 3 4             
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int a[]=new int[4];
        int b[]=new int[4];
        int c[]=new int[3];
        System.out.print("enter 3 numbers for first row:");
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
            a[3]+=a[i];
        }
        System.out.print("enter 3 numbers for second row:");
        for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
            b[3]+=b[i];
        }
        for(i=0;i<=3;i++)
        {
            System.out.print(a[i]+" ");
            if(i==2)
            {
                System.out.print("|");
            }
        }
        System.out.println();
        for(i=0;i<=3;i++)
        {
            System.out.print(b[i]+" ");
            if(i==2)
            {
                System.out.print("|");
            }
        }
        System.out.println();
        for(i=0;i<3;i++)
        {
            System.out.print((a[i]+b[i])+" ");           
        }
    }
}