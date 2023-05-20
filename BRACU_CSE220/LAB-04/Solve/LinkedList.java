//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Lab 04 : Linked List
package Lab04; // Remove This Line or Make a package

public class LinkedList {

    public Node head;

    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object[] a) {

        head = new Node(a[0], null);
        Node now = head; // Create Head for LinkList
        for (int i = 1; i < a.length; i++) {
            Node Temp = new Node(a[i], null);
            now.next = Temp; // Take Previouse Node Refarence
            now = now.next;
        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h) {
        // Set Head
        head = h;
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

    /* prints the elements in the list */
    public void printList() {
        // Start Printing from Head & End if Null
        Node now = head;
        for (; now.next != null; now = now.next) {
            System.out.print(now.element + ", ");
        }
        System.out.println(now.element + ". ");
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx) {
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

    /* returns the index of the Node containing the given element.
     * if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem) {
        // TO DO
        int i = 0; // Index Counter
        for (Node now = head; now != null; now = now.next) {
            if (now.element == elem) {
                return i; // Return Index
            }
            i++;
        }
        return -1; // Not Found
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem) {
        // TO DO
        for (Node now = head; now != null; now = now.next) {
            if (now.element == elem) {
                return true;
            }
        }
        return false; // Not Found
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList() {
        // Take a Copy of Head & Tail
        Node copyHead = new Node(null, null);
        Node copyTail = new Node(null, null);
        for (Node now = head; now != null; now = now.next) {
            if (copyHead.element == null) {
                copyHead.element = now.element;
                copyHead.next = copyTail;
                copyTail = copyHead;
            } else {
                copyTail.next = new Node(now.element, null);
                copyTail = copyTail.next;
            }
        }
        return copyHead;
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
                Node priv = nodeAt(idx - 1);
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

                Node priv = nodeAt(index - 1);
                removedNode = priv.next;
                priv.next = removedNode.next;
            }
            return removedNode.element; // Return Removed Node
        }

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
        for ( ; now.next != null; now = now.next) {
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
