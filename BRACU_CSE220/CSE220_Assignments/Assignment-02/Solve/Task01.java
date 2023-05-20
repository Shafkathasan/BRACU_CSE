//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-02 : Circular Array
package Assignment_02; // Remove This Line or Make a package

import java.util.Scanner;

public class Task01 {

    private static int index;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int size = 10;
        System.out.println("Enter Stating Index");
        int start = sc.nextInt();
        int k = (start + size - 1) % arr.length;
        for (int i = 0; i < size; i++) {
            index = k;
            visit(arr[k]);
            k--;
            if (k == -1) {
                k = arr.length - 1;
            }
        }

    }

    private static void visit(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
