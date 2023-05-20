//Write a java program that reads two integers, subtracts the smaller number from the larger one, and prints the result
import java.util.Scanner;
public class Task8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        int x = sc.nextInt();
        System.out.println("Please Enter 2nd integer Number");
        int y= sc.nextInt();
        int ans;
        if ( x > y )
            ans=x-y;
        else 
            ans=y-x;       
        System.out.println(ans);
        
    }
}