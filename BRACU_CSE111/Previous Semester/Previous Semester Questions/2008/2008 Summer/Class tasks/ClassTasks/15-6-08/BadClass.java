public class BadClass{
  public int someThingBad(int x){
    int y;
    if ( x == 0){
      //System.out.println("No can do");
      return 225;
    }else{
        y = 4 /x;
        return 1;
     }
  }
}