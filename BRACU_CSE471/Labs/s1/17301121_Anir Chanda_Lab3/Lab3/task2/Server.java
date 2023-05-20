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

                
                
                InputStreamReader input = new InputStreamReader (new DataInputStream(socket.getInputStream()));
                BufferedReader reader =new BufferedReader(input);

                DataOutputStream output = new DataOutputStream (socket.getOutputStream());
                PrintWriter writer = new PrintWriter(output,true);
                
                while(true){
                    String client_response = reader.readLine();
                    
                    if(client_response.equalsIgnoreCase("end game")){
                        writer.println("Good Bye");
                        break;
                    }
                    else
                        writer.println(client_response);
                }
              skt.close();
        }    
        }catch(Exception e){
            System.out.println(e);
        }
    }
}