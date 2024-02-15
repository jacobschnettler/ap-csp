public class BankAccount
{
    private double balance;

    // default
    public BankAccount()
    {
        this.balance = 0.0;
    }

    // constrictor w/ params
    public BankAccount(double balance)
    {   
        this.balance = balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String toString()
    {
        return "Balance: " + balance;
    }

    public void deposit(double depositAmount) 
    {
        setBalance(getBalance() + depositAmount);
    }

    public boolean withdraw(double depositAmount) 
    {
        boolean withdrawAvailable = depositAmount <= getBalance();

        if (withdrawAvailable) 
        {
            setBalance(getBalance() - depositAmount);
        }
        
        return withdrawAvailable;
    }
}
