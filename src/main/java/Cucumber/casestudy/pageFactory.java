package Cucumber.casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class pageFactory {
	WebDriver driver;
	public pageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(name="userName")
	@CacheLookup
	WebElement uname;
	@FindBy(name="password")
	@CacheLookup
	WebElement pswd;
	@FindBy(name="Login")
	@CacheLookup
	WebElement btn;
	public void login_reg(String uid,String pwd)
	{
		uname.sendKeys(uid);
		pswd.sendKeys(pwd);
		btn.click();
	}
	
}
