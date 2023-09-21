package org.russianweekend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yosemite.BaseClass;

public class WeekEndBookingPage extends BaseClass {
	
	public WeekEndBookingPage() {
PageFactory.initElements(driver, this);	
}

//PAGE-4
	@FindBy(xpath="//select[@data-test-id='user-type-adult']")
	private WebElement adults;
		
	@FindBy(xpath="//select[@data-test-id='user-type-child']")
	private WebElement childs;
	
    @FindBy(xpath="//div[@class='book-embed-container']")	
	private WebElement wholePage;
    
    @FindBy(xpath="//select[@placeholder='Please select where you are staying']")	
	private WebElement ques1;
    
    @FindBy(xpath="//input[@name='contact-name']")	
	private WebElement name;
    
    @FindBy(xpath="//div[@class='flag-container']")	
	private WebElement flag;
    
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
    
    @FindBy(xpath="//button[@type='submit']")	
	private WebElement complete;

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChilds() {
		return childs;
	}

	public WebElement getWholePage() {
		return wholePage;
	}

	public WebElement getQues1() {
		return ques1;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getFlag() {
		return flag;
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
