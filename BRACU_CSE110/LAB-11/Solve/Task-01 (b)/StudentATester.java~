public class StudentATester {
    public static void main(String[] args) { 
        StudentA s1 = new StudentA();
        StudentA s2 = new StudentA();
        StudentA s3;
        s1.name = "Student1";
        s1.cgpa = 2.3;
        s3 = s1;
        s2.name = "Student2";      
        s2.cgpa = s3.cgpa++;  
        s3.name = "New Student";
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s1.cgpa);
        System.out.println(s2.cgpa);
        System.out.println(s3.cgpa);
        s3 = s2;
        s1.name = "old student";
        s2.name = "older student";
        s3.name = "oldest student";     
        s2.cgpa = s1.cgpa - s3.cgpa + 1.3;  
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s1.cgpa);
        System.out.println(s2.cgpa);
        System.out.println(s3.cgpa); 
    }
}
