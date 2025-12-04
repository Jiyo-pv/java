import java.util.*;
class Num
{
    int n;
    public Num add(Num x)
    {
        Num r=new Num();
        r.n=n+x.n;
        return r;
    }
     public Num multiply(Num x)
    {
        Num r=new Num();
        r.n=n*x.n;
        return r;
    }
     public Num diff(Num x)
    {
        Num r=new Num();
        r.n=n-x.n;
        return r;
    }
     public Num divide(Num x)
    {
        Num r=new Num();
        
        try
        {
            r.n=n/x.n;
            return r;
        }catch(Exception e)
        {
            System.out.print(e);
        }
        return r;
    }
}
class ClassOps
{
    
    public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        Num a,b,c;
        a=new Num();
        b=new Num();
        c=new Num();
        int ch;
        do
        {
            System.out.print("enter 2 nos:");
            a.n=sc.nextInt();
            b.n=sc.nextInt();
            System.out.print("enter operation\n1.add.\n2.multiply\n3.diff\n4.divide\n5.exit\n->");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                        c=a.add(b);
                         System.out.println("sum:"+c.n);
                        break;
                case 2:
                        c=a.multiply(b);
                         System.out.println("product:"+c.n);
                        break;
                case 3:
                        c=a.diff(b);
                         System.out.println("difference:"+c.n);
                        break;
                case 4:
                        c=a.divide(b);
                         System.out.println("quotient:"+c.n);
                        break;
                case 5:
                    break;
                default:
                    System.out.print("invalid choice\n");
            }
            
        }while(ch!=5);

    }
}