package stepdefinition;


import com.qait.acs.tests.BaseTest;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verticals extends BaseTest {
	@Given("^users is on home page$")
	public void users_is_on_home_page() throws Throwable {
	   Start_Test_Session();
	}

	@When("^clicks on the verticals menu$")
	public void clicks_on_the_verticals_menu() throws Throwable {
		test.qainfotechhomepage.checkverticalmenu();
	}

	@When("^clicks on submenu of verticals$")
	public void clicks_on_submenu_of_verticals() throws Throwable {
		test.qainfotechhomepage.clickonhealthcares();
		
	   
	}

	@Then("^must redirect to submenu pages$")
	public void must_redirect_to_submenu_pages() throws Throwable {
		test.qainfotechhomepage.gotobackpage();
		close_Test_Session();
	}
	
}
