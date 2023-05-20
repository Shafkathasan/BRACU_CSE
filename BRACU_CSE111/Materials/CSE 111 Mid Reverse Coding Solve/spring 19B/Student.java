public class Student
{
    public int aID;
    public int sID;
    public String name;
    
    public Student(int a, int n, String s)
    {
        aID=a;
        sID=n;
        name=s;
    }
    
    //methods
    public boolean check(Student i)
    {
        boolean b;
        if (i.name==name)
        {
            b=true;
        }
        else
        {
            b=false;
        }
        return b;         
    }
    public void identify()
    {
        System.out.println("ApplicantID: " +aID+ ", StudentID: " +sID+ ", Name: " +name);
    }
    public void setName(String s)
    {
        name=s;
    }
    public void match(Student o)
    {
        if (o.name==name)
        {
            System.out.println(sID+ " is a same person as " +o.sID);
        }
        else
        {
            System.out.println(sID+ " is a different person from " +o.sID);
        }
    }
}
        
        