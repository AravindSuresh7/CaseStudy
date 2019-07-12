package Cucumber.casestudy;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login {
	WebDriver driver;
	@Given("^user must be on Login page$")
	public void user_must_be_on_Login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver=utilityClass.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/login.htm"); 
		   Assert.assertEquals(driver.getTitle(), "Login");
		   System.out.println(" login page");
	}

	@Given("^user enters registered credentials$")
	public void user_enters_registered_credentials(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<Map<String,String>> list=dt.asMaps(String.class, String.class);
	    for(int i=0;i<list.size()-1;i++)
	    {
//	    	System.out.println(list.get(i).get("Username")+" "+
//	    list.get(i).get("Password"));
//	    	System.out.println("\n");
	    	pageFactory login= PageFactory.initElements(driver, pageFactory.class);
	    	login.login_reg(list.get(i).get("value"), list.get(i+1).get("value"));
	    	System.out.println("user entered valid credentials");
	    }
	}

	@Then("^user must be in Home Page$")
	public void user_must_be_in_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals(driver.getTitle(), "Home");
		 System.out.println(" home page");
	}


}
