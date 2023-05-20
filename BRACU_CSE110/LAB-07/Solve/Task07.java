import java.util.Scanner;
public class Task07
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int count=2, number1, number2;
        System.out.println("Plase Enter Quantity:");
        int quantity=sc.nextInt();
        System.out.println("Plase Enter Value:");
        number1=sc.nextInt();
        int sum=number1, max=number1, min=number1;
        while(count<=quantity)
        {
            System.out.println("Plase Enter Value:");
            number2=sc.nextInt();
            if(number2>max){
                max=number2;
            }
            else if(number2<min){
                min=number2;
            }
            sum+=number2;
            ++count;
        }
        double avg = (double)sum/count; 
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
        System.out.println("Average:"+avg);
    }
}
