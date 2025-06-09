package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Stepdefintion {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(DataTable dt) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();

		
		System.out.println("siddhant");
	}

	@And("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("simant");
	}

	@When("I complete action")
	public void i_complete_action(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		List<List<String>> siddhant=dataTable.asLists(String.class);
		for(List<String> simant: siddhant)
		{
			System.out.println(simant);
		}
		System.out.println("complete action");
	}

	@When("some other action")
	public void some_other_action(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	List<Map<String, String>> simant	=dataTable.asMaps(String.class, String.class);
		System.out.println(simant);
		System.out.println(simant.get(0).get("complete"));
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Manmath");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		System.out.println("manasi");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("sarita");
	}


}
