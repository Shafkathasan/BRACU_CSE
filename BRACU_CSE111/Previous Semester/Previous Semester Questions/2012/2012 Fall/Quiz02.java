import java.util.*;
public class Quiz02 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in); // you can use any variable name instead of k
        
        System.out.println("How many numbers? ");
        int limit = k.nextInt();
        int[] a = new int[limit];
        
        int i;
        for(i=0; i<a.length; ++i) {
            a[i] = k.nextInt();
        }
        
        for(int c:a) {
            System.out.print(c + " ");
        }
    }
}
            