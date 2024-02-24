package runner;

import Navigate.Webpagehomepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;


@RunWith(SerenityRunner.class)
public class MyStepdefs {

    @Steps
    Webpagehomepage Webpagehomepage;

    @Step("Open the login page")
    @Given("enter emailid")
    public void enter_emailid() throws InterruptedException {
        Webpagehomepage.Webhomepage();
        Webpagehomepage.enterEmail();
    }

    @Step("Enter Email")
    @When("enter first name")
    public void enter_first_name() {
        Webpagehomepage.firstName();
    }

    @Step("Enter last name")
    @Then("enter last name")
    public void enter_last_name() {
        Webpagehomepage.lastName();
    }

    @Step("select checkbox")
    @Then("select checkbox")
    public void select_checkbox() {
        Webpagehomepage.selectCheckbox();
    }

    @Step("select signup")
    @Then("click on signup button")
    public void click_on_signup_button() throws InterruptedException {
        Webpagehomepage.clickSignup();
        Webpagehomepage.closeDriverwindow();

    }
}
