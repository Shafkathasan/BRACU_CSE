//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

public class Task_03_fibonacci { // Task-03
    static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int X = (1077 % 3) + (077 % 4) + 2; // {(1077 % 3) + (077 % 4) + 2} = 5
        int n = X;
        System.out.println(fib(n));
    }
}
