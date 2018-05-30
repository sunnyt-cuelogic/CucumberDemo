package com.cue.cucumberLogin.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cue.cucumberLogin.pageObjects.HomePage;
import com.cue.cucumberLogin.pageObjects.Login;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginTest {

	WebDriver driver;
	HomePage homepage;
	Login login;

	@Given("^I go to gmail page$")
	public void i_go_to_Home_Page() throws Throwable {
		System.out.println("INSIDE @Given");
		System.setProperty("webdriver.chrome.driver", "C:\\JARS\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://gmail.com");
		driver.get("https://www.google.com");
		System.out.println("GIVEN passed");
	}

	@When("^I navigate to login url$")
	public void login_url() throws Throwable {

		homepage = new HomePage(driver);
		homepage.clickLink_mail();
		homepage.clickLink_signIn();
		System.out.println("WHEN passed");
	}

	@And("^I enter username and password$")
	public void enter_user_password() throws Throwable {
		login = new Login(driver);

		login.enter_user("sunny.tokhi@cuelogic.com");
		login.click_user_next();
		login.enter_pass("password");
		login.click_pass_next();
	}

	@Then("^I should not be able to login$")
	public void invalid_login() throws Throwable {
		login.getMessage();
	}
}
