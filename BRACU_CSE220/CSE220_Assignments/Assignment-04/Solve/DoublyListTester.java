//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-04 : DummyHead Doubly Linked List

package Assignment_04; // Remove This Line or Make a package

public class DoublyListTester {

    public static void main(String[] args) {

        System.out.println("\n/////  Test 01  /////");
        Object[] a = {"SAF_1", "SAF_2", "SAF_3", "SAF_4", "SAF_5"};
        DoublyList h1 = new DoublyList(a); // Creates a linked list using the values from the array
        // head will refer to the Node that contains the element from a[0]
        System.out.println("Create a DoublyList of 5 elements");

        System.out.println("\n/////  Test 02  /////"); // Print the elements in the List.
        h1.printList();// This should print: SAF_1, SAF_2, SAF_3, SAF_4, SAF_5.

        System.out.println("\n/////  Test 03  /////"); // Count the number of elements in the List.
        System.out.println("List Size: " + h1.countNode()); // This should print: 5

        System.out.println("\n/////  Test 04  /////"); // Get an element
        System.out.println("Get element: " + h1.get(077 % 5)); // 077 % 5 = 3 // Print: SAF_4

        System.out.println("\n/////  Test 05  /////"); // Set an element
        DoublyList h5 = new DoublyList(a);
        h5.set(077 % 4, 0); // 077 % 4 = 3
        h5.printList(); // This should print: SAF_1, SAF_2, SAF_3, 0, SAF_5.

        System.out.println("\n/////  Test 06  /////"); // Search an element
        // returns the reference of the Node at the given index. For invalid idx return null.
        Node myNode = h1.search(077 % 3); // 077 % 3 = 0
        System.out.println("Searched element: " + myNode.element); // This should print: SAF_4. In case of invalid index This will
        // generate nullPointerException.

        System.out.println("\n/////  Test 07  /////"); // Insert an element in the List in

        DoublyList h7 = new DoublyList(a); // uses the first constructor: LinkedList(Object [] a)
        h7.printList();// This should print: SAF_1, SAF_2, SAF_3, SAF_4, SAF_5.

        System.out.println("Insert element: 100");
        // inserts Node containing the given element at the given index. Check validity of index.
        h7.insert(100, 0);
        h7.printList(); // This should print: 100, SAF_1, SAF_2, SAF_3, SAF_4, SAF_5.

        System.out.println("Insert element: 150");
        h7.insert(150, h7.countNode());
        h7.printList();// This should print: 100, SAF_1, SAF_2, SAF_3, SAF_4, SAF_5, 150.

        System.out.println("Insert element: 75");
        h7.insert(75, 077 % 5); // 077 % 5 = 3
        h7.printList();// This should print: 100, SAF_1, SAF_2, 75, SAF_3, SAF_4, SAF_5, 150.

        System.out.println("\n/////  Test 08  /////"); // Remove an element from the list from

        DoublyList h8 = h7; // uses h7 constructor
        h8.printList(); // This should print: 85, SAF_1, SAF_2, 75, SAF_3, SAF_4, SAF_5, 95.

        /* removes Node at the given index. returns element of the removed node.
         * Check validity of index. return null if index is invalid.K
         */
        System.out.println("Removed element: " + h8.remove(0)); // This should print: Removed element: 10
        h8.printList(); // This should print: SAF_1, SAF_2, 75, SAF_3, SAF_4, SAF_5, 95.
        // h3.backwardprint(); // This should print: 70,60,50,40,30,20.
        System.out.println("Removed element: " + h8.remove(h8.countNode() - 1)); // This should print: Removed element: 50
        h8.printList(); // This should print: SAF_1, SAF_2, 75, SAF_3, SAF_4, SAF_5.
        // h3.backwardprint(); // This should print: 70,60,40,30,20.
        System.out.println("Removed element: " + h8.remove(077 % 4)); // This should print: Removed element: SAF_3
        h8.printList(); // This should print: SAF_1, SAF_2, 75, SAF_4, SAF_5.
        // h3.backwardprint(); // This should print: 60,40,30,20.

        System.out.println("\n/////  Test 09  /////"); // Make a Reversed Copy List
        Node R = h1.reverseList();
        DoublyList h9 = new DoublyList(R); // uses the 2nd constructor: LinkedList(Object [] a)
        h9.printListR(); // This should print: SAF_5, SAF_4, SAF_3, SAF_2, SAF_1.

        System.out.println("\n/////  Test 10  /////");
        DoublyList h10 = h9;
        h10.printListR();
        // This should print: SAF_5, SAF_4, SAF_3, SAF_2, SAF_1.

        System.out.println("Rotates Right by 1 position:");
        h10.rotateRight();
        h10.printListR(); // This should print: SAF_1, SAF_5, SAF_4, SAF_3, SAF_2.

        System.out.println("Rotates Left by 1 position:");
        h10.rotateLeft();
        h10.printListR(); // This should print: SAF_5, SAF_4, SAF_3, SAF_2, SAF_1.

    }

}
