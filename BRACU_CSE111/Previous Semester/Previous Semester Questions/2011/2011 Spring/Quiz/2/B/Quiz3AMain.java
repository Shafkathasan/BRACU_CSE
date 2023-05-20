public class Quiz3AMain{
  public static void main(String[]args){
    Quiz3A a1 = new Quiz3A();
    a1.methodB(2,4);
    Quiz3A a2 = new Quiz3A(2);
    a2.methodB(1,2);
    a1.methodB(1,1);
    a2.methodB(2,1);
  }
}