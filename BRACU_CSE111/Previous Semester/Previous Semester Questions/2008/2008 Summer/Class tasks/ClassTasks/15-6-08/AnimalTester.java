public class AnimalTester{

  
  public static void main(String [] args){
    
    //Animal a = new Animal();
    SuperDuperSound sds = new SuperDuperSound();
    RedDog d = new RedDog();
    Cat c = new Cat();
    Cow co = new Cow();
    Pig p = new Pig();

    sds.bstolife(c);
    sds.bstolife(d);
    sds.bstolife(co);
    sds.bstolife(p);
  }
}