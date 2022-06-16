package org.Utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.PageObject.LoginPageObject;
import org.apache.commons.io.FileUtils;
import org.contance.Constance;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.step.CommonStepDefinition;

public class Common_Utils {
	// Creating Singleton for this class
	private static Common_Utils CommonUtilsInstance = null;

	private Common_Utils() {
	}

	public static Common_Utils CommonUtilsGetInstance() {

		if (CommonUtilsInstance == null) {
			CommonUtilsInstance = new Common_Utils();
		}
		return CommonUtilsInstance;
	}

	public  void loadProperties() {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("confiq.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property = null;
		try {
			property = new Properties();
			property.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Constance.URL = property.getProperty("APP_URL");
		Constance.USER_NAME = property.getProperty("USERNAME");
		Constance.PASS_WORD = property.getProperty("PASSWORD");

	}

	public void initelement() {
		PageFactory.initElements(CommonStepDefinition.getDriver(), LoginPageObject.getInstance());
	}

	public void takeScreenShot() {
		File screenshot = ((TakesScreenshot) CommonStepDefinition.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("Screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
