package cucumber.steps;

import cucumber.api.java.en.Given;

public class StepsDefinition {

    @Given("^I write hello in console$")
    public void i_write_hello_in_console() throws Throwable {
        System.out.println("Hellooooo");
    }
}
