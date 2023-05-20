import java.util.Scanner;
public class Pb16
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineCount=1; lineCount<=size; ++lineCount)
        {
            for(int starCount=1; starCount<=size; ++starCount)
            {
                if(starCount==1 || lineCount==size || lineCount==starCount)
                {
                    System.out.print("*");
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
}

