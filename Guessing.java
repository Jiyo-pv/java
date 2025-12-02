import java.util.*;
class Guessing
{	
	int attempts;
	public int guess()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number:XX(hint:its between 20 and 30)");
			
		System.out.println("attempt "+attempts);
		System.out.print("guess the number:");
		int g=sc.nextInt();
		return g;
	}
	
	public void play()
	{
		attempts=1;
		Random rn=new Random();
		int n=rn.nextInt(10)+20;	
		while(guess()!=n)
		{
			attempts++;
		}
		System.out.println("the no was "+n+"\nno of attempts:"+attempts);
	}
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		String s;
		Guessing g=new Guessing();
		while(true)
		{
			g.play();
			System.out.print("play again?<y/n>:");
			s=sc.nextLine();
			if(s.equals("n"))
			{	
				break;
			}		
			
		}
	}
}