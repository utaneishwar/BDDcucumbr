package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
(
		features = {"C:\\Users\\intel\\eclipse-workspace\\BddCucumberBevarageDomain\\src\\test\\resources\\FetaureFile\\signup.feature"},
		glue = {"stepdefinitions"},
		plugin = {"pretty"}
		
		
		
		
		)

public class SignupRunner extends AbstractTestNGCucumberTests
{

}
