public class Dog {
    private String color = "Black";
    
    public Dog()
    {
    }
    public Dog(String s)
    {
        color=s;
    }
    
    public void bark()
    {
        System.out.println(color + " dog is barking");
    }
    public void changeColor(String s)
    {
        color=s;
    }
}