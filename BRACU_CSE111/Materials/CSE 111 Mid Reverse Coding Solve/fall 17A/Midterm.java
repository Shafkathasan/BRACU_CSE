public class Midterm {
    public static void main (String[] args){
        Bird b1 = new Bird();
        Bird b2 = new Bird("Big");
        Bird b3 = new Bird("Small", "red");    
        Bird b4 = new Bird("Big", "blue");    
        Bird b5 = new Bird("Small");
        b1.fly();
        b2.fly();
        b3.fly();
        b4.fly();
        b5.fly();    
    }   
}
