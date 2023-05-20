public class CSEStudent extends Student{
  public CSEStudent(String _name, String _id){
    name = _name;
    id = _id;
  }
  public String getInfo(){
    return "name: "+name+"\nID: "+id; 
  }
  
}