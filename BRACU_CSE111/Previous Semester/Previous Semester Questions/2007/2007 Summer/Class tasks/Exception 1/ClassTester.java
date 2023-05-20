public class ClassTester{
  public static void doSomething(SomeClass s){
    try{      
      s.badThingsHappen();
    }catch(ArithmeticException e){
      System.out.println("Got a exception "+e);
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
    }    
    catch(Exception e){
      System.out.println("doSomething: Got a exception "+e);      
    }

    System.out.println("After the doSomething ");
  }
}