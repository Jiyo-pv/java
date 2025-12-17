import java.util.*;
interface i1
{
	public void disp();

}
interface i2
{
	public void print();
}
class c1 implements i1,i2{
	public void disp()
	{		
		System.out.println("in disp interface");
		print();
	}
	public void print()
	{		
		System.out.println("in print interface");
		show();
	}
	public void show()
	{		
		System.out.println("show not interface");
	}
	
}
class mi4{
	public static void main(String args[])
	{
		i1 obj=new c1();
		obj.disp();
		i2 obj1=new c1();
	
		obj1.print();;
	}
}