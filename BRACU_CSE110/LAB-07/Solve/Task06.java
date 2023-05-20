import java.util.Scanner;
public class Task06
{
    public static void main(String[] args)
    { 
        Scanner sc= new Scanner(System.in);
        int count=1, quantity, number;
        System.out.println("Plase Enter Quantity:");
        quantity=sc.nextInt();
        while(count<=quantity)
        {
            System.out.println("Plase Enter Value:");
            number=sc.nextInt();
            if(number%2==0){
                System.out.println("even");
            }
            else{
                System.out.println("odd");
            }
            ++count;
        }
    }
}
