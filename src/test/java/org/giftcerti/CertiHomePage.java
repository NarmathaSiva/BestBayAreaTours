package org.giftcerti;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yosemite.BaseClass;

public class CertiHomePage extends BaseClass {
	
	public CertiHomePage() {
PageFactory.initElements(driver, this);	
}
//PAGE-1	
	@FindBy(xpath="(//a[text()='book now'])[1]")
	private WebElement bookNow;

//PAGE-2
	@FindBy(xpath="(//span[text()='Buy'])[1]")
	private WebElement certiBuy;

//PAGE-3
	@FindBy(xpath="//iframe[@id='fareharbor-lightframe-iframe']")
	private WebElement frames;
	
	@FindBy(xpath="//div[@ng-then='retail']")
	private WebElement buyNow;

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getCertiBuy() {
		return certiBuy;
	}

	public WebElement getFrames() {
		return frames;
	}
	
	public WebElement getBuyNow() {
		return buyNow;
	}

}
