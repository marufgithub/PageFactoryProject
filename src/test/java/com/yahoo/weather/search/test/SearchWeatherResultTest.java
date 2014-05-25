package com.yahoo.weather.search.test;

import org.junit.Test;

import com.yahoo.weather.pages.YahooHomePage;
import com.yahoo.weather.pages.YahooWeatherPage;
import com.yahoo.weather.pages.YahooWeatherSearchPage;

public class SearchWeatherResultTest extends BaseTest
{
	YahooHomePage YHP;
	YahooWeatherPage YWP;
	YahooWeatherSearchPage YWSP;
	@Test
	public void searchWeaterTest()
	{
		YHP = new YahooHomePage(driver);
		YWP = YHP.clickWeatherlink();
		YWSP = YWP.searchResult();
//		driver.get("https://www.yahoo.com/");
	}

}
