package org.step;

import org.PageObject.LoginPageObject;
import org.Utlity.Common_Utils;
import org.apache.hc.core5.util.Asserts;
import org.contance.Constance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Verifylogin_stepDefinition {

	@Given("User should be on loginpage")
	public void user_should_be_on_loginpage() {
		try {
			CommonStepDefinition.getDriver().get(Constance.URL);
			System.out.println("User should be on loginpage");
		} catch (Exception e) {
			Common_Utils.CommonUtilsGetInstance().takeScreenShot();
		}
	}

	@When("User enter valid id as userame and valid password")
	public void user_enter_valid_id_as_userame_and_valid_password() {
		
		try {
			CommonStepDefinition.getDriver();
			LoginPageObject.getInstance().enterUserName(Constance.USER_NAME);
			LoginPageObject.getInstance().enterPassWord(Constance.PASS_WORD);
		} catch (Exception e) {
			Common_Utils.CommonUtilsGetInstance().takeScreenShot();
		}

	}

	@When("User click login button")
	public void user_click_login_button() {
		try {
			LoginPageObject.getInstance().clickLoginButton();
			System.out.println("button clicked");
		} catch (Exception e) {
			Common_Utils.CommonUtilsGetInstance().takeScreenShot();
		}
	}

	@Then("The homepage should be displayed")
	public void the_homepage_should_be_displayed() {
		try {
			String afterpagetitle = CommonStepDefinition.getDriver().getTitle();
			System.out.println(afterpagetitle);
			
		} catch (Exception e) {
			CommonStepDefinition.getDriver().getTitle();
		}
	}

}
