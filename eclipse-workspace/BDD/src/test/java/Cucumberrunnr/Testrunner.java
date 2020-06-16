package Cucumberrunnr;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

public class Testrunner {

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/features",
	glue="StepDefinations")
	public class TestRunner() {
		
	}
	
}
