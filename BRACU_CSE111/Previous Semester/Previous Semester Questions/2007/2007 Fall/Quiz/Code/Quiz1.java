public class Quiz1
{  
  public static void main(String args[])
  {
    double [] myArray = new double[5];
    String test = "";
    int i = 0, j = 0, k = 18;
    while (i < 4){
      myArray[i] = i + 3;
      test = "-->";      
      j = i - 1;
      while (j > (i - 3) ){
        if (j >= 0){
          myArray[i] = myArray[i+1] - myArray[j] / 2 + 1;          
        }
        j--;
      }
      test = test + myArray[i] + "-->" + j + 3 + 45;
      System.out.println(test);
      i++;
    }
    test = "-->" + myArray[i-3] + "-->" + myArray[i-1];
    System.out.println(test);
  }
}
