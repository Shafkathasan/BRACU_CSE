import java.util.Scanner;
public class Task06 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(s.concat("==THE END=="));
        System.out.println(s);
    }
}