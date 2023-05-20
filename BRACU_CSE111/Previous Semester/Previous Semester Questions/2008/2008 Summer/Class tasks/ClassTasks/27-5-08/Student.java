public class Student{
  private static int count = 0;
  public Student (){
    count++;
  }
  public static int getcount(){
    return count;
  }
}