public class BankAccount {

    //    Properties
    private int balance;
    private int minimumBalance;
    private String accountHolderName;

    // constructor
    public BankAccount(int balance, int minimumBalance, String accountHolderName) {
        this.balance=balance;
        this.minimumBalance=minimumBalance;
        this.accountHolderName=accountHolderName;
    }


//    Methods
    public void deposit(int amount){
        balance += amount;
    }

    public boolean withdraw(int withdrawAmount) {

        if (balance - withdrawAmount < minimumBalance) {
            return false;
        }
        this.setBalance(balance - withdrawAmount);
        return true;
    }
//    With Getters and Setters
        public int getBalance () {
            return this.balance;
        }

        public void setBalance ( int balance){
            this.balance = balance;
        }

        public int getMinimumBalance () {
            return this.minimumBalance;
        }

        public void setMinimumBalance ( int minBalance){
            this.minimumBalance = minBalance;
        }

        public String getAccountHolderName () {
            return this.accountHolderName;
        }

        public void setAccountHolderName (String name){
            this.accountHolderName = name;
        }


}
