package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = {"src/test/java/features"}, 
				glue = {"steps"}, 
				monochrome = true,
				publish = true,
				//tags = "@functional" //to execute all scenarios having @functional
				//tags = "@smoke or @functional" //to execute the scenarios with @smoke or @functional
				//tags = "@regression and @functional" //to execute the scenarios with both @regression and @functional
				tags = "not @regression" // to execute all the test scenarios except @regression
				
				
				//dryRun = true,
				//snippets = SnippetType.CAMELCASE
				)
public class TestRunner extends AbstractTestNGCucumberTests{
    
}
