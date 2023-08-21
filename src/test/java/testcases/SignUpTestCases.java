package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.SignUpPageObjects;

import resources.BaseClass;
import resources.CommonMethods;
import resources.Constants;

public class SignUpTestCases extends BaseClass {
	@Test
	public void VerifySignUP() throws IOException, InterruptedException {

		SignUpPageObjects spo = new SignUpPageObjects(driver);
		driver.manage().window().maximize();

		spo.NavigateToMyAccount().click();
		spo.NavigateToRegister().click();
		spo.enterFirstname().sendKeys(Constants.firstName);
		spo.enterLastname().sendKeys(Constants.lastName);
		spo.enterEmail().sendKeys(CommonMethods.getEmail());
		spo.enterTelephone().sendKeys(Constants.telephone);
		spo.enterPassword().sendKeys(Constants.enterpassword);
		spo.enterPasswordConfirm().sendKeys(Constants.enterpasswordconfirm);
		spo.enterAgree().click();
		spo.enterContinue().click();
		
		WebElement a=spo.AccountCreatedMessage();
		  String actualText=  a.getText();
		  

		  
		  String ExpectedText=Constants.expectedAccountCreatedMessage;
		 
		  SoftAssert sa=new SoftAssert();
		  sa.assertEquals(actualText,ExpectedText,"Expected Account Created message is not showing");
		  
		  sa.assertAll();
		  

	}

}
