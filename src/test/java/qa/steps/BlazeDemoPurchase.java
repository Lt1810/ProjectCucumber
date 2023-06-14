package qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import qa.pages.Blazedemo;
import qa.utils.Constants;
public class BlazeDemoPurchase {
	
	Blazedemo bDemo;

@Given("User get purchase page {string}")
public void user_get_purchase_page(String url) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	Constants.driver = new ChromeDriver();
	Thread.sleep(2000);
	Constants.driver.manage().window().maximize();
	Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Constants.driver.get(url);
	Thread.sleep(2000);
	bDemo = new Blazedemo();
	Actions actions = new Actions(Constants.driver);
	actions.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(1000);
}

@When("User enters Name {string}")
public void user_enters_name(String fisrtLastName) {
	bDemo.enterFirstLastName(fisrtLastName);
}

@When("User enters address {string}")
public void user_enters_address(String address) {
	bDemo.enterCardMonth(address);
}

@When("User enters City {string}")
public void user_enters_city(String city) {
	bDemo.enterCity(city);
}

@When("User enters State {string}")
public void user_enters_state(String state) {
	bDemo.enterState(state);
}

@When("User enters Zip Code {string}")
public void user_enters_zip_code(String zipCode) {
	bDemo.enterZipCode(zipCode);
}

@When("User selects Card Type {string}")
public void user_selects_card_type(String cardType) {
	bDemo.selectCardType(cardType);
}

@When("User enters Credit Card Number {string}")
public void user_enters_credit_card_number(String cardNum) {
	bDemo.enterCardNum(cardNum);
}

@When("User enters Month {string}")
public void user_enters_month(String month) {
	bDemo.enterCardMonth(month);
}

@When("User enters Year {string}")
public void user_enters_year(String year) {
	bDemo.enterCardyear(year);
}

@When("User enters Name on Card {string}")
public void user_enters_name_on_card(String nameOnCard) {
	bDemo.enterNameOnCard(nameOnCard);
}

@When("User clicks remember me box")
public void user_clicks_remember_me_box() {
	bDemo.rememberMeButton();
}

@When("User clicks Submit button")
public void user_clicks_submit_button() {
	bDemo.purchaseFlightButton();
}

@Then("User verifies confirmation message {string}")
public void user_verifies_confirmation_message(String confirmationMessage) throws InterruptedException {
	bDemo.confirmationText(confirmationMessage);
	Thread.sleep(3000);
	Constants.driver.quit();
}
}
