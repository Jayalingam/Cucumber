package org.github;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeatureFiles/login.feature",
		glue="org.github",
		monochrome = true,
		plugin={"pretty", "html:target/HtmlReports.html", "json:target/cucumber/cucumber.json"}
		)

public class TestRunner{
	
}
