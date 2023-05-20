import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int i;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        System.out.println("Please Enter Number:");
        int number=sc.nextInt();
        int flag=1;
        for(i=0; i<=a.length-1; ++i) {
            if(number==a[i]){
                flag=0;
            }
        }
        if(flag==0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
