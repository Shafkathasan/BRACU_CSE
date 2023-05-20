public class AbadClass{
  public void badThingsHappen() throws UnderFlowException{
    int [] a = new int [1];
    int [] d = null;
    int s = 5;
    boolean mubin = true;
    System.out.println("Before the Bad thing");
    UnderFlowException ue = new UnderFlowException("No it is Saad Sir's fault");
    throw(ue);
    //try{
      //System.out.println("Creat the mess");
      //d[1] = 3;
      //if (mubin){
      //  UnderFlowException ue = new UnderFlowException();
      //  throw(ue);
      //}
      //s = s /0;
      //a[1] = 3;          
      
    //}catch(ArrayIndexOutOfBoundsException e){
    //  System.out.println("Muhaaaaaaaaaa");      
     // throw(e);      
    //}catch(ArithmeticException e){
     // System.out.println("One that got away");      
    //}finally{
     // System.out.println("Clean up the mess");
    //}
    //System.out.println("After the Bad thing");
  }
}