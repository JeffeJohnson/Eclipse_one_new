package org.one;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\cucumber.feature",glue="org.stepdef" 
											,dryRun=false,monochrome=true,
			plugin= {"pretty","html:C:\\Users\\dell\\eclipse-workspace\\Cucumberone\\src\\test\\resources\\Reports",
					"junit:C:\\Users\\dell\\eclipse-workspace\\Cucumberone\\src\\test\\resources\\Reports\\reportsxml.xml",
					"json:C:\\Users\\dell\\eclipse-workspace\\Cucumberone\\src\\test\\resources\\Reports\\jsonreport.json"})
public class TestRunner {

}
