//Write a java program that reads one integer from the user, and prints it back to show which integer was entered by the user.

import java.util.Scanner;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Integer Number");
        int number = sc.nextInt();
        
        System.out.println(number);
    }
}