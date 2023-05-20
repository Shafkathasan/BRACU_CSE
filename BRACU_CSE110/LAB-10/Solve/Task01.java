import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Please Enter Number:");
        a[0]=sc.nextInt();
        int i, largest;
        largest=a[0];
        for(i=1; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
            if(a[i]>largest) {
                largest=a[i];
            }
        }
        System.out.println(largest);
    }
}
