public class Dog extends Animal implements SoundMaker{
  public Dog(){   
    //System.out.println("In Dog const");
    
  }
  public void rollOver(){
    System.out.println("In Dog's roll over");
  }
  public String makeSound(){
    return "bark";
  }
}