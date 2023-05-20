import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {
    public static void main(String[]args){
        try{
            while(true){
                ServerSocket skt =new ServerSocket(1417);
                System.out.println ("Port : 1417 ");
                Socket socket = skt.accept();
                System.out.println ("Connected");

                String today = new Date().toString();

                DataOutputStream output = new DataOutputStream (socket.getOutputStream());
                PrintWriter writer = new PrintWriter(output,true);

                writer.println(today);

                skt.close();
            
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
