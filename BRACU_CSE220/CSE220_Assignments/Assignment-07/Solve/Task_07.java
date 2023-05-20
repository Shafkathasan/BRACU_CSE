//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

public class Task_07 {
    public static void mystery4(String s) {
        if (s.length() > 0) {
            System.out.print(s.charAt(0));
            if (s.length() % 2 == 0) {
                mystery4(s.substring(0, s.length() - 1));
            } else {
                System.out.println("**");
                System.out.println("#" + s.length() + s.length() + "*");
                mystery4(s.substring(1, s.length()));
                System.out.print(s.charAt(s.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        mystery4("");
        mystery4("a");
        mystery4("ab");
        mystery4("bc");
        mystery4("abcd");
    }
}
