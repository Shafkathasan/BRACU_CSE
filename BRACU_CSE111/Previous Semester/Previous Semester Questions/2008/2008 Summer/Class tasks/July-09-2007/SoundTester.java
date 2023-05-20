public class SoundTester{
  public static void testSound(SoundMaker a){
    System.out.println(a.makeSound());
  }
  public static void main(String [] args){
    Dog d = new Dog();
    testSound(d);
    Cat c = new Cat();
    testSound(c);  
    Car car = new Car();
    testSound(car); 
    Mp3Player mp3 = new Mp3Player();
    testSound(mp3);   
  }
}