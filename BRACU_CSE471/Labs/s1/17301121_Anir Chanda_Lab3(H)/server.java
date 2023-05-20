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
                String client_response = reader.readLine();
        
        int nameLenght = client_response.length();
            String converted_msg = "";
            for(int i = 0; i < nameLenght ; i++){    
                char character = client_response.charAt(i); 
                int ascii = (int)character; 
                converted_msg = converted_msg + ascii;
            }
        writer.println(converted_msg);
                skt.close();
        }    
        }catch(Exception e){
            System.out.println(e);
        }
    }
}