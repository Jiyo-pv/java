/* Custom Exception Class for Password Validation in Java
	   to ensure strong password criteria.
@JIYO P V     Roll No:33
31 December 2025
*/
import java.util.*;
class UserE extends Exception
{
	String str;
	public UserE()
	{
		str="unknown error";
	}
	public UserE(String s)
	{
		str=s;
	}
	public String showError()
	{
		return str;
	}
}
class Password
{
	public static void main(String args[])
	{
		String password;
		String special="@*![]()/=";
		int isalnum=0;
		int lowercount=0,hasconsec=0,hasspecial=0;
		try
		{
					Scanner sc=new Scanner(System.in);
					System.out.print("enter a strong password:");
					password=sc.nextLine();
					if(password.length()<8)
						throw new UserE("atleast 8 charcters needed");
					int l=password.length();
					for(int i=0;i<l;i++)
					{
						if((i+1)!=l)
						{
							if(password.charAt(i)==password.charAt(i+1))
								throw new UserE("consecutive values not allowed");
							
						}
						if(special.toString().contains(String.valueOf(password.charAt(i))))
						{ 
							hasspecial++;
						}
						else if(Character.isLetterOrDigit(password.charAt(i)))
						{
							isalnum++;	
						}
						if(Character.isLowerCase(password.charAt(i)))
						{
							lowercount++;
						}
	
					}	
					if(lowercount==0)
						throw new UserE("at least 1 lowercase needed");
					if(hasspecial==0)
						throw new UserE("at least 1 special char needed");
					if((isalnum+hasspecial)!=l)
						throw new UserE("you entered invalid character");
				System.out.println("strong password");
		}
		catch(UserE e)
		{
			System.out.println("error:"+e.showError());
		}		
	}

}