import java.util.Scanner;           //roots of a qudratic equation
class Quadratic
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b,a,c,x,desc=0;
        System.out.print("enter coeff of x^2");
        a=sc.nextInt();
        System.out.print("enter coeff of x^1");
        b=sc.nextInt();
        System.out.print("enter constant term");
        c=sc.nextInt();
        desc=(b*b)-(4*a*c);
        if(desc<0)
        {
            System.out.println("no real roots ");
        }
    }
}