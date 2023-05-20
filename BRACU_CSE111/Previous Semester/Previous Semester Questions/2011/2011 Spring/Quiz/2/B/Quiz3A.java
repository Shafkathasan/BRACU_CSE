public class Quiz3A{
  public static int temp =5;
  public int sum = 1;
  public int y;
  public Quiz3A(){
    y = temp - 1;
    sum = temp + 2;
    temp+=2;
  }
  public Quiz3A(int k){
    temp = temp + 2;
    sum = ++temp + k;
    y = sum - 2;
  }
  public int methodB(int m, int n){
    int x = 1;
    y = y + m + (temp++);
    x = x + 2 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}
