//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-06 : Array & List Stack && Array & List Queue
package Assignment_06; // Remove This Line or Make a package

public class ListQueue implements Queue {
    private Node head, tail;
    private int capacity;
    //int rear = -1 ; //rear = (start+ size)%data.length; = (0+0)
    private int size;

    public ListQueue(int capacity) {
        this.capacity = capacity;
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {

        return (size == 0);
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
        if (size == capacity) throw new QueueOverflowException();
        // create new node and add it to the tail
        Node Temp = new Node(e, null);

        if (size == 0) { // initialize head if size is 0
            //TO DO
            head = Temp;
            tail = head;
        } else { // add the new node to the tail and update tail
            //TO DO
            tail.next = Temp;
            tail = tail.next;
        }

        // don't forget to update size
        //TO DO
        size++;

    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException();
        //TO DO
        Object removal = head.val;
        head = head.next;
        size--;
        return removal;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException();
        //TO DO
        return head.val;
    }

    @Override
    public String toString() {
        //TO DO
        if (size == 0) {
            return "Empty Queue";
        }
        String out = "[ ";
        for (Node now = head; now != null; now = now.next) {
            out = out + now.val + " ";
        }
        out = out + " ]";
        return out;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] array = new Object[size];
        Node temp = head;
        for (int i = 0; i < size; i++) {
            array[i] = temp.val;
            temp = temp.next;
        }
        return array;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;
        for (Node now = head; now != null; now = now.next) {
            if (now.val == e) {
                return count;
            }
            count++;
        }
        return -1;
    }

    public void linearView() {
        String s = "[ ";
        for (Node n = head; n != null; n = n.next) {
            s = s + n.val + " ";
        }
        s = s + "]";
        System.out.println("view: " + s);
    }


}
