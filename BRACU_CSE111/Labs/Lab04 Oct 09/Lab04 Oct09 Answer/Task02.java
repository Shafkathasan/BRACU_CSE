public class Task02
{  
    public static void main(String[] args)
    {
        String test = "";
        int i = 5, j = 0, k = 15;
        while (i< 10){   
            k-=1;
            j = k;
            while (j > 10 ){
                if (j % 2 == 0){
                    test = "<--";
                    test =  test + i + 2 + "-->" + (j / 2); 
                }
                else
                {
                    test = "-->";
                    test =  "-->" + (i / 2) + test + j; 
                }
                System.out.println(test);
                --j;
            }
            i++;
        }
    }
}
