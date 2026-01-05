//implement cp using cmd arguments
import java.io.*;
class CP
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.print("usage: java CP <source> <destination> ");
			System.exit(0);
			
		}
		String in=args[0];
		String out=args[1];
		int ch;
		FileOutputStream fout;
		FileInputStream fin;
		try
		{
			fin=new FileInputStream(in);
			fout=new FileOutputStream(out);
			while(true)
			{
				ch=fin.read();
				if(ch==-1)
					break;
				fout.write(ch);
			}
			fin.close();
			fout.close();
		}
		catch(Exception e)
		{
		}
		System.out.println("copied data to "+out);
	}
}