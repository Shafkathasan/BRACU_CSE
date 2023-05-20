class BbaStudent extends Student{
 
 private String slogan;
 public BbaStudent(String name, String id, String slogan){
   super(name, id);
   this.slogan = slogan;
 }
 public String toString(){
   return super.toString()+"\n" + "Slogan : "+ this.slogan;
 }
}
