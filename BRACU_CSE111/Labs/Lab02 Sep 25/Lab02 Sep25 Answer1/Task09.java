import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0; i<=a.length-1; i+=2) {
                System.out.print(a[i]+",");
        }
        for(i=1; i<=a.length-1; i+=2) {
                System.out.print(a[i]+",");
        }
    }
}
