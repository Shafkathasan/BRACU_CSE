class Circle {
    private double radius = 1.0;
    private String color = "red";
    
    public double getRadius() {
        return radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    Circle() {
        
    }
    
    Circle (double rad) {
        radius = rad;
    }
}