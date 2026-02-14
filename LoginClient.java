import java.net.*;
import java.io.*;
import java.util.*;
class LoginClient
{
    public static void main(String args[])throws Exception
    {
        DatagramSocket ds=new DatagramSocket(1234);
        InetAddress shost=InetAddress.getByName("localhost");
        Scanner sc=new Scanner(System.in);
        String username,password;
        System.out.print("enter username:");
        username=sc.nextLine();
        System.out.print("enter password:");
        password=sc.nextLine();
        String message=username+":"+password;
        byte[] data=message.getBytes();
        DatagramPacket dp=new DatagramPacket(data,data.length,shost,1234);
        ds.send(dp);
        byte[] response=new byte[1024];
        ds.receive(dp);
        String reply=new String(dp.getData(),0,dp.getLength());
        System.out.print(reply);
        ds.close();

    }
}