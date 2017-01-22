package com.shaheer;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountLogin {
	
	WebDriver driver; 
	public void settingTheProperties(){
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile profile = prof.getProfile("Sohail");		
		driver = new FirefoxDriver(profile);
	}
	
	//Locators used to login into the facebook and taking the screenshot..
	public static void main(String args[])throws Exception {
		FacebookAccountLogin fb=new FacebookAccountLogin();
		fb.settingTheProperties();
		fb.driver.get("https://www.facebook.com");
		fb.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		fb.driver.findElement(By.xpath(".//*[@id='u_0_1']")).sendKeys("syed");
		fb.driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys("shaheeruddin");
		fb.driver.findElement(By.xpath(".//*[@id='u_0_6']")).sendKeys("571-201-1258");
		fb.driver.findElement(By.xpath(".//*[@id='u_0_9']")).sendKeys("571-201-1258");
		fb.driver.findElement(By.xpath(".//*[@id='u_0_b']")).sendKeys("123456");
		Select select = new Select(fb.driver.findElement(By.xpath(".//*[@id='month']")));
		select.selectByIndex(10);
		Select select1 = new Select(fb.driver.findElement(By.xpath(".//*[@id='day']")));
		select1.selectByValue("24");
		Select select2 = new Select(fb.driver.findElement(By.xpath(".//*[@id='year']")));
		select2.selectByValue("1989");
		fb.driver.findElement(By.xpath(".//*[@id='u_0_l']/span[2]/label")).click();
		fb.driver.findElement(By.xpath(".//*[@id='u_0_f']")).click();
		File src = ((TakesScreenshot)fb.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("d://error.png"));
	}

}
