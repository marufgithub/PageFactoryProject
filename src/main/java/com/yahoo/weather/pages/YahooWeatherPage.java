package com.yahoo.weather.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class YahooWeatherPage 
{
private FirefoxDriver driver;
@FindBy(how=How.XPATH,using = "//div[@id='yucs-input_wrap']/input[contains(@class,'search')]")
private WebElement inputSearchCityName;
//@FindBy(how=How.XPATH,using="//*[@id='yui_3_9_1_1_1398308071543_1421']") private WebElement inputText;
@FindBy(how=How.XPATH,using = "//button[@id='yucs-sprop_button']") 
private WebElement searchButton;	
	public YahooWeatherPage(FirefoxDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public YahooWeatherSearchPage searchResult()
	{
//		driver.findElement(By.xpath("//div[@id='yucs-input_wrap']/input[contains(@class,'search')]")).sendKeys("Bronx");
		inputSearchCityName.sendKeys("Bronx");
		searchButton.click();
		return new YahooWeatherSearchPage(driver);
	}
	

}
