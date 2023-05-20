//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05; // Remove This Line or Make a package

public class Task_03 {

    public static void main(String[] args) {

        int X = 1077 % 37; // 1077 % 37 = 4
        LinkedList ll = new LinkedList();

        ll.insert(X + 100);
        ll.printList();
        // This should print: 104.

        ll.insert(X + 70);
        ll.printList();
        // This should print: 74, 104.

        ll.remove();
        ll.printList();
        // This should print: 74.

        ll.insert(X + 58);
        ll.printList();
        // This should print: 62, 74.

        ll.insert(X + 79);
        ll.printList();
        // This should print: 83, 62, 74.

        ll.remove();
        ll.printList();
        // This should print: 83, 62.

        ll.insert(X + 21);
        ll.printList();
        // This should print: 25, 83, 62.

        ll.insert(X + 11);
        ll.printList();
        // This should print: 15, 25, 83, 62.

    }
}
