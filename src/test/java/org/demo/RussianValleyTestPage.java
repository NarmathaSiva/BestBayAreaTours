package org.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.russianvalley.RussBookingPage;
import org.russianvalley.RussHomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.yosemite.BaseClass;

public class RussianValleyTestPage extends BaseClass{
	
	@BeforeSuite
    public void setUp() {
		System.out.println("This project starts the execution");
	}

	@BeforeClass
	private void launchUrl() {
		launchChromeBrowser();
		launchURL("https://bestbayareatours.com/");
		maxiWindow();
		impWait(10);
	}

	@BeforeMethod
	private void startTime() {
		getDateTime();
	}
	@AfterMethod
	private void endTime() {
		getDateTime();
	}

	@AfterClass
	private void close() {
		closeBrowser();
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("This project is successfully executed");
	}
	@Test
	private void tc1() throws InterruptedException {
		Thread.sleep(5000);
		
		RussHomePage rh = new RussHomePage();
		
		WebElement tours = rh.getTours();
		explicitWebDriverWait(50000, tours);
        movingCursor(tours);
        
        WebElement rusValley = rh.getRusValley();
        clickElement(rusValley);
        
        Thread.sleep(30000);
        
        WebElement bookNow = rh.getBookNow();
        clickElement(bookNow);
        
        Thread.sleep(30000);
        
        WebElement frames = rh.getFrames();
        switchToFrame(frames);
        
        Thread.sleep(30000);
        
        WebElement day = rh.getDay();
        clickElement(day);
        }
	@Test
	public void tc2() throws AWTException, InterruptedException {
		
		Thread.sleep(7000);
		
		RussBookingPage rb = new RussBookingPage();

		WebElement adults = rb.getAdults();
		Select s = new Select(adults);
		s.selectByValue("2");

		WebElement childs = rb.getChilds();
		Select s1 = new Select(childs);
		s1.selectByValue("1");

		WebElement wholePage = rb.getWholePage();
		clickElement(wholePage);

		for (int i = 0; i < 7; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
        Thread.sleep(4000);
        
		WebElement ques1 = rb.getQues1();
		Select s2 = new Select(ques1);
		s2.selectByVisibleText("TripAdvisor");

		WebElement ques2 = rb.getQues2();
		Select s3 = new Select(ques2);
		s3.selectByVisibleText("Abri Hotel");

		WebElement ques3 = rb.getQues3();
		passValues(ques3, "India");

		WebElement name = rb.getName();
		passValues(name, "Sasi123");

		WebElement flag = rb.getFlag();
		clickElement(flag);

		for (int i = 0; i < 100; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement phnNo = rb.getPhnNo();
		passValues(phnNo, "2341056701");

		WebElement geteMail = rb.geteMail();
		passValues(geteMail, "sasi@gmail.com");

		WebElement cardNo = rb.getCardNo();
		passValues(cardNo, "3123345667899012");
		
		Thread.sleep(7000);

		WebElement expMonth = rb.getExpMonth();
		movingCursor(expMonth);
		clickElement(expMonth);
		
		for (int i = 0; i < 5; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
		WebElement expYear = rb.getExpYear();
		movingCursor(expYear);
		clickElement(expYear);
		
		for (int i = 0; i < 2; i++) {
			a.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).build().perform();
		}
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
		WebElement cardName = rb.getCardName();
		passValues(cardName, "Sasi");

		WebElement cVC = rb.getcVC();
		passValues(cVC, "987");

		WebElement country = rb.getCountry();
		Select s6 = new Select(country);
		s6.selectByVisibleText("India");

		WebElement complete = rb.getComplete();
		clickElement(complete);
	}


}
