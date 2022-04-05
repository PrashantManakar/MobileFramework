package com.qa.tests;

import java.io.InputStream;
import java.lang.reflect.Method;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.HomePageMyPageFacade;
import com.qa.utils.TestUtils;

public class AddAdressFunctionality extends BaseTest {
	
	HomePageMyPageFacade homePageMyPageFacade;
	JSONObject loginUsers;
	TestUtils utils = new TestUtils();
	
	@BeforeClass
	  public void beforeClass() throws Exception {
			InputStream datais = null;
		  try {
			  String dataFileName = "data/loginUsers.json";
			  datais = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datais);
			  loginUsers = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datais != null) {
				  datais.close();
			  }
		  }
		  closeApp();
		  launchApp();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		  homePageMyPageFacade = new HomePageMyPageFacade();
	  }
	/*
	 * Assumption: Only valid adress scenario is covered to demo the automation framework structure and 
	 *
	 * Purpose: Write a test to navigate to the Shipping Address screen, 
	 * 
	 */
	  @Test
	  public void test_verifyUserNavigatedAddAdrress() {
	
		  Assert.assertEquals( homePageMyPageFacade.navigateShippingForm(), true);	  
		 
	  }
	  
	  /**
	   * Purpose: Verify add a new address and then verify it has been registered.
	   */
	  @Test  (dependsOnMethods = { "verifyUserNavigatedAddAdrress" })
	  public void verifyAddressIsSubmitted() {
		  homePageMyPageFacade.enterAllDetailsInTheForm(
				  loginUsers.getJSONObject("validAddress").getString("country"),
				  loginUsers.getJSONObject("validAddress").getString("fullName"),
				  loginUsers.getJSONObject("validAddress").getString("mobileNumber"),
				  loginUsers.getJSONObject("validAddress").getString("pinCode"),
				  loginUsers.getJSONObject("validAddress").getString("flatHouse"), 
				  loginUsers.getJSONObject("validAddress").getString("street"),
				  loginUsers.getJSONObject("validAddress").getString("landMark"),
				  loginUsers.getJSONObject("validAddress").getString("townCity"),
				  loginUsers.getJSONObject("validAddress").getString("state"));
		  Assert.assertEquals(homePageMyPageFacade.addressIsSubmitted(getStrings().get("valid_Adress")), true);
	  }
	  
	 
	

}
