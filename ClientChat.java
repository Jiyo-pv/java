import java.io.*;
import java.net.*;
class ClientChat
{
    public static void main(String args[])
    {
        try{
            Socket s=new Socket("localhost",1234);
            DataInputStream sin=new DataInputStream(s.getInputStream());
            DataOutputStream sout=new DataOutputStream(s.getOutputStream());
            DataInputStream stdin=new DataInputStream(System.in);
            String str="";
            while(true)
            {
                str=sin.readUTF();
                System.out.println("Server says:"+str);
                if(str.equals("quit"))
                    break;
                System.out.print("Enter message:");
                str=stdin.readLine();
                sout.writeUTF(str);
                if(str.equals("quit"))
                    break;

                    
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}