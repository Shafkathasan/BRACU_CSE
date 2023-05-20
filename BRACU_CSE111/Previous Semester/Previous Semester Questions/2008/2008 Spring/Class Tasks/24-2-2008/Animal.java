public class Animal{
  protected String sound = "Animal Sound";
  public Animal(){
    System.out.println("In Animal's const");
  }
  public Animal(String sound){
    System.out.println("In Animal's new const");
    this.sound = sound;
  }
  public void makeSound(){
    System.out.println(sound);
    //makeCrazySound();
  }
  
  
  
  
//  public void makeCrazySound(){
//    System.out.println(" $^$&^%%$%^$^%");
//  }
  
}