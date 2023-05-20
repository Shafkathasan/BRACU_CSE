public class Circle extends Shape {
    public int i;
    public double area, pie = 3.1416;
    public Circle (int _i) {
        i= _i;
    }
    public double getArea() {
        area = pie*i*i;
        return area;
    }
}