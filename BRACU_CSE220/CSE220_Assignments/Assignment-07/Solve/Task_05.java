//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package

public class Task_05 {
    /* Function to calculate x raised to the power y */
    static int power(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        } else {
            return x * power(x, y / 2) * power(x, y / 2);
        }
    }

    /* Program to test function power */
    public static void main(String[] args) {
        int x = (1077 % 5) + 2; // (1077 % 5) + 2  = 4
        int y = (077 % 3) + 1; // (077 % 3) + 1 = 1
        System.out.printf(x + "^" + y + " = %d", power(x, y));
    }
}
