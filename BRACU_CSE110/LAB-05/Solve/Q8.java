public class Q8
{  
    public static void main(String[] args){
        int test = 1;
        int j = 0, k = 100;
        while (k > 0){   
            while (j < k ){
                test = k - j + 11;
                System.out.println(1 + test / 3 +"12");
                j+=10;
            }
            k-=10;
        }
    }
}
