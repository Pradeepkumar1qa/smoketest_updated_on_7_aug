package stepdefinition;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qait.acs.tests.BaseTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuItem extends BaseTest {
	WebElement validate;

	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		Start_Test_Session();
		test.launchApplication(getYamlValue("baseUrl"));

	}

	@When("^user clicks on the services menu$")
	public void user_clicks_on_the_services_menu() throws Throwable {
		validate = test.qainfotechhomepage.checkservicesmenu();
	}

	@Then("^must display servic section of website$")
	public void must_display_servic_section_of_website() throws Throwable {
		String text = validate.getText();
		Assert.assertEquals(text, "Our Services", "unable to locate our services");
		close_Test_Session();

	}

	@When("^user clicks on the vertical  menu$")
	public void user_clicks_on_the_vertical_menu() throws Throwable {
		validate = test.qainfotechhomepage.checkverticalmenu();
	}

	@Then("^must display vertical section of website$")
	public void must_display_vertical_section_of_website() throws Throwable {
		String text = validate.getText();
		Assert.assertEquals(text, "Verticals", "unable to verify vertical section");
		close_Test_Session();
	}

	@When("^user clicks on the innovation menu$")
	public void user_clicks_on_the_innovation_menu() throws Throwable {
		validate = test.qainfotechhomepage.checkinnovationmenu();
	}

	@Then("^must display innovation section of website$")
	public void must_display_innovation_section_of_website() throws Throwable {
		String text = validate.getText();
        Assert.assertEquals(text, "INNOVATION", "unable to verify innovation section");
         close_Test_Session();
	}

	@When("^user clicks on the team  menu$")
	public void user_clicks_on_the_team_menu() throws Throwable {
	    validate = test.qainfotechhomepage.checkteammenu();
		

	}

	@Then("^must display team section of website$")
	public void must_display_team_section_of_website() throws Throwable {
		String text = validate.getText();
		Assert.assertEquals(text, "Meet Our Team", "unable to verify team section");
	    close_Test_Session();
	}

	@When("^user clicks on the news  menu$")
	public void user_clicks_on_the_news_menu() throws Throwable {
		 validate = test.qainfotechhomepage.check_news_menu();
		
	}

	@Then("^must display news section of website$")
	public void must_display_news_section_of_website() throws Throwable {
		String text = validate.getText();
		Assert.assertEquals(text, "QAIT News", "unable to verify news  section");
        close_Test_Session();
	}

	
}
