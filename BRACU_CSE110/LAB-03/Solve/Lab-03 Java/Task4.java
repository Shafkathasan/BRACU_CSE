//Write a java program that reads the radius of a circle and prints its circumference and area.

import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        float r;
        double area, circum;
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Radius");
        r=sc.nextFloat();
        area=3.14*r*r;
        circum=2*3.14*r;
        System.out.println("Area of Circle = " +area);
        System.out.println("\nCircumference of Circle = " +circum);
    }
}

