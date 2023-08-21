package testcases;

import org.testng.annotations.Test;

import pageObjectModel.AddToCartObjects;
import resources.BaseClass;
import resources.Constants;

public class VerifyAddToCartTestCases extends BaseClass {

	@Test
	public void Search() throws InterruptedException {

		AddToCartObjects obj2 = new AddToCartObjects(driver);

		driver.manage().window().maximize();

		// search the product iPhone
		obj2.SearchBox().sendKeys(Constants.SearchIphone);
		obj2.SearchBtn().click();

		// add to cart
		// obj2.ClickonSelectedIphione().click();

		// fetching iPhone text
		// System.out.println(obj2.IphonePrice().getText());
		String IphonePrice = obj2.IphonePrice().getText(); // grab iPhone price
		System.out.println(IphonePrice);
		String[] split = IphonePrice.split("\\s+"); // here we have to split in array and replace with space
		System.out.println(split);
		String IphonePriceWtihDollor = split[0]; // to fetch 1st value from array
		System.out.println(IphonePriceWtihDollor);
		String RemoveDollor = split[0].replaceAll("[$]", ""); // remove Dollar from price
		double a = Double.parseDouble(RemoveDollor); // converted String iPhone price without Dollar in Double
		System.out.println(a);

		obj2.addtocart().click();

		obj2.searchbox().clear(); // to clear the text

		obj2.searchbox().sendKeys(Constants.SearchSamsung); // to search for SamSung

		obj2.ClickSearchBtn().click();

		String Samsungprice = obj2.SamsungPrice().getText(); // grab SamSung price with taxes
		System.out.println(Samsungprice);
		String[] spl = Samsungprice.split("\\s+"); // Split the SamSung prices and saved in Array
		System.out.println(spl);
		String SamsungPriceWithDollor = spl[0]; // to fetch 1st value from array
		System.out.println(SamsungPriceWithDollor);
		String RemoveDollor1 = spl[0].replaceAll("[$]", ""); // remove dollar from SamSung galaxy price
		double b = Double.parseDouble(RemoveDollor1);
		System.out.println(b);

		double Count = a + b;
		System.out.println(Count);

		String DollorAdd = ("$" + Count);
		System.out.println(DollorAdd);

		obj2.AddtoCart().click(); // SamSung tab add to cart

		Thread.sleep(3000);
		obj2.CartTotal().click();

		String totalcart = obj2.sum().getText();
		System.out.println(totalcart);

		String RemoveDollor2 = totalcart.replaceAll("[$]", ""); // remove dollar from total cart price
		System.out.println(RemoveDollor2);

		double c = Double.parseDouble(RemoveDollor2);
		System.out.println(c);

		if (DollorAdd.equalsIgnoreCase(totalcart)) {
			System.out.println("Amount matching Successfully");
		} else {
			System.out.println("Amount not matching Successfully");
		}

	}
}
