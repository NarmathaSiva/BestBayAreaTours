package org.yosemite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{

	public HomePage() {
		PageFactory.initElements(driver, this);	
	}

	//PAGE-1
	@FindBy(xpath="(//li[@id='menu-item-234'])[1]")
	private WebElement tours;

	@FindBy(xpath="(//a[contains(text(),'Yosemite Day')])[1]")
	private WebElement yosemite;

	//PAGE-2
	@FindBy(xpath="//a[text()='Book now']")
	private WebElement bookNow;

	//PAGE-3
	@FindBy(xpath="(//iframe[@title='FareHarbor'])[2]")
	private WebElement frames;

	@FindBy(xpath="(//b[contains(text(),'Yosemite in a Day Tour')])[5]")
	private WebElement day;

	public WebElement getTours() {
		return tours;
	}

	public WebElement getYosemite() {
		return yosemite;
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
