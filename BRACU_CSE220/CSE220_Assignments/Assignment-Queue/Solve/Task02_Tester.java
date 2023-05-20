//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment on Queue
package Assignment_Queue; // Remove This Line or Make a package

import java.util.Scanner;

public class Task02_Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "Enter your Choice:\n1.Register a Patient\n2.Serve a Patient\n3.Cancel all Appointments\n4.Can Doctor go home?\n5.List of all Patient\n6.Exit";
        System.out.println("Welcome to LinkedList Based Queue Hospital System");
        System.out.println(menu);
        int select = 0;
        WRM w = new WRM();

        while (select != 6) {
            try {
                select = sc.nextInt();
                if (select == 1) {
                    w.RegisterPatient();
                    System.out.println("---\n" + menu);
                } else if (select == 2) {
                    w.ServePatient();
                    System.out.println("---\n" + menu);

                } else if (select == 3) {
                    w.CancelAll();
                    System.out.println("---\n" + menu);

                } else if (select == 4) {
                    w.CanDoctorGoHome();
                    System.out.println("---\n" + menu);
                } else if (select == 5) {
                    w.ShowAllPatient();
                    System.out.println("---\n" + menu);
                } else if (select == 6) {
                    System.out.println("Thank You");
                } else {
                    System.out.println(menu);
                }
            } catch (Exception e) {
                System.err.println("Input Format Mismatch! Please, try Again.\n" + menu);
                sc.next();
            }

        }
    }
}
