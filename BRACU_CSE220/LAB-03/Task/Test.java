import java.util.Scanner;
public class Test{
  public static void main(String[]args)throws Exception{
    String [] lin = {"9124","4578","42","784",null,null};
    
    TestCircularArray tc = new TestCircularArray(lin,2,4); // 9124 4578 42 784
    tc.sort(); // 42 784 4578 9124
    System.out.println(tc.countOdd()); // 1 
    System.out.println(tc.countEven()); // 3
    
    try{
      tc.insert("99",12);  
    }catch(Exception e){
      System.out.println(e); // Invalid offset
    }
    tc.delete(2); // 42 784 9124  
    tc.insert("99",2); // 42 784 9124 99 
  }
}
    
    
    