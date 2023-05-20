//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Lab 07 : Lab Mid-Exam
package Lab07_Mid_Exam; // Remove This Line or Make a package

public class Mid {

    Node head;
    int cir[];
    int start;
    int size;

    public Mid(int[] array) {
        //edit to create Linked List with global head from given array
        head = new Node(array[0], null);
        Node now = head;
        for (int i = 1; i < array.length; i++) {
            Node T = new Node(array[i], null);
            now.next = T;
            now = now.next;
        }

    }

    public Mid(int[] array3, int st, int sz) {
        //Creates global circular array cir from given array.
        start = st;
        size = sz;
        cir = new int[array3.length];
        for (int i = 0; i < size; i++) {
            cir[(start + i) % array3.length] = array3[i];
        }
    }

    public void pattern() {
        //you can use the System.out.println line only twice
        for (Node now = head; now != null; now = now.next) {
            if (now.next == null) { // For Last Index
                System.out.println("I am " + now.element + " and I do not have two buddies");
            } else if (now.next.next == null) { // For Last-1 Index
                System.out.println("I am " + now.element + " and I do not have two buddies");
            } else {
                System.out.println("I am " + now.element + " and the product of my next two buddies is " + (now.next.element * now.next.next.element));

            }
        }
    }

    public void occurrence(int i) {
        /* edit */
        int first = 0, last = 0;
        int c1 = 0, c2 = 0;
        for (Node now = head; now != null; now = now.next) {
            if (now.element == i) {
                first = c1;
                break;
            }
            c1++;
        }
        for (Node now = head; now != null; now = now.next) {
            if (now.element == i) {
                last = c2;
            }
            c2++;
        }
        System.out.println(i + " is first found in position " + first + " and last found in position " + last + ".");
    }

    public void sort() {
        //sorts the circular array
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (cir[(j + start) % cir.length] < cir[(i + start) % cir.length]) {
                    int Temp = cir[(i + start) % cir.length];
                    cir[(i + start) % cir.length] = cir[(j + start) % cir.length];
                    cir[(j + start) % cir.length] = Temp;
                }
            }
        }
    }

    public void print() {
        //prints the circulate array
        int i = 0;
        for (; i < size - 1; i++) {
            System.out.print(cir[(start + i) % cir.length] + ", ");
        }
        System.out.println(cir[(start + i) % cir.length]); // Last Index Print
    }

    public void linearize() { // Extra
        int[] T = new int[size];
        for (int i = 0; i < size; i++) {
            T[i] = cir[(start + i) % cir.length];
        }
        cir = T;
    }
}
