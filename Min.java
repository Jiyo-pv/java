import java.util.Scanner;
class Min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,min=0;
        System.out.println("enter 3 values\n");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        min=(a<b)?((a<c)?a:c):(b<c)?b:c;
        System.out.println("min="+min);
        

    }
}