package in.TravelTest.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import in.TravelTest.Page.LoginPage;
public class LoginWithValidandInvalidData {
	@Test (priority = 0) 
	
	public void loginWithValid() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
		
		LoginPage p = new LoginPage(w);
		p.login();
		Thread.sleep(2000);
		p.enterEmail("hardikdhanwade@gmail.com");
		Thread.sleep(2000);
		p.enterPassword("9876543210");
		Thread.sleep(2000);
		p.rememberMe();
		Thread.sleep(2000);
		p.loginButton();
		Thread.sleep(2000);
		w.quit();
		
	}
	
	@Test (priority = 1)
	
	public void loginWithInvalid() throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
		LoginPage p = new LoginPage(w);
		p.login();
		Thread.sleep(2000);
		p.enterEmail("hardik@gmail.com");
		Thread.sleep(2000);
		p.enterPassword("ArcBark");
		Thread.sleep(2000);
		p.rememberMe();
		Thread.sleep(2000);
		p.loginButton();
		Thread.sleep(2000);
		Assert.assertEquals(true,false);
		
		
	}
}
