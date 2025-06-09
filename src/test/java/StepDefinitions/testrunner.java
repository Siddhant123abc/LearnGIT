package StepDefinitions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features= "src/test/resources/Features",glue= {"StepDefinitions"},monochrome = true,
plugin= {"pretty","html:target/htmlreports.html","pretty","json:target/jsonreports.json"},tags = "@siddhant")
public class testrunner extends AbstractTestNGCucumberTests{

}
