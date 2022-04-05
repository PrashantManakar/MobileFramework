package com.qa.pages;

import com.qa.MenuPage;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductDetailsPage extends MenuPage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy (accessibility = "item-Name") 
	@iOSXCUITFindBy (id = "item-Name")
	private MobileElement productTitle;
	
	/* Get 
	 * 
	 * 
	 */

	public String getProductTitleTitle() {
		String title = getText(productTitle, "title is - ");
		return title;
	}

	
}
