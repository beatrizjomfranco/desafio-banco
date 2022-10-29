public class CheckingAccount extends Account{
      public CheckingAccount (Customer account_owner)
      {
        super(account_owner);
      }

@Override
public void printBankStatement() // bank statement method 
{
    System.out.println("Checking Statement: ");            
    super.printBankData();
}  
      
}

   