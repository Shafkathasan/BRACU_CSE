import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int i;
        for(i=0; i<=numbers.length-1; ++i) {
            System.out.println("Please Enter Number:");
            numbers[i]=sc.nextInt();
        }
        System.out.println("Please Enter Index Number");
        int location = sc.nextInt();
        System.out.println(numbers[location]);
    }
}
