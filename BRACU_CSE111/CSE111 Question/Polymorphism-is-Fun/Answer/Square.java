public class Square extends Rectangle
{
    public String name = "Square";
    
    public void method1(){
        method3();
        System.out.println("Square 1");
    }
    
    public void method2(){
        super.method2();
        System.out.println("Square 2");
        method3();
    }
}
