package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class LoginTestCase extends BaseClass {

	@Test
	public void verifyLogin() throws IOException {

		LoginPageObjects lpo = new LoginPageObjects(driver);
		driver.manage().window().maximize();

		lpo.NavigateToMyAccount().click();

		lpo.NavigateToLogin().click();

		lpo.enterUsername().sendKeys(Constants.enterusernamelogin);

		lpo.enterPassword().sendKeys(Constants.enterpassowrdLogin);

		lpo.clickOnLogin().click();

		lpo.NavigateToMyAccount().click();

		lpo.clickOnLogout().click();
		
		WebElement a=lpo.AccountLogoutMessage();
		 String actualText=  a.getText();

		  
		  String ExpectedText=Constants.expectedAccountLogoutMessage;
		 
		  SoftAssert sa=new SoftAssert();
		  sa.assertEquals(actualText,ExpectedText,"Expected Text message is not showing");
		  
		  sa.assertAll();
		  

	}

}
