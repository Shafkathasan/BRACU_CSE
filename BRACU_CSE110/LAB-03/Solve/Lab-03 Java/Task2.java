//Write a java program that reads two integers from the user, and prints their sum, product and difference.

import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        int x = sc.nextInt();
        System.out.println("Please Enter 2nd integer Number");
        int y= sc.nextInt();
        int sum= x + y;
        
        System.out.println("The sum is " +sum);
    }
}