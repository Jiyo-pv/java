import java.net.*;
import java.io.*;
import java.sql.*;
class LoginServer
{
    public  static void main(String args[])throws Exception
    {
        byte[] buffer=new byte[1024];
        DatagramPacket dp=new DatagramPacket(buffer,buffer.length);
        DatagramSocket ds=new DatagramSocket(1234);
        InetAddress client;
        int port;
        ds.receive(dp);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jiyo","1234");
        String received=new String(dp.getData(),0,dp.getLength());
        client=dp.getAddress();
        port=dp.getPort();
        String[] data=received.split(":");
        String un=data[0];
        String pass=data[1];
        String reply;
        PreparedStatement st=con.prepareStatement("select * from login where name=? and pass=?");
        st.setString(1,un);
        st.setString(2,pass);
        ResultSet rs=st.executeQuery();
        if(rs.next())
        {
            reply="success";
        }
        else
        {
            reply="failed";
        }
        dp=new DatagramPacket(reply.getBytes(),reply.length(),client,port);
        ds.send(dp);
        



        ds.close();



    }
}