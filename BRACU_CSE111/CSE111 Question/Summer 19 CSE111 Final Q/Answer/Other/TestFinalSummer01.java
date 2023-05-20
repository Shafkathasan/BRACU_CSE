public class TestFinalSummer01{
    public static void main (String [] args){
        A a1 = new A();
        B b1 = new B(8);
        B b2 = new B(b1);
        b2.run(1,51);
        a1.run(6,2);
    }
}
class A{
    int p = 2;
    static int q = 1;
    static int r = 2;
    public A(){
        ++p;
        --r;
    }
    public void run (int n, int m){
        int p = 1;
        p += m + (p++);
        p += 2 + n;
        r += p + p;
        System.out.println(r + " "+p);
    }
}
class B extends A {
    public int p = 2;
    static public int r =1;
    public B(int p) {
        super.p = p;
        ++p;
        r = p +q+1;
    }
    public B(A b){
        super.p = b.r;
        r = b.p;
    }
    public void run (int n, int m){
        int q = 2;
        q += this.q;
        p = this.q + 2 + r;
        super.run(p,q);
        r = p + q+ super.r;
        System.out.println(r + " "+p);
    }
}
