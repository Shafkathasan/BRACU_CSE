//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05; // Remove This Line or Make a package

public class Task_01 {

    public static void main(String[] args) {
        int x = 1077 % 40; // 1077 % 40 = 37
        int[] a1 = {x, x + 10, x - 100, x + 20};
        printFullArray(a1);
        // This should print: 37, 47, -63, 57.

        int[] a2 = {x + 20, x + 30, x + 60, x + 40};
        printFullArray(a2);
        // This should print: 57, 67, 97, 77.

        int[] newA = appendArrays(a1, a2);
        printFullArray(newA);
        // This should print: 37, 47, -63, 57, 57, 67, 97, 77.
    }

    public static int[] appendArrays(int[] array1, int[] array2) {
        int[] T = new int[array1.length + array2.length]; // Total Length of Two Array
        int c = 0;
        for (int i = 0; i < T.length; i++) {
            if (i < array1.length) {
                T[i] = array1[i];
            } else {
                T[i] = array2[c++];
            }
        }
        return T;
    }

    public static void printFullArray(int[] arr) {
        int i = 0;
        for (; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[i] + ".\n");
    }
}
