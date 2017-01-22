package com.shaheer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BootStrapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("Sohail");
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='hdr_user_signin']/span/a[1]")).click();
		driver.switchTo().frame("authiframe");
		driver.findElement(By.xpath(".//*[@id='id_username']")).sendKeys("shaheeruddinsyeds@gmail.com");
		
		
	

	}

}
