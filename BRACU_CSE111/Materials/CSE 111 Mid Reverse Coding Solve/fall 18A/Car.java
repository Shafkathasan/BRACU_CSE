public class Car {
    private String make = "";
    private String model = "";
    
    public Car()
    {
    }
    public Car(String s)
    {
        make=s;
    }
    public Car(String s, String m)
    {
        make=s;
        model=m;
    }
    
    public void start()
    {
        if(make.equals(""))
        {
            System.out.println("Car is starting");
        }
        else if(!make.equals("") && model.equals(""))
        {
            System.out.println("Car make: " +make+ "is starting");
        }
        else 
        {
            System.out.println("Car make: " +make+ ", model: " +model+ " is starting");
        }
    }
}