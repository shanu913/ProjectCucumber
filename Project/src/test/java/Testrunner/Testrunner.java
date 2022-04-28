package Testrunner;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"stepDefination"}, 
monochrome = true,
plugin = { "pretty", "html:target/htmlreports" },

publish=true

//plugin = { "html:target/cucumber-html-reports","json:target/cucumber-reports/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Testrunner {
	 
	    }
	
