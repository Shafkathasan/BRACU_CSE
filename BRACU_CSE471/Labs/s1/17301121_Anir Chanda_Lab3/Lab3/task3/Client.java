import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[]args){
        try{
            Socket ss = new Socket("Localhost",1714);
            
            InputStreamReader input = new InputStreamReader (new DataInputStream(ss.getInputStream()));
            BufferedReader reader =new BufferedReader(input);
            
            DataOutputStream output = new DataOutputStream (ss.getOutputStream());
            PrintWriter writer = new PrintWriter(output,true);
            
            Scanner sc = new Scanner (System.in);
            
            while(true){
                System.out.println ("speak:");
                String in =sc.nextLine();
                
                writer.println(in);
                String response = reader.readLine();
                System.out.println("From server- " +response);
                
                if(response.equalsIgnoreCase("GOODBYE"))
                    break;
            }
            ss.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
