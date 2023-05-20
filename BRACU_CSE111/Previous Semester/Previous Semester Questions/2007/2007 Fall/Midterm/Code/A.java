public class A{
  public static int temp = 4;
  public int sum;
  public int y;
  public A(int x){
    y = temp - 2 +x;
    sum = temp + 3;
    temp-=2;
  }
  public void methodB(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 2 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}
class B extends A {
  public int x;
  public int sum;
  public B(int p){
    super(p);
    y = temp + p ;
    sum = p+ temp + 1;
    temp-=1;
  }  
  public void methodB(int m, int n){    
    int  y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    super.methodB(x, y);
    sum = x + y + super.sum;
    System.out.println(x + " " + y+ " " + sum);
  }
}
