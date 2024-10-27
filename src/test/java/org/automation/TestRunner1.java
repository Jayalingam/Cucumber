package org.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/FeatureFiles/automation.feature",
        glue="org.automation",
        monochrome = true,
        plugin={"pretty", "html:target/HtmlReports.html", "json:target/cucumber/cucumber.json"}
)

public class TestRunner1 {

}
