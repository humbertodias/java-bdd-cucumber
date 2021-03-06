package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features",
        tags = "@BankTest",
        glue = "cucumber.test.steps",
        monochrome = true,
        dryRun = false)
public class BankTest {

}