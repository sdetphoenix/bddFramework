package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pageObjects.RegisterPageObjects;


public class RegisterSteps extends Base{
	
	RegisterPageObjects registerpage = new RegisterPageObjects();
	
	@And("user click on register button")
	public void user_click_on_register_button() {
		registerpage.clickOnRegister();
		logger.info("Register button was clicked successfully");
	}

	@And("user fill registeration form with information below")
	public void user_fill_registeration_form_with_information_below(DataTable dataTable) {
		//We are storing data in a list of map
		//list is going to define the row
		//and map will define the columns
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		registerpage.enterFirstName(data.get(0).get("firstname"));
		registerpage.enterLastName(data.get(0).get("lastname"));
		registerpage.enterEmail(data.get(0).get("email"));
		registerpage.enterTelephoneNumber(data.get(0).get("telephone"));
		registerpage.enterPassword(data.get(0).get("password"));
		registerpage.enterConfirmPassword(data.get(0).get("confirmPassword"));
		logger.info("User data entered successfully");
	}

	@And("user click on agree to terms checkbox")
	public void user_click_on_agree_to_terms_checkbox() {
		registerpage.confirmTermsCheckBox();
		logger.info("Agree to terms check box selected successfully");
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() {
		registerpage.clickOnContinueButton();
		logger.info("Continue button clicked successfully");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
