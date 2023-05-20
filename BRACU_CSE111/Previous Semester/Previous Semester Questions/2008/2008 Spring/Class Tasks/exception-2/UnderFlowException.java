public class UnderFlowException extends Exception{
  private String msg;
  public UnderFlowException(String msg){
    this.msg = msg;
  }
  public String toString(){
    return msg;
  }
}