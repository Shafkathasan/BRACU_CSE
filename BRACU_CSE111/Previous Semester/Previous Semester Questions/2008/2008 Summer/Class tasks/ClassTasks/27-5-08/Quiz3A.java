public class Quiz3A{
  public static int temp = 4;
  public int sum;
  public int y;
  public Quiz3A(){
    y = temp - 1;
    sum = temp + 1;
    temp+=2;
  }
  public Quiz3A(int k){
    temp++;
    sum = ++temp + k;
    y = sum - 1;
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
