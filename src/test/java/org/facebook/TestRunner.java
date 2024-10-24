package org.facebook;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/FeatureFiles", 
		glue="org.facebook", 
		monochrome = true,
		plugin={"pretty", "html:target/HtmlReports.html"}
		)

public class TestRunner{
	
}
