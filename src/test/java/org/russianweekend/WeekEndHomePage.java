package org.russianweekend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.yosemite.BaseClass;

public class WeekEndHomePage extends BaseClass{

	public WeekEndHomePage() {
PageFactory.initElements(driver, this);	
}

//PAGE-1
	@FindBy(xpath="(//a[text()='tours'])[1]")
	private WebElement tours;
	
	@FindBy(xpath="(//a[contains(text(),'Gourmet Lunch')])[1]")
	private WebElement russianRiver;
	
//PAGE-2
	@FindBy(xpath="//a[text()='Book now']")
	private WebElement bookNow;
	
//PAGE-3
	@FindBy(xpath="(//iframe[@title='FareHarbor'])[2]")
	private WebElement frames;
	
	@FindBy(xpath="(//a[@data-test-id='availabilities'])[1]")
	private WebElement day;

	public WebElement getTours() {
		return tours;
	}

	public WebElement getRussianRiver() {
		return russianRiver;
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
