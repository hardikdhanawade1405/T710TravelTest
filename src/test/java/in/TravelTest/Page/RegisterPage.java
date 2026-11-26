package in.TravelTest.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;



public class RegisterPage {
	WebDriver w;
	public RegisterPage(WebDriver wd) {
		System.out.println(wd);
		w = wd;
		
		}
	//locator
	By fullName  = By.id("register-full-name-input");
	By email = By.name("email");
	By phoneNumber = By.cssSelector("input[data-testid=\"register-phone-input\"]");
	By gender = By.name("gender");
	By password = By.xpath("//input[@id=\"register-password-input\"]");
	By confirmPassword = By.id("register-confirm-password-input");
	By termAndCondition = By.id("register-terms-checkbox");
	By registerButton = By.cssSelector(" ");
	By loginLink = By.cssSelector(" ");
	By RegisterHomepage = By.cssSelector(" ");

	

	//Actions ->Methods
	//Homepage Register 
	

public void  register() {
	w.findElement(RegisterHomepage).click();
}
public void enterFullName(String fullName) {
	w.findElement(this.fullName).sendKeys(fullName);
}
public void clearFullName() {
	w.findElement(fullName).clear();
}
public void enterEmail(String Email) {
	w.findElement(email).sendKeys(Email);
}
public void clearEmail() {
	w.findElement(email).clear();
}
public void enterPhoneNumber(String PhoneNumber) {
	w.findElement(phoneNumber).sendKeys(PhoneNumber);
}
public void clearPhoneNumber() {
	w.findElement(phoneNumber).clear();
}

public void gender(String Gender) {
	List<WebElement> genders = w.findElements(gender);
	for(int i = 0 ; i < genders.size(); i++) {
		if(Gender.equalsIgnoreCase("Female")) {
			genders.get(0).click();
		} else if (Gender.equalsIgnoreCase("male")) {
			genders.get(1).click();
		}else if (Gender.equalsIgnoreCase("other")) {
			genders.get(2).click();
		}
	}
}

public void enterPassword(String Password) {
	w.findElement(password).sendKeys(Password);
}
public void clearPassword() {
	w.findElement(password).clear();

}
public void enterConfirmPassword(String ConfirmPassword) {
	w.findElement(confirmPassword).sendKeys(ConfirmPassword);
	}
public void clearConfirmPassword() {
	w.findElement(confirmPassword).click();
}
public void termAndCondition() {
	w.findElement(termAndCondition).click();
}
public void registerButton() {
	w.findElement(registerButton).click();
}
public void loginLink() {
	w.findElement(loginLink).click();
}
}