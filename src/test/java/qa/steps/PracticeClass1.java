package qa.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.pages.Blazedemo;

public class PracticeClass1 {
	Blazedemo bd;

	@When(".* enterValue \"(.*)\"\"(.*)\"$")
	public void user_enters_name_enter_value(String string) throws InterruptedException {
	}

	@When(".* selectsValue \"(.*)\"\"(.*)\"$")
	public void user_selects_card_type_selects_value(String string) throws InterruptedException {
	}

	@When(".* click \"(.*)\"$")
	public void user_clicks_remember_me_box_click(String string) throws InterruptedException {
	}

	@Then(".* verifiesValue \"(.*)\"\"(.*)\"$")
	public void user_verifies_confirmation_message_verifies_value(String string) throws InterruptedException {
	}
}
