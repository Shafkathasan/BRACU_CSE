//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }

}