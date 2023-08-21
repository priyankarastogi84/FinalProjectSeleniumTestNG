package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver; //this driver do not have scope.
	
	private By MyAccount = By.xpath("//span[contains(text(),'My Account')]");
	
	private By NavigateToLogin =By.xpath("//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']");

	private By username = By.xpath("//input[@name='email']");

	private By password = By.xpath("//input[@name='password']");

	private By login = By.xpath("//input[@value='Login']");
	
	private By logout =By.xpath("(//a[contains(text(),'Logout')])[1]");
	
	private By AccountLogoutMessage =By.xpath("//h1[contains(text(),'Account Logout')]");

	public LoginPageObjects(WebDriver driver2) {
		
		this.driver =driver2;
	}

	public WebElement NavigateToMyAccount() {

		return driver.findElement(MyAccount);

	}

	public WebElement NavigateToLogin() {

		return driver.findElement(NavigateToLogin);

	}
	public WebElement enterUsername() {

		return driver.findElement(username);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}
	
     public WebElement clickOnLogin() {
		
		return driver.findElement(login);
		
		
	}
     public WebElement clickOnLogout() {
 		
 		return driver.findElement(logout);
 		
 		
 	}
     public WebElement AccountLogoutMessage() {
  		
  		return driver.findElement(AccountLogoutMessage);
  		
  		
  	}
}
