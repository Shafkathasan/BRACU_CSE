public class AnimalTester{
  public static void printSound(Animal a){    
      a.makeSound();
  }
  public static void main(String [] args){
    Animal [] aa = new Animal[4];
    Rabit c1 = new Rabit();
    Cat c2 = new Cat();
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    aa[0] = c1;
    aa[1] = c2;
    aa[2] = d1;
    aa[3] = d2;
    int i = 0;
    while (i < 4){
      aa[i].makeSound();
      i++;
    }
    
    
  }
}