/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05TASK11;

class Dog {

    private String color = "Black";

    public Dog(String c) {
        color = c;
    }

    public void bark() {
        System.out.println(color + " dog is barking");
    }

    public void changeColor(String c) {
        color = c;
    }
}

public class Quiz {

    public static void main(String[] args) {
        Dog odie = new Dog("Red");
        Dog goofy = new Dog("Blue");
        odie.bark();
        goofy.bark();
        odie.changeColor("Brown");
        odie.bark();
    }
}
