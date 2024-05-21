public class CheckingAccount{
    public double currentBalance;
     final public double penalty1=30.0;
     final public double penalty2=20.0;
     String currentMonth="a";
    public void Deposit(double amount)
    {

        this.currentBalance=this.currentBalance+amount;
    }
    public double getCurrentBalance()
    {
        return this.currentBalance;

    }
    public void getWithdraw(double amount,String month,int cnt)
    {

       if(this.currentMonth!=month)
       {
           this.currentMonth=month;
           if(this.currentBalance<amount+penalty1)
           {
               System.out.println("Insufficient Balance!");
           }
           else
           {
               this.currentBalance=this.currentBalance-(amount+penalty1);
               System.out.println("Successfully withdrawn "+ amount+" $");
           }
       }
       else if(this.currentMonth==month && cnt==1)
       {
           this.currentMonth=month;
           if(this.currentBalance<amount+penalty1)
           {
               System.out.println("Insufficient Balance!");
           }
           else
           {
               this.currentBalance=this.currentBalance-(amount+penalty1);
               System.out.println("Successfully withdrawn "+ amount+" $");
           }
       }
       else
       {
           this.currentMonth=month;
           if(this.currentBalance<amount+penalty2)
           {
               System.out.println("Insufficient Balance!");
           }
           else
           {
               this.currentBalance=this.currentBalance-(amount+penalty2);
               System.out.println("Successfully withdrawn "+ amount+" $");
           }
       }
    }

}