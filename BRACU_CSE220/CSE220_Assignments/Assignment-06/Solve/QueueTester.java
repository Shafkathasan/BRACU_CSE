//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-06 : Array & List Stack && Array & List Queue
package Assignment_06; // Remove This Line or Make a package

public class QueueTester {
    public static void main(String[] args) throws QueueOverflowException, QueueUnderflowException {
        
        System.out.println("---------Array Queue----------");
        Queue q = new ArrayQueue(6);
        
        q.enqueue('B');
        q.enqueue('R');
        q.enqueue('A');
        q.enqueue('C');
        q.enqueue('U');
        
        ((ArrayQueue) q ).linearView();
        System.out.println("size: "+ q.size());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ArrayQueue) q ).linearView();
        
        q.enqueue("B");
        q.enqueue("A");
        q.enqueue("N");
//        q.enqueue("G");  // this line will cause queue overflow
        ((ArrayQueue) q ).linearView();
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ArrayQueue) q ).linearView();
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ArrayQueue) q ).linearView();
        
        // the following line will cause Queue Underflow
//        System.out.println("peek: " + q.peek());
//        System.out.println("dequeue: "+ q.dequeue());
        System.out.println("-------Array Queue End-----------\n\n\n");
        
        System.out.println("---------List Queue----------");
        q = new ListQueue(6);
        
        q.enqueue('B');
        q.enqueue('R');
        q.enqueue('A');
        q.enqueue('C');
        q.enqueue('U');
        
        ((ListQueue) q ).linearView();
        System.out.println("size: "+ q.size());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ListQueue) q ).linearView();
        
        q.enqueue("B");
        q.enqueue("A");
        q.enqueue("N");
//        q.enqueue("G");  // this line will cause queue overflow
        ((ListQueue) q ).linearView();
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ListQueue) q ).linearView();
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        System.out.println("peek: " + q.peek());
        System.out.println("deque: "+ q.dequeue());
        
        ((ListQueue) q ).linearView();
        
        // the following line will cause Queue Underflow
//        System.out.println("peek: " + q.peek());
//        System.out.println("dequeue: "+ q.dequeue());
        System.out.println("-------List Queue End-----------\n\n\n");
    }
}
