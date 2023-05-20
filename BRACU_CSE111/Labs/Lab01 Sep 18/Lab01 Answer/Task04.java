import java.util.Scanner;
public class Task04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Height:");
        int size = sc.nextInt();
        int space=size;
        for(int lineC=1; lineC<=size; ++lineC){
            for(int spaceC=1; spaceC<=space-1; ++spaceC)
            {
                System.out.print(" ");
            }
            for(int numberC=1; numberC<=lineC; ++numberC) {
                System.out.print(numberC);
            }
            --space;
            System.out.println();
        }
    }
}