package org.step;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Utlity.Common_Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonStepDefinition {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	@Before
	public void browserlaunch() throws IOException {
		Common_Utils.loadProperties();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Common_Utils.initelement();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@After
	public void Teardown() {
     driver.quit();
	}

	
	}


	
	