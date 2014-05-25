package com.yahoo.weather.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YahooHomePage 
{
	
	private FirefoxDriver driver;
	@FindBy(how=How.XPATH, using="//li[@class='drag-item']//span[text()='Weather']") 
	private WebElement WeatherLink;
	
	
	public YahooHomePage(FirefoxDriver driver)
	{
		this.driver= driver;
		driver.get("https://www.yahoo.com/");
		PageFactory.initElements(driver, this);
	}
	
	public YahooWeatherPage clickWeatherlink()
	{
		WeatherLink.click();
		return new YahooWeatherPage(driver);
	}
	

}
