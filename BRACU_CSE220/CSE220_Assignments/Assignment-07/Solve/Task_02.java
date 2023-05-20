//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-07 : Recursion
package Assignment_07; // Remove This Line or Make a package


public class Task_02 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));

    }

    public static int sum(int num) {
        if (num <= 1) {
            return num;
        } else {
            return num + sum(num - 1);
        }

    }
}
