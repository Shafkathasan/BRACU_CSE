//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Lab 07 : Lab Mid-Exam
package Lab07_Mid_Exam; // Remove This Line or Make a package

public class MidTester {

    public static void main(String[] args) {

        int array[] = {10, 30, 50, 70, 90};
        Mid linkedlist = new Mid(array); //converts the given array into an linked list

        linkedlist.pattern();
        /*Calling this method will produce the following output:

            I am 10 and the product of my next two buddies is 1500
            I am 30 and the product of my next two buddies is 3500
            I am 50 and the product of my next two buddies is 6300
            I am 70 and I do not have two buddies
            I am 90 and I do not have two buddies
         */

        System.out.println("*******************************************");

        int array2[] = {20, 30, 20, 20, 50, 20, 90};
        Mid linkedlist2 = new Mid(array2); //converts the given array into an linked list

        linkedlist2.occurrence(20);
        /* Output:
           20 is first found in position 0 and last found in position 5.
         */

        System.out.println("*******************************************");

        int array3[] = {8, 2, 5, 6, 3, 9, 0, 0, 0};
        int st = 4, sz = 6;
        Mid circular = new Mid(array3, st, sz);
        circular.print();
        circular.sort();
        circular.print();

        /* output:
            8 2 5 6 3 9
            2 3 5 6 8 9
         */
    }
}
