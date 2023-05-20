//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05; // Remove This Line or Make a package

public class MyList {

    public NodeD head;

    public void myMethod(int[] a, int[] b) {
        head = new NodeD(a[0] * b[0], null, null);
        NodeD h = head;
        NodeD p;
        for (int i = 0; i < a.length; i++) {
            p = new NodeD(a[i], null, null);
            h.next = p;
            h = h.next;
        }
        h.next = head;
        h = head;
        for (int i = 0; i < b.length; i++) {
            p = new NodeD(b[i] - a[i], null, null);
            h.prev = p;
            h = h.prev;
        }
    }

    /* prints the elements in the list */
    public void printList() {
        // Start Printing from Head & End if Null
        NodeD now = head;
        for (; now.next != head; now = now.next) {
            System.out.print(now.x + ", ");
        }
        System.out.println(now.x + ". ");
    }

    /* prints the elements in the list */
    public void printListR() {
        // Start Printing from Head & End if Null
        NodeD now = head;
        for (; now.prev != null; now = now.prev) {
            System.out.print(now.x + ", ");
        }
        System.out.println(now.x + ". ");
    }
}
