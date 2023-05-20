public class TestThisMess{
  public static void main(String [] args){
    
    MyMainCode mmc = new MyMainCode();
    CSEStudent cs = new CSEStudent("Name of Student", "99999999");
    mmc.myMainMethod(new CSEStudent("Bush", "666"));
    mmc.myMainMethod(new Box());
    mmc.myMainMethod(new RedBox("Orange"));
  }
}