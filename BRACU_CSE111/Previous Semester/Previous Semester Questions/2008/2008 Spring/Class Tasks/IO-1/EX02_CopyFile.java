import java.io.*;

public class EX02_CopyFile{
  public static void main(String args[]) throws IOException{
    int i;
    FileInputStream fin;
    FileOutputStream fout;
    try { //open input file
      try {
        fin = new FileInputStream(args[0]);
      } catch(FileNotFoundException e) {
        System.out.println("Input file not found");
        return;
      }
      try { //open output file
        fout =  new FileOutputStream(args[1]);
      } catch(FileNotFoundException e) {
        System.out.println("Error opening output file");
        return;
      }
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage: java CopyFile Fr To");
      return;   }
    try {
      do {
        i = fin.read( );
        if(i != -1) fout.write(i);
      } while(i != -1);
    } catch(IOException e){
      System.out.println("File Error");
    }
    fin.close();  
    fout.close();
  } 
}
