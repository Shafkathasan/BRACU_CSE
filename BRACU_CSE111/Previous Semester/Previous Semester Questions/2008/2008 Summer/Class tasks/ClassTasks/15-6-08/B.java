public class B extends A{
  public B(){
    System.out.println("In B's Const");
  }
  public B(String txt){
    super(txt);
    System.out.println("In B's **** Const "+ txt);    
  }
  void test(){
    System.out.println("In B's test method ");    
  }
 
}