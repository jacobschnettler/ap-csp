public class CheckingAccount extends BankAccount
{ 
    int transactionCount;

    public CheckingAccount(double incomingChecking)
    {
        super(incomingChecking);
    }
    
    public void deposit(double depositAmount) 
    {
        transactionCount++;
        
        super.deposit(depositAmount);
    }
    
    public boolean withdraw(double withdrawAmount) 
    {
        boolean withdrawCompleted = super.withdraw(withdrawAmount);

        if (withdrawCompleted)
        {
            transactionCount++;
        }

        return withdrawCompleted;
    }

    public int getTransactionCount() 
    {
        return transactionCount;
    }

    public void deductFees() 
    {
        double transactionFees;
    }
}
