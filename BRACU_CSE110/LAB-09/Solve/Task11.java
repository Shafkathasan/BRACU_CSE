import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int i, j;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
            for(j=0; j<i; ++j) {
                if(a[i]==a[j]) {
                    System.out.println("Duplicate");
                    --i;
                }
            }  
        }
        for(i=0; i<=a.length-1; ++i) {
            System.out.println(a[i]);
        }
    }
}
