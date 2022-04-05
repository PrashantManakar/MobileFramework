package com.qa.pages;

import com.qa.MenuPage;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductsPage extends MenuPage {
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "(//android.widget.TextView[contains(@resource-id,'items-box-photo')])[3]") 
	@iOSXCUITFindBy (xpath = "(//XCUIElementTypeStaticText[@name='items-box-photo' and @visible = 'true' and @enabled = 'true'])[3]")
	private MobileElement thirdItemOncart;			


	/**
	 * Purpose: Verify third item in cart is displayed
	 * @return
	 */
	public Boolean isThirdItemInCartIsDisplayed() {
		return thirdItemOncart.isDisplayed();
	}

	
	/* Purpose: click in search button 
	 * 
	 */

	public ProductsPage pressThirdCartItem() {
		click(thirdItemOncart, "press third item in cart input");
		return this;
	}


}
