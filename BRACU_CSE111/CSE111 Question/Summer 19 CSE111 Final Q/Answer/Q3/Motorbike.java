public class Motorbike implements Bike {
    public int speed=0;
    public void speedUp(int i) {
        speed += i;
    }
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    public void printStatus() {
        System.out.println("Speed:"+speed);
    }
}