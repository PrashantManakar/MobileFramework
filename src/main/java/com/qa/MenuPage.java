package com.qa;

import com.qa.pages.MyPage;
import com.qa.pages.SettingsPage;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath="//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView\n" + 
			"") 
	@iOSXCUITFindBy (xpath="//XCUIElementTypeOther[@name=\"test-Menu\"]/XCUIElementTypeOther")
	private MobileElement settingsBtn;
	
	/*
	 * Assumed ios and android app have same locators
	 */
	@AndroidFindBy (accessibility = "my-profile") 
	@iOSXCUITFindBy (id = "my-profile")
	private MobileElement myProfileOption;
	
	/* Purpose: Click on m profile option and verify user is navigated to my page page
	 * 
	 */
	
	public MyPage pressmyProfileOption() {
		click(myProfileOption, "press my Profile Option");
		return new MyPage();
	}
	
	public SettingsPage pressSettingsBtn() {
		click(settingsBtn, "press Settings button");
		return new SettingsPage();
	}

}
