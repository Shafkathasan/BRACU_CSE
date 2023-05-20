public class Animal{
  protected String sound = "Animal Sound";
  public int age;
  public Animal(){
    System.out.println("In Animal default const");
  }
  public Animal(int age){
    this.age = age;
    System.out.println("In Animal new const");
  }
  public void setSound(String sound){
    this.sound = sound;
  }
  public String makeSound(){
    return sound;
  }
  public int getAge(){
    return age;
  }
}