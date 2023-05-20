//*****************************************************************************
//Run the methodA() on an Instance of Test2 three times and explain the answer.
//******************************************************************************

public class Test2{
  public int sum;
  public int y;

  public void methodA(){
    int x=0, y =0;
    msg mg = new msg();
    mg.content = 5;
    y = y + mg.content;
    methodB(mg);
    x = y + mg.content;
    sum = x + y;
    System.out.println(x + " " + y+ " " + sum);
  }
  private void methodB(msg mg2){
    int x = 0;
    y = y + mg2.content;
    x = x + 33 + y;
    sum = sum + x + y;
    mg2.content = x;
    System.out.println(x + " " + y+ " " + sum);
  }
}

//*******************************************************

class msg{
  public int content;
}