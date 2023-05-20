public class CommandLine{
  public static void main(String [] test)
  {
    System.out.println("Command line test");
    System.out.println(test.length);
    for (int i=0; i < test.length; i++){
      System.out.println(test[i]);
    }
  }
}