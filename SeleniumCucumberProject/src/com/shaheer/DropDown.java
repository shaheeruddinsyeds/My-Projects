package com.shaheer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String args[]) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("Sohail");
		WebDriver driver = new FirefoxDriver(profile);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		driver.get("https://www.facebook.com");
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='email']")));
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement month = driver.findElement(By.xpath(".//*[@id='month']"));
		Select select = new Select(month);
		select.selectByIndex(10);

	}

}
