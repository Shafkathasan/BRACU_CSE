import java.util.Scanner;
public class PbM01 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        for(int i=0; i<=s.length()-1; i++) {
            for(int j=0; j<=i; j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        System.out.println();
    }
}