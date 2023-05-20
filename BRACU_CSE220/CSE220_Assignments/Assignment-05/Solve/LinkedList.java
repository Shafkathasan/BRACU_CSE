//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05; // Remove This Line or Make a package

public class LinkedList {

    Node head;

    public LinkedList() {
        head = null;
    }

    void insert(int val) {
        Node node = new Node(val, null);
        node.next = head;
        head = node;
    }

    int remove() {
        int val = 0;
        if (head != null) {
            Node prev = null;
            Node cur = head;
            while (cur.next != null) {
                prev = cur;
                cur = cur.next;
            }
            val = cur.num;
            if (cur == head) {
                head = null;
            } else {
                prev.next = null;
            }
        }
        return val;
    }

    /* prints the elements in the list */
    public void printList() {
        // Start Printing from Head & End if Null
        Node now = head;
        for (; now.next != null; now = now.next) {
            System.out.print(now.num + ", ");
        }
        System.out.println(now.num + ". ");
    }
}
