public class Cat extends Animal{
  public abstract String sound = "MMMMM";
  public void makeSound(){
    System.out.println(sound);
  }
  public String toString(){
    return "I am a Cat";
  }
}