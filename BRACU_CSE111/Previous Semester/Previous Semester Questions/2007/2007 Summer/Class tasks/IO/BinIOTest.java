import java.io.*;

class BinIOTest {
  public static void main(String[] args)
    throws IOException
  {
    DataOutputStream out = new DataOutputStream( new FileOutputStream("test.bin"));
    double x = 1.0;
    int count = 10;
    out.writeInt(count);
    for (int i = 0; i < count; i++){
      out.writeDouble(x);
      x = x / 3.0;
    }
    out.close();
    DataInputStream in = new DataInputStream(new FileInputStream("test.bin"));
    count = in.readInt();
    for (int i = 0; i < count; i++){
      System.out.println(in.readDouble());
    }//for
  }//main
}//class
