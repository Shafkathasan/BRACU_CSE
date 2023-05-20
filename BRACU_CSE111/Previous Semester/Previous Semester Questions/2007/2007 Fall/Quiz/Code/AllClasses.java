class Sue {
 void method1() {
  System.out.println("sue 1");
 }

 void method3() {
  method1();
  System.out.println("sue 3");
  method1();
 }
}

class Blue {
 void method1() {
  System.out.println("blue 1");
  method3();
 }

 void method3() {
  System.out.println("blue 3");
 }
}

class Moo extends Blue {
 void method2() {
  super.method3();
  System.out.println("moo 2");
 }

 void method3() {
  System.out.println("moo 3");
 }
}

class Crew extends Moo {
 void method1() {
  System.out.println("crew 1");
 }

 void method3() {
  System.out.println("crew 3");
 }
}
