public class SoundTester{
  public static void MindBlowingS(SoundMaker a){    
    System.out.println("**********************");
    System.out.println(a.makeSound());
    System.out.println("**********************");
  }
  public static void main(String [] args){   
    Rabit c1 = new Rabit();
    Cat c2 = new Cat();
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    Mp3Player m1 = new Mp3Player();
    Harley h = new Harley();
    MindBlowingS(h);
    //MindBlowingS(d1);
  }
}