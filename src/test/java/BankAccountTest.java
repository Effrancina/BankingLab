
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.nio.channels.AsynchronousServerSocketChannel;

public class BankAccountTest {

//    Test Methods
    BankAccount account;
    @BeforeEach
    public void initialise() {

        account = new BankAccount(105, 5, "Martha Stewart");
    }

//    Deposit
    @Test
    public void testDeposit(){
//        Deposit function takes an int and adds it to balance

//        Given a bank account with balance x
//        And deposit y
//        getBalance should return x + y
        account.deposit(10);
        int balance = account.getBalance();
        Assertions.assertEquals(115,balance);

    }

    // Withdraw
    @Test
    public void testWithdrawAcceptibleAmount(){

//        After calling withdraw
        boolean worked = account.withdraw(20);
//        Balance should change by x amount
        Assertions.assertEquals(85, account.getBalance());
//        Should return true
        Assertions.assertTrue(worked);
    }

    @Test
    public void testWithdrawImpossibleAmount(){

//        After calling withdraw
//        Balance should remain the same
//        Should return false
        boolean didntWork = account.withdraw(300);
        Assertions.assertEquals(105, account.getBalance());
        Assertions.assertFalse(didntWork);
    }

//    Test Getters
    @Test
    public void testGetBalance(){
        int balance = account.getBalance();
        Assertions.assertEquals(105, balance);
    }

    @Test
    public void testGetMinimumBalance(){
        int minBalance = account.getMinimumBalance();
        Assertions.assertEquals(5, minBalance);
    }

    @Test
    public void testGetAccountHolderName(){
        String name = account.getAccountHolderName();
        Assertions.assertEquals("Martha Stewart", name);
    }
//    Test Setters

    @Test
    public void testSetBalance(){
        account.setBalance(10);
        Assertions.assertEquals(10, account.getBalance());
    }

    @Test
    public void testSetMinimumBalance(){
        account.setMinimumBalance(1);
        Assertions.assertEquals(1, account.getMinimumBalance());
    }

    @Test
    public void testSetAccountHolderName(){
        account.setAccountHolderName("Iestyn Mullinor");
        Assertions.assertEquals("Iestyn Mullinor", account.getAccountHolderName());

    }
}
