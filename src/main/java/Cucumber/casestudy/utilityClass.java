package Cucumber.casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilityClass {
	static WebDriver driver;
	public static WebDriver startBrowser(String browser,String url)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Drivers\\chromedriver.exe\\");
			driver=new ChromeDriver();
		}
		driver.get(url);
		return driver;
	}

}
