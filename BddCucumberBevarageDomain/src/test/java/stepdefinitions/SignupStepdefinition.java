package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepdefinition 
{
	@Given("user Should be at signup page")
	public void user_should_be_at_signup_page() 
	{
	   System.out.println("signup page");
	}

	@When("user click on continue with facebook")
	public void user_click_on_continue_with_facebook() 
	{
	   System.out.println("continue with facebook"); 
	}

	@Then("user should redirect to next page")
	public void user_should_redirect_to_next_page()
	{
	    System.out.println(" validate the output");
	}

	@Given("user should be at login page")
	public void user_should_be_at_login_page()
	{
	    
	}

	@When("user enter the gmail {string}")
	public void user_enter_the_gmail(String string)
	{
	    System.out.println("gmail "+string);
	}

	@When("user enter the password {string}")
	public void user_enter_the_password(String string)
	{
	   System.out.println("password "+string );
	}

	@Then("user should be get errror message")
	public void user_should_be_get_errror_message() 
	{
	   System.out.println("error message show");
	}



}
