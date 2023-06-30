package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"C:\\Users\\intel\\eclipse-workspace\\BddCucumberBevarageDomain\\src\\test\\resources\\FetaureFile\\search.feature"}, 
		glue= {"stepdefinitions"},
		publish=true
		)

public class Runnerclass extends AbstractTestNGCucumberTests
{

}
