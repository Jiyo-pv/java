import java.io.*;
import java.util.*;
class FReadSize
{
	public static void main(String args[])
	{
		Scanner s;
		String fn;
		FileInputStream fin;
		int ch;
		s=new Scanner(System.in);
		System.out.println("enter filename:");
		fn=s.nextLine();
		int c=0;;
		try
		{
			fin=new FileInputStream(fn);
			while(true)
			{
				ch=fin.read();
				if(ch==-1)
					break;
				c++;
			}
			System.out.print("has "+c+"bytes");
			fin.close();
		}
		catch(Exception e)
		{
		}
	}
}