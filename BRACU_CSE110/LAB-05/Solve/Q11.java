public class Q11 
{  
      public static void main(String[] args) {
            String test = "";
            int i = 1, j = 1, k = 14;
            test = "-->";
            while (i< 5) {   
                  j = --k;
                  while (j > 9 ) {
                        test = i + (j-2) + "-->" + test;
                        System.out.println(test);
                        j--;
                  }
                  i++;
            }
      }
}
