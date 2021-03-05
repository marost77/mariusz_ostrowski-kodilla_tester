package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Given("I have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
        });

        When("I request $100", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 51);
        });

        Then("Withdraw zero and get notification", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("the balance of my wallet should be $170", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java8.PendingException();
        });


    }
}