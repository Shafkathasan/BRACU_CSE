public class Test2{
  public static String x = "CSE, BBA, PHY, ECE"; 
  public static void main(String [] args){
    String [] allMyDtps = x.split(",");
    for(int i = 0; i < allMyDtps.length; i++){
      System.out.println(allMyDtps[i]);
    }
  }
}