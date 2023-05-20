//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-03 : Linked List
package Assignment_03; // Remove This Line or Make a package

public class LinkedListTester_02 {
    public static void main(String[] args) {
        int x = (077 % 25) + (077 % 30) +2; // (077 % 25) + (077 % 30) +2 = 18
        int[] arr = {x+21, x+13, x+23, x+21, x+13, x+29};
        LinkedList_02 c = new LinkedList_02(arr);
        c.printList();
        c.sortList();
        c.printList();
        c.RemoveDuplicates();
        c.printList();
    }
}
