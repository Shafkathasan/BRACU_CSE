public class Test3{
  public static void displayCounter(CasModCounter c){
    c.print();
    System.out.println();
  }
  public static void main(String [] args){
    CasModCounter ctr =  new CasModCounter (2);
    
    CasModCounter ptr;
    
    ptr = new CasModCounter(3);
    ctr.attach(ptr);
    
    ptr = new CasModCounter(2);
    ctr.attach(ptr);
    
    ptr = new CasModCounter(10);
    ctr.attach(ptr);
    
    for (int i = 0; i < 20; i++)
    {
      displayCounter(ctr);
      ctr.increment();
    }
    
    for (int i = 0; i < 20; i++)
    {
      displayCounter(ctr);
      ctr.decrement();
    }
    
  }
}