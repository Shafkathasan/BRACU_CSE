public class CheckingAccount extends Account{
  private final double MINIMUM=500.00;
  public CheckingAccount(String name, double amount){
    super(name);  
    if (amount > 0){
      setBalance(amount);
    }
  }
  public String deposit(double amount){
    double total = 0;
    if (amount > 0){
      total = getBalance()+ amount;
      setBalance(total);
      return "Deposit Successful";
    }
    return "Please enter amount greater than Zero";
  }
  public String withdraw(double amount){
    double bal;
    String msg;
    bal = getBalance();
    if (amount > 0){
      if (bal > amount){
        setBalance(bal - amount);
        return "Withdraw Successful";
      }else{
        return "You do not have enough funds";
      }
    }else{
      return "Please enter amount greater than Zero";
    }
  }
  public void printAccountInfo(){
    double amount;
    amount = getBalance();
    System.out.println("=======================================");
    System.out.println("Name : "+getName());
    System.out.println("Account Number : "+getAccountNumber());
    System.out.println("Balance : "+amount);
    if (amount < MINIMUM){
      System.out.println("Your balance is less than the minimum amount");
    }
    System.out.println("=======================================");
  }
}