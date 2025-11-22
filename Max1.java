import java.util.Scanner;
class Max1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max=0;;
        System.out.println("enter 3 values\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("max="+max);
        

    }
}