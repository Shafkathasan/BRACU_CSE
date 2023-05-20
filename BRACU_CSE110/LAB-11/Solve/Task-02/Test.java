//***************************************************************************************
//Run the methodA() and methodB on an Instance of Test few times and explain the answer.
//****************************************************************************************
//desgin class
public class Test{
    public int sum;
    public int y;
    public void methodA(){
        int x=0, y =0; //local y
        y = y + 7;
        x = y + 11;
        sum = x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
    public void methodB(){
        int x = 0;
        y = y + 11; //public y
        x = x + 33 + y; //local x
        sum = sum + x + y;
        System.out.println(x + " " + y+ " " + sum);
    }
}

//*******************************************************

