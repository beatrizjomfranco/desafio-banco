//Abstract class: is a restricted class that cannot be used to create objects; to access it, it must be inherited from another class.
//The implements keyword is used to implement an interface .
public abstract class Account implements IAccount 
{

        //private static final will be considered as constant and the constant can be accessed within this class only.
        private static final int Agency = 1; 
        //static int' means an integer field exists on the class (and not on each instance of the class)
        private static int SERIAL = 1;
    
        protected Customer customer;
        protected int bankagency;
        protected int bankaccount;
        protected double bankbalance;
    
        public Account(Customer customer){
            this.bankagency = Account.Agency;
            this.bankaccount = SERIAL++;
            this.customer = customer;
        }
    
//  generate getters for bankagency, bankaccount and bank balance

        public int getBankagency() {
                return bankagency;
        }

        public int getBankaccount() {
                return bankaccount;
        }

        public double getBankbalance() {
                return bankbalance;
        }

        // implementing the methods: money withdraw, money deposit and money transference

        @Override
        public void withdraw(double value) // withdraw method
        {
              bankbalance -= value;  
                
        }

        @Override
        public void deposit(double value) // deposit method
        {
                bankbalance += value;                
        }

        @Override
        public void transfer(double value, IAccount SenderAccount) // transfer method
        {
                this.withdraw(value);
                SenderAccount.deposit(value);
                
        }

        //print bank data method
        protected void printBankData() 
        {
                System.out.println("Bank Account Owner: " + this.customer.getName());
                System.out.println("Bank Agency: " + this.bankagency);    
                System.out.println("Bank Account: " + this.bankaccount);
                System.out.println("Bank Balance: " + this.bankbalance);
        }

    }
    
