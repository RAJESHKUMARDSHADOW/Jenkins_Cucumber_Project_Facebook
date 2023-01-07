package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="@Re_run\\Re_failed.txt", 
dryRun=false, strict=true, monochrome=true, glue="org.step", tags=("~@Forget,@Login"))

public class TestRerunner {

	
}
