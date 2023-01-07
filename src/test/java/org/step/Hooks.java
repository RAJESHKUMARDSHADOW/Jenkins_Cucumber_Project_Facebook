package org.step;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;

public class Hooks extends BaseClass {

@After
public void aft(Scenario se) {
	System.out.println("After-----------------------------------------------------");
	TakesScreenshot tk = (TakesScreenshot)d;
	byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
	se.embed(screenshotAs, "image/png");
}
}
 