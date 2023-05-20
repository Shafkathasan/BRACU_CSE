import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;
public class Client {

    public static void main(String[] args) throws IOException {
     try{
            Socket skt = new Socket("Localhost",1714);
            
            InputStreamReader input = new InputStreamReader (new DataInputStream(skt.getInputStream()));
            BufferedReader reader =new BufferedReader(input);
            
            DataOutputStream output = new DataOutputStream (skt.getOutputStream());
            PrintWriter writer = new PrintWriter(output,true);
            
            Scanner sc = new Scanner (System.in);
           
              System.out.println("addition-->1, subtraction-->2, multiplication-->3");
              String st = sc.nextLine();
              writer.println(st);

              System.out.println("Input 1");
              st = sc.nextLine();
              writer.println(st);

              System.out.println("Input 2");
              st = sc.nextLine();
              writer.println(st);

              String response= reader.readLine();
              System.out.println("From the server-" + response);
                  skt.close();
             
              }catch(Exception e){
            System.out.println(e);
        }
    }
}
    

