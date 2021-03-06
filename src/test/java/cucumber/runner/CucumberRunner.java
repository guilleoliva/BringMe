package cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/", glue = "cucumber.steps", tags = "@helloworld")
public class CucumberRunner {
}
