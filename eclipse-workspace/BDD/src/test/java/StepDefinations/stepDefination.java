package StepDefinations;


import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Given.Givens;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
public class stepDefination  {

    @Given("^user login using valid cerdential$")
    public void user_login_using_valid_cerdential() throws Throwable {
        System.out.println("Login button");
    }

    @When("^user enter valid user and password$")
    public void user_enter_valid_user_and_password() throws Throwable {
        System.out.println("user name password");
    }

    @Then("^users profile should open$")
    public void users_profile_should_open() throws Throwable {
      System.out.println("successfull");
    }

}