package com.qait.acs.tests;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.sql.DriverManager;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qait.automation.getpageobjects.BaseUi;
import com.qait.automation.getpageobjects.GetPage;

public class Qa_WebsiteTest extends BaseTest {

	public void logmsg(String str) {
		Reporter.log(str,true);
	}

	@Test(priority = 1,description="launching brwoser")
	public void Step01_Launch_Application() {
		logmsg("launching chrome browser");
		test.launchApplication(getYamlValue("baseUrl"));
		logmsg("launched chrome browser");
	}

	@Test(priority = 2,description="performing negative testing for search box")
	 public void verify_search_functionality() {
	 logmsg("verifying that search functionalityh is working properly");
	 logmsg("providing search input{}{{}{}{}");
	 String verification = test.qainfotechhomepage.clicksearchbutton();
	 Assert.assertEquals(verification,"Sorry, but nothing matched your search criteria. Please try again with some different keywords.");
	 logmsg("search functionality is working properly");
	 }

	@Test(priority = 3)
	public void testingservicesmenu() {
		logmsg("clicking on service menu");
		WebElement validate = test.qainfotechhomepage.checkservicesmenu();
		String text = validate.getText();
		Assert.assertEquals(text, "Our Services", "unable to locate our services");
		logmsg("service section is visible on clicking it");
	}

	@Test(priority = 4)
	public void testingvertical() {
		logmsg("verifying vertical section of the menu");
		WebElement v = test.qainfotechhomepage.checkverticalmenu();
		String text = v.getText();
		//System.out.println("debug is doing" + text);
		Assert.assertEquals(text, "Verticals", "unable to verify vertical section");
		logmsg("vertical section is displayed");

	}

	@Test(priority = 5)
	public void testinginnovation() {
		logmsg("verifying that innovation menu is working properly");
		WebElement v = test.qainfotechhomepage.checkinnovationmenu();
		String text = v.getText();
		//System.out.println("debug is doing" + text);
		Assert.assertEquals(text, "INNOVATION", "unable to verify innovation section");
		logmsg("innvoation section is displayed on clicking the innovation menu");

	}

	@Test(priority = 6)
	public void checkingteam() {
		logmsg("verifying that team section is being displayed");
		WebElement v = test.qainfotechhomepage.checkteammenu();
		String text = v.getText();
		//System.out.println("debug is doing" + text); 
		Assert.assertEquals(text, "Meet Our Team", "unable to verify team section");

		logmsg("Team section is  displayed when users click on the team menu button");

	}

	@Test(priority = 7)
	public void testing_news() {
		logmsg("verifying that news section is being displayed when user hits the news button");
		WebElement v = test.qainfotechhomepage.check_news_menu();
		String text = v.getText();
		//System.out.println("debug is doing" + text);
		Assert.assertEquals(text, "QAIT News", "unable to verify news  section");

		logmsg("News section is displayed on clicking on news ");
	}

	@Test(priority = 8)
	public void testingcontact() {
		logmsg("verifying that contact form is being displayed when users click on contact menu");
		WebElement v=test.qainfotechhomepage.check_contact_menu();
		String text = v.getText();
		System.out.println("debug is doing" + text);
		Assert.assertEquals(text, "Contact Us", "unable to verify contact  section");
		logmsg("successfully landed on contact section of page ");
	}

	@Test(priority = 9)
	public void verify_vertical_section() {
		logmsg("verifying that vertical section is being displayed");
		WebElement v=test.qainfotechhomepage.clickonhealthcares();
		String text=v.getText();
		
		logmsg("clicking on healthcare section ");
		Assert.assertEquals(text,"Health Care","unable to verify vertical section healtcare menu" );
		test.qainfotechhomepage.gotobackpage();
		logmsg("Healthcare submenu of Vertical section is redirecting to another page on clicking  healthe care ");
	}

	@Test(priority = 10)
	public void verify_download_section() {
		logmsg("verifying that download section is working ");
		logmsg("going to download page");
		test.qainfotechhomepage.clickdownloadsection();
		logmsg("working successfully");
	}
}
