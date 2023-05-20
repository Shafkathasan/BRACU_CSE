abstract class Circle extends Shape {
    public double radius;
    public Circle() {}
    public Circle (double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 5.0;
    }
    public double getPerimeter() {
        return 2.0;
    }
    public String toString() {
        return "String";
    }
}