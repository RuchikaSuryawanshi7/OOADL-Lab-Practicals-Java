package i4;

public class BankAccount {
    private int AccountNo = 0;
    private double AccountBalance = 0;
    private static  int bankAccNGenerator = 1;

    public BankAccount(int accno, double accbal){
        this.AccountNo = accno;
        this.AccountBalance = accbal;
    }
    public BankAccount(double accountBalance){
        this.AccountNo = bankAccNGenerator++;
    }
    public int getAccountNo(){
        return this.AccountNo;
    }
    public  double getAccountBalance(){
        return  this.AccountBalance;
    }
    public void withDraw(double amt){
        if(this.getAccountBalance() < 2000){
            double withDrawAmt = getAccountBalance() - amt;
            System.out.println("Balance Available after with Drawing the amt "+amt+" is "+ withDrawAmt);
        }else {
            System.out.println("Balance in not Sufficient to withdraw a the amount given!!");
        }
    }
    public  void deposit(double amt){
        double depositAmount = getAccountBalance() + amt;
        System.out.println("Account Balance after deposit of "+ amt + "is "+ depositAmount);
    }

    public void transfer(BankAccount b, double amt){
        this.AccountBalance -= amt;
        b.setAccountBalance(this.AccountBalance+amt);
        System.out.println("Account Balance after transfer is "+ this.getAccountBalance());
    }

    private void setAccountBalance(double abal) {
        this.AccountBalance = abal;
    }
}
