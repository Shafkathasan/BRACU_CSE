import static java.lang.System.*;
import java.util.Scanner;

public class ClockDemo {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter midnight time in seconds");
        int midSecs = sc.nextInt();
        
        Clock firstClock = new Clock(midSecs);
        
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        firstClock.tick();
        System.out.println(firstClock.toString());
        
        out.println();
        
        System.out.println("Enter hours value");
        int hours = sc.nextInt();
        System.out.println("Enter minutes value");
        int minutes = sc.nextInt();
        System.out.println("Enter seconds value");
        int seconds = sc.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);
        
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        secondClock.tick();
        System.out.println(secondClock.toString());
        
        out.println();
        
        firstClock = firstClock.addClock(secondClock);
        
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString());
        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        
        System.out.println(thirdClock.toString());
    }
}