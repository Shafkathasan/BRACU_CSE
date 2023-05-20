public class A{
  public static int temp = 4;
  public int sum;
  public int y;
  public A(){
    y = temp - 1;
    sum = temp + 1;
    temp+=2;
  }
  public int methodB(int m, int n){
    int x = 0;
    y = y + m + (++temp);
    x = x + 2 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
