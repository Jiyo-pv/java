import java.util.*;
interface IShape
{
	public void draw();
	public void mov();		
}
class Rectangle implements IShape
{
	public void draw()
	{
		System.out.println("rectangle drawn");
	}
	public void mov()
	{
		System.out.println("retangle moved");
	}
}
class Circle implements IShape
{
	public void draw()
	{
		System.out.println("Circle drawn");
	}
	public void mov()
	{
		System.out.println("Circle moved");
	}
}
class ShapeDraw
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		IShape s;
		int ch;
		do
		{
			System.out.print("1.rectangle \n2.circle\n3.exit\n:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					s=new Rectangle();
					s.draw();
					s.mov();
					break;
				case 2:
					s=new Circle();
					s.draw();
					s.mov();
					break;
				case 3:
					System.out.print("exited");
			}
		}while(ch!=3);
	}
}