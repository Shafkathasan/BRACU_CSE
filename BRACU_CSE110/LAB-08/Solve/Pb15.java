import java.util.Scanner;
public class Pb15
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int heigth = sc.nextInt();
        System.out.println("Please Enter Triangle Width: ");
        int width = sc.nextInt();
        for(int i=1; i<=heigth; ++i)
        {
            for(int j=1; j<=width; ++j)
            {
                if(i==1 || j==1 || i==heigth || j==width){
                    System.out.print(j);}
                else{
                System.out.print(" ");}
            }
            System.out.println();
        }
    }
}

