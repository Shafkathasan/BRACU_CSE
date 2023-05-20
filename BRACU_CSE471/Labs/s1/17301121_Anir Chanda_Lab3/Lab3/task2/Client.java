import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[]args){
        try{
            Socket skt = new Socket("Localhost",1417);
            
            InputStreamReader input = new InputStreamReader (new DataInputStream(skt.getInputStream()));
            BufferedReader reader =new BufferedReader(input);
            
            DataOutputStream output = new DataOutputStream (skt.getOutputStream());
            PrintWriter writer = new PrintWriter(output,true);
            
            Scanner sc = new Scanner (System.in);
            
            while(true){
                System.out.println ("Say something to the server");
                String in =sc.nextLine();
                
                writer.println(in);
                String response = reader.readLine();
                System.out.println("From server: " +response);
                
                if(response.equalsIgnoreCase("GOODBYE"))
                    break;
            }
            skt.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
