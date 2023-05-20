import java.util.Scanner;
public class Pb06
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineC=1; lineC<=size; ++lineC)
        {
            for(int numC=1; numC<=lineC; ++numC)
            {
                    System.out.print(numC);
            }
            System.out.println();
        }
    }
}

