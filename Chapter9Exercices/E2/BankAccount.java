public class BankAccount {
    public double currentBalance;


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

       if(this.currentBalance<amount)
       {
           System.out.println("Insufficient Balance!");
       }
       else
       {
           this.currentBalance=this.currentBalance-amount;
           System.out.println("Successfully withdrawn "+ amount+" taka");
       }
   }

}
