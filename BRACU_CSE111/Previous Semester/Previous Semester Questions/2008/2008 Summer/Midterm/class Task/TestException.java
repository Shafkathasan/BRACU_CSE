public class TestException{
  public static int doSomething(BadClass b){
    System.out.println("In do something");
    System.out.println("Before bad thing");
    try{      
      //b.someThingBad(3);
      throw new MyException();
    }catch(ArrayIndexOutOfBoundsException ai ){
      System.out.println("Trying my best...Ahhhhhhhhhhhhh");
      System.out.println("nooooooooooooooooooooooooooooooo!");
      throw(ai);
    } catch(ArithmeticException ai ){   
      throw(ai);
    }catch(Exception e){
      throw(e);
    }finally{
      System.out.println("After bad thing");
      System.out.println("Must print this");      
    }
    
    
    return 1;
  }
  public static void main(String [] args){
    BadClass bc = new BadClass();
    System.out.println("Before doSomething()");
    try{
      doSomething(bc);
    }catch(ArithmeticException ae ){
      System.out.println("Name not found in Database"+ae);              
    }catch(ArrayIndexOutOfBoundsException ai ){
      System.out.println("Index not correct "+ai);       
    }catch(Exception ai ){
      System.out.println("Do not show this to the user"+ai);    
    }
    System.out.println("After doSomething()");
  }
}