import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i, j, temp;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0; i<=a.length-1; ++i) {
            for(j=i+1; j<=a.length-1; ++j) {
                if(a[i]<a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(i=0; i<=a.length-1; ++i) {
            System.out.print(a[i]+",");
        }
        System.out.println();
    }
}
