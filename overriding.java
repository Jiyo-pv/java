import java.util.*;
class Person 
{
    int age;
    String name;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter name:");
        name=sc.nextLine();
        System.out.print("enter age:");
        age=sc.nextInt();
        
    }
    public void disp()
   	{
		System.out.println("Name:"+name+" Age:"+age);

	}
}
class Teacher extends Person
{
	String subject;
	public void read()
	{	
		Scanner sc=new Scanner(System.in);
		super.read();
		System.out.println("enter subject taught:");
		subject=sc.nextLine();
		
	}
	public void disp()
	{
		super.disp();
		System.out.println("subject taught:"+subject);
	}
}
class overriding
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher();;
		Person p1=new Person();
		p1.read();
		p1.disp();
		t1.read();
		t1.disp();
	}
}