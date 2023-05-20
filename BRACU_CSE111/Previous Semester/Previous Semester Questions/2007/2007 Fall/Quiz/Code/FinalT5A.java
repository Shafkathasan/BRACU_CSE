class msgClass{
  public int content;
}

public class FinalT5A{
  private int sum = 2;
  private int y = 1;
  public int x = 1;
  public void methodA(){    
    int x=0, y =0, i = 0;
    while (i < 2){
      msgClass myMsg = new msgClass();
      myMsg.content = this.x;
      this.y = this.y + methodB(myMsg, myMsg.content);     
      System.out.println(x + " " + y+ " " + sum);    
      y =  this.y / 2;   
      x = y + sum/2 - i;      
      sum = x + y + myMsg.content;
      i++;
    }
    System.out.println(x + " " + y+ " " + sum); 
  }
  private int methodB(msgClass mg2, int mg1){
    int x = 0;
    y = y + mg2.content;
    mg2.content = y + mg1;
    x = this.x + 3 + mg1;
    sum = sum + x + y;    
    System.out.println(this.x + " " + this.y+ " " + sum);      
    mg2.content = sum - mg1 ;
    return sum;
  }
}  
