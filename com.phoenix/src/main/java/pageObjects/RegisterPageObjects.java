package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPageObjects extends Base{
	
	public RegisterPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	public void clickOnRegister () {
		register.click();
	}
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastNameField.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterTelephoneNumber(String phonenumber) {
		telephoneField.sendKeys(phonenumber);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordField.sendKeys(confirmPassword);
	}
	public void confirmTermsCheckBox() {
		agreeToTermsCheckBox.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}

}
