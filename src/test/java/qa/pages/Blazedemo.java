package qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.utils.Constants1;

public class Blazedemo {
	@FindBy(id = "inputName")
	WebElement firstLastNameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

	@FindBy(id = "cardType")
	List<WebElement> selectCardType;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumField;

	@FindBy(id = "creditCardMonth")
	WebElement monthField;

	@FindBy(id = "creditCardYear")
	WebElement yearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(id = "rememberMe")
	WebElement rememberMeButton;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement purchaseFlightButton;

	@FindBy(xpath = "//h1[contains(text(),'Thank you for your purchase today!')]")
	WebElement confirmationText;

	public Blazedemo() {
		PageFactory.initElements(Constants1.driver, this);
	}

	// methods
	public void enterFirstLastName(String firstLastName) {
		firstLastNameField.sendKeys(firstLastName);
	}

	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}

	public void enterState(String state) {
		stateField.sendKeys(state);
	}

	public void enterZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}

	public void selectCardType(String cardType) {
		for (WebElement cardTypeElement : selectCardType) {
			String card = cardTypeElement.getAttribute("value").trim();
			if (cardType.equalsIgnoreCase(card)) {
				Select select = new Select(cardTypeElement);
				select.selectByVisibleText(cardType);
				break;
			}
		}
	}

	public void enterCardNum(String cardNum) {
		creditCardNumField.sendKeys(cardNum);
	}

	public void enterCardMonth(String cardMonth) {
		monthField.clear();
		monthField.sendKeys(cardMonth);
	}

	public void enterCardyear(String cardYear) {
		yearField.clear();
		yearField.sendKeys(cardYear);
	}

	public void enterNameOnCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);
	}

	public void rememberMeButton() {
		rememberMeButton.click();
	}

	public void purchaseFlightButton() {
		purchaseFlightButton.click();
	}

	public void confirmationText(String confirmation) {
		String text = confirmationText.getText();
		if (confirmation.equalsIgnoreCase(text)) {
			System.out.println("Page Title is: " + text);
			System.out.println("TESTCASE PASSED");
		} else {
			System.out.println("TESTCASE FAILED");
		}
	}

}
