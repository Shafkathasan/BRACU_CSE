public class Test1{
  public static void displayCounter(CasModCounter c){
    c.print();
    System.out.println();
  }
  public static void main(String [] args){
    CasModCounter ctr =new CasModCounter(3);
    
    for (int i = 0; i < 10; i++)
    {
      displayCounter(ctr);
      ctr.increment();
    }
    
    ctr.increment();
    
    for (int i = 0; i < 10; i++)
    {
      displayCounter(ctr);
      ctr.decrement();
    }
    
  }
}