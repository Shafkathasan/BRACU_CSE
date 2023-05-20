public class BadClass{
  public int someThingBad(int x){
    int y;
    int [] ma = new int[2];
    try{
      
    //ma [x] = x;
    //y = 4 /x;
    }catch(ArrayIndexOutOfBoundsException ai ){
          System.out.println("Trying my best...Ahhhhhhhhhhhhh");
          System.out.println("nooooooooooooooooooooooooooooooo!");
          throw(ai);
    }   finally{ 
    return 1;
    }
  }
}