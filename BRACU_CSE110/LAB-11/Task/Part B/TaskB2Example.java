import java.io.*;
import java.util.*;
public class TaskB2Example {
    public static void main(String[] args) throws Exception { 
        String amarFileNameAndLocation = "./a.txt";
        File amarFile = new File(amarFileNameAndLocation);
        Scanner sc = new Scanner (amarFile);
        
        int sum = 0;
        while(sc.hasNext()){
            String word = sc.next();
            int n = Integer.parseInt(word);
            sum += n;
        }
        System.out.println("sum is "+sum);
    }
    
    /* ADD YOUR CODE HERE */
    
}
