public class GoodThing{
  public static void goodMethod(Object o) throws Exception{
    try{
      ((BadThing)o).badMethod();
    }catch(ChildException c){
      System.out.println("goodThing: "+c);
    }catch(Exception e){
      throw(e);
    }
  }
  public static void main(String [] args){
    int i =  0;
    for (i =7; i < 23; i+=3){
      try{        
        goodMethod(new BadThing(i));        
      }catch(ParentException p){
        System.out.println("main: "+p);
      }catch(Exception e){
        System.out.println("Boo Hoo! I could not stop it ");;
      }
    }
  }
}
