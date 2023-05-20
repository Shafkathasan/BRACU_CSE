public class Main {
    public static void main(String[] args) {
        Student john = new Student(), mike = new Student(), carol = new Student();
        
        john.setName("john");
        john.setID("1234567");
        john.setAddress("Khulna");
        john.setCGPA(4.00);
        
        mike.setName("mike");
        mike.setID("1253642");
        mike.setAddress("Dhaka 1205");
        mike.setCGPA(1.65);
        
        carol.setName("carol");
        carol.setID("124586");
        carol.setAddress("Japan");
        carol.setCGPA(3.66);
        
        
        System.out.println("Name: " + john.getName());
        System.out.println("ID: " + john.getID());
        System.out.println("Address: " + john.getAddress());
        System.out.println("CGPA: " + john.getCGPA() + "\n");
        System.out.println("Name: " + mike.getName());
        System.out.println("ID: " + mike.getID());
        System.out.println("Address: " + mike.getAddress());
        System.out.println("CGPA: " + mike.getCGPA() + "\n");
        System.out.println("Name: " + carol.getName());
        System.out.println("ID: " + carol.getID());
        System.out.println("Address: " + carol.getAddress());
        System.out.println("CGPA: " + carol.getCGPA());
    }
}