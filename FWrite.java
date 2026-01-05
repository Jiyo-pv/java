import java.io.*;
import java.util.*;
class FWrite
{
	public static void main(String args[])
	{
		FileOutputStream fout;
		Scanner s;
		s=new Scanner(System.in);
		try
		{
			System.out.print("enter filename:");
			String fn=s.nextLine();
			fout=new FileOutputStream(fn);
			while(true)
			{
				System.out.print("enter data/quit:");
				String data=s.nextLine();
				if(data.equals("quit"))
					break;
				fout.write(data.getBytes());
					fout.write("\n".getBytes());
			
			}
			fout.close();
		}
		catch(Exception e)
		{
		}

	}
}