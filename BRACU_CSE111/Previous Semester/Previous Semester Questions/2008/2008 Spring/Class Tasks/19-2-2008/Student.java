public class Student{
  String name;
  Animal pet;
  public Student(){
    name = "default";
    pet = new Animal();
    pet.name = "cat";
    pet.sound = "meow";
  }
  public Student(Animal a1){
    pet = a1;
  }
  public void printName(){
    System.out.println(name);
  }
}