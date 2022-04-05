package com.qa.tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseTest;
import com.qa.pages.HomePageProductDetailsPageFacade;
import com.qa.utils.TestUtils;

public class SearchProduct extends BaseTest{

	
	HomePageProductDetailsPageFacade homePageProductDetailsPageFacade;
	
	TestUtils utils = new TestUtils();
	
	@BeforeClass
	  public void beforeClass() throws Exception {		
		  closeApp();
		  launchApp();
	  }

	  @AfterClass
	  public void afterClass() {
	  }
	  
	  @BeforeMethod
	  public void beforeMethod(Method m) {
		  utils.log().info("\n" + "****** starting test:" + m.getName() + "******" + "\n");
		  homePageProductDetailsPageFacade = new HomePageProductDetailsPageFacade();
	  }
	/*
	 * Assumption: Only valid scenario for prduct cart  scenario is covered to demo the automation framework structure and 
	 * 
	 * * Purpose: Search for “MacBook” on the timeline screen, 
	 * 
	 */
	  
	  @Test
	  public void test_verifyUserNavigatedAddAdrress() {
	
		  Assert.assertEquals( homePageProductDetailsPageFacade.productIsDisplayedWhileAppliedSearch(getStrings().get("product_title")), true);	  
		 
	  }
	  
	  /** Purpose: Verify tap on the third item to go to the Item Details screen.
	   * Write a test to check if the item title has "MacBook" in it.
	   * 
	   */
	  
	  @Test  (dependsOnMethods = { "verifyUserNavigatedAddAdrress" })
	  public void verifyAddressIsSubmitted() {
		  
		  String getProductTitle = homePageProductDetailsPageFacade.productDetailsTitleName().trim();
		  Assert.assertEquals(getProductTitle, getStrings().get("product_title"));
	  }
	  
	 
}
