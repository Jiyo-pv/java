import java.io.*;
import java.awt.*;
import java.net.*;
class ServerChat
{
    public static void main(String args[])
    {
        try 
        {
            ServerSocket ss=new ServerSocket(1234);
            System.out.println("Server is ready to accept connection");
            while(true)
            {
            Socket s=ss.accept();
            System.out.println("Client connected"+s);
            new ClientHandler(s).start();
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class ClientHandler extends Thread
{
    Socket s;
    ClientHandler(Socket s)
    {
        this.s=s;
    }
    public void run()
    {
        Desktop dt=Desktop.getDesktop();
        try{
            DataInputStream sin=new DataInputStream(s.getInputStream());
            DataOutputStream sout=new DataOutputStream(s.getOutputStream());
            DataInputStream stdin=new DataInputStream(System.in);
            String str="welcome to server";
            while(true)
            {
                sout.writeUTF(str);
                if(str.equals("quit"))
                    break;
                str=sin.readUTF();
                System.out.println("Client says:"+str);
                 dt.browse(new URI("https://www.google.com/search?q="+str));
                if(str.equals("quit"))
                    break;
                System.out.print("Enter message for client:");
                str=stdin.readLine();
             

            }
        }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }
}