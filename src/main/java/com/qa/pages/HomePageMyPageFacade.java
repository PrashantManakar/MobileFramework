/**
 * 
 */
package com.qa.pages;

import com.qa.MenuPage;

/**
 * @author pmanakar
 * 
 * I have created this facade class to deal with single interface to Home page and My Page 
 * 
 *
 */

public class HomePageMyPageFacade {
	private HomePage homePage;
	private MyPage myPage;
	private MenuPage menuPage;
	
	/**
	 * Created get home Page facade method to get home Page driver method
	 */
	public HomePage getHomePage() {
		if(homePage == null) {
			homePage = new HomePage();
			return homePage;
		}else
			return homePage;
	}
	
	/**
	 * Created get My page Page facade method to get my Page driver method
	 */
	public MyPage getMyPage() {
		if(myPage == null) {
			myPage = new MyPage();
			return myPage;
		}else
			return myPage;
	}
	
	/**
	 * Created get Menu page Page facade method to get Menu Page driver method
	 */
	public MenuPage getMenuPage() {
		if(menuPage == null) {
			menuPage = new MenuPage();
			return menuPage;
		}else
			return menuPage;
	}
	
	
	
	/**
	 * Below method is used to navigate Shipping address section
	 * @return MyPage object
	 * 
	 */
	public MyPage navigateShippingSection() {
		menuPage.pressSettingsBtn();
		menuPage.pressmyProfileOption();
		myPage.pressPersonalInformation();
		return myPage.pressShippingAddress();
	}
	
	/**
	 * Below method is used to navigate Shipping address section
	 * @return MyPage object
	 * 
	 */
	public boolean navigateShippingForm() {
		navigateShippingSection();
		myPage.pressAddShippingAddressButton();
		return myPage.verifySelectCountryDropdown();
	}
	
	/**
	 * This method is written for filling up all address data.
	 * 
	 * @param country
	 * @param fullName
	 * @param mobileNumber
	 * @param pinCode
	 * @param flatHouse
	 * @param street
	 * @param landMark
	 * @param townCity
	 * @param state
	 * @return
	 */
	public MyPage enterAllDetailsInTheForm(String country,String fullName,
			String mobileNumber,String pinCode,String flatHouse,String street,
			String landMark, String townCity,String state) {
		
		myPage.selectCountryDropdown(country);
		myPage.enterFullName(fullName);
		myPage.enterMobileNumber(mobileNumber);
		myPage.enterPinCode(pinCode);
		myPage.enterflatHouseBuildingText(flatHouse);
		myPage.enterstreetText(street);
		myPage.enterlandmarkText(landMark);
		myPage.entertownCityText(townCity);
		return myPage.selectStateDropdown(state);
		
	}
	
	/**
	 * @param confirmationText
	 * @return
	 */
	public boolean addressIsSubmitted(String confirmationText) {
		myPage.pressAddressSubmitButton();
		return myPage.getSubmitAddressConfirmationTxt().trim().contains(confirmationText);
	}
	

}
