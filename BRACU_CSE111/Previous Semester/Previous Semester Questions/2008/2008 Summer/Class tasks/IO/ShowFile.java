import java.io.*;

class ShowFile {
  public static void main(String args[ ]) throws IOException
  {
    int i;
    FileInputStream fin;
    try {
      fin = new FileInputStream(args[0]);
    } catch(FileNotFoundException e) {
      System.out.println("File Not Found "+e);
      return;
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Usage: ShowFile File");
      return;
    }
    // read characters until EOF is encountered
    do {
      i = fin.read();
      //if(i != -1) System.out.print((char) i);
      if(i != -1) System.out.println( i);
    } while(i != -1);
    
    fin.close();
  }
}
