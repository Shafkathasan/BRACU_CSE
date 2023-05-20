public class ClassTester{
  public static void doSomething(SomeClass s) throws MyException{
    try{      
      //s.badThingsHappen();
      throw new MyException("Raquib's fault");
    }catch(NullPointerException e){
      System.out.println("doSomething: Got a exception "+e);
      throw(e);      
    }finally{
      System.out.println("fsdklafjklasdfjasldjk");
    }
    
  }
  public static void main(String [] args){
    SomeClass sc = new SomeClass();
    System.out.println("Before the doSomething ");
    try{
    doSomething(sc);
    }catch(NullPointerException e){
      System.out.println("Main: Got a exception "+e);
    }catch(ArithmeticException e){
      System.out.println("Main: Got a exception "+e);  
    }  catch(MyException e){
      System.out.println("Main: MyException "+e);    
    } 
     System.out.println("After the doSomething ");
  }
}