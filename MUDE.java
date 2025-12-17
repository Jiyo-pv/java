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
		int a=5,b=0,c;
		try
		{
			if(b==0)
			{
				throw new UDE("Dr is zero");
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