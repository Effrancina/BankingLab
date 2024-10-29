import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SavingsAccountTest {

    SavingsAccount account;

    @BeforeEach
    public void initialise() {
        account = new SavingsAccount(100, 5, "Martha Stewart", 0.05);
    }

    @Test
    public void TestAccrueInterest() {
        // calling accrueInterest
//        Balance should be 105

        account.accrueInterest();
        Assertions.assertEquals(105, account.getBalance());
    }

    @Test
    public void TestGetInterestRate() {
        double interestRate = account.getInterestRate();
        Assertions.assertEquals(0.05, interestRate);

    }

    @Test
    public void TestSetInterestRate() {
        account.setInterestRate(0.1);
        Assertions.assertEquals(0.1, account.getInterestRate());
    }
}
