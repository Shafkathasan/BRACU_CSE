public class Q21 
{  
      public static void main(String[] args) {
            int x = 0, y =0;
            int sum = 0;
            while (x < 10) {
                  y = x - 3;
                  while (y < 3) {
                        sum = x - y * 3  ;
                        System.out.println(sum);
                        y = y + 1;
                  }
                  if (x > 7) {
                        x++;
                  } else {
                        x += 3;
                  }
            }
            sum = x - y * 3 ;
            System.out.println(sum);
      }
}
