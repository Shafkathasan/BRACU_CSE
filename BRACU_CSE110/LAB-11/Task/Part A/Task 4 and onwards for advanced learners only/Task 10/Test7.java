//*****************************************************************************
//Run the methodA() on an Instance of Test7 three times and explain the answer.
//******************************************************************************
class msgClass{
  public int content;
}
public class Test7{
  private int sum;
  private int y;
  public int x;
  public Test7(){
    sum = 8;
    x = 2;
    y = 4;
  }
  public void methodA(){
    int x=0, y =0;
    msgClass [] msg = new msgClass[1];
    msgClass myMsg = new msgClass();
    myMsg.content = this.x;
    msg[0] = myMsg;
    msg[0].content = this.y + myMsg.content;
    this.y = this.y + methodB(msg[0]);
    y = methodB(msg[0]) + this.y;
    x = y + methodB(msg, msg[0]);
    sum = x + y + msg[0].content;
    System.out.println(x + " " + y+ " " + sum);
  }
  private int methodB(msgClass [] mg2, msgClass mg1){
    int x = 0;
    y = y + mg2[0].content;
    mg2[0].content = y + mg1.content;
    x = x + 33 + mg1.content;
    sum = sum + x + y;
    mg1.content = sum - mg2[0].content ;
    System.out.println(this.x + " " + this.y+ " " + sum);
    return sum;
  }
  private int methodB(msgClass mg1){
    int x = 0;
    int y = 0;
    y = sum + mg1.content;
    this.y = y + mg1.content;
    x = this.x + 33 + mg1.content;
    sum = sum + x + y;
    this.x = mg1.content + x + 2;
    System.out.println(x + " " + y+ " " + sum);
    return y;
  }
}

//*******************************************************
