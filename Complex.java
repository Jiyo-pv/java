import java.util.*;
class Comp
{
    int a,b;
    public  void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter real part:");
        a=sc.nextInt();
        System.out.print("enter imaginary part:");
        b=sc.nextInt();
        disp();
    }
    public void disp()
    {
        System.out.println(a+"+i"+b);
    }
    public Comp add(Comp x)
    {
        Comp r=new Comp();
        r.a=a+x.a;
        r.b=b+x.b;
        return r;
    }
     public Comp multiply(Comp x)
    {
        Comp r=new Comp();
        r.a=(a*x.a)-(b*x.b);
        r.b=(a*x.b)+(b*x.a);
        return r; 
    }
}
class Complex
{
    public static void main(String args[])
    {
        Comp x1=new Comp();
        Comp x2=new Comp();
        Comp x3;
        System.out.println("Complex no 1");
        x1.read();
        
        System.out.println("Complex no 2");
        x2.read();
        x3=x1.add(x2);
        System.out.println("sum:");
        x3.disp();
        x3=x1.multiply(x2);
        System.out.println("product:");
        x3.disp();
        
    }

}