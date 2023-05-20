//Write a java program that reads one floating from the user, and prints it back to show which integer was entered by the user.

import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        float x = sc.nextInt();
        System.out.println("Please Enter 2nd integer Number");
        float y= sc.nextInt();
        float sum= x + y;
        
        System.out.println("The sum is " +sum);
    }
}
