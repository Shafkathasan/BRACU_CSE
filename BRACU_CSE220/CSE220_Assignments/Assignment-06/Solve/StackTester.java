//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Assignment-06 : Array & List Stack && Array & List Queue
package Assignment_06; // Remove This Line or Make a package

import java.util.Scanner;

public class StackTester {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int selection;
        while (true) {
            try {
                System.out.println("Please, enter:\n1 to select array based stack\n2 to select linked list based stack");
                selection = k.nextInt();
                if (selection != 1 && selection != 2)
                    System.err.println("Wrong Selection! Please, try Again.");
                else break;
            } catch (Exception e) {
                System.err.println("Input Format Mismatch! Please, try Again.");
                k.next();
            }
        }
        Stack stack;
        if (selection == 1) stack = new ArrayStack(); //If Select Array Stack
        else stack = new ListStack(); // If Select List Stack
        for (int x = 1; x <= 12; x += 2) {
            try {
                stack.push(x); // Push Elements in Stack
            } catch (StackOverflowException e) {
                System.err.println("Stack Full \n" + e);
            }
        }
        System.out.println("toString Output:" + stack.toString()); // Print Stack in String
        Object[] array = stack.toArray();
        for (int i = 0; i < array.length; i++) System.out.println("=> " + array[i]); // Print Array Elements
        System.out.println("Stack Size: " + stack.size()); // Print Stack Size
        System.out.println("Is Stack Empty: " + stack.isEmpty()); // Check if Stack is Empty or Not
        System.out.println("Distance of '1' from the top: " + stack.search(1)); // Search Element in Stack
        try {
            System.out.println("Popped: " + stack.pop()); // Popped from Stack Top
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        try {
            System.out.println("Popped: " + stack.pop()); // Popped from Stack Top
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        try {
            System.out.println("Popped: " + stack.pop()); // Popped from Stack Top
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        System.out.println("Stack Size: " + stack.size()); // Print Stack Size
        System.out.println("Is Stack Empty: " + stack.isEmpty()); // Check if Stack is Empty or Not
        System.out.println("Distance of '1' from the top: " + stack.search(1)); // Search Element in Stack

        array = stack.toArray();
        for (int i = 0; i < array.length; i++) System.out.println("=> " + array[i]);
        try {
            System.out.println("Peeked: " + stack.peek()); // Peek Stack Top Element
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        System.out.println("toString Output:" + stack.toString());
        try {
            System.out.println("Popped: " + stack.pop());
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        try {
            System.out.println("Popped: " + stack.pop());
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        try {
            System.out.println("Popped: " + stack.pop());
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        try {
            System.out.println("Peeked: " + stack.peek());
        } catch (StackUnderflowException e) {
            System.err.println("Stack Empty\n" + e);
        }
        array = stack.toArray();
        for (int i = 0; i < array.length; i++) System.out.println("=> " + array[i]);
        System.out.println("toString Output: " + stack.toString());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        System.out.println("Distance of '1' from the top: " + stack.search(1));

    }
}