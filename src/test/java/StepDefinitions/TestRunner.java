package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\gunja\\eclipse-workspace\\FreeCRM\\src\\test\\resources\\Features\\LoginPOM.feature",
glue={"StepDefinitions"},
plugin= {"pretty","html:target/HtmlReports"},
dryRun=false,monochrome=true
)
public class TestRunner {
//login
	
}
