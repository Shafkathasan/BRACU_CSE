public class AnimalTester{
  public static void main(String []args){
    /*Animal dog = new Animal();
    dog.setSound("bark");
    System.out.println(dog.makeSound());
    Animal cat = new Animal();
    cat.setSound("meow");
    System.out.println(cat.makeSound());*/
    Dog dog = new Dog();
    System.out.println(dog.makeSound());
    Cat cat = new Cat();
    System.out.println(cat.makeSound());
  }
}