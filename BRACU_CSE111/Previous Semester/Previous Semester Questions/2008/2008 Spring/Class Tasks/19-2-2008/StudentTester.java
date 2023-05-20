public class StudentTester{
  public static void main(String [] s){
    //Student s1 = new Student();
    //s1.printName();
    //s1.pet.makeSound();
    //s1.pet.sound = "bark";
    //s1.pet.makeSound();
    Animal cow = new Animal();
    cow.name = "cow";
    cow.sound = "mooo";
    Student s1 = new Student(cow);
    s1.pet.makeSound();
  }
}