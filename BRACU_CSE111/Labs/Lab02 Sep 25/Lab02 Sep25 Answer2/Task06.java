import java.util.Scanner;
public class Task06
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please Enter Number: ");
        int number = sc.nextInt();
        int count=1, sum =0, sign=1;
        while (count<=number){
            sum= sum+sign*(count*count);
            sign= (-1*sign);
            count++;}
        System.out.println(sum);  
    }    
}
