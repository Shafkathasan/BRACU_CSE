abstract class Rectangle extends Shape {
  public double width;
  public double length;
  public Rectangle() {}
  public Rectangle (double width, double length) {
    this.width = width;
    this.length = length;
  }
  public Rectangle (double width, double length, String color, boolean filled) {
    this.width = width;
    this.length = length;
    this.color = color;
    this.filled = filled;
  }
  public double getWidth() {
    return 0.0;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getLength() {
    return 0.0;
  }
  public void setLength(double length) {
    this.length = length;
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