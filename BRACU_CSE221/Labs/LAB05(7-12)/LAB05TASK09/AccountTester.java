/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB05TASK09;

public class AccountTester {

    public static void main(String[] args) {
        System.out.println(Account.interestRate);//static kemne?
        Account a1 = new Account();
        System.out.println(a1.nameKi());
        System.out.println(a1.balanceKi());
        a1.nameBoshao("Mashrafe Murtaza");
        a1.balanceBoshao(5000);
        System.out.println(a1.nameKi());
        System.out.println(a1.balanceKi());
        Account a2 = new Account("Mustafizur Rahman", 50);
        System.out.println(a2.nameKi());
        System.out.println(a2.balanceKi());
        a1.withdraw(4900);
        a2.withdraw(25);
        a1.withdraw(4899);
    }
}

class Account {

    private String name = "Default Account";
    private double balance = 0.0;
    public static double interestRate = 5.0;//static how?MOJA?
    private double withdraw;

    public Account() {

    }

    public String nameKi() {
        return name;
    }

    public double balanceKi() {
        return balance;
    }

    public void nameBoshao(String n) {
        name = n;
    }

    public void balanceBoshao(int b) {
        balance = (double) b;
    }

    public Account(String n, int b) {
        name = n;
        balance = (double) b;
    }

    public void withdraw(int w) { //int chara double diye ki recieve kora jabe
        withdraw = (double) w;
        if (balance - withdraw > 100) { //100 kotha theke aslo?
            balance = balance - withdraw;
            System.out.println("Withdraw successful! New balance is: " + balance);
        } else {
            System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
        }
    }
}
