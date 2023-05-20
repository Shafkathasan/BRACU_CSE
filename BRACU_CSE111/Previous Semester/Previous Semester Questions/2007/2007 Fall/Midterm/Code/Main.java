public class Main {
  public static void main(String[] args) {
    Foo foo1 = new Bar();
    Foo foo2 = new Mumble();
    Bar bar1 = new Bar();
    Baz baz1 = new Baz();
    Baz baz2 = new Mumble();
    Object obj1 = new Baz();       

//    foo1.method1();   //foo method 1\bar method 2         
//    
//    foo2.method1();   //baz method 1\mumble method 1         
//    
//    bar1.method1();   //foo method 1\bar method 2         
//    
//    baz1.method1();    /baz method 1       
//    
//    baz2.method1();    baz method 1\mumble method 1        
//    
//    obj1.method1();            
//    
//    foo1.method2();        //bar method 2    
//    
//    foo2.method2();   //baz method 2\baz method 1\mumble method 1         
//    
//    bar1.method2();    //bar method 2        
//    
//    baz1.method2();       //baz method 2\baz method 1     
//    
//    baz2.method2();  //baz method 2\baz method 1\mumble method 1          
//    
//    obj1.method2();            
//    
//    bar1.method3();         //bar method 3
//    
//    baz2.method3();            //CT
//    
    //((Bar)foo1).method3();     bar method 3
//    
//    ((Mumble)baz1).method3();  //RT
//    
    //((Mumble)baz2).method3();  
//    
//    ((Bar)foo2).method3();     
//    
//    ((Baz)foo2).method2();     
//    
    ((Mumble)obj1).method2();  
    
  }
}

class Foo {
  public void method1() {
    System.out.println("foo method 1");
    method2();
  }
  
  public void method2() {
    System.out.println("foo method 2");
  }
}
class Bar extends Foo {
  public void method2() {
    System.out.println("bar method 2");
  }
  
  public void method3() {
    System.out.println("bar method 3");
  }
}
class Baz extends Foo {
  public void method1() {
    System.out.println("baz method 1");
  }
  
  public void method2() {     
    System.out.println("baz method 2");
    method1();
  }
}
class Mumble extends Baz {
  public void method1() {
    super.method1();
    System.out.println("mumble method 1");
  }
  public void method3() {
    System.out.println("mumble method 3");
  }
}
