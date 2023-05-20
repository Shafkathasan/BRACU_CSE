public class Main {
    public static void main (String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        
        System.out.println("C1, Radius: " + c1.getRadius());
        System.out.println("C1, Area: " + c1.getArea());
        System.out.println();
        System.out.println("C1, Radius: " + c2.getRadius());
        System.out.println("C1, Area: " + c2.getArea());
        
    }
}