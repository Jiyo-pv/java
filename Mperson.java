import java.util.*;
class Person
{
	int age;
	String name;
	public Person()
	{
		name=" ";
		age=0;
	}
	public Person(String n,int a)
	{
		name=n;
		age=a;
	}
	
	public void disp()
	{
		System.out.println("name:"+name+" age:"+age);		
	}
}
class Mperson
{
	
	public static void main(String args[])
	{
		Person p1=new Person();
		Person p2=new Person("abcd",25);
		p1.disp();
		p2.disp();
	}
}