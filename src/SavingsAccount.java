public class SavingsAccount extends Account {
       public SavingsAccount(Customer account_owner){
        super(account_owner);
       }

@Override
public void printBankStatement() // print Bank Statement method
{
      System.out.println("Savings Statement: ");
      super.printBankData();
} 
}
