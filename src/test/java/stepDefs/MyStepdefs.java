package stepDefs;

import steps.MySteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class MyStepdefs {

    @Steps
    MySteps mySteps;

    @Given("^I am connected to the database$")
    public void i_am_connected_to_the_H_database() {

        mySteps.createConnection();
    }


    @When("^I execute a select query$")
    public void i_execute_a_select_query() {


    }

    @Then("^I should get some result$")
    public void i_should_get_some_result()  {


    }


}

