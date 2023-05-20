//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-03 : Linked List
package Assignment_03; // Remove This Line or Make a package

public class LinkedListTester_01 {

    public static void main(String[] args) {
        //System.out.println("\n/////  Task 01  /////");
        int x = (1077 % 4) + (077 % 6); // (1077 % 4) + (077 % 6) = 4
        int y = (1077 % 5) + (077 % 9); // (1077 % 5) + (077 % 9) = 2
        Object A = (x + 1) + "_SAF_" + (y + 10),
                B = (x + 2) + "_SAF_" + (y + 20),
                C = (x + 3) + "_SAF_" + (y + 30),
                D = (x + 4) + "_SAF_" + (y + 40),
                E = (x + 5) + "_SAF_" + (y + 50),
                F = (x + 6) + "_SAF_" + (y + 60);
        Object[] array = {A, B, C, D, E, F};
        LinkedList_01 c = new LinkedList_01(array);

        System.out.println("\n/////  Task 02  /////"); // Print
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 7_SAF_32, 8_SAF_42, 9_SAF_52, 10_SAF_62.

        System.out.println("\n/////  Task 03  /////"); // Count Elements
        System.out.println(c.countNode()); // This should print Linklist Size: 6

        System.out.println("\n/////  Task 04  /////"); // Get an Element
        System.out.println(c.get(077%5)); // 077%5 = 3 // Print : 8_SAF_42

        System.out.println("\n/////  Task 05  /////"); // Set an Element
        c.set(077%4, 0); // 077%5 = 3; Set-0 in index-3
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 7_SAF_32, 0, 9_SAF_52, 10_SAF_62.

        System.out.println("\n/////  Task 06  /////"); // Search Element
        // returns the reference of the Node at the given index. For invalid idx return null.
        Node findNode = c.searchNode(077%3); // 077%3 = 0
        System.out.println(findNode.element); // This should print: 5_SAF_12
        // In case of invalid index This will generate nullPointerException.

        System.out.println("\n/////  Task 07  /////"); // Insert an Element
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 7_SAF_32, 0, 9_SAF_52, 10_SAF_62.
        c.insert(0, 0); // Insert-0 in Index-0
        c.printList();
        // This should print: 0, 5_SAF_12, 6_SAF_22, 7_SAF_32, 0, 9_SAF_52, 10_SAF_62.
        c.insert(8, c.countNode()); // Insert-8 in Last Postion
        c.printList();
        // This should print: 0, 5_SAF_12, 6_SAF_22, 7_SAF_32, 0, 8, 9_SAF_52, 10_SAF_62.
        c.insert(8, 077%5); // 077%5 = 3 // // Insert-8 in Index-3
        c.printList();
        // This should print: 0, 5_SAF_12, 6_SAF_22, 8, 7_SAF_32, 0, 8, 9_SAF_52, 10_SAF_62.

        System.out.println("\n/////  Task 08  /////"); // Remove an Element
        c.printList();
        // This should print: 0, 5_SAF_12, 6_SAF_22, 8, 7_SAF_32, 0, 8, 9_SAF_52, 10_SAF_62.
        c.remove(0); // Remove form Index-0
        c.printList();
        // This should print:
        c.remove(c.countNode()-1); // Remove form Last Postion
        c.printList();
        // This should print:
        c.remove(077%4); // 077%4 = 3 // Remove from Index-3
        c.printList();
        // This should print:

        System.out.println("\n/////  Task 09  /////"); // Make a Reversed Copy
        // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
        Node revH = c.reverseList(); // Head node reference of the reversed list
        LinkedList_01 rh = new LinkedList_01(revH); // uses the second constructor: LinkedList(Node h)
        rh.printList();
        // This should print: 10_SAF_62, 9_SAF_52, 0, 8, 6_SAF_22, 5_SAF_12.

        System.out.println("\n/////  Task 10  /////"); // Rotate
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52, 10_SAF_62.

        // Rotates the list to the right by 1 position.
        c.rotateRight();
        c.printList();
        // This should print: 10_SAF_62, 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52.

        // Rotates the list to the left by 1 position.
        c.rotateLeft();
        c.printList();
        // This should print: 5_SAF_12, 6_SAF_22, 8, 0, 9_SAF_52, 10_SAF_62.
    }
}
