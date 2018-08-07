package stepdefinition;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qait.acs.tests.BaseTest;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps extends BaseTest{
	String verification;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    Start_Test_Session();
		test.launchApplication(getYamlValue("baseUrl"));
	}

	@When("^User provide some inputs to search box and click the search button$")
	public void user_provide_some_inputs_to_search_box_and_click_the_search_button() throws Throwable {
		  verification = test.qainfotechhomepage.clicksearchbutton();
		
		
	}
   
	@Then("^should show message related to that word$")
	public void should_show_message_related_to_that_word() throws Throwable {
		 Assert.assertEquals(verification,"Sorry, but nothing matched your search criteria. Please try again with some different keywords.");
	     close_Test_Session();
	}


}
