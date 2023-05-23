package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
				features="src/test/resources/features/LoginPage.feature",
				glue ="definitions",
				plugin = { "pertty",
						"html:test-output",
						"json:target/cucumber/cucumber.json", 
						"html:target/cucumber-html-report"						
				}		
		)

public final class CucumberRunner extends AbstractTestNGCucumberTests{

}
