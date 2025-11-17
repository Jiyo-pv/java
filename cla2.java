import java.io.*;
class cla2{
	public static void main(String args[])
	{
		int res=0;
		if(args.length!=3)
		{
				System.out.println("error: need 3 argouments \ncla2 a b <opcode>");
				System.out.println("op codes:0-add 1-diff 2-multipy 3-divide");
				
				return;
			
		}	
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		switch(args[2])
		{
			case "0":
				System.out.println("addition");
				res=a+b;	
				break;
			
			case "1":

				System.out.println("Subtraction");
				res=a-b;	
				break;

			case "2":

				System.out.println("product");
				res=a*b;	
				break;

			case "3":

				System.out.println("division");
				if(b==0)
				{
					System.out.println("division by zero not possible");
					return;	
				}	
				res=a/b;
				break;
		}
		
		System.out.println(res);
	}
}