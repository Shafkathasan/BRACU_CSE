public class TestException{
  public static void doSomething(BadClass b){
    System.out.println("In do something");
    System.out.println("Before bad thing");
    if (b.someThingBad(1)== 225){
      System.out.println("Your name is wrong");
    }else{
      System.out.println("You are the Man!");
    }
    System.out.println("After bad thing");
  }
  public static void main(String [] args){
    BadClass bc = new BadClass();
    System.out.println("Before doSomething()");
    doSomething(bc);
    System.out.println("After doSomething()");
  }
}