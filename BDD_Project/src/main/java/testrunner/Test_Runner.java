package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "C:\\Users\\hp\\BDD_Project\\src\\test\\java\\Feature.feature"
        ,glue = {"tc_implementation",
        		"Snippet"},
        plugin= {"pretty",
        		"html:target/site/cucumber-pretty",
        		"json:target/cucumber.json"},
        		  monochrome = true,
        				  publish = true
,tags = "@TestCase1")
		

public class Test_Runner {

}
