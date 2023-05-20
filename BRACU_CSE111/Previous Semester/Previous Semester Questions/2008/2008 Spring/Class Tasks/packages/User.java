import CompOne.*;
import CompTwo.*;
public class User{
   public static void main(String [] args){
      System.out.println("In User class");
      CompOne.A coa = new CompOne.A();
      coa.method();  
      CompTwo.A cta = new CompTwo.A();
      cta.method(); 	
   }	
}