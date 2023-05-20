import java.util.Scanner;
public class Task07 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i, j, temp;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0; i<=a.length-1; ++i) {
            for(j=i+1; j<=a.length-1; ++j) {
                if(a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0; i<=a.length-1; i=i+2) {
                System.out.print(a[i]+",");
        }
        for(i=1; i<=a.length-1; i=i+2) {
                System.out.print(a[i]+",");
        }
    }
}
