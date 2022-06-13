package org.Utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.PageObject.LoginPageObject;
import org.contance.Constance;
import org.openqa.selenium.support.PageFactory;
import org.step.CommonStepDefinition;

public class Common_Utils {
	
	public static void loadProperties() {
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
	        
	    
	   Constance.URL= property.getProperty("APP_URL");
	   Constance.USER_NAME=property.getProperty("USERNAME");
	   Constance.PASS_WORD=property.getProperty("PASSWORD");
	   
	   	}
	public static void initelement() {
    PageFactory.initElements(CommonStepDefinition.getDriver(), LoginPageObject.class);
	}
	
	

}
