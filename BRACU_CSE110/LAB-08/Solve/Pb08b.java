import java.util.Scanner;
public class Pb08b
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        for(int lineCount=1; lineCount<=size; ++lineCount){
            int k=1;
            for(int numberCount=size; numberCount>=1; --numberCount){
                if(numberCount>lineCount){
                System.out.print(" ");}
                else{
                System.out.print(k);
                ++k;}
            }
            System.out.println();
        }
    }
}

