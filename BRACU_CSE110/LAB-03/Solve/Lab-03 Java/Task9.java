//Write a java program that reads an integer, and prints “The number is even” or “The number is odd”, depending on whether the number is even or odd. (Hint: use the modulus operator) 

import java.util.Scanner;
public class Task9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter 1st Integer Number");
        int num = sc.nextInt();
        if ( num%2==0 )          
            System.out.println( "The number is even");
        else {
            System.out.println("The number is odd");
        }
        
    }
}