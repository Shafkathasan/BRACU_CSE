//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Queue
package Assignment_Queue; // Remove This Line or Make a package

public class ListQueue implements Queue {
    int size;
    Node front;
    Node rear;


    public ListQueue() {
        size = 0;
        front = null;
        rear = null;
    }

    // The number of items in the queue
    public int size() {
        return size;
    }


    // Returns true if the queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Adds the new item on the back of the queue, throwing the
    // QueueOverflowException if the queue is at maximum capacity. It
    // does not throw an exception for an "unbounded" queue, which
    // dynamically adjusts capacity as needed.
    public void enqueue(Object o) throws QueueOverflowException {
        Node t = new Node(o, null);
        if (size == 0) { // initialize front if size is 0
            front = t;
            rear = t;
        } else {
            rear.next = t;
            rear = rear.next;
        }
        // don't forget to update size
        size++;

    }

    // Removes the item in the front of the queue, throwing the
    // QueueUnderflowException if the queue is empty.
    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException();
        //TO DO
        Object removal = front.val;
        front = front.next;
        size--;
        return removal;
    }

    // Peeks at the item in the front of the queue, throwing
    // QueueUnderflowException if the queue is empty.
    public Object peek() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException();
        //TO DO
        return front.val;
    }


    // Returns a textual representation of items in the queue, in the
    // format "[ x y z ]", where x and z are items in the front and
    // back of the queue respectively.
    public String toString() {
        //TO DO
        if (size == 0) {
            return "Empty Queue";
        }
        String out = "[ ";
        for (Node now = front; now != null; now = now.next) {
            out = out + now.val + " ";
        }
        out = out + " ]";
        return out;
    }

    // Returns an array with items in the queue, with the item in the
// front of the queue in the first slot, and back in the last slot.
    public Object[] toArray() {
        Object a[] = new Object[size];
        Node temp = front;
        for (int i = 0; i < size; i++) {
            a[i] = temp.val;
            temp = temp.next;
        }
        return a;
    }

    // Searches for the given item in the queue, returning the
    // offset from the front of the queue if item is found, or -1
    // otherwise.
    public int search(Object e) {
        //TO DO
        int count = 0;
        for (Node now = front; now != null; now = now.next) {
            if (now.val == e) {
                return count;
            }
            count++;
        }
        return -1;
    }
}
