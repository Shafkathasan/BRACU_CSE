public class BadThing{
  private String msg = null;
  private int num;
  public BadThing (int i){
    num = i;
  }
  public void badMethod() throws Exception{
    if (num < 11){
      throw new ArrayIndexOutOfBoundsException ();
    }
    if (num%2 == 0){
      throw new ParentException(new BadThing(num));
    }else{
      throw new ChildException(new BadThing(num));
    }
  }
  public String toString(){
    if (num%2 == 0){
      return "You are an Even Steven "+ num;
    }else{
      return "You are an Odd One "+ num;
    }
  }
}
