//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-06 : Array & List Stack && Array & List Queue
package Assignment_06; // Remove This Line or Make a package

public class ListStack implements Stack {
    int size;
    Node top;


    public ListStack() {
        size = 0;
        top = null;
    }

    @Override
    public int size() {
        //TO DO
        int count = 0;
        for (Node temp = top; temp != null; temp = temp.next) {
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        //TO DO
        if (top == null) {
            return true;
        }
        return false;
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        //TO DO
        Node newTop = new Node(e, null);
        newTop.next = top;
        top = newTop;
        size++;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        //TO DO
        if (top == null) {
            throw new StackUnderflowException();
        }
        Object T = top.val;
        top = top.next;
        size--;
        return T;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        //TO DO
        if (top == null) {
            throw new StackUnderflowException();
        }
        return top.val;
    }

    public String toString() {
        //TO DO
        if (top == null) {
            return "Empty Stack";
        }
        String t = "[ ";
        Node now = top;
        for (; now.next != null; now = now.next) {
            t = t + now.val + " ";
        }
        t = t + now.val + " ]";

        return t;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] a = new Object[size];
        int i = 0;
        for (Node now = top; now != null; now = now.next) {
            a[i++] = now.val;
        }
        return a;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;
        for (Node now = top; now != null; now = now.next) {
            if (now.val == e) {
                return count;
            }
            count++;
        }
        return -1;
    }


}