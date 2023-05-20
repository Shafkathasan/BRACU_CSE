import java.util.Scanner;
public class Pb07b
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineCount=1; lineCount<=size; ++lineCount)
        {
            for(int starCount=size; starCount>=1; --starCount)
            {
                if(starCount>lineCount){
                System.out.print(" ");
                }
                else{
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

