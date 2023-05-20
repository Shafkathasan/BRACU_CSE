public class AccountTester{
  public static void printInfo(Account a){
    a.printAccountInfo();
  }
  public static void main(String [] args){
    CheckingAccount c1 = new CheckingAccount("Nadeem", 400);
    CheckingAccount c2 = new CheckingAccount("Susan", 600);
    CheckingAccount c3 = new CheckingAccount("Raqib", 1000);
    printInfo(c1);
    printInfo(c2);
    printInfo(c3);
    System.out.println(c1.deposit(-100.00));
    System.out.println(c1.deposit(0.00));
    System.out.println(c1.deposit(200.00));
    System.out.println(c1.withdraw(1000.00));
    System.out.println(c1.withdraw(0.00));
    System.out.println(c1.withdraw(300.00));
    printInfo(c1);
  }
}