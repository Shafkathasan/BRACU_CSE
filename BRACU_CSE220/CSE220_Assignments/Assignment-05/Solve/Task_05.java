//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-05 : Special Assignment for Midterm
package Assignment_05; // Remove This Line or Make a package

public class Task_05 {

    public static void main(String[] args) {

        int X = 077 % 37; // 077 % 37 = 26
        int a[] = {X + 1, X + 2, X + 3, X + 4};
        // 27, 28, 29, 30
        int b[] = {X + 5, X + 6, X + 7, X + 8};
        // 31, 32, 33, 34
        MyList m = new MyList();
        m.myMethod(a, b);
        m.printList();
        // This should print: 837, 27, 28, 29, 30.
        m.printListR();
        // This should print: 837, 4, 4, 4, 4.
    }
}
