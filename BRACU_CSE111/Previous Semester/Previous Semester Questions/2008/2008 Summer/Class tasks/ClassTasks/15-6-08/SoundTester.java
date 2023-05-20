public class SoundTester{

  public static void main(String [] args){
    
    //Animal a = new Animal();
    SuperDuperSound sds = new SuperDuperSound();
    RedDog d = new RedDog();
    Cat c = new Cat();
    Cow co = new Cow();
    Pig p = new Pig();
    Mp3Player mp3 = new Mp3Player();
    Bike b = new Bike();
    sds.bstolife(c);
    sds.bstolife(d);
    sds.bstolife(co);
    sds.bstolife(p);
    sds.bstolife(mp3);
    sds.bstolife(b);
  }
}