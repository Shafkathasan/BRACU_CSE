//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Queue
package Assignment_Queue; // Remove This Line or Make a package

public class ArrayQueue implements Queue { // Queue with Circular Array

    Object[] data;
    int front;
    int size;

    public ArrayQueue() {
        data = new Object[5];
        size = 0;
        front = 0;
    }

    @Override
    public int size() {
        //TO DO
        return size;
    }

    @Override
    public boolean isEmpty() {
        //TO DO
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException { // Insert
        if (data.length == size) {
            throw new QueueOverflowException();
        }
        int newRear = (front + size) % data.length;
        data[newRear] = e;
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException { // Remove
        //TO DO
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        Object removal = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return removal;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        //TO DO
        if (size == 0) {
            throw new QueueUnderflowException();
        }
        return data[front];
    }

    @Override
    public String toString() {
        //TO DO
        if (size == 0) {
            return "Empty Queue";
        }
        String out = "[ ";
        int k = front;
        for (int i = 0; i < size; i++) {
            out = out + data[k] + " ";
            k = (k + 1) % data.length;
        }
        out = out + " ]";
        return out;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] array = new Object[size];
        int k = front;
        for (int i = 0; i < size; i++) {
            array[i] = data[k];
            k = (k + 1) % data.length;
        }
        return array;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == e) {
                return count;
            }
            count++;
        }
        return -1;
    }

}
