import java.util.Scanner;
public class Task08
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
                System.out.println(count);
                ++divCount;
            }
            ++count;
        }
        System.out.println("Total:"+divCount+"-divisors");
    }
}
