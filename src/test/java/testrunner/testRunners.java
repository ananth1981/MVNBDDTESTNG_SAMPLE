package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="./src/test/java/feature",
		glue="stepdefinition",
		tags="@TNEB")
public class testRunners extends AbstractTestNGCucumberTests{

}

