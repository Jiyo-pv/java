import java.util.*;
interface Shape
{
	public void read();
	public void disp();
	public void area();

}

class Circle implements Shape{
	float r;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter radius :");
		r=sc.nextFloat();
		disp();
		area();	
	}
	public void disp()
	{
		System.out.println("radius of circle:"+r);
		
	}
	public void area()
	{
		System.out.println("area="+(3.14*r*r));
	}
	
	
}

class Rectangle implements Shape{
	int l,b;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter length and breadth :");
		l=sc.nextInt();
		b=sc.nextInt();
		disp();
		area();	
	}
	public void disp()
	{
		System.out.println("length:"+l+" breadth:"+b);
		
	}
	public void area()
	{
		System.out.println("area="+(l*b));
	}
	
}
class Triangle implements Shape{
	float b,h;
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter base and height :");
		b=sc.nextFloat();
		h=sc.nextFloat();
		disp();
		area();	
	}
	public void disp()
	{
		System.out.println("height:"+h+" base:"+b);
		
	}
	public void area()
	{
		System.out.println("area="+(0.5*(b*h)));
	}
	
}
class Shapes{
	public static void main(String args[])
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		Shape s;
		do
		{
			System.out.println("1.circle\n2.rectangle\n3.triangle\n4.exit\nchoice:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					s= new Circle();
					s.read();			
					break;
				case 2:
					s= new Rectangle();
					s.read();
					break;
				case 3:
					s= new Triangle();
					s.read();
					break;
				case 4:
					break;

			}
		}while(ch!=4);
	}
}