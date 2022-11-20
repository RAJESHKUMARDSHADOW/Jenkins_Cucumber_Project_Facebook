package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\AaProject\\src\\test\\resources\\FeatureFile", 
dryRun=false, strict=true, monochrome=true, glue="org.step", tags=("@Forget"))

public class TestRunner {

}
