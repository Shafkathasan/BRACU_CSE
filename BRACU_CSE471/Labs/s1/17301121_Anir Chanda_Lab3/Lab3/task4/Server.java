import java.io.*;
import java.net.*;
import java.util.Date;
public class Server {
    public static void main(String[] args){
    while(true){
      try{
        ServerSocket skt = new ServerSocket(1714);
        System.out.println("Port : 1714");
        Socket socket = skt.accept();
        System.out.println("Client is connected");
        
        InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
        BufferedReader reader = new BufferedReader(input);
        
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        PrintWriter writer = new PrintWriter(output,true);
        String open=reader.readLine();
        double i1=Integer.parseInt(reader.readLine());
        double i2=Integer.parseInt(reader.readLine());
        double result=0;
        if(open.equals("1"))
          result=i1+i2;
        else if(open.equals("2"))
          result=i1-i2;
        else if(open.equals("3"))
          result=i1*i2;
        else
          writer.println("Wrong input");
         

        
        writer.println(result);
        skt.close(); 
        }
        

      catch(Exception e){
        System.out.println(e);
      }
    }
  }
}
