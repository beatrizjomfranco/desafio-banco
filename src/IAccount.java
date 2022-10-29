public interface IAccount 
{
        //The method withdraw is of a void return type, which means it does not return anything.
        void withdraw(double value);
        
        void deposit (double value);
        void transfer(double value, IAccount SenderAccount);
        void printBankStatement();
   
}