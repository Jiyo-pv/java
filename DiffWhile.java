import java.util.Scanner;           //diff of 2 nos using while loop
class DiffWhile
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,max=0,min=0,dif=0;
        System.out.println("enter 2 values\n");
        a=sc.nextInt();
        b=sc.nextInt();
        min=a;
        max=b;
        if(b>a)
        {
            max=b;
            min=a;
        }
        while(min<max)
        {
            dif++;
            min++;
        }
        System.out.print("difference:"+dif);
        

    }
}