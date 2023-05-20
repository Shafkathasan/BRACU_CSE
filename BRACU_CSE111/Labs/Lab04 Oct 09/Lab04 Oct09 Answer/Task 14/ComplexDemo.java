import java.util.Scanner;

public class ComplexDemo {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double r1, r2, i1, i2;
        System.out.println("Please enter the first complex number");
        
        r1 = sc.nextDouble();
        i1 = sc.nextDouble();
        
        System.out.println("Please enter the second complex number");
        r2 = sc.nextDouble();
        i2 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        System.out.print("(" + c1 + ") + (" + c2 + ") = ");
        Complex add = c1.add(c2);
        System.out.println(add);
        System.out.print("(" + c1 + ") - (" + c2 + ") = ");
        Complex sub = c1.subtract(c2);
        System.out.println(sub);
        System.out.print("(" + c1 + ") * (" + c2 + ") = ");
        Complex multiply = c1.multiply(c2);
        System.out.println(multiply);
        System.out.print("(" + c1 + ") / (" + c2 + ") = ");
        Complex divide = c1.divide(c2);
        System.out.println(divide);
    }
}