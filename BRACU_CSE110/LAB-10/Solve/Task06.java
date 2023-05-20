import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i, j, n, temp;
        System.out.print("Please Enter Quantity: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (i = 0; i < n; ++i) {
            System.out.print("Please Enter Number: ");
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; ++i) {
            for (j = i + 1; j < n; ++j) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        if(n%2==0) {
            double avg= (double)(a[n/2]+a[(n/2-1)])/2;
            System.out.println("Median : "+avg);
        } else {
            System.out.println("Median : "+a[n/2]);
        }
    }
}