import java.util.Scanner;
public class Pb03
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Quantity of Lines: ");
        int lineL = sc.nextInt();
        System.out.println("Please Enter Quantity of Stars: ");
        int starL = sc.nextInt();
        for(int lineC=1; lineC<=lineL; ++lineC)
        {
            for(int starC=1; starC<=starL; ++starC)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}