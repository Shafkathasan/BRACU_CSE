import java.io.*;

public class EX06_ObjectIO {
  public static void main(String[] args){
//object serialization
  try {
   EX06_MyClass obj1 = new EX06_MyClass("Hello",-7,2.7e10);
   System.out.println("Object1: " + obj1);
    ObjectOutputStream out =
      new ObjectOutputStream(new FileOutputStream("object.bin"));
    out.writeObject(obj1);
    out.flush();
    out.close();
  } catch(Exception e) {
   System.out.println("Exception during serializaion: "+e);
   System.exit(0);
  }
//object deserialization
  try {
   EX06_MyClass obj2; 
   ObjectInputStream in = new 
      ObjectInputStream(new FileInputStream("object.bin"));
   obj2 = (EX06_MyClass)in.readObject();
   in.close();
   System.out.println("Object2: " + obj2);
  } catch(Exception e) {
  System.out.println("Exception during deserializaion: " +e);
   System.exit(0);
  }
 }
}  
