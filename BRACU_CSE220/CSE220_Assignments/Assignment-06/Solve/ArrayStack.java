//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-06 : Array & List Stack && Array & List Queue
package Assignment_06; // Remove This Line or Make a package

public class ArrayStack implements Stack {
    int size;
    Object[] data;
    private static final int DEFINED_INIT_SIZE = 5;

    public ArrayStack() {
        size = 0;
        data = new Object[DEFINED_INIT_SIZE];
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
    public void push(Object e) throws StackOverflowException {
        //TO DO
        if (data.length == size) {
            throw new StackOverflowException();
        } else {
            data[size] = e;
            size++;
        }
    }

    @Override
    public Object pop() throws StackUnderflowException {
        //TO DO
        if (size == 0) {
            throw new StackUnderflowException();
        } else {
            Object temp = data[size - 1];
            data[size - 1] = null;
            size--;
            return temp;
        }
    }

    @Override
    public Object peek() throws StackUnderflowException {
        //TO DO
        if (size == 0) {
            throw new StackUnderflowException();
        } else {

            return data[size - 1];
        }
    }

    @Override
    public String toString() {
        //TO DO
        if (size == 0) {
            return "Empty Stack";
        }
        String p = "[ ";
        for (int i = size - 1; i >= 0; i--) {
            p = p + data[i] + " ";
        }
        p = p  + "]";
        return p;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        int k = 0;
        Object[] a = new Object[size];
        for (int i = size - 1; i >= 0; i--) {
            a[k++] = data[i];
        }
        return a;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int c = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (data[i] == e) {
                return c;
            }
            c++;
        }
        return -1;
    }
}