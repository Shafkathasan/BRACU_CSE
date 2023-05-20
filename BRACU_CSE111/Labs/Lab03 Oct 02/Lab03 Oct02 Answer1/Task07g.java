import java.util.Scanner;
public class Task07g {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(s);
        System.out.println(s.indexOf(s1));
        System.out.println(s);
    }
}