public class Student{
    String name="";
    static int numberOfStudents;
    public Student(){
        this.name="Default Name";
        numberOfStudents++;
    }
    public Student(String x){
        this.name=x;
    }
}