/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05TASK12;

class Cat {

    public String color = "White";
    public String action = "sitting";

    public Cat() {

    }

    public Cat(String c) {
        color = c;
    }

    public Cat(String c, String a) {
        color = c;
        action = a;
    }

    public void printCat() {
        System.out.println(color + " cat is " + action);
    }

    public void changeColor(String c) {
        color = c;
    }
}

public class Test {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = new Cat("Black");
        Cat c3 = new Cat("Brown", "jumping");
        Cat c4 = new Cat("Red", "purring");
        c1.printCat();
        c2.printCat();
        c3.printCat();
        c4.printCat();
        c1.changeColor("Blue");
        c3.changeColor("Purple");
        c1.printCat();
        c3.printCat();
    }
}
