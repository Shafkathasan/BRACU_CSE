import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int count=1,divCount=0, number;
        System.out.println("Plase Enter Value:");
        number=sc.nextInt();
        while(count<=number)
        {
            if(number%count==0)
            {
                ++divCount;
            }
            ++count;
        }
        if(divCount==2){
            System.out.println(number+" is a Prime Number");
        }
        else{
            System.out.println(number+" is not a Prime Number");
        }
    }
}
