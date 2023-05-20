//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Queue
package Assignment_Queue;

public interface Queue {

    // The number of items in the queue
    int size();

    // Returns true if the queue is empty
    boolean isEmpty();

    // Adds the new item on the back of the queue, throwing the
    // QueueOverflowException if the queue is at maximum capacity. It
    // does not throw an exception for an "unbounded" queue, which
    // dynamically adjusts capacity as needed.
    void enqueue(Object o) throws QueueOverflowException;

    // Removes the item in the front of the queue, throwing the
    // QueueUnderflowException if the queue is empty.
    Object dequeue() throws QueueUnderflowException;

    // Peeks at the item in the front of the queue, throwing
    // QueueUnderflowException if the queue is empty.
    Object peek() throws QueueUnderflowException;

    // Returns a textual representation of items in the queue, in the
    // format "[ x y z ]", where x and z are items in the front and
    // back of the queue respectively.
    String toString();

    // Returns an array with items in the queue, with the item in the
    // front of the queue in the first slot, and back in the last slot.
    Object[] toArray();

    // Searches for the given item in the queue, returning the
    // offset from the front of the queue if item is found, or -1
    // otherwise.
    int search(Object o);
}
