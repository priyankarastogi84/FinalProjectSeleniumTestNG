package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {

	public WebDriver driver; // this driver do not have scope.

	private By MyAccount = By.xpath("//span[contains(text(),'My Account')]");
	private By Register =By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/register'])[1]");
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By passwordconfirm = By.xpath("//input[@name='confirm']");
	private By agree = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	private By AccountCreatedMessage =By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

	

	public SignUpPageObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement NavigateToMyAccount() {

		return driver.findElement(MyAccount);

	}
	public WebElement NavigateToRegister() {

		return driver.findElement(Register);

	}

	public WebElement enterFirstname() {

		return driver.findElement(firstname);

	}

	public WebElement enterLastname() {

		return driver.findElement(lastname);

	}

	public WebElement enterEmail() {

		return driver.findElement(email);

	}

	public WebElement enterTelephone() {

		return driver.findElement(telephone);

	}

	public WebElement enterPassword() {

		return driver.findElement(password);

	}

	public WebElement enterPasswordConfirm() {

		return driver.findElement(passwordconfirm);

	}

	public WebElement enterAgree() {

		return driver.findElement(agree);

	}

	public WebElement enterContinue() {

		return driver.findElement(Continue);

	}
	public WebElement AccountCreatedMessage() {

		return driver.findElement(AccountCreatedMessage);

	}
}
