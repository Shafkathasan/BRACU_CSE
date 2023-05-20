import java.util.Scanner;
public class Pb04
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Quantity of Lines: ");
        int lineL = sc.nextInt();
        System.out.println("Please Enter Quantity of Number: ");
        int numL = sc.nextInt();
        for(int lineC=1; lineC<=lineL; ++lineC)
        {
            for(int numC=1; numC<=numL; ++numC)
            {
                System.out.print(numC);
            }
            System.out.println();
        }
    }
}