public class Dog extends Animal{
  //public Dog(int age){
  public Dog(int age){
    
    System.out.println("In Dog const");
    super(age);
    //super.age = age;
    sound = "bark";
  }
  public int getAge(){
    int newAge;
    age = age / 4;
    newAge = super.getAge();
    return newAge;
  }
}