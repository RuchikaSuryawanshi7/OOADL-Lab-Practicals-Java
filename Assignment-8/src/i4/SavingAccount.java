package i4;

public class SavingAccount extends BankAccount{
    private static double Interest = 0.03;
    private  double Result;
    public SavingAccount(double amt){
        super(amt);
    }
    public void computeInterest(){
        Result = super.getAccountBalance()
    }
}
