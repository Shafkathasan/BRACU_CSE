import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double i, e, r, l, c, f, pie=3.1416;
        System.out.println("Please Enter Voltage:");
        e=sc.nextInt();
        System.out.println("Please Enter Resistance:");
        r=sc.nextInt();
        System.out.println("Please Enter Inductance:");
        l=sc.nextInt();
        System.out.println("Please Enter Capacitance:");
        c=sc.nextInt();
        System.out.println("Please Enter Frequency:");
        f=sc.nextInt();
        i=e/Math.sqrt(Math.pow(r, 2)+Math.pow((2*pie*f*l-(0.5*pie*f*c)), 2));
        System.out.println(i);
    }
}
