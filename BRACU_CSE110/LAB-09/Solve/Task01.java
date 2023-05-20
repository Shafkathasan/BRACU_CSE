import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        int i, sum=0;
        for(i=0; i<=numbers.length-1; ++i) {
            System.out.println("Please Enter Number:");
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println(sum);
        for(i=0; i<=numbers.length-1; ++i) {
            System.out.println(numbers[i]);
        }
    }
}
