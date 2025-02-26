package test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.SwagLabLoginPage;


public class SwagLabLoginTest extends BaseTest{
	
	@BeforeMethod
	public void launch_browser() {
		driver=Browser.launch("https://www.saucedemo.com");
	}
	@AfterMethod
	public void close_browser() {
		driver.quit();
	}
	@Test
	public void UserIsAbleToLoginOrNot() {
		SwagLabLoginPage swagLabLoginPage=new SwagLabLoginPage(driver);
		swagLabLoginPage.inputusername("standard_user");
		swagLabLoginPage.inputpass("secret_sauc");
		swagLabLoginPage.loginbtn();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		
	}

}
