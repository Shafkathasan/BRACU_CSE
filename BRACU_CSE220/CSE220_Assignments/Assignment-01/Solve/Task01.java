//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-01 : Liner Array
package Assignment_01; // Remove This Line or Make a package

public class Task01 {

    public static void main(String[] args) {
        int x = (1077 % 33) + (1077 % 34);
        int[] a = {x - 18, x + 4, x, x + 14, x - 5, x + 4, x - 2, x + 9};
        printArray(a);

        System.out.println("\n///// TEST 01: Copy Array example /////");
        int[] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }

        System.out.println("\n///// TEST 02: Resize Array example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        b = resizeArray(b, 10);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53, 0, 0 }

        System.out.println("\n///// TEST 03: Reverse Array example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        reverseArray(b);
        printArray(b); // This Should Print: { 53, 42, 48, 39, 58, 44, 48, 26 }

        System.out.println("\n///// TEST 04: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        printArray(b);
        b = shiftLeft(b, 3);
        printArray(b); // This Should Print: { 58, 39, 48, 42, 53, 0, 0, 0 }

        System.out.println("\n///// TEST 05: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        b = shiftRight(b, 3);
        printArray(b);  // This Should Print: { 0, 0, 0, 26, 48, 44, 42, 53 }

        System.out.println("\n///// TEST 06: Rotate Left k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        b = rotateLeft(b, 4);
        printArray(b); // This Should Print: { 39, 48, 42, 53, 26, 48, 44, 58 }

        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        b = rotateRight(b, 4);
        printArray(b); // This Should Print: { 39, 48, 42, 53, 26, 48, 44, 58 }

        System.out.println("\n///// TEST 08: Insert example 1 /////");

        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        boolean bol = insert(b, 9, 70, 3); // This Should Print: No space Left
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }

        System.out.println("\n///// TEST 09: Insert example 2 /////");
        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        bol = insert(b, 5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(b); // This Should Print: { 26, 48, 70, 44, 58, 39, 48, 42 }

        System.out.println("\n///// TEST 10: Insert example 3 /////");
        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 26, 48, 44, 58, 39, 48, 42, 53 }
        bol = insert(b, 6, 70, 6); // This Should Print: Number of elements after insertion: 7
        System.out.println(bol); // This Should Print: true
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 70, 42 }

        System.out.println("\n///// TEST 11: Remove example 1 /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 70, 42 }
        b = removeAt(b, 7);
        //System.out.println(bol); // This Should Print: false
        printArray(b); // This Should Print: { 26, 48, 44, 58, 39, 48, 70, 42 }

    }

    // Prints the contents of the source array
    public static void printArray(int[] source) {
        for (int i = 0; i < source.length; i++) {
            if (i == source.length - 1) {
                System.out.print(source[i] + "\n");
            } else {
                System.out.print(source[i] + ", ");
            }
        }
    }

    public static int[] resizeArray(int[] source, int newcapacity) {
        int[] T = new int[newcapacity];
        for (int i = 0; i < source.length; i++) {
            T[i] = source[i];
        }
        return T;
    }

    // creates a copy of the source array and returns the reference of the newly created copy array
    public static int[] copyArray(int[] source, int len) {
        int[] c = new int[len];
        for (int i = 0; i < c.length; i++) {
            c[i] = source[i];
        }
        return c;
    }

    // creates a reversed copy of the source array and returns the reference of the newly created reversed array
    public static void reverseArray(int[] source) {
        int i, T;
        for (i = 0; i < source.length / 2; i++) {
            T = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = T;
        }
    }

    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int[] shiftLeft(int[] source, int k) {
        for (int i = 0; i + k < source.length; i++) {
            source[i] = source[i + k];
            source[i + k] = 0;
        }
        return source;
    }

    // Shifts all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int[] shiftRight(int[] source, int k) {
        for (int i = 0; i < k; i++) {
            source[i + k] = source[i];
            source[i] = 0;
        }
        return source;
    }

    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int[] rotateLeft(int[] source, int k) {
        for (int i = 0; i + k < source.length; i++) {
            int T = source[i];
            source[i] = source[i + k];
            source[i + k] = T;
        }
        return source;
    }

    // Rotates all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int[] rotateRight(int[] source, int k) {
        for (int i = source.length - 1; i - k >= 0; i--) {
            int T = source[i];
            source[i] = source[i - k];
            source[i - k] = T;
        }
        return source;
    }

    /**
     * @return true if insertion is successful; @return false otherwise
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array.
     * size<=arr.length @para m elem the element that is to be inserted @param
     * index the index in which the element is required to be inserted if
     * insertion is not successful due to lack space, print "No space Left" if
     * given index is invalid, print "Invalid Index" if insertion is successful,
     * print the 'Number of elements after insertion' is completed
     */
    public static boolean insert(int[] arr, int size, int elem, int index) {
        boolean check = false;

        if (size > arr.length - 1) {
            System.out.println("No space Left");
            return check;

        } else if (index > arr.length - 1) {
            System.out.println("Invalid Index");

        } else if (size < arr.length) {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = elem;
            check = true;
            System.out.println("Number of elements after insertion: " + (size + 1));
        }
        return check;
    }

    /**
     * removes all the occurences of the given element
     *
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array.
     * size<=arr.length @param elem the element to be removed @return true if
     * removal is successful; return fal se otherwise if removal is successful,
     * print the 'Number of elements after removal' is completed
     */
    public static int[] removeAt(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;

        } else {
            int[] anotherArray = new int[arr.length - 1];
            for (int i = 0, k = 0; i < arr.length; i++) {

                // if the index is
                // the removal element index
                if (i == index) {
                    continue;
                }

                // if the index is not
                // the removal element index
                anotherArray[k++] = arr[i];
            }
            return anotherArray;
        }
    }
}
