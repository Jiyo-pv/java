import java.util.*;
class Author
{
	int ano;
	String aname;
	public Author()
	{
		System.out.println("default  constructor invoked");
		ano=0;
		aname="";
	}
	public Author(String a,int n)
	{		
		System.out.println(" parameterized constructor invoked");
		ano=n;
		aname=a;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("author name:");
		aname=sc.nextLine();

		System.out.println("author no:");
		ano=sc.nextInt();

	}
	public void disp()
	{
		System.out.println("author name:"+aname);
		System.out.println("author no:"+ano);
		
	}
}
class Book extends Author
{
	float bprice;
	String bname;
	public Book()
	{
	 	 	
		bprice=0;
		bname="";
		
	}
	public Book(float f,String s,int n,String x)
	{
		
		super(x,n);
		bprice=f;
		bname=s;
	}
	public void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("book name:");
		
		bname=sc.nextLine();	
		System.out.println("book price:");
		
		bprice=sc.nextFloat();

		super.read();

	}
	public void disp()
	{
		System.out.println("book name:"+bname);
		System.out.println("book price:"+bprice);
		super.disp();
		
	}
	public static void main(String args[])
	{
		Book obj=new Book();
		Book obj2=new Book(1,"a",10,"xyz");
		obj.disp();
		System.out.println();
		obj2.disp();
	}
}