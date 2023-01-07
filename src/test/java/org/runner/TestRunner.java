package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\AaProject\\src\\test\\resources\\FeatureFile", 
dryRun=false, strict=true, monochrome=true, glue="org.step", tags=("@Forget,@Login"), 
plugin= { "pretty",
		"html:AllReports\\HtmlReport",
		"json:AllReports\\JsonReport\\forget.json",
		"junit:AllReports\\JunitReport\\facfor.xml",
		
})

public class TestRunner {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\AllReports\\JsonReport\\forget.json");

	}

}
