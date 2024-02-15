public class BankTest
{
    public static void main(String args[])
    {
        BankAccount mine = new BankAccount();

        BankAccount yours = new BankAccount(1000);

        mine.deposit(56.75);

        if (yours.withdraw(1200)) 
            System.out.println("Good Transaction");
        else
            System.out.println("Unable to complete transaction");

        double cash = yours.getBalance();

        System.out.println(cash);
        
        CheckingAccount his = new CheckingAccount(100);
        
        his.deposit(10);
        
        his.withdraw(50);
        
        his.deposit(20);
        
        his.deposit(10);
        
        int numTimes = his.getTransactionCount();
        
        his.deductFees();
        
        cash = his.getBalance();
        
        numTimes = his.getTransactionCount();
        
        System.out.println(cash);
    }
}
