import java.util.Scanner;
public class Task02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Line Number:");
        int line = sc.nextInt();
        System.out.println("Please Enter Number:");
        int number = sc.nextInt();
        for(int lineC=1; lineC<=line; ++lineC) {
            for(int numberC=1; numberC<=number; ++numberC){
                System.out.print(numberC);
            }
            System.out.println();
        }
    }
}