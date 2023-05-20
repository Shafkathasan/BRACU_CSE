public class AnimalTester{
  public static void MindBlowingS(Animal a){    
    System.out.println("**********************");
    System.out.println(a.makeSound());
    System.out.println("**********************");
  }
  public static void main(String [] args){   
    Rabit c1 = new Rabit();
    Cat c2 = new Cat();
    Dog d1 = new Dog();
    Dog d2 = new Dog();
    MindBlowingS(c1);
    MindBlowingS(d1);
  }
}