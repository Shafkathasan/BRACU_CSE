//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

public class Task_04 {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int X = (1077 % 3) + (077 % 4) + 2; // {(1077 % 3) + (077 % 4) + 2} = 5
        int num = X;

        System.out.println("Factorial of " + num + " is " + factorial(num));
    }

}
