package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"com.stepDefinition"},
monochrome = true,
//"html:target/CucumberReport.html",
//plugin = {"pretty","html:target/HTMLReports.html"
//plugin = {"pretty","html:target/HtmlReports"}
plugin = {"html:Reports/HTMLReports.html","json:Reports/JsonReports.json",
		"junit:Reports/XMLReports.xml"},
dryRun = false
)
public class Runner {

}
