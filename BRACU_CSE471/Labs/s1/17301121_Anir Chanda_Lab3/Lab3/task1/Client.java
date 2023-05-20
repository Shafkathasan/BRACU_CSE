import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[]args){
        try{
            Socket skt = new Socket("Localhost",1417);
            
            InputStreamReader input = new InputStreamReader (new DataInputStream(skt.getInputStream()));
            BufferedReader reader =new BufferedReader(input);
            
            System.out.println("Speak"+reader.readLine());
            skt.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
