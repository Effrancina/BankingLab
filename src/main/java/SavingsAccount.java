public class SavingsAccount extends BankAccount{

    double interestRate;
    public SavingsAccount(int balance, int minimumBalance, String accountHolderName, double interestRate){
        super(balance, minimumBalance, accountHolderName);
        this.interestRate = interestRate;

    }

    public void accrueInterest() {
        int currentBalance = super.getBalance();
        double newBalance = (double) currentBalance * (1.00 + interestRate);
        super.setBalance((int) newBalance);
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
}
