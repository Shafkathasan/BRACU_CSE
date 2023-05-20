public class Batsman
{
    public String name= "New Batsman";
    public int run;
    public int ball;
    
    //constructors
    public Batsman(int r , int b)
    {
        run=r;
        ball=b;
    }
    public Batsman(String n , int r , int b)
    {
        name=n;
        run=r;
        ball=b;
    }
    
    
    //methods
    public void setName(String s)
    {
        name=s;
    }
    public void printCareerStatistics()
    {
        System.out.println("Name: "+name);
        System.out.println("Runs Scored: " +run+ ", Balls Faced: " +ball);
    }
    public double battingStrikeRate()
    {   
        
        double rate= (double)run/ball*100;
        return rate;
    }
}