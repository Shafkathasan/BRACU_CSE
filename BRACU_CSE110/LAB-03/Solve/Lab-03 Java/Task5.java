//Write a java program that reads two integers from the user and prints “first” if the first number is greater than the second number

import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        int x = sc.nextInt();
        System.out.println("Please Enter 2nd integer Number");
        int y= sc.nextInt();
        if ( x > y )
            System.out.println( "first" );
    }
}
