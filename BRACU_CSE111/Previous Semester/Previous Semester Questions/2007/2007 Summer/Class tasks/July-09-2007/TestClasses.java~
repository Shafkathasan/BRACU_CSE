class Frodo extends Bilbo
{
  public void method1()
  {
    System.out.println("Frodo 1");
    super.method1();
  }
  
  public void method3()
  {
    System.out.println("Frodo 3");
  }
}

class Gandalf
{
  public void method1()
  {
    System.out.println("Gandalf 1");
  }
  
  public void method2()
  {
    System.out.println("Gandalf 2");
    method1();
  }
}

class Bilbo extends Gandalf
{
  public void method1()
  {
    System.out.println("Bilbo 1");
  }
}

class Gollum extends Gandalf
{
  public void method3()
  {
    System.out.println("Gollum 3");
  }
}
public class TestClasses{
  public static void main(String [] args){
    Gandalf var1 = new Frodo();
    Gandalf var2 = new Bilbo();
    Gandalf var3 = new Gandalf();
    Object var4 = new Bilbo();
    Bilbo var5 = new Frodo();
    Object var6 = new Gollum();
//    var1.method1();                   
//    var2.method1();                 
//    var3.method1();                      
//    var4.method1();                 
//    var5.method1();                  
//    var6.method1();                
//    var1.method2();                
//    var2.method2();                 
//    var3.method2();                 
//    var4.method2();                 
//    var5.method2();                 
//    var6.method2();                   
//    ((Bilbo)var1).method3();    
//    ((Gandalf)var1).method2();   
//    ((Frodo)var4).method1();    
//    ((Gandalf)var6).method2();   
//    ((Gandalf)var4).method1();   
//    ((Frodo)var6).method3();    
//    ((Frodo)var3).method3();    
//    ((Frodo)var5).method3();        

  }
}
