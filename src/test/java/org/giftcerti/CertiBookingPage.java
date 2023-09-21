package org.giftcerti;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yosemite.BaseClass;

public class CertiBookingPage extends BaseClass{
	
	public CertiBookingPage() {
PageFactory.initElements(driver, this);	
}
//PAGE-4
	@FindBy(xpath="(//select[@ng-mx-change='add-customer-type'])[3]")
	private WebElement sauAdult;
	
	@FindBy(xpath="(//select[@ng-mx-change='add-customer-type'])[4]")
	private WebElement sauChild;
	
	
    @FindBy(xpath="//div[@class='book-embed-container']")	
	private WebElement wholePage;
	
	@FindBy(xpath="//input[@name='contact-name']")
	private WebElement fullName;
	
	@FindBy(xpath="//input[@name='contact-phone']")
	private WebElement phnNo;

	@FindBy(xpath="//input[@name='contact-email']")
	private WebElement eMail;
	
	@FindBy(xpath="//input[@name='payments-payment-cardNumber']")
	private WebElement cardNo;
	
	@FindBy(xpath="//select[@name='payments-payment-cardExpiryMonth']")
	private WebElement expMonth;
	
	@FindBy(xpath="//select[@name='payments-payment-cardExpiryYear']")
	private WebElement expYear;
	
	@FindBy(xpath="//input[@name='payments-payment-cardholdersName']")
	private WebElement cardName;
	
	@FindBy(xpath="//input[@name='payments-payment-cardCvc']")
	private WebElement cVC;
	
	@FindBy(xpath="//select[@name='payments-payment-countryCode']")
	private WebElement country;
	
	@FindBy(xpath="//button[@data-test-id='complete-and-pay-disabled']")
	private WebElement complete;

	public WebElement getSauAdult() {
		return sauAdult;
	}

	public WebElement getSauChild() {
		return sauChild;
	}
	
	public WebElement getWholePage() {
		return wholePage;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getPhnNo() {
		return phnNo;
	}

	public WebElement geteMail() {
		return eMail;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getcVC() {
		return cVC;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getComplete() {
		return complete;
	}
	
}
