public class Main {
    public static void main (String[] args) {
        BankAccount acc1 = new BankAccount(), acc2 = new BankAccount(), acc3 = new BankAccount();
        
        acc1.setName("Aamina");
        acc1.setAccountID("12452");
        acc1.setAddress("Mohakhali");
        acc1.setBalance(1246.23);
        
        acc2.setName("SMall Foot");
        acc2.setAccountID("12463");
        acc2.setAddress("Ishwardi");
        acc2.setBalance(332);
        
        acc3.setName("Java CHoudhury");
        acc3.setAccountID("211542559");
        acc3.setAddress("Tangail");
        acc3.setBalance(16.00);
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println("Name: " + acc1.getName());
        System.out.println("ID: " + acc1.getAccountID());
        System.out.println("Address: " + acc1.getAddress());
        System.out.println("Balance: " + acc1.getBalance());
        System.out.println();
        System.out.println("Name: " + acc2.getName());
        System.out.println("ID: " + acc2.getAccountID());
        System.out.println("Address: " + acc2.getAddress());
        System.out.println("Balance: " + acc2.getBalance());
        System.out.println();
        System.out.println("Name: " + acc3.getName());
        System.out.println("ID: " + acc3.getAccountID());
        System.out.println("Address: " + acc3.getAddress());
        System.out.println("Balance: " + acc3.getBalance());
    }
}