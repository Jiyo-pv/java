import java.net.*;
import java.io.*;
class UDPC
{
	public static void main(String args[])
	{
		DatagramSocket ds=null;
		InetAddress shost=null;
		DatagramPacket dp=null,reply=null;
		try
		{
			ds=new DatagramSocket(1235);
			byte[] m="Hello From Jiyo".getBytes();
			shost=InetAddress.getByName("localhost");
			dp=new DatagramPacket(m,m.length,shost,1234);
			ds.send(dp);

			byte[] buffer=new byte[1000];
			reply=new DatagramPacket(buffer,buffer.length);
			ds.receive(reply);
			

			System.out.println("Reply:"+ (new String(reply.getData())).trim() );
		}
		catch(Exception e)
		{
			System.out.print("error:"+e);
		}
			 
	}
}