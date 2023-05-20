import java.util.Scanner;
public class PbM04 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input a String");
        String s = sc.nextLine();
        String input = new String(s);
        String output = new String();
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }
        
        System.out.println(output);
    }
}