package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"stepDefinitions"},
plugin = {"json:target/cucumber.json"})

public class TestRunner {
  //to run all stepDefinitions files in one Go, you use Test Runner //Run as JUnit here in BDD; just like TestNG in Sel
}

