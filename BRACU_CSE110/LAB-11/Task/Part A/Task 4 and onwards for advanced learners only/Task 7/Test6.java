//****************************************************************************
//Run the methodA() Twice on an Instance of Test6 and
//explain the answer.
//****************************************************************************
public class Test6{
  public int sum;
  public int y;
  public int x;
  public void methodA(){
    int y =0;
    int i = 0;
    int [] msg = new int[5];
    msg[0] = 5;
    while (i < 5) {
      msg[i] = i + 2;
      y = y + methodB(msg, i);
      x = y + methodB(msg);
      sum = x + y + msg[0];
      System.out.println(x + " " + y+ " " + sum);
      i++;
    }
  }
  private int methodB(int [] mg2){
    int x = 0;
    int y = 22;
    this.y = y + mg2[this.y % 5];
    x = x + (this.y / 3) - mg2[sum % 5];
    sum = sum + x + y;
    System.out.println(x + " " + this.y+ " " + sum);
    return sum;
  }
  private int methodB(int[] mg1, int i){
    int x = 0;
    int j = 0;
    while (j <= i){
      mg1[i] = mg1[i] + mg1[j];
      j++;
    }
    return mg1[i];
  }
}
//*******************************************************

