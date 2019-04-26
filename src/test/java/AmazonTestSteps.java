import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmazonTestSteps {

    private Logger logger = LoggerFactory.getLogger(AmazonTestSteps.class);

    @Given("^User opens page$")
    public void userOpenPage() {

        logger.info("user is opening main page");

        delay();
    }

    @Then("^User typing a search query$")
    public void userTypingSearchQuery() {

        logger.info("user typing a search query");

        delay();
    }


    @When("^User clicks search button$")
    public void userClicksSearchButton() {

        logger.info("user clicks search button");

        delay();
    }

    private void delay() {

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
