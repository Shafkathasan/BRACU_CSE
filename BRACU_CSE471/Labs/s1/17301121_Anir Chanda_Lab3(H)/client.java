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
            
            System.out.println ("Speak now");
            String in =sc.nextLine();
                
            writer.println(in);
            System.out.println(reader.readLine());
            skt.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}