package com.qa.pages;

public class HomePageProductDetailsPageFacade {

	
	private HomePage homePage;
	private ProductsPage productsPage;
	private ProductDetailsPage productDetailsPage;
	
	
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
	 * Created get Product page Page facade method to get Product Page driver method
	 */
	public ProductsPage getProductsPage() {
		if(productsPage == null) {
			productsPage = new ProductsPage();
			return productsPage;
		}else
			return productsPage;
	}	
	
	
	/**
	 * Created get Product Detail Page facade method to get Product Detail driver method
	 */
	public ProductDetailsPage getProductDetailsPage() {
		if(productDetailsPage == null) {
			productDetailsPage = new ProductDetailsPage();
			return productDetailsPage;
		}else
			return productDetailsPage;
	}	
	
	/**
	 * @param confirmationText
	 * @return
	 */
	public boolean productIsDisplayedWhileAppliedSearch(String productName) {
		homePage.enterProductName(productName);
		homePage.pressSearchButton();
		return productsPage.isThirdItemInCartIsDisplayed();		
	}
	
	
	/**
	 * @return
	 */
	public String productDetailsTitleName() {
		productsPage.pressThirdCartItem();
		return productDetailsPage.getProductTitleTitle();
	}
}
