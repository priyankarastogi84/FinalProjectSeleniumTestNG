package testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectModel.MenuBarObjects;
import resources.BaseClass;

public class VerifyMenuBar extends BaseClass {
	@Test
	public void MenuBar() {

		MenuBarObjects obj = new MenuBarObjects(driver);

		Actions a = new Actions(driver);
		a.moveToElement(obj.NavigateToDesktops()).perform();

		obj.ClickOnShowAlltoDesktops().click();

		a.moveToElement(obj.NavigateToLaptops()).perform();

		obj.ClickOnShowAllLaptopsAndNoteBooks().click();

		a.moveToElement(obj.NavigateToComponents()).perform();

		obj.ClickOnShowAllComponents().click();

		a.moveToElement(obj.NavigateToTablets()).perform();

		obj.NavigateToTablets().click();

		a.moveToElement(obj.NavigateToSoftware()).perform();

		obj.NavigateToSoftware().click();

		a.moveToElement(obj.NavigateToPhonesAndPDAs()).perform();

		obj.NavigateToPhonesAndPDAs().click();

		a.moveToElement(obj.NavigateToCameras()).perform();

		obj.NavigateToCameras().click();

		a.moveToElement(obj.NavigateToMP3Players()).perform();

		obj.NavigateToMP3Players().click();

		a.moveToElement(obj.NavigateToMP3Players()).perform();

		obj.ClickOnShowAllMP3Players().click();

	}

}
