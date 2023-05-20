import java.util.Scanner;
public class Pb02
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Quantity of Stars: ");
        int starL = sc.nextInt();
        for (int starC=1; starC<=starL; ++starC)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
