import java.util.Scanner;
public class Task14
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        int columnCount=1;
        for(int lineCount=1; lineCount<=size; ++lineCount)
        {
            int k=0;
            for(int numCount=1; numCount<=size-lineCount; ++numCount){
                System.out.print(" ");
            }
            for(int numCount=1; numCount<=columnCount; ++numCount)
            {
                if(numCount<=lineCount)
                {
                    k+=1;
                }
                else{k-=1;}
                System.out.print(k);
            }
            System.out.println();
            columnCount+=2;
        }
    }
}

