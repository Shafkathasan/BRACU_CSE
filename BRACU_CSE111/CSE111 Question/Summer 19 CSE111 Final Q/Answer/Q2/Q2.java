public class Q2 {
    public static double x, y, i;
    public static double product (double _x, double _y) {
        x =_x;
        y =_y;
        i = x*y;
        return i;
    }
    public static double product (int _x, int _y) {
        x =_x;
        y =_y;
        i = x*y;
        return i;
    }
    public static void main(String[] args) {
        System.out.println(product(2,3));
        System.out.println(product(5.5,2.5));
    }
}
//Output:
//6.0
//13.75
