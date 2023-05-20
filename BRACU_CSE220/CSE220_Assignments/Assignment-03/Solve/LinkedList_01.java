//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-03 : Linked List
package Assignment_03; // Remove This Line or Make a package

public class LinkedList_01 {

    Node head;

    public LinkedList_01(Object[] a) {

        head = new Node(a[0], null); // Create Head Node for LinkList
        Node now = head;
        for (int i = 1; i < a.length; i++) {
            Node Temp = new Node(a[i], null); // Create new Node for LinkList
            now.next = Temp; // Take Previouse Node Refarence
            now = now.next;
        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList_01(Node h) {
        // Set Head
        head = h;
    }

    /* prints the elements in the list */
    public void printList() {
        // Start Printing from Head & End if Null
        Node now = head;
        for (; now.next != null; now = now.next) {
            System.out.print(now.element + ", ");
        }
        System.out.println(now.element + ". " + "\n");
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        // Take a Counter
        int count = 0;
        for (Node now = head; now != null; now = now.next) {
            count++;
        }
        return count;
    }

    // returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        if (idx < 0 || idx >= countNode()) { // Invalid Range
            return null;
        }
        Node now = head;
        for (int i = 0; i < idx; i++) {
            now = now.next;
        }
        return now.element; // Return Element
    }

    /* updates the element of the Node at the given index.
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem) {
        // TO DO
        if (idx < 0 || idx >= countNode()) {
            return null;
        }
        int c = 0;
        for (Node now = head; now != null; now = now.next) {
            if (c == idx) {
                Object Old = now.element;
                now.element = elem;
                return Old;
            }
            c++;
        }
        return null;
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node searchNode(int idx) {
        if (idx < 0 || idx >= countNode()) { // Invalid Range
            return null;
        }
        int count = 0;
        Node now = head;
        for (; now != null; now = now.next) {
            if (count == idx) {
                break;
            }
            count++;
        }
        return now;
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        // TO DO
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid Index");
        } else {
            Node newNode = new Node(elem, null);
            if (idx == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node priv = searchNode(idx - 1);
                newNode.next = priv.next;
                priv.next = newNode;
            }
        }
    }

    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        if (index < 0 || index >= countNode()) {
            return null;
        } else {
            Node removedNode;
            if (index == 0) {
                removedNode = head;
                head = head.next;
            } else {

                Node priv = searchNode(index - 1);
                removedNode = priv.next;
                priv.next = removedNode.next;
            }
            return removedNode.element; // Return Removed Node
        }

    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        // TO DO
        Node reverseNode = new Node(head.element, null);
        for (Node now = head.next; now != null; now = now.next) {
            Node Temp = new Node(now.element, reverseNode);
            reverseNode = Temp;
        }
        return reverseNode; // Return Reverse Node
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft() {
        Node now = head;
        while (now.next != null) {
            now = now.next;
        }
        Node temp = head.next;
        now.next = head;
        head.next = null;
        head = temp;
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight() {
        Node now = head;
        Node tail = null;
        for (; now.next != null; now = now.next) {
            if ((now.next).next == null) {
                tail = now;
            }

        }
        Node temp = head;
        now.next = temp;
        head = now;
        tail.next = null;
    }
}
