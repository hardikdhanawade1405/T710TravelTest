package in.TravelTest.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import in.TravelTest.Page.LoginPage;

public class LoginTestInMultipleScenarios {
	
	WebDriver w;
	LoginPage lp;
	@BeforeMethod 
	public void precondition() {
		w = new ChromeDriver();
		w.get("https://travel-test-bug.vercel.app/");
		lp = new LoginPage(w);
	}
@Test (priority = 0) 

public void checkLoginLink() throws Exception {
	Thread.sleep(2000);
	lp.login();
// hard Assertion
	Assert.assertEquals(w.getCurrentUrl(), "https://travel-test-bug.vercel.app/");
}
@Test (priority = 1)

public void loginWithValidData() throws Exception {
	 Thread.sleep(2000);
	 SoftAssert soft = new SoftAssert();
	 lp.login();
	 soft.assertEquals(w.getTitle(), "Login");
	 Thread.sleep(2000);
	 lp.enterEmail("hardikdhanwade@gmail.com");
	 Thread.sleep(2000);
	 lp.enterPassword("123456789");
	 Thread.sleep(2000);
	 lp.rememberMe();
	 Thread.sleep(2000);
	 lp.loginButton();
	 soft.assertEquals(w.getTitle(), "TravelTest");
	 Thread.sleep(2000);
	 soft.assertAll();
	 
}
@Test (priority = 2, enabled = false) 
public void loginWithInValidData() throws Exception {
	 Thread.sleep(2000);
	 lp.login();
	 Thread.sleep(2000);
	 lp.enterEmail("hardikdhanwade@gmail...com");
	 Thread.sleep(2000);
	 lp.enterPassword("123456qjkdb789");
	 Thread.sleep(2000);
	 lp.rememberMe();
	 Thread.sleep(2000);
	 lp.loginButton();
	 Thread.sleep(2000);

}

@Test (priority = 3) 

public void forgetPasswordLink() throws Exception {
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.forgetPassowrd();
}

@Test (priority = 4)

public void createAnAccount() throws Exception {
	Thread.sleep(2000);
	lp.login();
	Thread.sleep(2000);
	lp.createAnAccount();
}
@AfterMethod
public void closeAnBrowser() throws Exception{
	Thread.sleep(2000);
	w.quit();
}
}