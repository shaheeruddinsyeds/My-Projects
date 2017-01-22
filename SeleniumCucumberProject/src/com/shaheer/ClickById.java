package com.shaheer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickById {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("Sohail");
		WebDriver driver = new FirefoxDriver(profile);
		WebDriverWait wait= new WebDriverWait(driver, 10);

		driver.get("https://login.yahoo.com/");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='persistency']/div/label")));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//input[@class='checkbox']"))).click().build().perform();

	}

}
