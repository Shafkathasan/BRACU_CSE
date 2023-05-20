public class Dog extends Animal{
  public String sound = "No sound";
  public Dog(){
    super(sound);
    System.out.println("In Dog's const");
  }
  public Dog(String sound){    
    super(sound);
    System.out.println("In Dog's new const");
  }  
  public void setSound(String sound){
    super.sound = sound;
  }
//  public void makeCrazySound(){
//    System.out.println("woooooooooooooooo");
//  }
}