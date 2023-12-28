package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features= {"DataTable.feature"},
			glue= {"DataTable.java"},
			dryRun= false,
			monochrome= true
			
			)



	public class TestRunner {

	}
	
	
	


