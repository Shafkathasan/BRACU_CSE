//tester class
public class TestUser {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.sum);
        t.methodA();
        t.methodB();
        t.methodB();
        Test t1 = new Test();
        t1.methodB();
    }
}