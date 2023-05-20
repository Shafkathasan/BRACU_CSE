import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {
    public static void main(String[]args){
        try{
            while(true){
                ServerSocket skt =new ServerSocket(1714);
                System.out.println ("Port : 1714 ");
                Socket socket = skt.accept();
                System.out.println ("Connected");

                ServerThread serverThread = new ServerThread(socket);
                
                serverThread.start();
                skt.close();
        }    
        }catch(Exception e){
            System.out.println(e);
        }
    }
}