import java.util.*;

public class Question03{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student s1 = new Student("Aditya",19101414,3.72,4);
    Student s2 = new Student("Raad",19101069,3.5,4);
    Student s3 = new Student("Sayem",19101076,3.0,5);
    
    s2.updateLab(sc.nextInt(),sc.nextInt());
    s2.updateLab(sc.nextInt(),sc.nextInt());
    s1.updateLab(sc.nextInt(),sc.nextInt());
    s3.updateLab(sc.nextInt(),sc.nextInt());
    
  }
}
class Student{
  String name;
  int id;
  double cgpa;
  int ts;
  int ls;
  static int[] lab = new int[18];
  static int requests = 0;
  
  public Student(String _name,int _id,double _cgpa,int _ts){
    this.name = _name;
    this.id = _id;
    this.cgpa = _cgpa;
    this.ts = _ts;
    for(int i = 0 ; i < lab.length ; i++){
      if(lab[i] < 42){
        this.ls = i+1;
        System.out.println(name+"'s Lab Section: "+ls);
        lab[i]++;
        break;
      }
    }
  }
  
  public void updateLab(int oldLab,int newLab){
    requests++;
    System.out.println("Request(s) no: "+requests);
    int count = 0;
    for(int i = 0; i < lab.length ; i++){
      if(i == oldLab-1 && newLab <=42){
        if(lab[i] < 42){
          this.ls = newLab;
          lab[i]++;
          System.out.println("Success.");
        }else{
          System.out.println("Sorry,cannot approve your request.");
        }
        break;
      }else{
        count++;
      }
    }
    if(count == lab.length){
      System.out.println("Lab Not Found.");
    }
  }
}