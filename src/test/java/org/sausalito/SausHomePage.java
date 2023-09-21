package org.sausalito;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yosemite.BaseClass;

public class SausHomePage extends BaseClass{

	public SausHomePage() {
PageFactory.initElements(driver, this);	
}

//PAGE-1
	@FindBy(xpath="(//a[text()='tours'])[1]")
	private WebElement tours;
	
	@FindBy(xpath="(//a[contains(text(),'Sausalito')])[1]")
	private WebElement sausalito;
	
//PAGE-2
	@FindBy(xpath="//a[text()='Book now']")
	private WebElement bookNow;
	
//PAGE-3
	@FindBy(xpath="(//iframe[@title='FareHarbor'])[2]")
	private WebElement frames;
	
	@FindBy(xpath="(//a[@data-test-id='availabilities'])[3]")
	private WebElement day;

	public WebElement getTours() {
		return tours;
	}

	public WebElement getSausalito() {
		return sausalito;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public WebElement getFrames() {
		return frames;
	}

	public WebElement getDay() {
		return day;
	}
	
}
