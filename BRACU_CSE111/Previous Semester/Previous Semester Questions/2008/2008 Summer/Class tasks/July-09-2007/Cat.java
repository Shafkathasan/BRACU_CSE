public class Cat extends Animal implements SoundMaker{
  
  public Cat(){
    //System.out.println("In Cat const");
   
  }
  public String makeSound(){
    return "mew";
  }
}