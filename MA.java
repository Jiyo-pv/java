import java.io.*;
class Array
{
	int a[],n;
	public void readSize() throws IOException,NumberFormatException
	{
		DataInputStream din;
		din=new DataInputStream(System.in);
		System.out.println("enter n:");
		n=Integer.parseInt(din.readLine());
	}
	public void readArrayElements() throws IOException,NumberFormatException,ArrayIndexOutOfBoundsException
	{
		DataInputStream din=new DataInputStream(System.in);
		readSize();
		a=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter a["+i+"]:");
			a[i]=Integer.parseInt(din.readLine());
		}
	}
	public void dispArray() throws ArrayIndexOutOfBoundsException
	{
		int i;
		for(i=0;i<=n;i++)
		{
			System.out.println( a[i]+"\t");
		
		}
	}
}

class MA
{
	public static void main(String args[])
	{
		try
		{
			Array obj=new Array();
			obj.readArrayElements();
			obj.dispArray();
		}
		catch(IOException e1)
		{
			System.out.println("error IO:"+e1);	
		}
		catch(NumberFormatException e2)
		{
			System.out.println("error NF:"+e2);	
		}
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("error Aiob:"+e3);	
		}
		catch(Exception e4)
		{
			System.out.println("error :"+e4);	
			
		}
	}
}