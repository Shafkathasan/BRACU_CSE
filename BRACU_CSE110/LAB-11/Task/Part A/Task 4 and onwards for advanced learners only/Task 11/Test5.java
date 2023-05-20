//****************************************************************************
//Create a instance of Test5 with the command Test5 t5 = new Test5();
//Run the methodA() on an Instance of Test5 four times and explain the answer.
//Create a instance of Test5 with the command t5 = new Test5(2,3);
//Run the methodA() on an Instance of Test5 four times and explain the answer.
//****************************************************************************
public class Test5{
  private int sum;
  private int y;
  private int x;
  public Test5(){
    sum = 1;
    y = 1;
  }
  public Test5(int x, int p){
    sum = x;
    y = p;
  }
  public void methodA(){
    int x=0;
    int [] msg = new int[1];
    msg[0] = 5;
    y = y + methodB(msg, msg[0]);
    x = y + methodB(methodB(msg, msg[0]), msg[0]);
    sum = x + y + msg[0];
    System.out.println(this.x + " " + y+ " " + sum);
  }
  private int methodB(int [] mg2, int y){
    int x = 0;
    this.y = y - mg2[0];
    this.x = x - 33 + y;
    x = y + this.y;
    sum = sum - x + y;
    mg2[0] = y - sum;
    System.out.println(x + " " + y+ " " + sum);
    return mg2[0];
  }
   private int methodB(int sum, int mg1){
    int x = 0;
    y = y - this.sum;
    x = x + 33 + mg1;
    sum = sum + x + y;
    mg1 = y - mg1;
    System.out.println(x + " " + y+ " " + sum);
    return mg1;
  }
}
