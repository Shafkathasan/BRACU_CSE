//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Value");
        int n = sc.nextInt();
        System.out.println("Binary output of " + n + " is " + toBinary(n));
    }

    public static int toBinary(int i) {

        if (i == 0) {
            return 0;
        } else {
            i = i % 2 + 10 * (toBinary(i / 2));
        }
        return i;
    }
}