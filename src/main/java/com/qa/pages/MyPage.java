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
 *Assumption : I am not aware of Japanese language so did not understood screen shot. 
 *Assuming the address fields for common e-commerce site
 *
 */
public class MyPage extends BaseTest{
	TestUtils utils = new TestUtils();
	/*
	 * Assumed ios and android app have same locators
	 */
	@AndroidFindBy (accessibility = "personal-Information") 
	@iOSXCUITFindBy (id = "personal-Information")
	private MobileElement personalInformation;
	
	@AndroidFindBy (accessibility = "shipping-address") 
	@iOSXCUITFindBy (id = "shipping-address")
	private MobileElement shippingAddressOption;
	
	
	@AndroidFindBy (accessibility = "add-shipping-btn") 
	@iOSXCUITFindBy (id = "add-shipping-btn")
	private MobileElement addShipingAddress;
	
	@AndroidFindBy (accessibility = "country-dropdown") 
	@iOSXCUITFindBy (id = "country-dropdown")
	private MobileElement countryDropdown;
	
	@AndroidFindBy (accessibility = "full-name") 
	@iOSXCUITFindBy (id = "full-name")
	private MobileElement fullNameTextbox;
	
	
	@AndroidFindBy (accessibility = "mobile-Number") 
	@iOSXCUITFindBy (id = "mobile-Number")
	private MobileElement mobileNumberText;
	
	@AndroidFindBy (accessibility = "pin-code") 
	@iOSXCUITFindBy (id = "pin-code")
	private MobileElement pinCodeText;
	
	
	@AndroidFindBy (accessibility = "flat-house-building") 
	@iOSXCUITFindBy (id = "flat-house-building")
	private MobileElement flatHouseBuildingText;	

	@AndroidFindBy (accessibility = "street") 
	@iOSXCUITFindBy (id = "street")
	private MobileElement streetText;
	
	@AndroidFindBy (accessibility = "landmark") 
	@iOSXCUITFindBy (id = "landmark")
	private MobileElement landmarkText;
	
	@AndroidFindBy (accessibility = "town-city") 
	@iOSXCUITFindBy (id = "town-city")
	private MobileElement townCityText;
	
	
	@AndroidFindBy (accessibility = "state") 
	@iOSXCUITFindBy (id = "state")
	private MobileElement stateDropdown;
	
	
	@AndroidFindBy (accessibility = "submit-address-btn") 
	@iOSXCUITFindBy (id = "submit-address-btn")
	private MobileElement submitAddressBtn;
	
	
	@AndroidFindBy (accessibility = "address-label") 
	@iOSXCUITFindBy (id = "address-label")
	private MobileElement addressValueLabel;
	
	
	/* Purpose: Click on personal information
	 * 
	 */
	
	public MyPage pressPersonalInformation() {
		click(personalInformation, "press personal Information");
		return this;		
	}

	/* Purpose: Click on shipping address option
	 * 
	 */
	
	public MyPage pressShippingAddress() {
		click(shippingAddressOption, "press shipping address option");
		return this;		
	}
	
	/* Purpose: Click on add shipping address button
	 * 
	 */
	
	public MyPage pressAddShippingAddressButton() {
		click(addShipingAddress, "press add shipping address button");
		return this;
	}
	
	/* Purpose: verify select country dropdown value 
	 * 
	 */
	
	public boolean verifySelectCountryDropdown() {
		waitForVisibility(countryDropdown);		
		return  countryDropdown.isDisplayed();
	}
	/* Purpose: select country dropdown value 
	 * 
	 */
	
	public MyPage selectCountryDropdown(String dropdown) {
		selectDropdownByText(countryDropdown,dropdown, "press add shipping address button");
		return this;		
	}
	
	/* Purpose: Enter full name in full name text box
	 * 
	 */
	
	public MyPage enterFullName(String fullName) {
		clear(fullNameTextbox);	
		sendKeys(fullNameTextbox, fullName, "Enter " + fullName);
		return this;		
	}
	
	
	/* Purpose: Enter mobile number in mobile number text box
	 * 
	 */
	
	public MyPage enterMobileNumber(String mobileNumber) {
		clear(mobileNumberText);	
		sendKeys(mobileNumberText, mobileNumber, "Enter " + mobileNumber);
		return this;		
	}
	
	
	/* Purpose: Enter pin code in pin code text box
	 * 
	 */
	
	public MyPage enterPinCode(String pinCode) {
		clear(pinCodeText);	
		sendKeys(pinCodeText, pinCode, "Enter " + pinCode);
		return this;		
	}
	
	
	/* Purpose: Enter flat House Building in flat House Building text box
	 * 
	 */
	
	public MyPage enterflatHouseBuildingText(String flatHouseBuilding) {
		clear(flatHouseBuildingText);	
		sendKeys(flatHouseBuildingText, flatHouseBuilding, "Enter " + flatHouseBuilding);
		return this;		
	}
	
	
	/* Purpose: Enter street  in street  text box
	 * 
	 */
	
	public MyPage enterstreetText(String street) {
		clear(streetText);	
		sendKeys(streetText, street, "Enter " + street);
		return this;		
	}
	
	
	/* Purpose: Enter landmark Text  in landmark  text box
	 * 
	 */
	
	public MyPage enterlandmarkText(String landmark) {
		clear(landmarkText);	
		sendKeys(landmarkText, landmark, "Enter " + landmark);
		return this;		
	}
	

	
	/* Purpose: Enter landmark Text  in landmark  text box
	 * 
	 */
	
	public MyPage entertownCityText(String townCity) {
		clear(townCityText);	
		sendKeys(townCityText, townCity, "Enter " + townCity);
		return this;		
	}
	

	/* Purpose: select state drop down 
	 * 
	 */
	
	public MyPage selectStateDropdown(String state) {
		selectDropdownByText(stateDropdown,state, "Select state dropdown");
		return this;		
	}
	
	/* Purpose: Click on submit address button
	 * 
	 */
	
	public MyPage pressAddressSubmitButton() {
		click(submitAddressBtn, "press submit address button");
		return this;		
	}
	
	public String getSubmitAddressConfirmationTxt() {
		String txt = getText(addressValueLabel, "txt is - ");
		return txt;
	}

	

}
