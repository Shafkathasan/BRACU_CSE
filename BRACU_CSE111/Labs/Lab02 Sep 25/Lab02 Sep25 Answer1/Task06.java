import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i, num;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            num=sc.nextInt();
            a[num]=a[num]+1;
        }
        for(i=0; i<=a.length-1; ++i) {
            System.out.println(i+" was found "+a[i]+" times");
        }
    }
}
