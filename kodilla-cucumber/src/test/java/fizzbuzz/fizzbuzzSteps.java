package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class fizzbuzzSteps implements En {
    private int number;
    private String answer;



    public fizzbuzzSteps() {

        fizzbuzzCheck fizzbuzzCheck = new fizzbuzzCheck();


        Given("given number is number three", () -> {
            this.number = 3;
        });

        Given("given number is number five", () -> {
            this.number = 5;
        });

        Given("given number is number fifteen", () -> {
            this.number = 15;
        });

        Given("given number is number eight", () -> {
            this.number = 8;
        });

        When("I ask for answer", () -> {
            this.answer = fizzbuzzCheck.fizzbuzzCheck(this.number);
        });

        Then("I should be told {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });


    }

}
