package stepdefinitions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchClass {

		@Given("user should be on Better Rhodes page")
		public void user_should_be_on_better_rhodes_page() 
		{
          System.out.println("user should be on better rhodes page");
		}

		@When("user provided text into the search functionality")
		public void user_will_provided_text_into_the_serch_functionality() 
		{
			System.out.println("user should be provided text winepage");
		}

		@Then("User can seen search related product to the next page")
		public void user_can_seen_search_related_product_to_the_next_page()
		{
			System.out.println("user should navigate next page ");
		}

	}


