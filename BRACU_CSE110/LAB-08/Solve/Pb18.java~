import java.util.Scanner;
public class Pb18
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineC=1; lineC<=size; ++lineC)
        {
            int spaceC=1;
            for(; spaceC<=size-lineC; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int starCount=spaceC; starCount<=size; ++starCount)
            {
                if(starCount==size || lineC==size || starCount==spaceC){
                    System.out.print("*");}
                else{
                    System.out.print(" ");}
            }
            System.out.println();
        }
    }
}

