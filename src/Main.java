public class Main {
    public static void main(String[] args) {
        Customer account_owner = new Customer();
        account_owner.setName("Wonder Woman");

        Account checking = new CheckingAccount(account_owner);
        Account savings = new SavingsAccount(account_owner);

        checking.withdraw(200);// withdraw money
        checking.deposit(1000); // deposit money
        
        // transfer money from checking account to savings account
        checking.transfer(50, savings);

        savings.deposit(570);
        
      
        // print both checking and savings statements
        checking.printBankStatement();
        savings.printBankStatement();
    }
}
