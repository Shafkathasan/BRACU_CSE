abstract class Shape {
  public String color;
  public boolean filled;
  Shape(){}
  Shape(String color, boolean filled){};
  
  public String getColor() {
    return "Color";
  }
 
  public void setColor(String color){
    this.color = color;
  }
  
  public boolean isFilled(){
    return true;
  }
  
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  
  public abstract double getArea();
  public abstract double getPerimeter();
  public String toString() {
    return "String";
  }
}