//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

public class Task_06 {

    public static int mystery3(int n) {
        if (n < 0) {
            return -mystery3(-n);
        } else if (n < 10) {
            return n;
        } else {
            return mystery3(n / 10 + n % 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(mystery3(6));
        System.out.println(mystery3(17));
        System.out.println(mystery3(259));
        System.out.println(mystery3(-479));
    }
}
