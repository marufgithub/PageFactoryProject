package com.yahoo.weather.search.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public FirefoxDriver driver;
	@Before
	public void openURL()
	{
//		FirefoxBinary fb = new FireFoxBinary(File new("C:\\Program Files (x86)\\MozillaFirefox16\\firefox.exe"));
		FirefoxBinary fb = new FirefoxBinary(new File("C:\\Program Files (x86)\\MozillaFirefox16\\firefox.exe"));
		driver = new FirefoxDriver(fb,null);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After
	public void closeURL()
	{
		driver.quit();
	}

}
