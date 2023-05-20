import java.util.Scanner;
public class Task23
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineC=1; lineC<=size; ++lineC)
        {
            for(int starC=size; starC>=1; --starC)
            {
                if(starC==1 || lineC==size || starC==lineC){
                System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

