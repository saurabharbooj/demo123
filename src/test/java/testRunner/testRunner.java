package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFiles/pimpage.feature"},
		glue= {"StepDefination"},
		dryRun=false
		
						
		)
public class testRunner {

}

