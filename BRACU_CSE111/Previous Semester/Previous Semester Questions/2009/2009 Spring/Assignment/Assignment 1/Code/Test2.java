public class Test2{
  public static void displayCounter(CasModCounter c){
    c.print();
    System.out.println();
  }
  public static void main(String [] args){
    CasModCounter ctr =new CasModCounter(2);
    ctr.attach(new CasModCounter(3));
    
    displayCounter(ctr);
    
    CasModCounter another = ctr;
    
    displayCounter(another);
    
    ctr.increment();
    displayCounter(ctr);
    displayCounter(another);
    
    ctr.increment();
    displayCounter(ctr);
    displayCounter(another);    
    
  }
}