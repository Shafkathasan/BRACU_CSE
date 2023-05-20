public class MyGoodClass{

  public void goodMethod(){
    AbadClass abc = new AbadClass();
    System.out.println("Before good stuff");
    try{
      abc.badThingsHappen();
    }catch(NullPointerException e){
      System.out.println("Null Pointer");
    }
    System.out.println("After good stuff");
    
  }
  public static void main(String [] mubin){
    MyGoodClass mgc = new MyGoodClass();
    try{
      mgc.goodMethod();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("You can run but you can't hide");
    }
  }
}