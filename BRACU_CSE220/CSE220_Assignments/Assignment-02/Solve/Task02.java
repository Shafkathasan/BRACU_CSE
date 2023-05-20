//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-02 : Circular Array
package Assignment_02; // Remove This Line or Make a package

public class Task02 { //One Application of Circular Array and Why?

    public static void main(String[] args) {
        int size = 5;
        int start =0;
        Object arr[] = {3, 7, 1, 8, 6, null, null};
        remove(arr, size, start, 4);
    }

    public static void remove(Object[] cir, int size, int start, int pos) {
        int index = (start + pos) % cir.length;
        for (int i = 0; i <= size - pos; i++) {
            cir[index] = cir[(index + 1) % cir.length];
            index++;
            if (index >= cir.length) {
                index = index % cir.length;
            }
        }
        size--;
        printFullArray(cir);
    }

    //Prints from index --> 0 to cir.length-1
    public static void printFullArray(Object[] cir) {
        for (int i = 0; i <= cir.length - 1; i++) {
            if (i == cir.length - 1) {
                System.out.println(cir[i] + "\n");
            } else {
                System.out.print(cir[i] + ", ");
            }
        }
    }
}
