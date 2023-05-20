public class Player{
    private String name = "Default";
    private int number = 0;  
    private String team = "Default"; 
    
    public Player()
    {
    }
    public Player(String s)
    {
        name=s;
    }
    public Player(String s, int n)
    {
        name=s;
        number=n;
    }
    public Player(String s, int n, String i)
    {
        name=s;
        number=n;
        team=i;
    }
    
    
    public void setName(String s)
    {
        name=s;
    }
    public void setNumber(int i)
    {
        number=i;
    }
    public void setTeam(String s)
    {
        team=s;
    }
    public void detail()
    {
        System.out.println(name+ "*is*no." +number+ "*for*" +team);
    }
}
