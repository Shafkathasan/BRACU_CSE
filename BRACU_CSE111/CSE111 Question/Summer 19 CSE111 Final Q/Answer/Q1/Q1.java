public class Q1 {
    public static void main(String[] args) {
        Shape circle = new Circle (2);
        Shape rectangle = new Rectangle (5, 7);
        
        System.out.println("Area of the circle: "+circle.getArea());
        System.out.println("Area of the rectangle: "+rectangle.getArea());
    }
}

