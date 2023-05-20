import java.util.Scanner;
public class Pb08
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineC=1; lineC<=size; ++lineC)
        {
            for(int spaceC=1; spaceC<=size-lineC; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int starC=1; starC<=lineC; ++starC)
            {
                System.out.print(starC);
            }
            System.out.println();
        }
    }
}

