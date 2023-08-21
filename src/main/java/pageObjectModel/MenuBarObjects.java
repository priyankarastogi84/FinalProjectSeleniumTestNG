package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuBarObjects {
	
	public WebDriver driver; // this driver do not have scope.
	
	
	private By NavigateToDesktops = By.xpath("(//a[@class='dropdown-toggle'])[2]");
	private By ShowAlltoDesktops = By.xpath("//a[contains(text(),'Show All Desktops')]");
	private By NavigateToLaptopsAndNotebooks =By.xpath("(//a[@class='dropdown-toggle'])[3]");
	private By ShowAllLaptopsAndNoteBooks =By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]");
	private By Components = By.xpath("(//a[@class='dropdown-toggle'])[4]");
	private By ShowAllComponents =By.xpath("//a[contains(text(),'Show All Components')]");
	private By Tablets = By.xpath("(//a[contains(text(),'Tablets')])[1]");
	private By Software = By.xpath("(//a[contains(text(),'Software')])[1]");
	private By PhonesAndPDAs = By.xpath("(//a[contains(text(),'Phones & PDAs')])[1]");
	private By Cameras = By.xpath("(//a[contains(text(),'Cameras')])[2]");
	private By MP3Players = By.xpath("(//a[@class='dropdown-toggle'])[5]");
	private By ShowAllMP3Players =By.xpath("//a[contains(text(),'Show All MP3 Players')]");
	
	
	
	public MenuBarObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement NavigateToDesktops() {

		return driver.findElement(NavigateToDesktops);

	}
	public WebElement ClickOnShowAlltoDesktops() {

		return driver.findElement(ShowAlltoDesktops);

	}
	public WebElement NavigateToLaptops() {

		return driver.findElement(NavigateToLaptopsAndNotebooks);

	}
	public WebElement ClickOnShowAllLaptopsAndNoteBooks() {

		return driver.findElement(ShowAllLaptopsAndNoteBooks);

	}

	public WebElement NavigateToComponents() {

		return driver.findElement(Components);

	}
	public WebElement ClickOnShowAllComponents() {

		return driver.findElement(ShowAllComponents);

	}
	
	public WebElement NavigateToTablets() {

		return driver.findElement(Tablets);

	}
	
	public WebElement NavigateToSoftware() {

		return driver.findElement(Software);

	}
	
	public WebElement NavigateToPhonesAndPDAs() {

		return driver.findElement(PhonesAndPDAs);

	}
	public WebElement NavigateToCameras() {

		return driver.findElement(Cameras);

	}
	public WebElement NavigateToMP3Players() {

		return driver.findElement(MP3Players);

	}
	public WebElement ClickOnShowAllMP3Players() {

		return driver.findElement(ShowAllMP3Players);

	}
}

