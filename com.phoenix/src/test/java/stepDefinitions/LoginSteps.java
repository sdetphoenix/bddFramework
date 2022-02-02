package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import utilities.Utilities;

public class LoginSteps extends Base{
	
	LoginPageObjects login = new LoginPageObjects();
	
	@Given("^user is on test environment homepage$")
	public void user_is_on_test_environment_homepage() throws IOException {
		login.validateHomePage();
		logger.info("Homepage validated successfully");
		Utilities.takeScreenShot("Homepage");
	}
	
	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() {
		login.clickOnMyAccountButton();
		logger.info("My account button was clicked successfully");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		login.clickOnLoginButton();
		logger.info("Login button was clicked successfully");
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {
		login.enterUserName();
		login.enterPassword();
		logger.info("Username and Passwerd entered successfully");
	}
	
	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		login.enterUserNameWithParam(username);
		login.enterPasswordWithParam(password);
	}

	@Then("user click on login button to login to the page")
	public void user_click_on_login_button_to_login_to_the_page() {
		login.clickOnLoginButtonMain();
		logger.info("Login button was clicked successfully");
	}
}
