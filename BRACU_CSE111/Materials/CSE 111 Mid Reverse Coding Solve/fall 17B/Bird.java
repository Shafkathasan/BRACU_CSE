public class Bird{
    
    public String size="";
    public String color="";
    
    public Bird()
    {
    }
    public Bird(String s)
    {
        size=s;
    }
    public Bird(String s, String j)
    {
        size=s;
        color=j;
    }
    public void fly()
    {
        if(size.equals(""))
        {
            System.out.println("Bird*is*flying");
        }
        else if (!size.equals("") && color.equals(""))
        {
            System.out.println(size+"*bird*is*flying");
        }
        else 
        {
            System.out.println(size+"*"+color+"*bird*is*flying");
        }
    }




}


