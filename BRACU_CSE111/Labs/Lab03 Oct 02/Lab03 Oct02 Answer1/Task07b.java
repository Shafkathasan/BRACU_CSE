import java.util.Scanner;
public class Task07b {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(s);
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s);
    }
}