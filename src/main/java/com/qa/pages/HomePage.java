/**
 * 
 */
package com.qa.pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/**
 * @author pmanakar
 *
 *ASSUMPTION: - I am from India and I do not have idea about flow of application. 
 *Writing test flow according to my experience. Added ideal locators.
 *
 */
public class HomePage extends BaseTest{
	TestUtils utils = new TestUtils();
	/*
	 * Assumed ios and android app have same locators
	 */
	@AndroidFindBy (accessibility = "serach-input") 
	@iOSXCUITFindBy (id = "serach-input")
	private MobileElement searchTextbox;

	/* Assumption : xpath for complex element like search button.
	 * Below xpath is not correct it is used for demo purpose only.
	 * */
	@AndroidFindBy (xpath = "//android.widget.ImageButton[contains(@resource-id,'search-btn')]") 
	@iOSXCUITFindBy (xpath = "//XCUIElementTypeButton[@name='search-btn']")
	private MobileElement searchButton;



	
	/* 
	 * 
	 * 
	 */



	/* Purpose: Enter search text in search text box
	 * 
	 */

	public HomePage enterProductName(String productName) {
		clear(searchTextbox);	
		sendKeys(searchTextbox, productName, "Enter " + productName);
		return this;		
	}

	/* Purpose: click in search button 
	 * 
	 */

	public HomePage pressSearchButton() {
		click(searchButton, "press search button of product search input");
		return this;
	}
	
	

}
