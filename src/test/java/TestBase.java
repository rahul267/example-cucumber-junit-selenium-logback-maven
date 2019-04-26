import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before
    public void before() {
        logger.info("before ...");
    }


    @After
    public void tearDown(Scenario scenario) {
        logger.info("after ...");
    }
}
