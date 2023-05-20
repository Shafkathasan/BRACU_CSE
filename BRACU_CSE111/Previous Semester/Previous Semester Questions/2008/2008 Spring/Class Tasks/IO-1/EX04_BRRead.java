import java.io.*;
class EX04_BRRead{
public static void main(String args[]) throws IOException{
  char c;
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter characters, 'q' to quite");
 do {
     c= (char) br.read();
     System.out.println(c);
  } while(c != 'q'); 
}}// class
