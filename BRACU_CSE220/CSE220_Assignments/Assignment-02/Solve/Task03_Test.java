//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-02 : Circular Array
package Assignment_02; // Remove This Line or Make a package

public class Task03_Test {
    public static void main(String[] args) {
        int x = (1077%34) + (1077%33);
        Object arr [] = {x+50,x+4,null,null,x,x+10,x-10,x-18}; //{94, 48, null, null, 44, 54, 34, 26}
        System.out.println("///// Array /////");
        Task03 c = new Task03(arr, 4, 8);
        c.printFullArray(); //{44, 54, 34, 26, 94, 48, null, null}

        System.out.println("///// Forward Print /////");
        c.printForward(); //{94, 48, null, null, 44, 54, 34, 26}

        System.out.println("///// Backward Print /////");
        c.printBackward();

        System.out.println("///// Linearize /////");
        c.linearize();
        c.printFullArray();

        System.out.println("///// Resize /////");
        c.resize((1077%5)+(077%3)+8); //(1077%5)+(077%3)+8 = 10;
        c.printFullArray();

        System.out.println("///// Insert-01 /////");
        c.insert(0, 077%6); // 077%6 = 3;
        c.printFullArray();

        System.out.println("///// Insert-02 /////");
        c.insert(0, 077%5); // 077%5 = 3;
        c.printFullArray();

        System.out.println("///// Remove-01 /////");
        c.remove(077%6);
        c.printFullArray();

        System.out.println("///// Remove-02 /////");
        c.remove(077%5);
        c.printFullArray();
    }
}
