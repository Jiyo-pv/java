/* Demonstration of exception propagation and final block in Java 
   using a custom exception class.
@JIYO P V     Roll No:33
31 December 2025
*/
class thrownException extends Exception
{
		String s;
		public thrownException(String st)
		{
			s=st;
		}
		String show()
		{
			return s;
		}
}

class Player
{
	public void thrown() throws thrownException
	{
		throw new thrownException("ball thrown by player");
	}
	public void catches() throws thrownException
	{
		try
		{
			thrown();
		}
		catch(thrownException e)
		{
			
			System.out.println(e.show()+"\nball catched by a player");
			throw e;
		}
		
	}
	
}
class finalcatch
{
	public static void main(String args[])
	{
		try
		{
			new Player().catches();
		}
		catch(thrownException e)
		{
			System.out.println(e.show()+"\nball catched by main player");
		}
		finally
		{
			System.out.print("game has finished");
		}
	}
}