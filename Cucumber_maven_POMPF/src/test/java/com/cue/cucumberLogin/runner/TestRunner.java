package com.cue.cucumberLogin.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "com.cue.cucumberLogin.stepDefinations" }, plugin = { "pretty",
		"html:target/site/cucumber-pretty", "json:target/cucumber.json" }, tags = { "~@ignore" })

public class TestRunner {
	public static void main(String[] args) {
	}
}
