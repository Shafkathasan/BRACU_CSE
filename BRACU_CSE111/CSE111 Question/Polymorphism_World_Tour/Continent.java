class Continent{
    
    void method1(){
        System.out.println("Continent 1");
    }
    
    void method2(){
        System.out.println("Continent 2");
    }
    
    void method3(){
        System.out.println("Continent 3");
    }
    
    int method4(){
        method1();
        method2();
        method3();
        System.out.println("Continent 4");
        return 7;
    }
    
    static void method5(){
        int x = 5;
        System.out.println(x);
        
        System.out.println(x++);
        System.out.println(x);
        
        System.out.println(++x);
        System.out.println(x);
    }
}

//--------------------------------------------------------------

class Europe extends Continent{
    
    void method1() {
        super.method3();
        method3();
        System.out.println("Europe 1");
    }

    void method2() {
        System.out.println("Europe 2");
    }
}

//--------------------------------------------------------------

class Asia extends Continent{
    int countries = 49;
    void method1() {
        System.out.println("Asia 1");
        super.method3();
        method3();
        method3(0);
    }

    void method3(int x) {
        System.out.println("Asia 3");
    }
    
    public String toString(){
        System.out.println("This is Asia");
        return "";
    }
}

//--------------------------------------------------------------

class SouthAsia extends Asia {
    int countries = 8;
    void method2() {
        super.method3();
        System.out.println("SouthAsia 2");
        method3();
    }

    void method3() {
        System.out.println("SouthAsia 3");
    }
}

//--------------------------------------------------------------

class Bangladesh extends SouthAsia {

    void method3() {
        System.out.println("Bangladesh 3");
    }
    
    void Method6(){
        Method6();
    }
    
    void method7(Continent c){
        if (c instanceof Dhaka){
            System.out.println("Dhakaiya found!");
        }
        else if (c instanceof Asia){
            System.out.println("Asian found!");
        }
        else if (c instanceof Europe){
            System.out.println("European found!");
        }
    }
    

}

//--------------------------------------------------------------

class France extends Europe {
    void method1() {
        System.out.println("France 1");
    }

    void method3() {
        System.out.println("France 3");
    }
}

//--------------------------------------------------------------

class Dhaka extends Bangladesh {
    
    void method6(){
        method7(this);
    }
    
    public String toString(){
        return "This is Dhaka";
    }
}

