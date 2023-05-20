//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-03 : Linked List
package Assignment_03; // Remove This Line or Make a package

public class LinkedList_02 {

    NodeN head;

    LinkedList_02(int[] arr) {
        head = new NodeN(arr[0], null); // Create Head NodeN for LinkList
        NodeN now = head;
        for (int i = 1; i < arr.length; i++) {
            NodeN Temp = new NodeN(arr[i], null); // Create new NodeN for LinkList
            now.next = Temp; // Take Previouse NodeN Refarence
            now = now.next;
        }
    }

    /* prints the elements in the list */
    public void printList() {
        // Start Printing from Head & End if Null
        NodeN now = head;
        for (; now.next != null; now = now.next) {
            System.out.print(now.element + ", ");
        }
        System.out.println(now.element + ". " + "\n");
    }

    //sortList() will sort NodeNs of the list in ascending order
    public void sortList() {
        //NodeN current will point to head
        NodeN current = head, index = null;
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                //NodeN index will point to NodeN next to current
                index = current.next;

                while(index != null) {
                    //If current NodeN's data is greater than index's NodeN data, swap the data between them
                    if(current.element >index.element) {
                        temp = current.element;
                        current.element = index.element;
                        index.element = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void RemoveDuplicates() {
        NodeN current = head;
        while (current != null) {
            NodeN temp = current;
            while (temp != null && temp.element == current.element) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }


}
