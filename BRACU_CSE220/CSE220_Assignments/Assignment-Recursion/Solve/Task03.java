//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package

public class Task03 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        print(a, 0);
    }

    static void print(int[] a, int idx) {
        if (idx < a.length) {
            System.out.print(a[idx]+" ");
            idx++;
            print(a, idx);
        }
    }
}