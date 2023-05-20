import java.util.Scanner;
public class Pb07
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        int spaceL=size-1;
        for(int lineC=1; lineC<=size; ++lineC)
        {
            for(int spaceC=1; spaceC<=spaceL; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int starC=1; starC<=lineC; ++starC)
            {
                System.out.print("*");
            }
            --spaceL;
            System.out.println();
        }
    }
}