import java.util.Scanner;
public class Task01 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Number:");
        int number = sc.nextInt();
        for(int numberC=1; numberC<=number; ++numberC){
            System.out.print(numberC);
        }
    }
}