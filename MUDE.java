/* Custom Exception Class and its Usage in Java 
	to handle division by zero scenario.
@JIYO P V     Roll No:33
31 December 2025
	*/
import java.util.*;
class UDE extends Exception
{
	String strError;
	public UDE()
	{
		strError="unknown error";
	}
	public UDE(String s)
	{
		strError=s;
	}
	public String showError()
	{
		return strError;
	}
	
}
class MUDE
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter two numbers:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c;
			if(b==0)
			{
				throw new UDE("error:Divisor is zero");
			}
			c=a/b;
			System.out.print(c);
		}
		catch(UDE e)
		{
			System.out.println(e.showError());
		}
	}
}