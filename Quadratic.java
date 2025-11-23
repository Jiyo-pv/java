import java.util.*;           //roots of a qudratic equation
class Quadratic
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double b,a,c,desc=0;
        System.out.print("enter coeff of x^2:");
        a=sc.nextDouble();
        System.out.print("enter coeff of x^1:");
        b=sc.nextDouble();
        System.out.print("enter constant term:");
        c=sc.nextDouble();
        desc=(b*b)-(4*a*c);
        if(desc<0)
        {
            System.out.println("Imaginary roots");
            double  x=-b/(2*a);
            double y=Math.sqrt(-desc)/(2*a);
            System.out.println("root 1:"+x+"+i"+y);
            System.out.println("root 2:"+x+"-i"+y);
        }
        else if(desc==0)
        {
            System.out.print("root:"+(-b/(2*a)));
        }
        else
        {
            double r1=(-b+Math.sqrt(desc))/(2*a);
            double r2=(-b-Math.sqrt(desc))/(2*a);
            System.out.println("root 1:"+r1);
            System.out.println("root 2:"+r2);
        }
    }
}