public class Square extends Rectangle {
    public double side;
    public Square() {}
    public Square (double side) {
        this.side = side;
    }
    public Square (double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return 0.0;
    }
    public void setSide(double width) {
        this.side = side;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public String toString() {
        return "String";
    }
}