import java.util.Scanner;
public class Pb19b
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineCount=1; lineCount<=size; ++lineCount)
        {
            for(int spaceC=1; spaceC<=size-lineCount; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int columnCount=1; columnCount<=lineCount; ++columnCount)
            {
                if(columnCount==1 || lineCount==size || columnCount==lineCount)
                {
                    System.out.print(lineCount);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

