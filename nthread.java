import java.util.*;
class Found_Flag {
    static int found = 0;
    static int threads_done = 0;

    public synchronized static int value() {
        return found;
    }

    public synchronized static void set() {
        found = 1;
    }

    public synchronized static void done() {
        threads_done++;
    }

    public synchronized static int doneCount() {
        return threads_done;
    }
}

class Searcher extends Thread
{
	int start;
	int end;
	int key;
	int a[];
	int no;
	public  Searcher(int ar[],int start,int end,int key,int no)
	{
		this.a=ar;
		this.start=start;
		this.end=end;
		this.key=key;
		this.no=no;
		this.start();
	}
	public void run()
	{
		int i=start;
		while(i<end && Found_Flag.value()==0)
		{
			 
			if(a[i]==key)
			{	
				Found_Flag.set();
				System.out.println("element found by thread "+no);
				Found_Flag.done();
				return;
				
			}
			i++;
		}
		Found_Flag.done();
	}
	 
}
class nthread
{
	public static void main(String args[])
	{
		int a[],n,start,end,threadcount,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter n:");
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter search element:");
		int key=sc.nextInt();
		threadcount=(n+4)/5;
		for(i=0;i<threadcount;i++)
		{
			start=i*5;
			end=start+5;
			if(end>=n)
			{
				end=n;
			}
			new Searcher(a,start,end,key,i+1);
		}
		while(Found_Flag.doneCount()<threadcount)
		{
		}
		if(Found_Flag.value()==0)
		{
			System.out.print("not found");
		}
	}
}

