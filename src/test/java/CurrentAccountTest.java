import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {

    CurrentAccount account;

    @BeforeEach
    public void initialise() {

        account = new CurrentAccount(100, 250, 50, "Snoop Dogg");
    }

    @Test
    public void TestWithdrawAcceptableAmount() {
        int amount = 10;
        boolean acceptableWithdrawal = account.withdraw(amount);
        Assertions.assertTrue(acceptableWithdrawal);
    }

    @Test
    public void TestGetMaximumWithdrawalAmount() {
        int maxWithdrawalAmount = account.getMaximumWithdrawalAmount();
        Assertions.assertEquals(100, maxWithdrawalAmount);

    }

    @Test
    public void TestSetMaximumWithdrawalAmount() {
        account.setMaximumWithdrawalAmount(200);
        Assertions.assertEquals(200, account.getMaximumWithdrawalAmount());

    }


}
