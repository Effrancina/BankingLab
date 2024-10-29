public class CurrentAccount extends BankAccount {

    int maximumWithdrawalAmount;

    public CurrentAccount(int maximumWithdrawalAmount, int balance, int minimumBalance, String accountHolderName) {
        super(balance, minimumBalance, accountHolderName);
        this.maximumWithdrawalAmount = maximumWithdrawalAmount;
    }

    @Override
    public boolean withdraw(int amount){
        return true;
    }

    public int getMaximumWithdrawalAmount(){
        return this.maximumWithdrawalAmount;
    }

    public void setMaximumWithdrawalAmount(int newAmount){
        this.maximumWithdrawalAmount = newAmount;
    }
}
