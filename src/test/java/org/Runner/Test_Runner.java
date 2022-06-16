package org.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Cumcumber.feature",
glue = "org.step", 
dryRun = false,
monochrome = true

		)
public class Test_Runner {

}
