import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int i, evenSum=0, oddSum=0, sum=0;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=0; i<=a.length-1; ++i) {
            if(a[i]%2==0){
                evenSum+=a[i];
            }
            if(a[i]%2!=0){
                oddSum+=a[i];
            }
            if(a[i]%5==0){
                sum+=a[i];
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
        System.out.println(sum);
    }
}
