package org.step;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {
	
	
	@Given("User have to enter facebook using chrome")
	public void user_have_to_enter_facebook_using_chrome() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
	}

	@When("User enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() throws InterruptedException {
		WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("rajsdehr");
		
		WebElement findElement2 = d.findElement(By.id("pass"));
		findElement2.sendKeys("123456789");
		
		WebElement findElement3 = d.findElement(By.name("login"));
		findElement3.click();
		
		Thread.sleep(3000);
	}

	@Then("User have to receive the message as invalid credentials")
	public void user_have_to_receive_the_message_as_invalid_credentials() {
		if (d.getCurrentUrl().contains("privacy_mutation_token")) {
			WebElement findElement = d.findElement(By.xpath("//div[contains(text(),'The email address or')]"));
			String text = findElement.getText();
			System.out.println("The Given Text Is For Failed To Login is :"+text);
		}
		else {
			System.out.println("Valid Username");
		}
	}

	@Then("User have to close the browser")
	public void user_have_to_close_the_browser() {
		System.out.println("Close The browser");
	}
}
