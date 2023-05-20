import java.util.Scanner;
public class Pb09
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        int columnC=1;
        for(int lineC=1; lineC<=size; ++lineC)
        {
            for(int spaceC=1; spaceC<=size-lineC; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int starC=1; starC<=columnC; ++starC)
            {
                System.out.print("*");
            }
            System.out.println();
            columnC+=2;
        }
    }
}