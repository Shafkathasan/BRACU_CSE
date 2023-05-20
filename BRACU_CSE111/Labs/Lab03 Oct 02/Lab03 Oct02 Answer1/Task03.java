import java.util.Scanner;
public class Task03 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        for(int i=0; i<=s.length()-1; i++) {
            char ch = s.charAt(i);
            int code = (int)ch;
            System.out.println(ch+": "+code);
        }
    }
}