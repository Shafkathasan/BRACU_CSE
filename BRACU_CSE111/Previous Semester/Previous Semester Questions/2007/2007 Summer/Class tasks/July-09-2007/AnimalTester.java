public class AnimalTester{
  public static void testSound(Animal a){
    System.out.println(a.makeSound());
  }
  public static void main(String []args){
 
    //Animal a  = new Animal();
    //testSound(a);
    Dog d = new Dog();
    testSound(d);
    Cat c = new Cat();
    testSound(c);
  }
}