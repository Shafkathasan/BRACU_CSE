class Student {
    private String name, id, address;
    private double cgpa;
    
    public String getName() {
        return name;
    }
    
    public String getID() {
        return id;
    }
    
    public String getAddress() {
        return address;
    }
    
    public double getCGPA() {
        return cgpa;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setID (String i) {
        id = i;
    }
    
    public void setAddress(String a) {
        address = a;
    }
    
    public void setCGPA(double c) {
        cgpa = c;
    }
    
    Student () {
        
    }
    
    Student (String n, String i, String a, double c) {
        name = n;
        id = i;
        address = a;
        cgpa = c;
    }
}