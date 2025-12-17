import java.util.*;
class A
{
	int num;
	
	public A(int n)
	{
		num=n;
	}
	public void display()
	{
		System.out.println("num:"+num);		
	}
}
class B extends A
{
	String string;
	public B(int n,String s)
	{
		super(n);
		string=s;
	}
	public void display()
	{
		super.display();
		System.out.println("String :"+string);
	}
}
class C extends B
{
	float fl;
	public C(int n,String s,float f)
	{
		super(n,s);
		fl=f;
	}
	public void display()
	{
		super.display();
		System.out.println("float :"+fl);
	}
}
class SelectObj
{
	public static void main(String args[])
	{
		A a;
		B b;
		C c;
		Scanner sc=new Scanner(System.in);
		int ch,n;
		String s;
		float f;
		do
		{
			System.out.println("1.read object A");
			System.out.println("2.read object B");
			System.out.println("3.read object C");
			System.out.println("4.exit");
			System.out.print("your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("enter num");
					n=sc.nextInt();
					a=new A(n);
					a.display();
					break;
				case 2:
					System.out.println("enter num");
					n=sc.nextInt();
					System.out.println("string");
					s=sc.next();
					b=new B(n,s);
					b.display();
					break;
				case 3:
					
					System.out.println("enter num");
					n=sc.nextInt();
					System.out.println("string");
					s=sc.next();
					System.out.println("enter float");
					f=sc.nextFloat();
					c=new C(n,s,f);
					c.display();
					break;
				case 4:
					System.out.println("exited");
					break;
			}
		}while(ch!=4);
	}
}