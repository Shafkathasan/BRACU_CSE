//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Recursion
package Assignment_Recursion; // Remove This Line or Make a package


public class LinkedList {
    public Node head;

    public LinkedList(int[] a) {
        head = new Node(a[0], null);
        Node tail = head;
        for (int i = 1; i < a.length; i++) {
            Node x = new Node(a[i], null);
            tail.next = x;
            tail = tail.next;
        }
    }


}