import java.util.Scanner;
class Max2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max=0;;
        System.out.println("enter 3 values\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            max=a;
        }
        else if(b>c)
        {
            max=b;
        }
        else
        {
            max=c;
        }
        System.out.println("max="+max);
        

    }
}