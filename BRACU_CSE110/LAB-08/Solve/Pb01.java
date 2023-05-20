import java.util.Scanner;
public class Pb01
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Number:");
        int number = sc.nextInt();
        for (int numC=1; numC<=number; ++numC)
        {
            System.out.print(numC);
        }
        System.out.println();
    }
}
