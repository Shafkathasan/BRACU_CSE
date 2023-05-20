//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-04 : DummyHead Doubly Linked List

package Assignment_04; // Remove This Line or Make a package

public class DoublyList {

    public Node head;

    /* First Constructor:
     * Creates a linked
     * list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object[] a) {
        head = new Node("Dummy", null, null);
        Node now = head;
        for (int i = 0; i < a.length; i++) {
            Node temp = new Node(a[i], null, null);
            now.next = temp;
            temp.prev = now;
            now = now.next;
        }
        now.next = head; // Making it circular
        head.prev = now;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h) {

        head = h;
    }

    /* prints the elements in the list */
    public void printList() {
        Node now = head;
        for (now = now.next; now.next != head; now = now.next) {
            System.out.print(now.element + ", ");
        }
        System.out.println(now.element + ".");
    }

    /* prints the Revers elements in the list */
    public void printListR() {
        Node now = head;
        for (; now.next != null; now = now.next) {
            System.out.print(now.element + ", ");
        }
        System.out.println(now.element + ".");
    }

    /* Counts the number of Nodes in the list */
    public int countNode() {
        Node temp = head;
        int count = 0;
        while (temp.next != head) {
            count++;
            temp = temp.next;
        }
        return count; // Return Node Size
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Object get(int idx) {
        Node temp = head.next;
        int count = 0;
        while (temp != head) {
            if (count == idx) {
                break;
            }
            count++;
            temp = temp.next;
        }

        return temp.element; // please remove this line!
    }


    // set an element at the given index.
    public void set(int idx, Object elem) {
        Node temp = head.next;
        int count = 0;
        while (temp != head) {
            if (count == idx) {
                temp.element = elem;
                break;
            }
            count++;
            temp = temp.next;
        }
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node search(int idx) {
        Node temp = head.next;
        int count = 0;
        while (temp != head) {
            if (count == idx) {
                break;
            }
            count++;
            temp = temp.next;
        }

        return temp; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx) {
        if (idx < 0 || idx > countNode()) {
            System.out.println("Invalid Index");
        } else {
            Node n = new Node(elem, null, null);
            Node temp = head;
            for (int i = 0; i <= idx; i++) {
                temp = temp.next;
            }
            Node a = temp.prev;
            Node b = temp;
            a.next = n;
            n.next = b;
            n.prev = a;
            b.prev = n;
        }
    }

    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index) {
        Node temp = head, now;
        Node x, y;
        if (index < 0 || index > countNode()) {
            return null;
        } else {
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            now = temp;
            x = temp.prev;
            y = temp.next;
            x.next = y;
            y.prev = x;
        }
        return now.element;
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList() {
        Node reverseNode = new Node(head.next.element, null, null);
        for (Node now = head.next.next; now != head; now = now.next) {
            Node Temp = new Node(now.element, reverseNode, null);
            Temp.prev = reverseNode;
            reverseNode = Temp;
        }
        return reverseNode;
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
}
