package org.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {

	private static LoginPageObject Instance;

	private LoginPageObject() {
	}

	public static LoginPageObject getInstance() {

		if (Instance == null) {
			Instance = new LoginPageObject();

		}
		return Instance;

	}

	@FindBy(id = "txtUsername")
	private WebElement userName;
	@FindBy(id = "txtPassword")
	private WebElement passWord;
	@FindBy(id = "btnLogin")
	private WebElement loginButton;

//	public WebElement getUserName() {
//		return userName;
//	}
//
//	public WebElement getPassWord() {
//		return passWord;
//	}
//
//	public WebElement getLoginButton() {
//		return loginButton;
//	}

	public void enterUserName(String UserName) {
		userName.sendKeys(UserName);
	}

	public void enterPassWord(String PassWord) {
		passWord.sendKeys(PassWord);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
