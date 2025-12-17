import java.util.*;
interface i1
{
	public void disp();
	public void print();
}
class c1 implements i1{
	public void disp()
	{		
		System.out.println("in disp interface");
	}
	public void print()
	{		
		System.out.println("in print interface");
	}
	public void show()
	{		
		System.out.println("show not interface");
	}
	
}
class mi2{
	public static void main(String args[])
	{
		i1 obj=new c1();
		obj.disp();

		//obj.show();
		obj.print();;
	}
}