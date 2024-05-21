public class BasicAccount extends BankAccount {
    public String name;
    public int accountNumber;

    public static void main(String[] args) {
        BasicAccount account1=new BasicAccount();
        account1.name="Krishna Saha";
        account1.accountNumber=12345678;
        account1.Deposit(10000);
        System.out.println(account1.getCurrentBalance());
        account1.getWithdraw(5000);
        System.out.println(account1.getCurrentBalance());
        account1.Deposit(15000);

        System.out.println(account1.getCurrentBalance());
        account1.getWithdraw(5000);
        System.out.println(account1.getCurrentBalance());
    }

}