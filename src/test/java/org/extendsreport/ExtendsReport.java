package org.extendsreport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendsReport {

	public static void main(String[] args) {

		ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "\\ExtensReport\\ExtentReportResults.html");
		ExtentTest test = report.startTest("ExtentDemo");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if (driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the specified URL");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}

		report.endTest(test);
		report.flush();
	}

}
