//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package

public class Task07 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        LinkedList list = new LinkedList(a);

        reverse(list.head);
    }

    static void reverse(Node h) {
        if (h != null) {
            reverse(h.next);
            System.out.println(h.element);
        }
    }
}