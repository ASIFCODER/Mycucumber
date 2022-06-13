package org.step;

import org.PageObject.LoginPageObject;
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
	CommonStepDefinition.getDriver().get(Constance.URL);
	
	System.out.println("User should be on loginpage");
}

@When("User enter valid id as userame and valid password")
public void user_enter_valid_id_as_userame_and_valid_password() {
	CommonStepDefinition.getDriver();
	LoginPageObject.userName.sendKeys(Constance.USER_NAME);
LoginPageObject.passWord.sendKeys(Constance.PASS_WORD);



}


@When("User click login button")
public void user_click_login_button() {
	LoginPageObject.loginButton.click();
	System.out.println("button clicked");
}

@Then("The homepage should be displayed")
public void the_homepage_should_be_displayed() {
	 String afterpagetitle = CommonStepDefinition.getDriver().getTitle();
	 System.out.println(afterpagetitle);
	 Assert.assertEquals("OrangeHRM", afterpagetitle);
}



}
