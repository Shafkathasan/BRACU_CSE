import java.util.Scanner;
public class Task09
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int count=1,sum=0, number;
        System.out.println("Plase Enter Value:");
        number=sc.nextInt();
        while(count<number)
        {
            if(number%count==0)
            {
                sum+=count;
            }
            ++count;
        }
        if(number==sum){
            System.out.println(number+" is a Perfect Number");
        }
        else{
            System.out.println(number+" is not a Perfect Number");
        }
    }
}
