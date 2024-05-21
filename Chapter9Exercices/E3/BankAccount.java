public class BankAccount {
    public double currentBalance;
    final public double penalty=30.0;

    public void Deposit(double amount)
    {

        this.currentBalance=this.currentBalance+amount;
    }
    public double getCurrentBalance()
    {
        return this.currentBalance;

    }
    public void getWithdraw(double amount)
    {

        if(this.currentBalance<amount+penalty)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            this.currentBalance=this.currentBalance-(amount+penalty);
            System.out.println("Successfully withdrawn "+ amount+" $");
        }
    }

}