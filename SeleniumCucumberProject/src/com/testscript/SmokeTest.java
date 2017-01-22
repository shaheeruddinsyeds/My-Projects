package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("Sohail");
		driver = new FirefoxDriver(profile);
		wait = new WebDriverWait(driver, 10);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	
	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_and_valid(String username, String password) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
	}
	



	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		throw new PendingException();
	}
}
